// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An HTTPS endpoint to which webhook subscriptions send POST requests.
*/
public class WebhookHttpEndpointQuery extends Query<WebhookHttpEndpointQuery> {
    WebhookHttpEndpointQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The URL to which the webhooks events are sent.
    */
    public WebhookHttpEndpointQuery callbackUrl() {
        startField("callbackUrl");

        return this;
    }
}
