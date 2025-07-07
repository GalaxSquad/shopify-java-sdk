// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;


import com.shopify.graphql.support.ID;
import java.util.List;

/**
* A list of products with publishing and pricing information.
* A catalog can be associated with a specific context, such as a
* [`Market`](https://shopify.dev/api/admin-graphql/current/objects/market),
* [`CompanyLocation`](https://shopify.dev/api/admin-graphql/current/objects/companylocation), or
* [`App`](https://shopify.dev/api/admin-graphql/current/objects/app).
*/

public interface Catalog {
    String getGraphQlTypeName();

    ID getId();

    List<ResourceOperation> getOperations();

    PriceList getPriceList();

    Publication getPublication();

    CatalogStatus getStatus();

    String getTitle();
}

