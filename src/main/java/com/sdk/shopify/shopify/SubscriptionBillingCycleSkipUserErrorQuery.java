// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `SubscriptionBillingCycleSkip`.
*/
public class SubscriptionBillingCycleSkipUserErrorQuery extends Query<SubscriptionBillingCycleSkipUserErrorQuery> {
    SubscriptionBillingCycleSkipUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public SubscriptionBillingCycleSkipUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public SubscriptionBillingCycleSkipUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public SubscriptionBillingCycleSkipUserErrorQuery message() {
        startField("message");

        return this;
    }
}
