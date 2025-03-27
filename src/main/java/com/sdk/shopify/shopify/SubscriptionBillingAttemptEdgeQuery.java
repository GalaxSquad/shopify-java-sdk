// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one SubscriptionBillingAttempt and a cursor during pagination.
*/
public class SubscriptionBillingAttemptEdgeQuery extends Query<SubscriptionBillingAttemptEdgeQuery> {
    SubscriptionBillingAttemptEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public SubscriptionBillingAttemptEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of SubscriptionBillingAttemptEdge.
    */
    public SubscriptionBillingAttemptEdgeQuery node(SubscriptionBillingAttemptQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionBillingAttemptQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
