// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one SubscriptionManualDiscount and a cursor during pagination.
*/
public class SubscriptionManualDiscountEdgeQuery extends Query<SubscriptionManualDiscountEdgeQuery> {
    SubscriptionManualDiscountEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public SubscriptionManualDiscountEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of SubscriptionManualDiscountEdge.
    */
    public SubscriptionManualDiscountEdgeQuery node(SubscriptionManualDiscountQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionManualDiscountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
