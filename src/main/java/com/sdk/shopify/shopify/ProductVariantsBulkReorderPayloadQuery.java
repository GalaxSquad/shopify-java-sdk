// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `productVariantsBulkReorder` mutation.
*/
public class ProductVariantsBulkReorderPayloadQuery extends Query<ProductVariantsBulkReorderPayloadQuery> {
    ProductVariantsBulkReorderPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The updated product.
    */
    public ProductVariantsBulkReorderPayloadQuery product(ProductQueryDefinition queryDef) {
        startField("product");

        _queryBuilder.append('{');
        queryDef.define(new ProductQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public ProductVariantsBulkReorderPayloadQuery userErrors(ProductVariantsBulkReorderUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new ProductVariantsBulkReorderUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
