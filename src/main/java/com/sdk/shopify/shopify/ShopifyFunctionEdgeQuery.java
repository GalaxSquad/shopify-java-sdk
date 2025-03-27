// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one ShopifyFunction and a cursor during pagination.
*/
public class ShopifyFunctionEdgeQuery extends Query<ShopifyFunctionEdgeQuery> {
    ShopifyFunctionEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public ShopifyFunctionEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of ShopifyFunctionEdge.
    */
    public ShopifyFunctionEdgeQuery node(ShopifyFunctionQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new ShopifyFunctionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
