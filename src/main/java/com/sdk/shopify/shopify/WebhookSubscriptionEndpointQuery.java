// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An endpoint to which webhook subscriptions send webhooks events.
*/
public class WebhookSubscriptionEndpointQuery extends Query<WebhookSubscriptionEndpointQuery> {
    WebhookSubscriptionEndpointQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public WebhookSubscriptionEndpointQuery onWebhookEventBridgeEndpoint(WebhookEventBridgeEndpointQueryDefinition queryDef) {
        startInlineFragment("WebhookEventBridgeEndpoint");
        queryDef.define(new WebhookEventBridgeEndpointQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public WebhookSubscriptionEndpointQuery onWebhookHttpEndpoint(WebhookHttpEndpointQueryDefinition queryDef) {
        startInlineFragment("WebhookHttpEndpoint");
        queryDef.define(new WebhookHttpEndpointQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public WebhookSubscriptionEndpointQuery onWebhookPubSubEndpoint(WebhookPubSubEndpointQueryDefinition queryDef) {
        startInlineFragment("WebhookPubSubEndpoint");
        queryDef.define(new WebhookPubSubEndpointQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
