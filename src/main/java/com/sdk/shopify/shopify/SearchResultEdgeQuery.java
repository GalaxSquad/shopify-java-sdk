// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one SearchResult and a cursor during pagination.
*/
public class SearchResultEdgeQuery extends Query<SearchResultEdgeQuery> {
    SearchResultEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public SearchResultEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of SearchResultEdge.
    */
    public SearchResultEdgeQuery node(SearchResultQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new SearchResultQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
