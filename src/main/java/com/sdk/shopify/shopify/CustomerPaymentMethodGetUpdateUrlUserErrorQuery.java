// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `CustomerPaymentMethodGetUpdateUrl`.
*/
public class CustomerPaymentMethodGetUpdateUrlUserErrorQuery extends Query<CustomerPaymentMethodGetUpdateUrlUserErrorQuery> {
    CustomerPaymentMethodGetUpdateUrlUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public CustomerPaymentMethodGetUpdateUrlUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public CustomerPaymentMethodGetUpdateUrlUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public CustomerPaymentMethodGetUpdateUrlUserErrorQuery message() {
        startField("message");

        return this;
    }
}
