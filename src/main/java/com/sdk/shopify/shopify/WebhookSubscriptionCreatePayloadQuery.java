// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `webhookSubscriptionCreate` mutation.
*/
public class WebhookSubscriptionCreatePayloadQuery extends Query<WebhookSubscriptionCreatePayloadQuery> {
    WebhookSubscriptionCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public WebhookSubscriptionCreatePayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The webhook subscription that was created.
    */
    public WebhookSubscriptionCreatePayloadQuery webhookSubscription(WebhookSubscriptionQueryDefinition queryDef) {
        startField("webhookSubscription");

        _queryBuilder.append('{');
        queryDef.define(new WebhookSubscriptionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
