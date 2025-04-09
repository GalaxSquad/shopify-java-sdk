// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The details of a specific product category within the [Shopify product
* taxonomy](https://shopify.github.io/product-taxonomy/releases/unstable/?categoryId=sg-4-17-2-17).
*/
public class ProductCategoryQuery extends Query<ProductCategoryQuery> {
    ProductCategoryQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The product taxonomy node associated with the product category.
    */
    public ProductCategoryQuery productTaxonomyNode(ProductTaxonomyNodeQueryDefinition queryDef) {
        startField("productTaxonomyNode");

        _queryBuilder.append('{');
        queryDef.define(new ProductTaxonomyNodeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
