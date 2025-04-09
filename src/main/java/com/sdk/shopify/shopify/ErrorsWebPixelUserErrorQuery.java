// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of a web pixel mutation.
*/
public class ErrorsWebPixelUserErrorQuery extends Query<ErrorsWebPixelUserErrorQuery> {
    ErrorsWebPixelUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public ErrorsWebPixelUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public ErrorsWebPixelUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public ErrorsWebPixelUserErrorQuery message() {
        startField("message");

        return this;
    }
}
