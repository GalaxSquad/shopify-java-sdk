// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one AppSubscription and a cursor during pagination.
*/
public class AppSubscriptionEdgeQuery extends Query<AppSubscriptionEdgeQuery> {
    AppSubscriptionEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public AppSubscriptionEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of AppSubscriptionEdge.
    */
    public AppSubscriptionEdgeQuery node(AppSubscriptionQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new AppSubscriptionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
