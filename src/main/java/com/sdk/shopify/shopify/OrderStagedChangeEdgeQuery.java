// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one OrderStagedChange and a cursor during pagination.
*/
public class OrderStagedChangeEdgeQuery extends Query<OrderStagedChangeEdgeQuery> {
    OrderStagedChangeEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public OrderStagedChangeEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of OrderStagedChangeEdge.
    */
    public OrderStagedChangeEdgeQuery node(OrderStagedChangeQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new OrderStagedChangeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
