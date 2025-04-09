// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one ProductVariant and a cursor during pagination.
*/
public class ProductVariantEdgeQuery extends Query<ProductVariantEdgeQuery> {
    ProductVariantEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public ProductVariantEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of ProductVariantEdge.
    */
    public ProductVariantEdgeQuery node(ProductVariantQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new ProductVariantQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
