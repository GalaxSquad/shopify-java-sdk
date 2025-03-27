// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `articleUpdate` mutation.
*/
public class ArticleUpdatePayloadQuery extends Query<ArticleUpdatePayloadQuery> {
    ArticleUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The article that was updated.
    */
    public ArticleUpdatePayloadQuery article(ArticleQueryDefinition queryDef) {
        startField("article");

        _queryBuilder.append('{');
        queryDef.define(new ArticleQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public ArticleUpdatePayloadQuery userErrors(ArticleUpdateUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new ArticleUpdateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
