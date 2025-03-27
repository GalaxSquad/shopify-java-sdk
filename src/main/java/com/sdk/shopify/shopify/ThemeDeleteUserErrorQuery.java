// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `ThemeDelete`.
*/
public class ThemeDeleteUserErrorQuery extends Query<ThemeDeleteUserErrorQuery> {
    ThemeDeleteUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public ThemeDeleteUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public ThemeDeleteUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public ThemeDeleteUserErrorQuery message() {
        startField("message");

        return this;
    }
}
