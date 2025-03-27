// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one DiscountAutomaticNode and a cursor during pagination.
*/
public class DiscountAutomaticNodeEdgeQuery extends Query<DiscountAutomaticNodeEdgeQuery> {
    DiscountAutomaticNodeEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public DiscountAutomaticNodeEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of DiscountAutomaticNodeEdge.
    */
    public DiscountAutomaticNodeEdgeQuery node(DiscountAutomaticNodeQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new DiscountAutomaticNodeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
