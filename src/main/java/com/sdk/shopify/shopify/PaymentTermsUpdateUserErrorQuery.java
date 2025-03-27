// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `PaymentTermsUpdate`.
*/
public class PaymentTermsUpdateUserErrorQuery extends Query<PaymentTermsUpdateUserErrorQuery> {
    PaymentTermsUpdateUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public PaymentTermsUpdateUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public PaymentTermsUpdateUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public PaymentTermsUpdateUserErrorQuery message() {
        startField("message");

        return this;
    }
}
