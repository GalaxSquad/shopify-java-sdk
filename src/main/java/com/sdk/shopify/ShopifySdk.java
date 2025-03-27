package com.sdk.shopify;

import com.sdk.shopify.shopify.QueryResponse;
import com.sdk.shopify.shopify.QueryRootQuery;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ShopifySdk {

  private String storeName;
  private String apiKey;
  private String apiVersion = "2025-01";
  private HttpClient httpClient = HttpClient.newHttpClient();
  private final String ACCESS_TOKEN_HEADER = "X-Shopify-Access-Token";

  public ShopifySdk(String storeName, String apiKey) {
    this.storeName = storeName;
    this.apiKey = apiKey;
  }

  public QueryResponse queryShopifyAdmin(QueryRootQuery rootQuery) {
    String jsonPayload = String.format("{\"query\":\"%s\"}",
        rootQuery.toString().replace("\"", "\\\"").replace("\n", "\\n"));
    return queryShopifyAdmin(jsonPayload);
  }

  public QueryResponse queryShopifyAdmin(String payload) {
    try {
      HttpRequest request =  HttpRequest.newBuilder()
          .uri(new URI(buildAdminGraphQLUrl()))
          .POST(HttpRequest.BodyPublishers.ofString(payload))
          .header("Content-Type", "application/json")
          .header(ACCESS_TOKEN_HEADER, apiKey)
          .build();
      HttpResponse<String> response = httpClient.send(request, BodyHandlers.ofString());
      if(response.statusCode() != 200) {
        log.error("Error when execute GraphQL request: {} - {}", response.statusCode(), response.body());
        return null;
      }

      return QueryResponse.fromJson(response.body());
    } catch (Exception e) {
      log.error("Error when execute shopify admin graphql api", e);
      throw new RuntimeException(e);
    }
  }

  private String buildAdminGraphQLUrl () {
    return "https://" + storeName + ".myshopify.com/admin/api/" + apiVersion + "/graphql.json";
  }
}
