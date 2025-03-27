// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `CheckoutBrandingUpsert`.
*/
public class CheckoutBrandingUpsertUserErrorQuery extends Query<CheckoutBrandingUpsertUserErrorQuery> {
    CheckoutBrandingUpsertUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public CheckoutBrandingUpsertUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public CheckoutBrandingUpsertUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public CheckoutBrandingUpsertUserErrorQuery message() {
        startField("message");

        return this;
    }
}
