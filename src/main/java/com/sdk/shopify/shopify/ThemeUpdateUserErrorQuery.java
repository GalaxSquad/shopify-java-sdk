// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `ThemeUpdate`.
*/
public class ThemeUpdateUserErrorQuery extends Query<ThemeUpdateUserErrorQuery> {
    ThemeUpdateUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public ThemeUpdateUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public ThemeUpdateUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public ThemeUpdateUserErrorQuery message() {
        startField("message");

        return this;
    }
}
