// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one ShippingLine and a cursor during pagination.
*/
public class ShippingLineEdgeQuery extends Query<ShippingLineEdgeQuery> {
    ShippingLineEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public ShippingLineEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of ShippingLineEdge.
    */
    public ShippingLineEdgeQuery node(ShippingLineQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new ShippingLineQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
