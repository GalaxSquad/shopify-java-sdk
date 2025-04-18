// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one WebhookSubscription and a cursor during pagination.
*/
public class WebhookSubscriptionEdgeQuery extends Query<WebhookSubscriptionEdgeQuery> {
    WebhookSubscriptionEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public WebhookSubscriptionEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of WebhookSubscriptionEdge.
    */
    public WebhookSubscriptionEdgeQuery node(WebhookSubscriptionQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new WebhookSubscriptionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
