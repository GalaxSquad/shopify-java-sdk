// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `pubSubWebhookSubscriptionCreate` mutation.
*/
public class PubSubWebhookSubscriptionCreatePayloadQuery extends Query<PubSubWebhookSubscriptionCreatePayloadQuery> {
    PubSubWebhookSubscriptionCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public PubSubWebhookSubscriptionCreatePayloadQuery userErrors(PubSubWebhookSubscriptionCreateUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new PubSubWebhookSubscriptionCreateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The webhook subscription that was created.
    */
    public PubSubWebhookSubscriptionCreatePayloadQuery webhookSubscription(WebhookSubscriptionQueryDefinition queryDef) {
        startField("webhookSubscription");

        _queryBuilder.append('{');
        queryDef.define(new WebhookSubscriptionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
