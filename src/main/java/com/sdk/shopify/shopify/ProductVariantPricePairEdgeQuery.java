// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one ProductVariantPricePair and a cursor during pagination.
*/
public class ProductVariantPricePairEdgeQuery extends Query<ProductVariantPricePairEdgeQuery> {
    ProductVariantPricePairEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public ProductVariantPricePairEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of ProductVariantPricePairEdge.
    */
    public ProductVariantPricePairEdgeQuery node(ProductVariantPricePairQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new ProductVariantPricePairQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
