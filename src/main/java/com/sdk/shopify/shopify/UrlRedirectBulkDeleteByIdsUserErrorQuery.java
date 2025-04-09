// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `UrlRedirectBulkDeleteByIds`.
*/
public class UrlRedirectBulkDeleteByIdsUserErrorQuery extends Query<UrlRedirectBulkDeleteByIdsUserErrorQuery> {
    UrlRedirectBulkDeleteByIdsUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public UrlRedirectBulkDeleteByIdsUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public UrlRedirectBulkDeleteByIdsUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public UrlRedirectBulkDeleteByIdsUserErrorQuery message() {
        startField("message");

        return this;
    }
}
