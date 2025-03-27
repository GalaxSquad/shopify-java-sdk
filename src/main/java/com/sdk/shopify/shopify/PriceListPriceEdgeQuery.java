// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one PriceListPrice and a cursor during pagination.
*/
public class PriceListPriceEdgeQuery extends Query<PriceListPriceEdgeQuery> {
    PriceListPriceEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public PriceListPriceEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of PriceListPriceEdge.
    */
    public PriceListPriceEdgeQuery node(PriceListPriceQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new PriceListPriceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
