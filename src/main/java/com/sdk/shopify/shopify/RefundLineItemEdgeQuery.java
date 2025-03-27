// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one RefundLineItem and a cursor during pagination.
*/
public class RefundLineItemEdgeQuery extends Query<RefundLineItemEdgeQuery> {
    RefundLineItemEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public RefundLineItemEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of RefundLineItemEdge.
    */
    public RefundLineItemEdgeQuery node(RefundLineItemQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new RefundLineItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
