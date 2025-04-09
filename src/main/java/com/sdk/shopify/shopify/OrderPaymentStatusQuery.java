// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The status of a customer's payment for an order.
*/
public class OrderPaymentStatusQuery extends Query<OrderPaymentStatusQuery> {
    OrderPaymentStatusQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * A message describing an error during the asynchronous processing of a payment.
    */
    public OrderPaymentStatusQuery errorMessage() {
        startField("errorMessage");

        return this;
    }

    /**
    * The ID of the payment, initially returned by an `orderCreateMandatePayment` or `orderCreatePayment`
    * mutation.
    */
    public OrderPaymentStatusQuery paymentReferenceId() {
        startField("paymentReferenceId");

        return this;
    }

    /**
    * The status of the payment.
    */
    public OrderPaymentStatusQuery status() {
        startField("status");

        return this;
    }

    /**
    * The transaction associated with the payment.
    */
    public OrderPaymentStatusQuery transactions(OrderTransactionQueryDefinition queryDef) {
        startField("transactions");

        _queryBuilder.append('{');
        queryDef.define(new OrderTransactionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A translated message describing an error during the asynchronous processing of a payment.
    */
    public OrderPaymentStatusQuery translatedErrorMessage() {
        startField("translatedErrorMessage");

        return this;
    }
}
