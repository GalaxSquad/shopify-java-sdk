// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one OrderAdjustment and a cursor during pagination.
*/
public class OrderAdjustmentEdgeQuery extends Query<OrderAdjustmentEdgeQuery> {
    OrderAdjustmentEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public OrderAdjustmentEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of OrderAdjustmentEdge.
    */
    public OrderAdjustmentEdgeQuery node(OrderAdjustmentQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new OrderAdjustmentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
