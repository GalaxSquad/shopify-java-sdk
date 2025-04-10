// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `UrlRedirectBulkDeleteBySavedSearch`.
*/
public class UrlRedirectBulkDeleteBySavedSearchUserErrorQuery extends Query<UrlRedirectBulkDeleteBySavedSearchUserErrorQuery> {
    UrlRedirectBulkDeleteBySavedSearchUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public UrlRedirectBulkDeleteBySavedSearchUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public UrlRedirectBulkDeleteBySavedSearchUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public UrlRedirectBulkDeleteBySavedSearchUserErrorQuery message() {
        startField("message");

        return this;
    }
}
