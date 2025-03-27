// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one MarketingActivity and a cursor during pagination.
*/
public class MarketingActivityEdgeQuery extends Query<MarketingActivityEdgeQuery> {
    MarketingActivityEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public MarketingActivityEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of MarketingActivityEdge.
    */
    public MarketingActivityEdgeQuery node(MarketingActivityQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new MarketingActivityQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
