// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents a Subscription Contract error.
*/
public class SubscriptionContractUserErrorQuery extends Query<SubscriptionContractUserErrorQuery> {
    SubscriptionContractUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public SubscriptionContractUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public SubscriptionContractUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public SubscriptionContractUserErrorQuery message() {
        startField("message");

        return this;
    }
}
