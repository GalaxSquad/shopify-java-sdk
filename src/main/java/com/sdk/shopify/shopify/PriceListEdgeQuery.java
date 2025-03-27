// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one PriceList and a cursor during pagination.
*/
public class PriceListEdgeQuery extends Query<PriceListEdgeQuery> {
    PriceListEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public PriceListEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of PriceListEdge.
    */
    public PriceListEdgeQuery node(PriceListQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new PriceListQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
