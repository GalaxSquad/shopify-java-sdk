// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one MarketCatalog and a cursor during pagination.
*/
public class MarketCatalogEdgeQuery extends Query<MarketCatalogEdgeQuery> {
    MarketCatalogEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public MarketCatalogEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of MarketCatalogEdge.
    */
    public MarketCatalogEdgeQuery node(MarketCatalogQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new MarketCatalogQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
