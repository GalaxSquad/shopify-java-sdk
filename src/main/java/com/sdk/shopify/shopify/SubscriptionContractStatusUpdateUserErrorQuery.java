// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents a subscription contract status update error.
*/
public class SubscriptionContractStatusUpdateUserErrorQuery extends Query<SubscriptionContractStatusUpdateUserErrorQuery> {
    SubscriptionContractStatusUpdateUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public SubscriptionContractStatusUpdateUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public SubscriptionContractStatusUpdateUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public SubscriptionContractStatusUpdateUserErrorQuery message() {
        startField("message");

        return this;
    }
}
