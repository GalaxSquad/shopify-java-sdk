// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents an error that happens during the execution of a billing attempt mutation.
*/
public class BillingAttemptUserErrorQuery extends Query<BillingAttemptUserErrorQuery> {
    BillingAttemptUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public BillingAttemptUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public BillingAttemptUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public BillingAttemptUserErrorQuery message() {
        startField("message");

        return this;
    }
}
