// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of a server pixel mutation.
*/
public class ErrorsServerPixelUserErrorQuery extends Query<ErrorsServerPixelUserErrorQuery> {
    ErrorsServerPixelUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public ErrorsServerPixelUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public ErrorsServerPixelUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public ErrorsServerPixelUserErrorQuery message() {
        startField("message");

        return this;
    }
}
