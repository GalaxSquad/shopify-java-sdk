// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `commentApprove` mutation.
*/
public class CommentApprovePayloadQuery extends Query<CommentApprovePayloadQuery> {
    CommentApprovePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The comment that was approved.
    */
    public CommentApprovePayloadQuery comment(CommentQueryDefinition queryDef) {
        startField("comment");

        _queryBuilder.append('{');
        queryDef.define(new CommentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CommentApprovePayloadQuery userErrors(CommentApproveUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new CommentApproveUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
