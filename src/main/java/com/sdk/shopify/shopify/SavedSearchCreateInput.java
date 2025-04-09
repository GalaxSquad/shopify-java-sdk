// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class SavedSearchCreateInput implements Serializable {
    private SearchResultType resourceType;

    private String name;

    private String query;

    public SavedSearchCreateInput(SearchResultType resourceType, String name, String query) {
        this.resourceType = resourceType;

        this.name = name;

        this.query = query;
    }

    public SearchResultType getResourceType() {
        return resourceType;
    }

    public SavedSearchCreateInput setResourceType(SearchResultType resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    public String getName() {
        return name;
    }

    public SavedSearchCreateInput setName(String name) {
        this.name = name;
        return this;
    }

    public String getQuery() {
        return query;
    }

    public SavedSearchCreateInput setQuery(String query) {
        this.query = query;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("resourceType:");
        _queryBuilder.append(resourceType.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("name:");
        Query.appendQuotedString(_queryBuilder, name.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("query:");
        Query.appendQuotedString(_queryBuilder, query.toString());

        _queryBuilder.append('}');
    }
}
