// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Returns information about pagination in a connection, in accordance with the
* [Relay specification](https://relay.dev/graphql/connections.htm#sec-undefined.PageInfo).
* For more information, please read our [GraphQL Pagination Usage
* Guide](https://shopify.dev/api/usage/pagination-graphql).
*/
public class PageInfoQuery extends Query<PageInfoQuery> {
    PageInfoQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The cursor corresponding to the last node in edges.
    */
    public PageInfoQuery endCursor() {
        startField("endCursor");

        return this;
    }

    /**
    * Whether there are more pages to fetch following the current page.
    */
    public PageInfoQuery hasNextPage() {
        startField("hasNextPage");

        return this;
    }

    /**
    * Whether there are any pages prior to the current page.
    */
    public PageInfoQuery hasPreviousPage() {
        startField("hasPreviousPage");

        return this;
    }

    /**
    * The cursor corresponding to the first node in edges.
    */
    public PageInfoQuery startCursor() {
        startField("startCursor");

        return this;
    }
}
