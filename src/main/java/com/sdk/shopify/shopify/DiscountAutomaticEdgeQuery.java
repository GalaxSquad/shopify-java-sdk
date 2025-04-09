// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one DiscountAutomatic and a cursor during pagination.
*/
public class DiscountAutomaticEdgeQuery extends Query<DiscountAutomaticEdgeQuery> {
    DiscountAutomaticEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public DiscountAutomaticEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of DiscountAutomaticEdge.
    */
    public DiscountAutomaticEdgeQuery node(DiscountAutomaticQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new DiscountAutomaticQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
