// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `CommentNotSpam`.
*/
public class CommentNotSpamUserErrorQuery extends Query<CommentNotSpamUserErrorQuery> {
    CommentNotSpamUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public CommentNotSpamUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public CommentNotSpamUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public CommentNotSpamUserErrorQuery message() {
        startField("message");

        return this;
    }
}
