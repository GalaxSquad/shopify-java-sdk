package com.sdk.shopify;

import com.sdk.shopify.dto.Argument;
import com.sdk.shopify.mapper.ArgumentMapper;
import com.sdk.shopify.shopify.Operations;
import com.sdk.shopify.shopify.Order;
import com.sdk.shopify.shopify.OrderConnection;
import com.sdk.shopify.shopify.OrderQueryDefinition;
import com.sdk.shopify.shopify.OrderSortKeys;
import com.sdk.shopify.shopify.QueryResponse;
import com.sdk.shopify.shopify.QueryRootQuery;
import io.github.resilience4j.retry.Retry;
import io.github.resilience4j.retry.RetryConfig;
import io.github.resilience4j.retry.RetryRegistry;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import lombok.Builder;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ShopifySdk {

  private final String storeName;
  private final String apiKey;
  private String apiVersion = "2025-01";
  private static final int BATCH_SIZE = 50;

  private final HttpClient httpClient;
  private final Retry retry;
  private final ArgumentMapper argumentMapper = ArgumentMapper.INSTANCE;


  private static final String ACCESS_TOKEN_HEADER = "X-Shopify-Access-Token";
  private static final Integer DEFAULT_CONNECT_TIMEOUT_MS = 30000;
  private static final Long DEFAULT_RETRY_DELAY_MS = 1000L;
  private static final Integer DEFAULT_MAX_RETRY_ATTEMPTS = 5;
  private static final String HTTPS = "https://";
  private static final String SHOPIFY_SUBDOMAIN = ".myshopify.com";
  private static final String ADMIN_API = "/admin/api/";

  private static final int LOCKED_STATUS_CODE = 423;

  @Builder
  public ShopifySdk (
      String storeName,
      String apiKey,
      String apiVersion,
      Integer connectTimeoutMs,
      Long retryDelayMs,
      Integer maxRetryAttempts) {

    // Validate input parameters
    if(storeName == null || storeName.isEmpty()) {
      throw new IllegalArgumentException("Store name cannot be null or empty");
    }

    if(apiKey == null || apiKey.isEmpty()) {
      throw new IllegalArgumentException("API key cannot be null or empty");
    }

    this.storeName = storeName;
    this.apiKey = apiKey;

    if(apiVersion != null) {
      this.apiVersion = apiVersion;
    }

    // Configure HttpClient with timeout
    this.httpClient =
        HttpClient.newBuilder()
            .connectTimeout(
                Duration.ofMillis(
                    connectTimeoutMs == null ? DEFAULT_CONNECT_TIMEOUT_MS : connectTimeoutMs))
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
                  // Add jitter (±20%) to fixed delay
                  double jitter = 0.2 * retryDelay;
                  return (long) (retryDelay + ((Math.random() * 2 - 1) * jitter));
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

  public QueryResponse queryShopifyAdmin (QueryRootQuery rootQuery) {
    String jsonPayload = toJsonPayload(rootQuery);
    return queryShopifyAdmin(jsonPayload);
  }

  public QueryResponse queryShopifyAdmin (String payload) {
    try {
      Supplier<HttpResponse<String>> httpRequestSupplier =
          Retry.decorateSupplier(
              retry,
              () -> {
                try {
                  HttpRequest request =
                      HttpRequest.newBuilder()
                          .uri(new URI(buildAdminGraphQLUrl()))
                          .POST(HttpRequest.BodyPublishers.ofString(payload))
                          .header("Content-Type", "application/json")
                          .header(ACCESS_TOKEN_HEADER, apiKey)
                          .build();
                  return httpClient.send(request, BodyHandlers.ofString());
                } catch (Exception e) {
                  log.error("Error when execute shopify admin graphql api", e);
                  throw new ShopifySdkException(e);
                }
              });

      // Execute with retry
      HttpResponse<String> response = httpRequestSupplier.get();
      if(response.statusCode() != 200) {
        log.error(
            "Request error, status code: {}, response: {}", response.statusCode(), response.body());
        throw new ShopifySdkException("Error when execute shopify admin graphql api");
      }
      return QueryResponse.fromJson(response.body());
    } catch (Exception e) {
      log.error("method: queryShopifyAdmin, error", e);
      throw new ShopifySdkException(e);
    }
  }

  public List<Order> queryOrders (OrderQueryDefinition orderQueryDefinition, String sortKey) {
    Argument argument = Argument.builder()
        .first(BATCH_SIZE)
        .sortKey(sortKey)
        .build();

    boolean hasNextPage = true;
    String cursor = null;

    List<Order> orders = new ArrayList<>();

    while (hasNextPage) {
      argument.setAfter(cursor);
      OrderConnection orderConnection = queryOrdersInOnePage(orderQueryDefinition, argument);
      List<Order> nodes = orderConnection.getNodes();
      if(nodes != null && !nodes.isEmpty()) {
        orders.addAll(nodes);
      }
      hasNextPage = orderConnection.getPageInfo().getHasNextPage();
      cursor = orderConnection.getPageInfo().getEndCursor();
    }

    return orders;

  }

  public OrderConnection queryOrdersInOnePage (OrderQueryDefinition orderQueryDefinition,
      Argument argument) {
    QueryRootQuery query = Operations.query(
        q -> q.orders(arg -> argumentMapper.updateToOrderArguments(argument, arg),
            o -> o.nodes(orderQueryDefinition)
                .pageInfo(p -> p.startCursor().endCursor().hasPreviousPage().hasNextPage())));
    QueryResponse response = queryShopifyAdmin(query);
    return response.getData().getOrders();
  }

  private String buildAdminGraphQLUrl () {
    return HTTPS + storeName + SHOPIFY_SUBDOMAIN + ADMIN_API + apiVersion + "/graphql.json";
  }

  private String toJsonPayload (QueryRootQuery query) {
    return String.format(
        "{\"query\":\"%s\"}", query.toString().replace("\"", "\\\"").replace("\n", "\\n"));
  }

  private boolean shouldRetryResponse (HttpResponse<?> response) {
    int statusCode = response.statusCode();
    return (statusCode > 500) || (LOCKED_STATUS_CODE == statusCode);
  }
}
