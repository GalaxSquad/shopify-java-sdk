# Shopify SDK

A Java SDK for interacting with the Shopify Admin GraphQL API.

## Overview

This SDK provides a simple way to interact with Shopify's GraphQL API, specifically for querying order data.

## Installation

## Usage
### Initialize the SDK
```
ShopifySdk shopifySdk = new ShopifySdk("your-store-name", "your-api-key");
```

Query Orders Example
```
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