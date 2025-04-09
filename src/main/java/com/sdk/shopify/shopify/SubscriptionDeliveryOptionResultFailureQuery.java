// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A failure to find the available delivery options for a subscription contract.
*/
public class SubscriptionDeliveryOptionResultFailureQuery extends Query<SubscriptionDeliveryOptionResultFailureQuery> {
    SubscriptionDeliveryOptionResultFailureQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The reason for the failure.
    */
    public SubscriptionDeliveryOptionResultFailureQuery message() {
        startField("message");

        return this;
    }
}
