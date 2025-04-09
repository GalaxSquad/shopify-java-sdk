// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one OrderTransaction and a cursor during pagination.
*/
public class OrderTransactionEdgeQuery extends Query<OrderTransactionEdgeQuery> {
    OrderTransactionEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public OrderTransactionEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of OrderTransactionEdge.
    */
    public OrderTransactionEdgeQuery node(OrderTransactionQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new OrderTransactionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
