// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `productDeleteMedia` mutation.
*/
public class ProductDeleteMediaPayloadQuery extends Query<ProductDeleteMediaPayloadQuery> {
    ProductDeleteMediaPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * List of media IDs which were deleted.
    */
    public ProductDeleteMediaPayloadQuery deletedMediaIds() {
        startField("deletedMediaIds");

        return this;
    }

    /**
    * List of product image IDs which were deleted.
    */
    public ProductDeleteMediaPayloadQuery deletedProductImageIds() {
        startField("deletedProductImageIds");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public ProductDeleteMediaPayloadQuery mediaUserErrors(MediaUserErrorQueryDefinition queryDef) {
        startField("mediaUserErrors");

        _queryBuilder.append('{');
        queryDef.define(new MediaUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The product associated with the deleted media.
    */
    public ProductDeleteMediaPayloadQuery product(ProductQueryDefinition queryDef) {
        startField("product");

        _queryBuilder.append('{');
        queryDef.define(new ProductQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
