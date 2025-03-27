// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

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
