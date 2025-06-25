# Shopify SDK

A Java SDK for interacting with the Shopify Admin GraphQL API.

## Overview

This SDK provides a simple way to interact with Shopify's GraphQL API, specifically for querying order data.

## Requirements

- Java: 17

## Installation

## Usage

### Initialize the SDK

```java
ShopifySdk shopifySdk =
        ShopifySdk.builder().apiKey("your-store-apikey").storeName("your-store-name").maxRetryAttempts(5).retryDelayMs(1000L).connectTimeoutMs(30000).build()
```

- Store name and API Key is mandatory
- Max Retry Attempts default: 5
- retryDelayMs default: 1000L
- connectTimeoutMs default: 30000

Query Orders Example

```java

QueryRootQuery rootQuery = Operations.query(
    q -> q.orders(
        args -> args.first(10),
        o -> o.nodes(n -> n.createdAt().currencyCode().confirmed())
            .pageInfo(p -> p.endCursor().hasPreviousPage().hasNextPage().startCursor())
    )
);

QueryResponse queryResponse = shopifySdk.queryShopifyAdmin(rootQuery);
OrderConnection orderConnection = queryResponse.getData().getOrders();
List<Order> order = orderConnection.getNodes();
```

## Features

- Query Shopify orders with pagination support
- Error handling for API responses
- Support for admin GraphQL API
