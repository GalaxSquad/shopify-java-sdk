// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `productDuplicate` mutation.
*/
public class ProductDuplicatePayloadQuery extends Query<ProductDuplicatePayloadQuery> {
    ProductDuplicatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The asynchronous job that duplicates the product images.
    */
    public ProductDuplicatePayloadQuery imageJob(JobQueryDefinition queryDef) {
        startField("imageJob");

        _queryBuilder.append('{');
        queryDef.define(new JobQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The duplicated product.
    */
    public ProductDuplicatePayloadQuery newProduct(ProductQueryDefinition queryDef) {
        startField("newProduct");

        _queryBuilder.append('{');
        queryDef.define(new ProductQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The product duplicate operation, returned when run in asynchronous mode.
    */
    public ProductDuplicatePayloadQuery productDuplicateOperation(ProductDuplicateOperationQueryDefinition queryDef) {
        startField("productDuplicateOperation");

        _queryBuilder.append('{');
        queryDef.define(new ProductDuplicateOperationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The user's shop.
    */
    public ProductDuplicatePayloadQuery shop(ShopQueryDefinition queryDef) {
        startField("shop");

        _queryBuilder.append('{');
        queryDef.define(new ShopQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public ProductDuplicatePayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
