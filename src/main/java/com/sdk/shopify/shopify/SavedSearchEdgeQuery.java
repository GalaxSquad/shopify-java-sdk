// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one SavedSearch and a cursor during pagination.
*/
public class SavedSearchEdgeQuery extends Query<SavedSearchEdgeQuery> {
    SavedSearchEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public SavedSearchEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of SavedSearchEdge.
    */
    public SavedSearchEdgeQuery node(SavedSearchQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new SavedSearchQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
