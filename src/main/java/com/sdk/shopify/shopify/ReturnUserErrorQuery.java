// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of a return mutation.
*/
public class ReturnUserErrorQuery extends Query<ReturnUserErrorQuery> {
    ReturnUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public ReturnUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public ReturnUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public ReturnUserErrorQuery message() {
        startField("message");

        return this;
    }
}
