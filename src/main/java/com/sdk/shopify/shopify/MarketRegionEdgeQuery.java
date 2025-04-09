// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one MarketRegion and a cursor during pagination.
*/
public class MarketRegionEdgeQuery extends Query<MarketRegionEdgeQuery> {
    MarketRegionEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public MarketRegionEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of MarketRegionEdge.
    */
    public MarketRegionEdgeQuery node(MarketRegionQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new MarketRegionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
