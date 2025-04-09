// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The possible errors for a subscription billing cycle.
*/
public class SubscriptionBillingCycleUserErrorQuery extends Query<SubscriptionBillingCycleUserErrorQuery> {
    SubscriptionBillingCycleUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public SubscriptionBillingCycleUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public SubscriptionBillingCycleUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public SubscriptionBillingCycleUserErrorQuery message() {
        startField("message");

        return this;
    }
}
