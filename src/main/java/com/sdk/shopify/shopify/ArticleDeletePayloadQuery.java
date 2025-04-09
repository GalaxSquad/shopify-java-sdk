// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `articleDelete` mutation.
*/
public class ArticleDeletePayloadQuery extends Query<ArticleDeletePayloadQuery> {
    ArticleDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ID of the deleted article.
    */
    public ArticleDeletePayloadQuery deletedArticleId() {
        startField("deletedArticleId");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public ArticleDeletePayloadQuery userErrors(ArticleDeleteUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new ArticleDeleteUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
