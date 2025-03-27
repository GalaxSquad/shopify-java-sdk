// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `PubSubWebhookSubscriptionUpdate`.
*/
public class PubSubWebhookSubscriptionUpdateUserErrorQuery extends Query<PubSubWebhookSubscriptionUpdateUserErrorQuery> {
    PubSubWebhookSubscriptionUpdateUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public PubSubWebhookSubscriptionUpdateUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public PubSubWebhookSubscriptionUpdateUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public PubSubWebhookSubscriptionUpdateUserErrorQuery message() {
        startField("message");

        return this;
    }
}
