// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one DiscountAllocation and a cursor during pagination.
*/
public class DiscountAllocationEdgeQuery extends Query<DiscountAllocationEdgeQuery> {
    DiscountAllocationEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public DiscountAllocationEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of DiscountAllocationEdge.
    */
    public DiscountAllocationEdgeQuery node(DiscountAllocationQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new DiscountAllocationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
