// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `CommentSpam`.
*/
public class CommentSpamUserErrorQuery extends Query<CommentSpamUserErrorQuery> {
    CommentSpamUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public CommentSpamUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public CommentSpamUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public CommentSpamUserErrorQuery message() {
        startField("message");

        return this;
    }
}
