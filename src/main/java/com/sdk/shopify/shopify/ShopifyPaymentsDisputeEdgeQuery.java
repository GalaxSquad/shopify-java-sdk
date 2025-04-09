// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one ShopifyPaymentsDispute and a cursor during pagination.
*/
public class ShopifyPaymentsDisputeEdgeQuery extends Query<ShopifyPaymentsDisputeEdgeQuery> {
    ShopifyPaymentsDisputeEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public ShopifyPaymentsDisputeEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of ShopifyPaymentsDisputeEdge.
    */
    public ShopifyPaymentsDisputeEdgeQuery node(ShopifyPaymentsDisputeQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new ShopifyPaymentsDisputeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
