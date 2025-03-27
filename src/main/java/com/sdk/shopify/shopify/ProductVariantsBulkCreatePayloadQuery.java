// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `productVariantsBulkCreate` mutation.
*/
public class ProductVariantsBulkCreatePayloadQuery extends Query<ProductVariantsBulkCreatePayloadQuery> {
    ProductVariantsBulkCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The updated product object.
    */
    public ProductVariantsBulkCreatePayloadQuery product(ProductQueryDefinition queryDef) {
        startField("product");

        _queryBuilder.append('{');
        queryDef.define(new ProductQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The newly created variants.
    */
    public ProductVariantsBulkCreatePayloadQuery productVariants(ProductVariantQueryDefinition queryDef) {
        startField("productVariants");

        _queryBuilder.append('{');
        queryDef.define(new ProductVariantQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public ProductVariantsBulkCreatePayloadQuery userErrors(ProductVariantsBulkCreateUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new ProductVariantsBulkCreateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
