// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one Refund and a cursor during pagination.
*/
public class RefundEdgeQuery extends Query<RefundEdgeQuery> {
    RefundEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public RefundEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of RefundEdge.
    */
    public RefundEdgeQuery node(RefundQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new RefundQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
