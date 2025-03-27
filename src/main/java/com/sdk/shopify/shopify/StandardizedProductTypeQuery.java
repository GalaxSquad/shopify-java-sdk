// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents the details of a specific type of product within the [Shopify product
* taxonomy](https://shopify.github.io/product-taxonomy/releases/unstable/?categoryId=sg-4-17-2-17).
*/
public class StandardizedProductTypeQuery extends Query<StandardizedProductTypeQuery> {
    StandardizedProductTypeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The product taxonomy node associated with the standardized product type.
    */
    public StandardizedProductTypeQuery productTaxonomyNode(ProductTaxonomyNodeQueryDefinition queryDef) {
        startField("productTaxonomyNode");

        _queryBuilder.append('{');
        queryDef.define(new ProductTaxonomyNodeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
