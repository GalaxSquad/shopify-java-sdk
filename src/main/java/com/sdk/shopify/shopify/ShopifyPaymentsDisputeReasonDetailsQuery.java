// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Details regarding a dispute reason.
*/
public class ShopifyPaymentsDisputeReasonDetailsQuery extends Query<ShopifyPaymentsDisputeReasonDetailsQuery> {
    ShopifyPaymentsDisputeReasonDetailsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The raw code provided by the payment network.
    */
    public ShopifyPaymentsDisputeReasonDetailsQuery networkReasonCode() {
        startField("networkReasonCode");

        return this;
    }

    /**
    * The reason for the dispute provided by the cardholder's banks.
    */
    public ShopifyPaymentsDisputeReasonDetailsQuery reason() {
        startField("reason");

        return this;
    }
}
