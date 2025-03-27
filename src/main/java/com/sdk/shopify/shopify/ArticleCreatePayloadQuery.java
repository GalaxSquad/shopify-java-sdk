// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `articleCreate` mutation.
*/
public class ArticleCreatePayloadQuery extends Query<ArticleCreatePayloadQuery> {
    ArticleCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The article that was created.
    */
    public ArticleCreatePayloadQuery article(ArticleQueryDefinition queryDef) {
        startField("article");

        _queryBuilder.append('{');
        queryDef.define(new ArticleQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public ArticleCreatePayloadQuery userErrors(ArticleCreateUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new ArticleCreateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
