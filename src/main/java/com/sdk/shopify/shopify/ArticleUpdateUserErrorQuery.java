// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `ArticleUpdate`.
*/
public class ArticleUpdateUserErrorQuery extends Query<ArticleUpdateUserErrorQuery> {
    ArticleUpdateUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public ArticleUpdateUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public ArticleUpdateUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public ArticleUpdateUserErrorQuery message() {
        startField("message");

        return this;
    }
}
