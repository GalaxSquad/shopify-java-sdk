// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents an error in the input of a mutation.
*/
public class CustomerPaymentMethodRemoteUserErrorQuery extends Query<CustomerPaymentMethodRemoteUserErrorQuery> {
    CustomerPaymentMethodRemoteUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public CustomerPaymentMethodRemoteUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public CustomerPaymentMethodRemoteUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public CustomerPaymentMethodRemoteUserErrorQuery message() {
        startField("message");

        return this;
    }
}
