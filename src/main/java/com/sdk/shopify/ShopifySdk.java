package com.sdk.shopify;

import com.sdk.shopify.dto.Argument;
import com.sdk.shopify.helper.GraphQLAdminHelper;
import com.sdk.shopify.helper.MutationAdminHelper;
import com.sdk.shopify.helper.QueryAdminFactory;
import com.sdk.shopify.helper.QueryAdminFactory.AdminHelperType;
import com.sdk.shopify.mapper.ArgumentMapper;
import com.sdk.shopify.shopify.AppPlanInput;
import com.sdk.shopify.shopify.AppPricingInterval;
import com.sdk.shopify.shopify.AppRecurringPricingInput;
import com.sdk.shopify.shopify.AppSubscriptionCancelPayload;
import com.sdk.shopify.shopify.AppSubscriptionCreatePayload;
import com.sdk.shopify.shopify.AppSubscriptionLineItemInput;
import com.sdk.shopify.shopify.AppSubscriptionQueryDefinition;
import com.sdk.shopify.shopify.AppUsagePricingInput;
import com.sdk.shopify.shopify.ChannelDefinitionQuery;
import com.sdk.shopify.shopify.CurrencyCode;
import com.sdk.shopify.shopify.CustomerQueryDefinition;
import com.sdk.shopify.shopify.FulfillmentQuery;
import com.sdk.shopify.shopify.FulfillmentQueryDefinition;
import com.sdk.shopify.shopify.LineItem;
import com.sdk.shopify.shopify.LineItemConnection;
import com.sdk.shopify.shopify.MailingAddressQueryDefinition;
import com.sdk.shopify.shopify.MoneyBagQueryDefinition;
import com.sdk.shopify.shopify.MoneyInput;
import com.sdk.shopify.shopify.MoneyV2QueryDefinition;
import com.sdk.shopify.shopify.MutationQuery;
import com.sdk.shopify.shopify.MutationResponse;
import com.sdk.shopify.shopify.OnlineStoreTheme;
import com.sdk.shopify.shopify.OnlineStoreThemeConnection;
import com.sdk.shopify.shopify.OnlineStoreThemeFile;
import com.sdk.shopify.shopify.OnlineStoreThemeFileBodyBase64Query;
import com.sdk.shopify.shopify.OnlineStoreThemeFileBodyTextQuery;
import com.sdk.shopify.shopify.OnlineStoreThemeFileBodyUrlQuery;
import com.sdk.shopify.shopify.OnlineStoreThemeFileConnection;
import com.sdk.shopify.shopify.OnlineStoreThemeQueryDefinition;
import com.sdk.shopify.shopify.Operations;
import com.sdk.shopify.shopify.Order;
import com.sdk.shopify.shopify.OrderConnection;
import com.sdk.shopify.shopify.OrderQueryDefinition;
import com.sdk.shopify.shopify.OrderRiskAssessmentQuery;
import com.sdk.shopify.shopify.PageInfo;
import com.sdk.shopify.shopify.QueryResponse;
import com.sdk.shopify.shopify.QueryRootQuery;
import com.sdk.shopify.shopify.UserError;
import com.sdk.shopify.util.GraphQLUtils;
import com.sdk.shopify.util.ShopifyUtils;
import com.shopify.graphql.support.ID;
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
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * Main client for interacting with the Shopify Admin API. Provides methods for
 * querying Shopify
 * GraphQL endpoints with automatic pagination and retry capabilities.
 */
@Slf4j
@Data
public class ShopifySdk {

  private final String storeName;
  private final String apiKey;
  private String apiVersion = "2025-01";
  private static final int BATCH_SIZE = 100;
  private static final int MAX_PAGES = 100; // Safety limit for pagination

  private final HttpClient httpClient;
  private final Retry retry;
  private final ArgumentMapper argumentMapper = ArgumentMapper.INSTANCE;
  private final QueryAdminFactory queryAdminFactory;

  private static final Integer DEFAULT_CONNECT_TIMEOUT_MS = 30000;
  private static final Long DEFAULT_RETRY_DELAY_MS = 1000L;
  private static final Integer DEFAULT_MAX_RETRY_ATTEMPTS = 5;

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
   * @throws IllegalArgumentException if required parameters are missing or
   *                                  invalid
   */
  @Builder
  public ShopifySdk(
      String storeName,
      String apiKey,
      String apiVersion,
      Integer connectTimeoutMs,
      Long retryDelayMs,
      Integer maxRetryAttempts) {

    // Validate required parameters
    if (storeName == null || storeName.isEmpty()) {
      throw new IllegalArgumentException("Store name cannot be null or empty");
    }

    if (apiKey == null || apiKey.isEmpty()) {
      throw new IllegalArgumentException("API key cannot be null or empty");
    }

    this.storeName = storeName;
    this.apiKey = apiKey;

    // Validate and set optional parameters
    if (apiVersion != null && !apiVersion.isEmpty()) {
      this.apiVersion = apiVersion;
    }

    // Validate numeric parameters
    if (connectTimeoutMs != null && connectTimeoutMs <= 0) {
      throw new IllegalArgumentException("Connect timeout must be positive");
    }

    if (retryDelayMs != null && retryDelayMs <= 0) {
      throw new IllegalArgumentException("Retry delay must be positive");
    }

    if (maxRetryAttempts != null && maxRetryAttempts <= 0) {
      throw new IllegalArgumentException("Max retry attempts must be positive");
    }

    // Configure HttpClient with timeout and HTTP/2 support
    this.httpClient = HttpClient.newBuilder()
        .connectTimeout(Duration.ofMillis(
            connectTimeoutMs == null ? DEFAULT_CONNECT_TIMEOUT_MS : connectTimeoutMs))
        .version(HttpClient.Version.HTTP_2) // Use HTTP/2 for better connection management
        .build();

    // Set default values if not provided
    long retryDelay = retryDelayMs != null ? retryDelayMs : DEFAULT_RETRY_DELAY_MS;
    int maxAttempts = maxRetryAttempts != null ? maxRetryAttempts : DEFAULT_MAX_RETRY_ATTEMPTS;

    // Configure Resilience4j retry
    RetryConfig retryConfig = RetryConfig.custom()
        .maxAttempts(maxAttempts)
        .retryExceptions(
            IOException.class, InterruptedException.class, URISyntaxException.class)
        .retryOnResult(
            response -> {
              if (response instanceof HttpResponse) {
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
            event -> log.warn(
                "Retry attempt {} after {} ms",
                event.getNumberOfRetryAttempts(),
                event.getWaitInterval().toMillis()));
    this.queryAdminFactory = new QueryAdminFactory(this);
  }

  /**
   * Query orders with automatic pagination.
   *
   * @param orderQueryDefinition The order query definition
   * @param sortKey              The field to sort by
   * @return List of all orders matching the query
   */
  public List<Order> queryOrders(OrderQueryDefinition orderQueryDefinition, Argument argument) {
    argument.defaultValues();
    boolean hasNextPage = true;
    String cursor = null;
    List<Order> orders = new ArrayList<>();
    int pageCount = 0;

    while (hasNextPage && pageCount < MAX_PAGES) {
      argument.setAfter(cursor);
      OrderConnection orderConnection = queryOrdersInOnePage(orderQueryDefinition, argument);
      List<Order> nodes = orderConnection.getNodes();
      if (nodes != null && !nodes.isEmpty()) {
        orders.addAll(nodes);
      } else {
        // No data returned, break to prevent potential infinite loop
        break;
      }

      hasNextPage = orderConnection.getPageInfo().getHasNextPage();
      cursor = orderConnection.getPageInfo().getEndCursor();
      pageCount++;
    }

    if (pageCount >= MAX_PAGES) {
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
  public OrderConnection queryOrdersInOnePage(OrderQueryDefinition orderQueryDefinition,
      Argument argument) {
    QueryRootQuery query = Operations.query(
        q -> q.orders(arg -> argumentMapper.updateToOrderArguments(argument, arg),
            o -> o.nodes(orderQueryDefinition)
                .pageInfo(p -> p.startCursor().endCursor().hasPreviousPage().hasNextPage())));
    String queryOrder = query.toString();
    String lineItemsQuery = null;
    if (isOrderQueryContainLineItem(query)) {
      String[] extractAndModified = ShopifyUtils.extractAndRemoveFromShopifyQuery(queryOrder,
          "lineItems");
      lineItemsQuery = extractAndModified[0];
      queryOrder = extractAndModified[1];
    }
    QueryResponse response = ((GraphQLAdminHelper) queryAdminFactory.createAdminHelper(AdminHelperType.GRAPHQL))
        .queryShopifyAdmin(queryOrder);
    OrderConnection orders = response.getData().getOrders();
    if (lineItemsQuery != null) {
      for (Order order : orders.getNodes()) {
        queryLineItemsItemForOrder(order, lineItemsQuery);
      }
    }
    return orders;
  }

  private boolean isOrderQueryContainLineItem(QueryRootQuery rootQuery) {
    try {
      return rootQuery.toString().contains("lineItems");
    } catch (Exception exception) {
      log.info("Error while checking if order query contains line items", exception);
    }

    return false;
  }

  private void queryLineItemsItemForOrder(Order order, String lineItemQuery) {
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

      QueryResponse queryResponse = ((GraphQLAdminHelper) queryAdminFactory.createAdminHelper(AdminHelperType.GRAPHQL))
          .queryShopifyAdmin(orderLineItemQuery);
      LineItemConnection lineItemConnection = queryResponse.getData().getOrder().getLineItems();
      List<LineItem> nodes = lineItemConnection.getNodes();
      if (nodes != null && !nodes.isEmpty()) {
        lineItems.addAll(nodes);
      } else {
        // No data returned, break to prevent potential infinite loop
        break;
      }
      PageInfo pageInfo = lineItemConnection.getPageInfo();
      hasNextPage = pageInfo.getHasNextPage();
      cursor = pageInfo.getEndCursor();

    }
    if (!lineItems.isEmpty()) {
      order.setLineItems(new LineItemConnection().setNodes(lineItems));
    }
  }

  /**
   * Determine if a response should be retried based on its status code.
   *
   * @param response The HTTP response
   * @return true if the request should be retried
   */
  private boolean shouldRetryResponse(HttpResponse<?> response) {
    int statusCode = response.statusCode();
    return (statusCode >= 500) ||
        (statusCode == LOCKED_STATUS_CODE) ||
        (statusCode == TOO_MANY_REQUESTS_STATUS_CODE);
  }

  public List<OnlineStoreTheme> queryAllThemes() {
    List<OnlineStoreTheme> themes = new ArrayList<>();
    boolean hasNextPage = true;
    String cursor = null;
    while (hasNextPage) {

      String finalCursor = cursor;
      QueryRootQuery query = Operations.query(
          q -> q.themes(
              arg -> arg.first(BATCH_SIZE).after(finalCursor),
              themeQuery -> themeQuery.nodes(
                  themeQueryDef -> themeQueryDef.themeStoreId().createdAt().role().name().updatedAt())));
      QueryResponse queryResponse = ((GraphQLAdminHelper) queryAdminFactory.createAdminHelper(AdminHelperType.GRAPHQL))
          .queryShopifyAdmin(query);
      OnlineStoreThemeConnection onlineStoreThemeConnection = queryResponse.getData().getThemes();
      List<OnlineStoreTheme> nodes = onlineStoreThemeConnection.getNodes();
      if (nodes != null && !nodes.isEmpty()) {
        themes.addAll(nodes);
      } else {
        break;
      }
      PageInfo pageInfo = onlineStoreThemeConnection.getPageInfo();
      if (pageInfo == null) {
        break;
      }
      hasNextPage = pageInfo.getHasNextPage();
      cursor = pageInfo.getEndCursor();
    }
    return themes;
  }

  /**
   * Build a query definition for OnlineStoreTheme that includes pagination
   * information.
   * This query definition is designed to be used with pagination to fetch all
   * theme files.
   *
   * @return A query definition for OnlineStoreTheme
   */
  public OnlineStoreThemeQueryDefinition buildOnlineStoreThemeQuery() {
    return (q) -> q.createdAt()
        .updatedAt()
        .files(
            arg -> arg.first(BATCH_SIZE),
            f -> f.nodes(
                n -> n.updatedAt().filename().contentType().createdAt().size()
                    .body(b -> b.onOnlineStoreThemeFileBodyUrl(OnlineStoreThemeFileBodyUrlQuery::url)

                        .onOnlineStoreThemeFileBodyText(
                            OnlineStoreThemeFileBodyTextQuery::content))
                    .body(
                        n1 -> n1.onOnlineStoreThemeFileBodyBase64(OnlineStoreThemeFileBodyBase64Query::contentBase64)))
                .pageInfo(p -> p.hasNextPage().endCursor()));
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
              buildOnlineStoreThemeQuery()));

      // If we have a cursor, modify the query to use it
      String queryStr = query.toString();
      if (cursor != null) {
        // Replace the files argument to include the after parameter
        queryStr = queryStr.replace(
            "files(first:" + BATCH_SIZE + ")",
            "files(first:" + BATCH_SIZE + ",after:\"" + cursor + "\")");
      }

      // Execute the query
      QueryResponse response = ((GraphQLAdminHelper) queryAdminFactory.createAdminHelper(AdminHelperType.GRAPHQL))
          .queryShopifyAdmin(queryStr);
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

  public OrderQueryDefinition buildOrderQuery() {
    return (q) -> q.name().email()
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
                .taxLines(arg -> arg.first(5),
                    t -> t.title().rate().ratePercentage().priceSet(buildMoneyBagQuery()).source().channelLiable())))
        .displayAddress(buildMailingAddressQuery())
        .billingAddress(buildMailingAddressQuery())
        .shippingAddress(buildMailingAddressQuery())
        .note()
        .risk(r -> r.recommendation().assessments(OrderRiskAssessmentQuery::riskLevel))
        .totalOutstandingSet(buildMoneyBagQuery())
        .sourceName()
        .paymentTerms(p -> p.dueInDays().overdue().paymentTermsName());
  }

  private MoneyBagQueryDefinition buildMoneyBagQuery() {
    return (mB -> mB.shopMoney(m -> m.amount().currencyCode())
        .presentmentMoney(m -> m.amount().currencyCode()));
  }

  private MoneyV2QueryDefinition buildMoneyV2Query() {
    return (m -> m.amount().currencyCode());
  }

  private MailingAddressQueryDefinition buildMailingAddressQuery() {
    return (mAq -> mAq.company()
        .address1()
        .address2()
        .city()
        .name()
        .phone()
        .coordinatesValidated()
        .country()
        .countryCodeV2()
        .formattedArea()
        .province()
        .provinceCode()
        .timeZone()
        .validationResultSummary());
  }

  public static void main(String[] args) {
    ShopifySdk sdk = ShopifySdk.builder()
        .apiKey("api_key")
        .storeName("kezlo-test-2")
        .build();

    // Example of querying orders with customer
    List<Order> orders = sdk.queryOrders(sdk.buildOrderQueryDefinition(), Argument.builder().first(10).build());
    System.out.println("Found " + orders.size() + " orders:");
    for (Order order : orders) {
      System.out.println("Order: " + order.getName());
      System.out.println("Customer: " + order.getCustomer());
    }

    // // Example of querying orders
    // List<OnlineStoreThemeFile> files =
    // sdk.queryAllThemeFiles("gid://shopify/OnlineStoreTheme/168800911680");
    // System.out.println("Found " + files.size() + " files:");

  }

  /**
   * Create an app subscription for a plan.
   *
   * @param planName  The name of the subscription plan
   * @param returnUrl The URL that the merchant is redirected to after approving
   *                  the app subscription
   * @param lineItems List of subscription line items containing pricing details
   * @param test      Whether the app subscription is a test transaction
   *                  (optional)
   * @param trialDays The number of days of the free trial period (optional)
   * @return The app subscription create payload containing the subscription
   *         details and confirmation URL
   * @throws ShopifySdkException if the subscription creation fails
   */
  public AppSubscriptionCreatePayload createAppSubscription(
      String planName,
      String returnUrl,
      List<AppSubscriptionLineItemInput> lineItems,
      Boolean test,
      Integer trialDays) {

    // Validate required parameters
    if (planName == null || planName.isEmpty()) {
      throw new IllegalArgumentException("Plan name cannot be null or empty");
    }

    if (returnUrl == null || returnUrl.isEmpty()) {
      throw new IllegalArgumentException("Return URL cannot be null or empty");
    }

    if (lineItems == null || lineItems.isEmpty()) {
      throw new IllegalArgumentException("Line items cannot be null or empty");
    }

    try {
      // Create the mutation query
      MutationQuery mutation = Operations.mutation(m -> m.appSubscriptionCreate(
          planName,
          lineItems,
          returnUrl,
          args -> {
            if (test != null) {
              args.test(test);
            }
            if (trialDays != null) {
              args.trialDays(trialDays);
            }
          },
          payload -> payload
              .appSubscription(buildAppSubscriptionQueryDefinition())
              .confirmationUrl()
              .userErrors(error -> error
                  .field()
                  .message())));

      MutationResponse mutationResponse = ((MutationAdminHelper) queryAdminFactory
          .createAdminHelper(AdminHelperType.MUTATION)).queryShopifyAdmin(mutation);

      if (mutationResponse.getData() == null) {
        throw new ShopifySdkException("Invalid response structure from Shopify API");
      }

      AppSubscriptionCreatePayload payload = mutationResponse.getData().getAppSubscriptionCreate();

      // Check for user errors
      if (payload.getUserErrors() != null && !payload.getUserErrors().isEmpty()) {
        String errorMessages = payload.getUserErrors().stream()
            .map(UserError::getMessage)
            .collect(java.util.stream.Collectors.joining("; "));
        throw new ShopifySdkException("App subscription creation failed: " + errorMessages);
      }

      return payload;

    } catch (Exception e) {
      log.error("method: createAppSubscription, error", e);
      throw new ShopifySdkException("Failed to create app subscription", e);
    }
  }

  /**
   * Helper method to create a recurring pricing line item for app subscriptions.
   *
   * @param amount       The amount to charge
   * @param currencyCode The currency code
   * @param interval     The billing interval (EVERY_30_DAYS or ANNUAL)
   * @return AppSubscriptionLineItemInput configured for recurring pricing
   */
  public static AppSubscriptionLineItemInput createRecurringLineItem(
      java.math.BigDecimal amount,
      CurrencyCode currencyCode,
      AppPricingInterval interval) {

    MoneyInput price = new MoneyInput(amount, currencyCode);
    AppRecurringPricingInput recurringPricing = new AppRecurringPricingInput(price)
        .setInterval(interval);

    AppPlanInput plan = new AppPlanInput()
        .setAppRecurringPricingDetails(recurringPricing);

    return new AppSubscriptionLineItemInput(plan);
  }

  /**
   * Helper method to create a usage-based pricing line item for app
   * subscriptions.
   *
   * @param cappedAmount The maximum amount that can be charged in the billing
   *                     cycle
   * @param currencyCode The currency code
   * @param terms        The terms and conditions for usage pricing
   * @return AppSubscriptionLineItemInput configured for usage pricing
   */
  public static AppSubscriptionLineItemInput createUsageLineItem(
      java.math.BigDecimal cappedAmount,
      CurrencyCode currencyCode,
      String terms) {

    MoneyInput cappedMoney = new MoneyInput(cappedAmount, currencyCode);
    AppUsagePricingInput usagePricing = new AppUsagePricingInput(cappedMoney, terms);

    AppPlanInput plan = new AppPlanInput()
        .setAppUsagePricingDetails(usagePricing);

    return new AppSubscriptionLineItemInput(plan);
  }

  /**
   * Cancel an app subscription on a store.
   *
   * @param id      The ID of the app subscription to cancel
   * @param prorate Whether to issue prorated credits for the unused portion of
   *                the app subscription
   * @return The app subscription cancel payload containing the cancelled
   *         subscription details
   * @throws ShopifySdkException if the subscription cancellation fails
   */
  public AppSubscriptionCancelPayload cancelAppSubscription(String id, Boolean prorate) {

    // Validate required parameters
    if (id == null || id.isEmpty()) {
      throw new IllegalArgumentException("Subscription ID cannot be null or empty");
    }

    try {
      // Create the mutation query
      MutationQuery mutation = Operations.mutation(m -> m.appSubscriptionCancel(
          new ID(id),
          args -> {
            if (prorate != null) {
              args.prorate(prorate);
            }
          },
          payload -> {
            payload
                .appSubscription(buildAppSubscriptionQueryDefinition())
                .userErrors(error -> error
                    .field()
                    .message());
          }));

      MutationResponse mutationResponse = ((MutationAdminHelper) queryAdminFactory
          .createAdminHelper(AdminHelperType.MUTATION)).queryShopifyAdmin(mutation);

      if (mutationResponse.getData() == null) {
        throw new ShopifySdkException("Invalid response structure from Shopify API");
      }

      AppSubscriptionCancelPayload payload = mutationResponse.getData().getAppSubscriptionCancel();

      // Check for user errors
      if (payload.getUserErrors() != null && !payload.getUserErrors().isEmpty()) {
        StringBuilder errorMessage = new StringBuilder("App subscription cancellation failed: ");
        for (UserError error : payload.getUserErrors()) {
          errorMessage.append(error.getMessage()).append("; ");
        }
        throw new ShopifySdkException(errorMessage.toString());
      }

      return payload;

    } catch (Exception e) {
      log.error("method: cancelAppSubscription, error", e);
      throw new ShopifySdkException("Failed to cancel app subscription", e);
    }
  }

  /**
   * Cancel an app subscription on a store without proration.
   * This is a convenience method that calls cancelAppSubscription with
   * prorate=false.
   *
   * @param id The ID of the app subscription to cancel
   * @return The app subscription cancel payload containing the cancelled
   *         subscription details
   * @throws ShopifySdkException if the subscription cancellation fails
   */
  public AppSubscriptionCancelPayload cancelAppSubscription(String id) {
    return cancelAppSubscription(id, false);
  }

  private AppSubscriptionQueryDefinition buildAppSubscriptionQueryDefinition() {
    return (subscription) -> subscription
        .name()
        .status()
        .test()
        .trialDays()
        .returnUrl()
        .createdAt()
        .currentPeriodEnd()
        .lineItems(lineItem -> lineItem
            .plan(plan -> plan
                .pricingDetails(details -> details
                    .onAppRecurringPricing(recurring -> recurring
                        .price(price -> price.amount().currencyCode())
                        .interval()
                        .discount(discount -> discount
                            .value(value -> value
                                .onAppSubscriptionDiscountAmount(amount -> amount
                                    .amount(money -> money.amount().currencyCode()))
                                .onAppSubscriptionDiscountPercentage(percentage -> percentage
                                    .percentage()))
                            .durationLimitInIntervals()))
                    .onAppUsagePricing(usage -> usage
                        .cappedAmount(capped -> capped.amount().currencyCode())
                        .terms()
                        .interval()))));
  }

  public OrderQueryDefinition buildOrderQueryDefinition() {
    return o -> o.name()
        .email()
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
        .fulfillments(arg -> arg.first(50), buildFulfillmentQuery())
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
        .customer(buildCustomerQuery())
        .currentCartDiscountAmountSet(buildMoneyBagQuery())
        .shippingLine(sl -> sl.title().id())
        .lineItems(
            arg -> arg.first(50),
            l -> l.nodes(
                lq -> lq.name()
                    .discountedUnitPriceSet(buildMoneyBagQuery())
                    .quantity()
                    .originalUnitPriceSet(buildMoneyBagQuery())
                    .sku()
                    .requiresShipping()
                    .taxable()
                    .vendor()
                    .discountedTotalSet(buildMoneyBagQuery())
                    .taxLines(
                        arg -> arg.first(5),
                        t -> t.title()
                            .rate()
                            .ratePercentage()
                            .priceSet(buildMoneyBagQuery())
                            .source()
                            .channelLiable())))
        .displayAddress(buildMailingAddressQuery())
        .billingAddress(buildMailingAddressQuery())
        .shippingAddress(buildMailingAddressQuery())
        .note()
        .risk(r -> r.recommendation().assessments(OrderRiskAssessmentQuery::riskLevel))
        .totalOutstandingSet(buildMoneyBagQuery())
        .sourceName()
        .channelInformation(
            ci -> ci.channelId().channelDefinition(ChannelDefinitionQuery::channelName))
        .publication(
            publicationQuery -> publicationQuery.catalog(catalogQuery -> catalogQuery.id().title().status()))
        .tags()
        .paymentTerms(p -> p.dueInDays().overdue().paymentTermsName());
  }

  private FulfillmentQueryDefinition buildFulfillmentQuery() {
    return (f -> f.createdAt()
        .displayStatus()
        .inTransitAt()
        .deliveredAt()
        .estimatedDeliveryAt()
        .name()
        .requiresShipping()
        .status()
        .trackingInfo(tr -> tr.url().company().number())
        .createdAt()
        .requiresShipping()
        .estimatedDeliveryAt()
        .legacyResourceId());
  }

  private CustomerQueryDefinition buildCustomerQuery() {
    return (c) -> c.addressesV2(arg -> arg.first(50), add -> add.nodes(buildMailingAddressQuery()))
        .amountSpent(buildMoneyV2Query())
        .createdAt()
        .displayName()
        .firstName()
        .lastName()
        .state()
        .tags()
        .taxExempt()
        .taxExemptions()
        .updatedAt()
        .verifiedEmail();
  }
}