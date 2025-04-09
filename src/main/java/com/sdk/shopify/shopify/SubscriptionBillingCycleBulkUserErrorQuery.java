// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents an error that happens during the execution of subscriptionBillingCycles mutations.
*/
public class SubscriptionBillingCycleBulkUserErrorQuery extends Query<SubscriptionBillingCycleBulkUserErrorQuery> {
    SubscriptionBillingCycleBulkUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public SubscriptionBillingCycleBulkUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public SubscriptionBillingCycleBulkUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public SubscriptionBillingCycleBulkUserErrorQuery message() {
        startField("message");

        return this;
    }
}
