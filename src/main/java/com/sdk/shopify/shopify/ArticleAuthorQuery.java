// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents an article author in an Article.
*/
public class ArticleAuthorQuery extends Query<ArticleAuthorQuery> {
    ArticleAuthorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The author's full name.
    */
    public ArticleAuthorQuery name() {
        startField("name");

        return this;
    }
}
