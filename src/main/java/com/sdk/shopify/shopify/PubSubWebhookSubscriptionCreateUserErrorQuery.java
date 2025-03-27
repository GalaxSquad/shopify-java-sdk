// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `PubSubWebhookSubscriptionCreate`.
*/
public class PubSubWebhookSubscriptionCreateUserErrorQuery extends Query<PubSubWebhookSubscriptionCreateUserErrorQuery> {
    PubSubWebhookSubscriptionCreateUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public PubSubWebhookSubscriptionCreateUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public PubSubWebhookSubscriptionCreateUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public PubSubWebhookSubscriptionCreateUserErrorQuery message() {
        startField("message");

        return this;
    }
}
