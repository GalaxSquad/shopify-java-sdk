// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents a Subscription Draft error.
*/
public class SubscriptionDraftUserErrorQuery extends Query<SubscriptionDraftUserErrorQuery> {
    SubscriptionDraftUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public SubscriptionDraftUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public SubscriptionDraftUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public SubscriptionDraftUserErrorQuery message() {
        startField("message");

        return this;
    }
}
