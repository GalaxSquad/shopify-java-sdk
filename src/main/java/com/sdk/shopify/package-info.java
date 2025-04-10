/**
 * Java SDK for interacting with the Shopify Admin GraphQL API.
 * <p>
 * This package provides a high-level client for executing GraphQL queries against
 * the Shopify Admin API with features such as:
 * <ul>
 *   <li>GraphQL query building</li>
 *   <li>Automatic pagination handling</li>
 *   <li>Error handling with custom exceptions</li>
 *   <li>Retry capabilities for transient failures</li>
 *   <li>Rate limiting management</li>
 * </ul>
 * <p>
 * The main entry point for using this SDK is the {@link com.sdk.shopify.ShopifySdk} class.
 * <p>
 * Example usage:
 * <pre>{@code
 * ShopifySdk sdk = ShopifySdk.builder()
 *     .storeName("your-store-name")
 *     .apiKey("your-api-key")
 *     .build();
 *
 * List<Order> orders = sdk.queryOrders(
 *     o -> o.id().name().email(),
 *     OrderSortKeys.CREATED_AT.toString()
 * );
 * }</pre>
 */
package com.sdk.shopify;