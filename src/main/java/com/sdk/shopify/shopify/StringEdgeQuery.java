// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one String and a cursor during pagination.
*/
public class StringEdgeQuery extends Query<StringEdgeQuery> {
    StringEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public StringEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of StringEdge.
    */
    public StringEdgeQuery node() {
        startField("node");

        return this;
    }
}
