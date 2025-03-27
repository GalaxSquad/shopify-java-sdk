// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `commentSpam` mutation.
*/
public class CommentSpamPayloadQuery extends Query<CommentSpamPayloadQuery> {
    CommentSpamPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The comment that was marked as spam.
    */
    public CommentSpamPayloadQuery comment(CommentQueryDefinition queryDef) {
        startField("comment");

        _queryBuilder.append('{');
        queryDef.define(new CommentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CommentSpamPayloadQuery userErrors(CommentSpamUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new CommentSpamUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
