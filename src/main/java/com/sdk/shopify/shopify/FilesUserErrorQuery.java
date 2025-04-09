// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that happens during the execution of a Files API query or mutation.
*/
public class FilesUserErrorQuery extends Query<FilesUserErrorQuery> {
    FilesUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public FilesUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public FilesUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public FilesUserErrorQuery message() {
        startField("message");

        return this;
    }
}
