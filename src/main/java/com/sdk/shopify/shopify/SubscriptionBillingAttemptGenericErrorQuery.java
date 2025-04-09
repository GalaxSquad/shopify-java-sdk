// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A base error type that applies to all uncategorized error classes.
*/
public class SubscriptionBillingAttemptGenericErrorQuery extends Query<SubscriptionBillingAttemptGenericErrorQuery> {
    SubscriptionBillingAttemptGenericErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The code for the error.
    */
    public SubscriptionBillingAttemptGenericErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * An explanation of the error.
    */
    public SubscriptionBillingAttemptGenericErrorQuery message() {
        startField("message");

        return this;
    }
}
