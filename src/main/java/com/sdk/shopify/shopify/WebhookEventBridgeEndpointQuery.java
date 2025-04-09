// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An Amazon EventBridge partner event source to which webhook subscriptions publish events.
*/
public class WebhookEventBridgeEndpointQuery extends Query<WebhookEventBridgeEndpointQuery> {
    WebhookEventBridgeEndpointQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ARN of this EventBridge partner event source.
    */
    public WebhookEventBridgeEndpointQuery arn() {
        startField("arn");

        return this;
    }
}
