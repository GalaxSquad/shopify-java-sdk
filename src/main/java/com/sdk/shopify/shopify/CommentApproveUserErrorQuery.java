// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `CommentApprove`.
*/
public class CommentApproveUserErrorQuery extends Query<CommentApproveUserErrorQuery> {
    CommentApproveUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public CommentApproveUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public CommentApproveUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public CommentApproveUserErrorQuery message() {
        startField("message");

        return this;
    }
}
