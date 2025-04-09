// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one DiscountNode and a cursor during pagination.
*/
public class DiscountNodeEdgeQuery extends Query<DiscountNodeEdgeQuery> {
    DiscountNodeEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public DiscountNodeEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of DiscountNodeEdge.
    */
    public DiscountNodeEdgeQuery node(DiscountNodeQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new DiscountNodeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
