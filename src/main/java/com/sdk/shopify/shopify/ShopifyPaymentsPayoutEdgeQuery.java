// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one ShopifyPaymentsPayout and a cursor during pagination.
*/
public class ShopifyPaymentsPayoutEdgeQuery extends Query<ShopifyPaymentsPayoutEdgeQuery> {
    ShopifyPaymentsPayoutEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public ShopifyPaymentsPayoutEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of ShopifyPaymentsPayoutEdge.
    */
    public ShopifyPaymentsPayoutEdgeQuery node(ShopifyPaymentsPayoutQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new ShopifyPaymentsPayoutQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
