// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `PaymentTermsDelete`.
*/
public class PaymentTermsDeleteUserErrorQuery extends Query<PaymentTermsDeleteUserErrorQuery> {
    PaymentTermsDeleteUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public PaymentTermsDeleteUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public PaymentTermsDeleteUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public PaymentTermsDeleteUserErrorQuery message() {
        startField("message");

        return this;
    }
}
