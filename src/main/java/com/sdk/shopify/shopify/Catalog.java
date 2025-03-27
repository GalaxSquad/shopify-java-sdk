// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

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

