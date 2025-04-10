// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `CustomerPaymentMethodGetDuplicationData`.
*/
public class CustomerPaymentMethodGetDuplicationDataUserErrorQuery extends Query<CustomerPaymentMethodGetDuplicationDataUserErrorQuery> {
    CustomerPaymentMethodGetDuplicationDataUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public CustomerPaymentMethodGetDuplicationDataUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public CustomerPaymentMethodGetDuplicationDataUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public CustomerPaymentMethodGetDuplicationDataUserErrorQuery message() {
        startField("message");

        return this;
    }
}
