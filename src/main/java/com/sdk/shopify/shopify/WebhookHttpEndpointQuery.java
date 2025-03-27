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
