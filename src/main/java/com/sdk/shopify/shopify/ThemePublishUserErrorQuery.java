// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `ThemePublish`.
*/
public class ThemePublishUserErrorQuery extends Query<ThemePublishUserErrorQuery> {
    ThemePublishUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public ThemePublishUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public ThemePublishUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public ThemePublishUserErrorQuery message() {
        startField("message");

        return this;
    }
}
