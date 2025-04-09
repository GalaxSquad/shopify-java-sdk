// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `SubscriptionBillingCycleUnskip`.
*/
public class SubscriptionBillingCycleUnskipUserErrorQuery extends Query<SubscriptionBillingCycleUnskipUserErrorQuery> {
    SubscriptionBillingCycleUnskipUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public SubscriptionBillingCycleUnskipUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public SubscriptionBillingCycleUnskipUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public SubscriptionBillingCycleUnskipUserErrorQuery message() {
        startField("message");

        return this;
    }
}
