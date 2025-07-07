// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of a order create manual payment mutation.
*/
public class OrderCreateManualPaymentOrderCreateManualPaymentErrorQuery extends Query<OrderCreateManualPaymentOrderCreateManualPaymentErrorQuery> {
    OrderCreateManualPaymentOrderCreateManualPaymentErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public OrderCreateManualPaymentOrderCreateManualPaymentErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public OrderCreateManualPaymentOrderCreateManualPaymentErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public OrderCreateManualPaymentOrderCreateManualPaymentErrorQuery message() {
        startField("message");

        return this;
    }
}
