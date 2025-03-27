// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `PageUpdate`.
*/
public class PageUpdateUserErrorQuery extends Query<PageUpdateUserErrorQuery> {
    PageUpdateUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public PageUpdateUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public PageUpdateUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public PageUpdateUserErrorQuery message() {
        startField("message");

        return this;
    }
}
