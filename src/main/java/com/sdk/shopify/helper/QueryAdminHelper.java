package com.sdk.shopify.helper;

import com.sdk.shopify.ShopifySdk;
import com.sdk.shopify.ShopifySdkException;
import com.sdk.shopify.shopify.Response;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Query;
import io.github.resilience4j.retry.Retry;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;
import java.util.function.Supplier;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public abstract class QueryAdminHelper<T extends Query<T>, R extends Response<? extends AbstractResponse<?>>> {

    protected final Retry retry;
    protected final HttpClient httpClient;
    protected final String apiKey;
    protected final String storeName;
    protected final String apiVersion;

    private static final String ACCESS_TOKEN_HEADER = "X-Shopify-Access-Token";
    private static final Integer DEFAULT_READ_TIMEOUT_MS = 60000;
    private static final String HTTPS_PROTOCOL = "https";
    private static final String SHOPIFY_DOMAIN_SUFFIX = ".myshopify.com";
    private static final String ADMIN_API_PATH = "/admin/api/";
    private static final String GRAPHQL_ENDPOINT = "/graphql.json";

    public QueryAdminHelper(ShopifySdk shopifySdk) {
        this.retry = shopifySdk.getRetry();
        this.httpClient = shopifySdk.getHttpClient();
        this.apiKey = shopifySdk.getApiKey();
        this.storeName = shopifySdk.getStoreName();
        this.apiVersion = shopifySdk.getApiVersion();
    }

    public HttpResponse<String> getStringHttpResponse(String payload) {
        Supplier<HttpResponse<String>> httpRequestSupplier = Retry.decorateSupplier(
                retry,
                () -> {
                    try {
                        HttpRequest request = HttpRequest.newBuilder()
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

    protected URI buildAdminGraphQLUri() {
        try {
            return new URI(
                    HTTPS_PROTOCOL,
                    storeName + SHOPIFY_DOMAIN_SUFFIX,
                    ADMIN_API_PATH + apiVersion + GRAPHQL_ENDPOINT,
                    null,
                    null);
        } catch (URISyntaxException e) {
            throw new ShopifySdkException("Invalid URL components for Shopify API endpoint", e);
        }
    }

    protected abstract String toJsonPayload(String payload);

    protected abstract String toJsonPayload(T payload);
    
    protected abstract R fromJson(String json);

    public R queryShopifyAdmin(String payload) {
        if (payload == null || payload.isEmpty()) {
          throw new IllegalArgumentException("Payload cannot be null or empty");
        }
        String query = toJsonPayload(payload);
        try {
          HttpResponse<String> response = getStringHttpResponse(query);
          if (response.statusCode() != 200) {
            log.error(
                "Request error, status code: {}, response: {}", response.statusCode(), response.body());
            throw new ShopifySdkException(
                "Error when executing Shopify admin GraphQL API. Status code: "
                    + response.statusCode());
          }
          return fromJson(response.body());
        } catch (Exception e) {
          log.error("method: queryShopifyAdmin, error", e);
          throw new ShopifySdkException("Failed to query Shopify admin API", e);
        }
      }
  
  public R queryShopifyAdmin(T payload) {
    if (payload == null || payload.toString().isEmpty()) {
      throw new IllegalArgumentException("Payload cannot be null or empty");
    }
    return queryShopifyAdmin(payload.toString());
  }
}
