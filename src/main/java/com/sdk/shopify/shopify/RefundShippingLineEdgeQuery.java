// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one RefundShippingLine and a cursor during pagination.
*/
public class RefundShippingLineEdgeQuery extends Query<RefundShippingLineEdgeQuery> {
    RefundShippingLineEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public RefundShippingLineEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of RefundShippingLineEdge.
    */
    public RefundShippingLineEdgeQuery node(RefundShippingLineQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new RefundShippingLineQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
