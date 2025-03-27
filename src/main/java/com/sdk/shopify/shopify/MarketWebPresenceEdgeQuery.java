// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one MarketWebPresence and a cursor during pagination.
*/
public class MarketWebPresenceEdgeQuery extends Query<MarketWebPresenceEdgeQuery> {
    MarketWebPresenceEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public MarketWebPresenceEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of MarketWebPresenceEdge.
    */
    public MarketWebPresenceEdgeQuery node(MarketWebPresenceQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new MarketWebPresenceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
