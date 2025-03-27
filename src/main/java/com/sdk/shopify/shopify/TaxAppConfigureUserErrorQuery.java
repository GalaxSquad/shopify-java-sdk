// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `TaxAppConfigure`.
*/
public class TaxAppConfigureUserErrorQuery extends Query<TaxAppConfigureUserErrorQuery> {
    TaxAppConfigureUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public TaxAppConfigureUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public TaxAppConfigureUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public TaxAppConfigureUserErrorQuery message() {
        startField("message");

        return this;
    }
}
