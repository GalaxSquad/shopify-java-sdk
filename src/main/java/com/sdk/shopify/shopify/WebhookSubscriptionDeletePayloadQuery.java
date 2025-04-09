// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `webhookSubscriptionDelete` mutation.
*/
public class WebhookSubscriptionDeletePayloadQuery extends Query<WebhookSubscriptionDeletePayloadQuery> {
    WebhookSubscriptionDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ID of the deleted webhook subscription.
    */
    public WebhookSubscriptionDeletePayloadQuery deletedWebhookSubscriptionId() {
        startField("deletedWebhookSubscriptionId");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public WebhookSubscriptionDeletePayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
