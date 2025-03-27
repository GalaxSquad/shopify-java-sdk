// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Failure determining available shipping options for delivery of a subscription contract.
*/
public class SubscriptionShippingOptionResultFailureQuery extends Query<SubscriptionShippingOptionResultFailureQuery> {
    SubscriptionShippingOptionResultFailureQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Failure reason.
    */
    public SubscriptionShippingOptionResultFailureQuery message() {
        startField("message");

        return this;
    }
}
