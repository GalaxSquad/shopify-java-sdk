// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one CartTransform and a cursor during pagination.
*/
public class CartTransformEdgeQuery extends Query<CartTransformEdgeQuery> {
    CartTransformEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public CartTransformEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of CartTransformEdge.
    */
    public CartTransformEdgeQuery node(CartTransformQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new CartTransformQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
