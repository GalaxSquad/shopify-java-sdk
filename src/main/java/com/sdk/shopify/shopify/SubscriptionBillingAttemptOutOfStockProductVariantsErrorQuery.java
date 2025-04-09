// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An inventory error caused by an issue with one or more of the contract merchandise lines.
*/
public class SubscriptionBillingAttemptOutOfStockProductVariantsErrorQuery extends Query<SubscriptionBillingAttemptOutOfStockProductVariantsErrorQuery> {
    SubscriptionBillingAttemptOutOfStockProductVariantsErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The code for the error.
    */
    public SubscriptionBillingAttemptOutOfStockProductVariantsErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * An explanation of the error.
    */
    public SubscriptionBillingAttemptOutOfStockProductVariantsErrorQuery message() {
        startField("message");

        return this;
    }
}
