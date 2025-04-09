// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

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

