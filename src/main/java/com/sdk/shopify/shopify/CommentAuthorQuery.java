// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The author of a comment.
*/
public class CommentAuthorQuery extends Query<CommentAuthorQuery> {
    CommentAuthorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The author's email.
    */
    public CommentAuthorQuery email() {
        startField("email");

        return this;
    }

    /**
    * The author’s name.
    */
    public CommentAuthorQuery name() {
        startField("name");

        return this;
    }
}
