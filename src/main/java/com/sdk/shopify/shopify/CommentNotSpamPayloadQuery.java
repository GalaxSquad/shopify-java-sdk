// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `commentNotSpam` mutation.
*/
public class CommentNotSpamPayloadQuery extends Query<CommentNotSpamPayloadQuery> {
    CommentNotSpamPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The comment that was marked as not spam.
    */
    public CommentNotSpamPayloadQuery comment(CommentQueryDefinition queryDef) {
        startField("comment");

        _queryBuilder.append('{');
        queryDef.define(new CommentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CommentNotSpamPayloadQuery userErrors(CommentNotSpamUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new CommentNotSpamUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
