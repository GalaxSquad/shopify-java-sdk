// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A swatch associated with a product option value.
*/
public class ProductOptionValueSwatchQuery extends Query<ProductOptionValueSwatchQuery> {
    ProductOptionValueSwatchQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The color representation of the swatch.
    */
    public ProductOptionValueSwatchQuery color() {
        startField("color");

        return this;
    }

    /**
    * An image representation of the swatch.
    */
    public ProductOptionValueSwatchQuery image(MediaImageQueryDefinition queryDef) {
        startField("image");

        _queryBuilder.append('{');
        queryDef.define(new MediaImageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
