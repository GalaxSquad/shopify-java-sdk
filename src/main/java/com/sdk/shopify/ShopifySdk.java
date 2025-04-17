package com.sdk.shopify;

import com.sdk.shopify.dto.Argument;
import com.sdk.shopify.mapper.ArgumentMapper;
import com.sdk.shopify.shopify.*;
import com.sdk.shopify.util.GraphQLUtils;
import com.sdk.shopify.util.ShopifyUtils;
import graphql.language.AstPrinter;
import graphql.language.Field;
import graphql.language.IntValue;
import graphql.language.NullValue;
import graphql.language.SelectionSet;
import graphql.language.StringValue;
import io.github.resilience4j.retry.Retry;
import io.github.resilience4j.retry.RetryConfig;
import io.github.resilience4j.retry.RetryRegistry;
import java.io.IOException;
import java.math.BigInteger;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;
import lombok.Builder;
import lombok.extern.slf4j.Slf4j;
import com.shopify.graphql.support.ID;
/**
 * Main client for interacting with the Shopify Admin API. Provides methods for querying Shopify
 * GraphQL endpoints with automatic pagination and retry capabilities.
 */
@Slf4j
public class ShopifySdk {

  private final String storeName;
  private final String apiKey;
  private String apiVersion = "2025-01";
  private static final int BATCH_SIZE = 100;
  private static final int MAX_PAGES = 100; // Safety limit for pagination

  private final HttpClient httpClient;
  private final Retry retry;
  private final ArgumentMapper argumentMapper = ArgumentMapper.INSTANCE;

  private static final String ACCESS_TOKEN_HEADER = "X-Shopify-Access-Token";
  private static final Integer DEFAULT_CONNECT_TIMEOUT_MS = 30000;
  private static final Integer DEFAULT_READ_TIMEOUT_MS = 60000;
  private static final Long DEFAULT_RETRY_DELAY_MS = 1000L;
  private static final Integer DEFAULT_MAX_RETRY_ATTEMPTS = 5;
  private static final String HTTPS_PROTOCOL = "https";
  private static final String SHOPIFY_DOMAIN_SUFFIX = ".myshopify.com";
  private static final String ADMIN_API_PATH = "/admin/api/";
  private static final String GRAPHQL_ENDPOINT = "/graphql.json";

  // HTTP status codes
  private static final int LOCKED_STATUS_CODE = 423;
  private static final int TOO_MANY_REQUESTS_STATUS_CODE = 429;

  /**
   * Builder constructor for ShopifySdk with validation and defaults.
   *
   * @param storeName        The Shopify store name (required)
   * @param apiKey           The API access token (required)
   * @param apiVersion       API version to use (optional, defaults to 2025-01)
   * @param connectTimeoutMs Connection timeout in milliseconds (optional)
   * @param retryDelayMs     Base delay between retries in milliseconds (optional)
   * @param maxRetryAttempts Maximum number of retry attempts (optional)
   * @throws IllegalArgumentException if required parameters are missing or invalid
   */
  @Builder
  public ShopifySdk (
      String storeName,
      String apiKey,
      String apiVersion,
      Integer connectTimeoutMs,
      Long retryDelayMs,
      Integer maxRetryAttempts) {

    // Validate required parameters
    if(storeName == null || storeName.isEmpty()) {
      throw new IllegalArgumentException("Store name cannot be null or empty");
    }

    if(apiKey == null || apiKey.isEmpty()) {
      throw new IllegalArgumentException("API key cannot be null or empty");
    }

    this.storeName = storeName;
    this.apiKey = apiKey;

    // Validate and set optional parameters
    if(apiVersion != null && !apiVersion.isEmpty()) {
      this.apiVersion = apiVersion;
    }

    // Validate numeric parameters
    if(connectTimeoutMs != null && connectTimeoutMs <= 0) {
      throw new IllegalArgumentException("Connect timeout must be positive");
    }

    if(retryDelayMs != null && retryDelayMs <= 0) {
      throw new IllegalArgumentException("Retry delay must be positive");
    }

    if(maxRetryAttempts != null && maxRetryAttempts <= 0) {
      throw new IllegalArgumentException("Max retry attempts must be positive");
    }

    // Configure HttpClient with timeout and HTTP/2 support
    this.httpClient = HttpClient.newBuilder()
        .connectTimeout(Duration.ofMillis(
            connectTimeoutMs == null ? DEFAULT_CONNECT_TIMEOUT_MS : connectTimeoutMs))
        .version(HttpClient.Version.HTTP_2)  // Use HTTP/2 for better connection management
        .build();

    // Set default values if not provided
    long retryDelay = retryDelayMs != null ? retryDelayMs : DEFAULT_RETRY_DELAY_MS;
    int maxAttempts = maxRetryAttempts != null ? maxRetryAttempts : DEFAULT_MAX_RETRY_ATTEMPTS;

    // Configure Resilience4j retry
    RetryConfig retryConfig =
        RetryConfig.custom()
            .maxAttempts(maxAttempts)
            .retryExceptions(
                IOException.class, InterruptedException.class, URISyntaxException.class)
            .retryOnResult(
                response -> {
                  if(response instanceof HttpResponse) {
                    return shouldRetryResponse((HttpResponse<?>) response);
                  }
                  return false;
                })
            .intervalFunction(
                attempt -> {
                  // Add jitter (0-20%) to fixed delay, ensuring positive values
                  double jitter = 0.2 * retryDelay;
                  return (long) (retryDelay + (Math.random() * jitter));
                })
            .failAfterMaxAttempts(true)
            .build();

    RetryRegistry registry = RetryRegistry.of(retryConfig);
    this.retry = registry.retry("shopifySdkRetry");

    // Add retry event listeners for logging
    retry
        .getEventPublisher()
        .onRetry(
            event ->
                log.warn(
                    "Retry attempt {} after {} ms",
                    event.getNumberOfRetryAttempts(),
                    event.getWaitInterval().toMillis()));
  }

  /**
   * Execute a GraphQL query against the Shopify Admin API.
   *
   * @param rootQuery The GraphQL query to execute
   * @return The query response
   * @throws ShopifySdkException if the query fails
   */
  public QueryResponse queryShopifyAdmin (QueryRootQuery rootQuery) {
    String jsonPayload = toJsonPayload(rootQuery);
    return queryShopifyAdmin(jsonPayload);
  }

  /**
   * Execute a raw GraphQL query against the Shopify Admin API.
   *
   * @param payload The GraphQL query payload as JSON
   * @return The query response
   * @throws ShopifySdkException if the query fails
   */
  public QueryResponse queryShopifyAdmin (String payload) {
    if(payload == null || payload.isEmpty()) {
      throw new IllegalArgumentException("Payload cannot be null or empty");
    }
    if(!payload.contains("query")) {
      payload = toJsonPayload(payload);
    }
    try {
      HttpResponse<String> response = getStringHttpResponse(payload);
      if(response.statusCode() != 200) {
        log.error(
            "Request error, status code: {}, response: {}", response.statusCode(), response.body());
        throw new ShopifySdkException(
            "Error when executing Shopify admin GraphQL API. Status code: "
                + response.statusCode());
      }
      return QueryResponse.fromJson(response.body());
    } catch (Exception e) {
      log.error("method: queryShopifyAdmin, error", e);
      throw new ShopifySdkException("Failed to query Shopify admin API", e);
    }
  }

  private HttpResponse<String> getStringHttpResponse (String payload) {
    Supplier<HttpResponse<String>> httpRequestSupplier =
        Retry.decorateSupplier(
            retry,
            () -> {
              try {
                HttpRequest request =
                    HttpRequest.newBuilder()
                        .uri(buildAdminGraphQLUri())
                        .timeout(Duration.ofMillis(DEFAULT_READ_TIMEOUT_MS))
                        .POST(HttpRequest.BodyPublishers.ofString(payload))
                        .header("Content-Type", "application/json")
                        .header(ACCESS_TOKEN_HEADER, apiKey)
                        .build();
                return httpClient.send(request, BodyHandlers.ofString());
              } catch (Exception e) {
                log.error("Error when execute shopify admin graphql api", e);
                throw new ShopifySdkException(
                    "Error when executing Shopify admin GraphQL API: " + e.getMessage(), e);
              }
            });

    // Execute with retry
    return httpRequestSupplier.get();
  }

  /**
   * Query orders with automatic pagination.
   *
   * @param orderQueryDefinition The order query definition
   * @param sortKey              The field to sort by
   * @return List of all orders matching the query
   */
  public List<Order> queryOrders (OrderQueryDefinition orderQueryDefinition, String sortKey) {
    Argument argument = Argument.builder()
        .first(BATCH_SIZE)
        .sortKey(sortKey)
        .build();

    boolean hasNextPage = true;
    String cursor = null;
    List<Order> orders = new ArrayList<>();
    int pageCount = 0;

    while (hasNextPage && pageCount < MAX_PAGES) {
      argument.setAfter(cursor);
      OrderConnection orderConnection = queryOrdersInOnePage(orderQueryDefinition, argument);
      List<Order> nodes = orderConnection.getNodes();
      if(nodes != null && !nodes.isEmpty()) {
        orders.addAll(nodes);
      } else {
        // No data returned, break to prevent potential infinite loop
        break;
      }

      hasNextPage = orderConnection.getPageInfo().getHasNextPage();
      cursor = orderConnection.getPageInfo().getEndCursor();
      pageCount++;
    }

    if(pageCount >= MAX_PAGES) {
      log.warn("Reached maximum page limit ({}) when querying orders. Results may be incomplete.",
          MAX_PAGES);
    }

    return orders;
  }

  /**
   * Query a single page of orders.
   *
   * @param orderQueryDefinition The order query definition
   * @param argument             The query arguments including pagination
   * @return The order connection result
   */
  public OrderConnection queryOrdersInOnePage (OrderQueryDefinition orderQueryDefinition,
      Argument argument) {
    QueryRootQuery query = Operations.query(
        q -> q.orders(arg -> argumentMapper.updateToOrderArguments(argument, arg),
            o -> o.nodes(orderQueryDefinition)
                .pageInfo(p -> p.startCursor().endCursor().hasPreviousPage().hasNextPage())));
    String queryOrder = query.toString();
    String lineItemsQuery = null;
    if(isOrderQueryContainLineItem(query)) {
      String[] extractAndModified = ShopifyUtils.extractAndRemoveFromShopifyQuery(queryOrder,
          "lineItems");
      lineItemsQuery = extractAndModified[0];
      queryOrder = extractAndModified[1];
    }
    QueryResponse response = queryShopifyAdmin(queryOrder);
    OrderConnection orders = response.getData().getOrders();
    if(lineItemsQuery != null) {
      for (Order order : orders.getNodes()) {
        queryLineItemsItemForOrder(order, lineItemsQuery);
      }
    }
    return orders;
  }

  private boolean isOrderQueryContainLineItem (QueryRootQuery rootQuery) {
    try {
      return rootQuery.toString().contains("lineItems");
    } catch (Exception exception) {
      log.info("Error while checking if order query contains line items", exception);
    }

    return false;
  }

  private void queryLineItemsItemForOrder (Order order, String lineItemQuery) {
    String orderId = order.getId().toString();
    List<LineItem> lineItems = new ArrayList<>();
    boolean hasNextPage = true;
    String cursor = null;
    Field lineItemField = GraphQLUtils.getGraphQLFieldFromQuery(lineItemQuery);

    while (hasNextPage) {
      // Remove argument
      lineItemField = Field.newField("lineItems")
          .selectionSet(lineItemField.getSelectionSet())
          .arguments(
              List.of(graphql.language.Argument.newArgument().name("first").value(new IntValue(
                      BigInteger.valueOf(BATCH_SIZE))).build(),
                  graphql.language.Argument.newArgument().name("after")
                      .value(cursor == null ? NullValue.of() : new StringValue(cursor)).build()))

          .build();
      lineItemField = GraphQLUtils.enrichFieldWithPaginationInfo(lineItemField);
      Field orderField = Field.newField("order")
          .arguments(Collections.singletonList(
              graphql.language.Argument.newArgument().name("id").value(StringValue.of(orderId))
                  .build()))
          .selectionSet(SelectionSet.newSelectionSet().selections(Collections.singletonList(lineItemField)).build())
          .build();

      String orderLineItemQuery = AstPrinter.printAst(orderField);

      QueryResponse queryResponse = queryShopifyAdmin(orderLineItemQuery);
      LineItemConnection lineItemConnection = queryResponse.getData().getOrder().getLineItems();
      List<LineItem> nodes = lineItemConnection.getNodes();
      if(nodes != null && !nodes.isEmpty()) {
        lineItems.addAll(nodes);
      } else {
        // No data returned, break to prevent potential infinite loop
        break;
      }
      PageInfo pageInfo = lineItemConnection.getPageInfo();
      hasNextPage = pageInfo.getHasNextPage();
      cursor = pageInfo.getEndCursor();

    }
    if(!lineItems.isEmpty()) {
      order.setLineItems(new LineItemConnection().setNodes(lineItems));
    }
  }


  /**
   * Build the Shopify Admin API GraphQL URI using proper URI construction.
   *
   * @return The URI for the Shopify Admin API GraphQL endpoint
   * @throws ShopifySdkException if the URI is invalid
   */
  private URI buildAdminGraphQLUri () {
    try {
      return new URI(
          HTTPS_PROTOCOL,
          storeName + SHOPIFY_DOMAIN_SUFFIX,
          ADMIN_API_PATH + apiVersion + GRAPHQL_ENDPOINT,
          null,
          null
      );
    } catch (URISyntaxException e) {
      throw new ShopifySdkException("Invalid URL components for Shopify API endpoint", e);
    }
  }

  private String toJsonPayload (QueryRootQuery query) {
    return toJsonPayload(query.toString());
  }

  private String toJsonPayload (String query) {
    String replace = query.replace("\"", "\\\"").replace("\n", "\\n");
    if(!query.startsWith("{")){
      return String.format(
          "{\"query\":\"{%s}\"}", replace);
    }
    return String.format(
        "{\"query\":\"%s\"}", replace);
  }

  /**
   * Determine if a response should be retried based on its status code.
   *
   * @param response The HTTP response
   * @return true if the request should be retried
   */
  private boolean shouldRetryResponse (HttpResponse<?> response) {
    int statusCode = response.statusCode();
    return (statusCode >= 500) ||
        (statusCode == LOCKED_STATUS_CODE) ||
        (statusCode == TOO_MANY_REQUESTS_STATUS_CODE);
  }

  /**
   * Build a query definition for OnlineStoreTheme that includes pagination information.
   * This query definition is designed to be used with pagination to fetch all theme files.
   *
   * @return A query definition for OnlineStoreTheme
   */
  public OnlineStoreThemeQueryDefinition buildOnlineStoreThemeQuery() {
    return (q) ->
        q.createdAt()
            .updatedAt()
            .files(
                arg -> arg.first(BATCH_SIZE),
                f -> f.nodes(
                    n -> n.updatedAt().filename().updatedAt().contentType().createdAt().body(b ->b.onOnlineStoreThemeFileBodyUrl(OnlineStoreThemeFileBodyUrlQuery::url)
                        
                         .onOnlineStoreThemeFileBodyText(
                        OnlineStoreThemeFileBodyTextQuery::content
                    )).body(n1->n1.onOnlineStoreThemeFileBodyBase64(OnlineStoreThemeFileBodyBase64Query::contentBase64))
                ).pageInfo(p -> p.hasNextPage().endCursor())
            );
  }

  /**
   * Query all files of a theme with automatic pagination.
   *
   * @param id The ID of the theme
   * @return List of all theme files
   */
  public List<OnlineStoreThemeFile> queryAllThemeFiles(String id) {
    if (id == null) {
      throw new IllegalArgumentException("Theme ID cannot be null");
    }
    ID themeId = new ID(id);
    List<OnlineStoreThemeFile> allFiles = new ArrayList<>();
    boolean hasNextPage = true;
    String cursor = null;
    int pageCount = 0;

    while (hasNextPage && pageCount < MAX_PAGES) {
      // Query a single page of theme files
      QueryRootQuery query = Operations.query(
          q -> q.theme(
              themeId,
              buildOnlineStoreThemeQuery()
          )
      );

      // If we have a cursor, modify the query to use it
      String queryStr = query.toString();
      if (cursor != null) {
        // Replace the files argument to include the after parameter
        queryStr = queryStr.replace(
            "files(first:" + BATCH_SIZE + ")",
            "files(first:" + BATCH_SIZE + ",after:\"" + cursor + "\")"
        );
      }

      // Execute the query
      QueryResponse response = queryShopifyAdmin(queryStr);
      OnlineStoreTheme theme = response.getData().getTheme();

      if (theme != null && theme.getFiles() != null) {
        OnlineStoreThemeFileConnection fileConnection = theme.getFiles();
        List<OnlineStoreThemeFile> files = fileConnection.getNodes();

        if (files != null && !files.isEmpty()) {
          allFiles.addAll(files);
        } else {
          // No data returned, break to prevent potential infinite loop
          break;
        }

        PageInfo pageInfo = fileConnection.getPageInfo();
        hasNextPage = pageInfo.getHasNextPage();
        cursor = pageInfo.getEndCursor();
      } else {
        hasNextPage = false;
      }

      pageCount++;
    }

    if (pageCount >= MAX_PAGES) {
      log.warn("Reached maximum page limit ({}) when querying theme files. Results may be incomplete.",
          MAX_PAGES);
    }

    return allFiles;
  }
  public OrderQueryDefinition buildOrderQuery () {
    return (q) ->
        q.name().email()
                // Time
                .createdAt()
                .processedAt()
                .closedAt()
                .cancelledAt()
                .updatedAt()
                .confirmed()
                .closed()
                .cancelReason()
                // Financial
                .displayFinancialStatus()
                // Fulfillment
                .displayFulfillmentStatus()
                .fulfillable()
                .fulfillments(arg -> arg.first(1), FulfillmentQuery::createdAt)
                .customerAcceptsMarketing()
                .currencyCode()
                .subtotalPriceSet(buildMoneyBagQuery())
                .subtotalLineItemsQuantity()
                .currentShippingPriceSet(buildMoneyBagQuery())
                .totalShippingPriceSet(buildMoneyBagQuery())
                .totalTaxSet(buildMoneyBagQuery())
                .currentTotalTaxSet(buildMoneyBagQuery())
                .currentTotalPriceSet(buildMoneyBagQuery())
                .totalPriceSet(buildMoneyBagQuery())
                .discountCode()
                .currentCartDiscountAmountSet(buildMoneyBagQuery())
                .shippingLine(sl -> sl.title().id())
                .lineItems(arg -> arg.first(50), l -> l.nodes(
                    lq -> lq.name()
                        .discountedUnitPriceSet(buildMoneyBagQuery()).quantity()
                        .originalUnitPriceSet(buildMoneyBagQuery())
                        .sku()
                        .requiresShipping()
                        .taxable()
                        .vendor()
                        .discountedTotalSet(buildMoneyBagQuery())
                        .taxLines(arg -> arg.first(5),t -> t.title().rate().ratePercentage().priceSet(buildMoneyBagQuery()).source().channelLiable())
                ))
                .displayAddress(buildMailingAddressQuery())
                .billingAddress(buildMailingAddressQuery())
                .shippingAddress(buildMailingAddressQuery())
                .note()
                .risk(r -> r.recommendation().assessments(OrderRiskAssessmentQuery::riskLevel))
                .totalOutstandingSet(buildMoneyBagQuery())
                .sourceName()
                .paymentTerms( p -> p.dueInDays().overdue().paymentTermsName())
        ;
  }

  private MoneyBagQueryDefinition buildMoneyBagQuery() {
    return (mB -> mB.shopMoney(m -> m.amount().currencyCode())
        .presentmentMoney(m -> m.amount().currencyCode()));
  }

  private MailingAddressQueryDefinition buildMailingAddressQuery() {
    return (mAq -> mAq.company().coordinatesValidated().country().countryCodeV2()
        .formattedArea().province().provinceCode().timeZone()
        .validationResultSummary());
  }


  public static void main (String[] args) {
    ShopifySdk sdk = ShopifySdk.builder()
        .apiKey("secret")
        .storeName("kezlo-test-2")
        .build();

    // Example of querying orders
    List<OnlineStoreThemeFile> files = sdk.queryAllThemeFiles("gid://shopify/OnlineStoreTheme/168800911680");
    System.out.println("Found " + files.size() + " files:");
    
    // To query all theme files, you would use:
    // ID themeId = new ID("gid://shopify/OnlineStoreTheme/12345");
    // sdk.printAllThemeFiles(themeId);
  }
}