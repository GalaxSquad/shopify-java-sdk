// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one SubscriptionDiscount and a cursor during pagination.
*/
public class SubscriptionDiscountEdgeQuery extends Query<SubscriptionDiscountEdgeQuery> {
    SubscriptionDiscountEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public SubscriptionDiscountEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of SubscriptionDiscountEdge.
    */
    public SubscriptionDiscountEdgeQuery node(SubscriptionDiscountQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionDiscountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
