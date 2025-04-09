// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one Order and a cursor during pagination.
*/
public class OrderEdgeQuery extends Query<OrderEdgeQuery> {
    OrderEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public OrderEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of OrderEdge.
    */
    public OrderEdgeQuery node(OrderQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new OrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
