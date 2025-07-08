// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one ProductComponentType and a cursor during pagination.
*/
public class ProductComponentTypeEdgeQuery extends Query<ProductComponentTypeEdgeQuery> {
    ProductComponentTypeEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public ProductComponentTypeEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of ProductComponentTypeEdge.
    */
    public ProductComponentTypeEdgeQuery node(ProductComponentTypeQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new ProductComponentTypeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
