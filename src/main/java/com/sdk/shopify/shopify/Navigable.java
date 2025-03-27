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

/**
* A default cursor that you can use in queries to paginate your results. Each edge in a connection can
* return a cursor, which is a reference to the edge's position in the connection. You can use an
* edge's cursor as
* the starting point to retrieve the nodes before or after it in a connection.
* To learn more about using cursor-based pagination, refer to
* [Paginating results with GraphQL](https://shopify.dev/api/usage/pagination-graphql).
*/

public interface Navigable {
    String getGraphQlTypeName();

    String getDefaultCursor();
}

