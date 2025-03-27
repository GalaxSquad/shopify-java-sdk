// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `OrderCreateMandatePayment`.
*/
public class OrderCreateMandatePaymentUserErrorQuery extends Query<OrderCreateMandatePaymentUserErrorQuery> {
    OrderCreateMandatePaymentUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public OrderCreateMandatePaymentUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public OrderCreateMandatePaymentUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public OrderCreateMandatePaymentUserErrorQuery message() {
        startField("message");

        return this;
    }
}
