// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A saved search is a representation of a search query saved in the admin.
*/
public class SavedSearchQuery extends Query<SavedSearchQuery> {
    SavedSearchQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The filters of a saved search.
    */
    public SavedSearchQuery filters(SearchFilterQueryDefinition queryDef) {
        startField("filters");

        _queryBuilder.append('{');
        queryDef.define(new SearchFilterQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The ID of the corresponding resource in the REST Admin API.
    */
    public SavedSearchQuery legacyResourceId() {
        startField("legacyResourceId");

        return this;
    }

    /**
    * The name of a saved search.
    */
    public SavedSearchQuery name() {
        startField("name");

        return this;
    }

    /**
    * The query string of a saved search. This includes search terms and filters.
    */
    public SavedSearchQuery query() {
        startField("query");

        return this;
    }

    /**
    * The type of resource this saved search is searching in.
    */
    public SavedSearchQuery resourceType() {
        startField("resourceType");

        return this;
    }

    /**
    * The search terms of a saved search.
    */
    public SavedSearchQuery searchTerms() {
        startField("searchTerms");

        return this;
    }
}
