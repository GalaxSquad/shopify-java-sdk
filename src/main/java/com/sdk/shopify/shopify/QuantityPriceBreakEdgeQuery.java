// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one QuantityPriceBreak and a cursor during pagination.
*/
public class QuantityPriceBreakEdgeQuery extends Query<QuantityPriceBreakEdgeQuery> {
    QuantityPriceBreakEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public QuantityPriceBreakEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of QuantityPriceBreakEdge.
    */
    public QuantityPriceBreakEdgeQuery node(QuantityPriceBreakQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new QuantityPriceBreakQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
