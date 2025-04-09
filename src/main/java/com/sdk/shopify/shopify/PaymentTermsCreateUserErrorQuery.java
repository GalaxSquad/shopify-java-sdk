// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `PaymentTermsCreate`.
*/
public class PaymentTermsCreateUserErrorQuery extends Query<PaymentTermsCreateUserErrorQuery> {
    PaymentTermsCreateUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public PaymentTermsCreateUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public PaymentTermsCreateUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public PaymentTermsCreateUserErrorQuery message() {
        startField("message");

        return this;
    }
}
