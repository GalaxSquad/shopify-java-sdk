// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one Market and a cursor during pagination.
*/
public class MarketEdgeQuery extends Query<MarketEdgeQuery> {
    MarketEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public MarketEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of MarketEdge.
    */
    public MarketEdgeQuery node(MarketQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new MarketQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
