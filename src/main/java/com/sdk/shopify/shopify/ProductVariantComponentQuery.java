// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A product variant component associated with a product variant.
*/
public class ProductVariantComponentQuery extends Query<ProductVariantComponentQuery> {
    ProductVariantComponentQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The product variant associated with the component.
    */
    public ProductVariantComponentQuery productVariant(ProductVariantQueryDefinition queryDef) {
        startField("productVariant");

        _queryBuilder.append('{');
        queryDef.define(new ProductVariantQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The required quantity of the component.
    */
    public ProductVariantComponentQuery quantity() {
        startField("quantity");

        return this;
    }
}
