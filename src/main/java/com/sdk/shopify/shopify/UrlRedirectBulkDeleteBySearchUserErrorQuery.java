// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `UrlRedirectBulkDeleteBySearch`.
*/
public class UrlRedirectBulkDeleteBySearchUserErrorQuery extends Query<UrlRedirectBulkDeleteBySearchUserErrorQuery> {
    UrlRedirectBulkDeleteBySearchUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public UrlRedirectBulkDeleteBySearchUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public UrlRedirectBulkDeleteBySearchUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public UrlRedirectBulkDeleteBySearchUserErrorQuery message() {
        startField("message");

        return this;
    }
}
