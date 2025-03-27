// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

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
