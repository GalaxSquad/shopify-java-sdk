// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of a payment customization mutation.
*/
public class PaymentCustomizationErrorQuery extends Query<PaymentCustomizationErrorQuery> {
    PaymentCustomizationErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public PaymentCustomizationErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public PaymentCustomizationErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public PaymentCustomizationErrorQuery message() {
        startField("message");

        return this;
    }
}
