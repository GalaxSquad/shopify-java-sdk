// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

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
