// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one DiscountCodeNode and a cursor during pagination.
*/
public class DiscountCodeNodeEdgeQuery extends Query<DiscountCodeNodeEdgeQuery> {
    DiscountCodeNodeEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public DiscountCodeNodeEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of DiscountCodeNodeEdge.
    */
    public DiscountCodeNodeEdgeQuery node(DiscountCodeNodeQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new DiscountCodeNodeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
