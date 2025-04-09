// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `ArticleDelete`.
*/
public class ArticleDeleteUserErrorQuery extends Query<ArticleDeleteUserErrorQuery> {
    ArticleDeleteUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public ArticleDeleteUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public ArticleDeleteUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public ArticleDeleteUserErrorQuery message() {
        startField("message");

        return this;
    }
}
