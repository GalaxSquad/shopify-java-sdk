// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `CustomerPaymentMethodCreateFromDuplicationData`.
*/
public class CustomerPaymentMethodCreateFromDuplicationDataUserErrorQuery extends Query<CustomerPaymentMethodCreateFromDuplicationDataUserErrorQuery> {
    CustomerPaymentMethodCreateFromDuplicationDataUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public CustomerPaymentMethodCreateFromDuplicationDataUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public CustomerPaymentMethodCreateFromDuplicationDataUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public CustomerPaymentMethodCreateFromDuplicationDataUserErrorQuery message() {
        startField("message");

        return this;
    }
}
