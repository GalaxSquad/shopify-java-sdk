// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class ArticleBlogInput implements Serializable {
    private String title;

    public ArticleBlogInput(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public ArticleBlogInput setTitle(String title) {
        this.title = title;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("title:");
        Query.appendQuotedString(_queryBuilder, title.toString());

        _queryBuilder.append('}');
    }
}
