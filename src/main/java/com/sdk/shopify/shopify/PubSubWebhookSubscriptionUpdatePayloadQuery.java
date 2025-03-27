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
* Return type for `pubSubWebhookSubscriptionUpdate` mutation.
*/
public class PubSubWebhookSubscriptionUpdatePayloadQuery extends Query<PubSubWebhookSubscriptionUpdatePayloadQuery> {
    PubSubWebhookSubscriptionUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public PubSubWebhookSubscriptionUpdatePayloadQuery userErrors(PubSubWebhookSubscriptionUpdateUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new PubSubWebhookSubscriptionUpdateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The webhook subscription that was updated.
    */
    public PubSubWebhookSubscriptionUpdatePayloadQuery webhookSubscription(WebhookSubscriptionQueryDefinition queryDef) {
        startField("webhookSubscription");

        _queryBuilder.append('{');
        queryDef.define(new WebhookSubscriptionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
