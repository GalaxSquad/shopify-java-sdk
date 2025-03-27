// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `commentDelete` mutation.
*/
public class CommentDeletePayloadQuery extends Query<CommentDeletePayloadQuery> {
    CommentDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ID of the comment that was deleted.
    */
    public CommentDeletePayloadQuery deletedCommentId() {
        startField("deletedCommentId");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CommentDeletePayloadQuery userErrors(CommentDeleteUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new CommentDeleteUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
