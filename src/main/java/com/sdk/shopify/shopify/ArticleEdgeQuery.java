// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one Article and a cursor during pagination.
*/
public class ArticleEdgeQuery extends Query<ArticleEdgeQuery> {
    ArticleEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public ArticleEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of ArticleEdge.
    */
    public ArticleEdgeQuery node(ArticleQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new ArticleQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
