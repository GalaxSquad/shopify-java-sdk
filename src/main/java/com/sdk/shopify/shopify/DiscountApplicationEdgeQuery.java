// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one DiscountApplication and a cursor during pagination.
*/
public class DiscountApplicationEdgeQuery extends Query<DiscountApplicationEdgeQuery> {
    DiscountApplicationEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public DiscountApplicationEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of DiscountApplicationEdge.
    */
    public DiscountApplicationEdgeQuery node(DiscountApplicationQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new DiscountApplicationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
