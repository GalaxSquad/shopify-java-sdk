// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An entity that represents details of an asynchronous
* [ProductDuplicate](https://shopify.dev/api/admin-graphql/current/mutations/productDuplicate)
* mutation.
* By querying this entity with the
* [productOperation](https://shopify.dev/api/admin-graphql/current/queries/productOperation) query
* using the ID that was returned
* [when the product was
* duplicated](https://shopify.dev/api/admin/migrate/new-product-model/sync-data#create-a-product-with-
* variants-and-options-asynchronously),
* this can be used to check the status of an operation.
* The `status` field indicates whether the operation is `CREATED`, `ACTIVE`, or `COMPLETE`.
* The `product` field provides the details of the original product.
* The `newProduct` field provides the details of the new duplicate of the product.
* The `userErrors` field provides mutation errors that occurred during the operation.
*/
public class ProductDuplicateOperationQuery extends Query<ProductDuplicateOperationQuery> {
    ProductDuplicateOperationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The newly created duplicate of the original product.
    */
    public ProductDuplicateOperationQuery newProduct(ProductQueryDefinition queryDef) {
        startField("newProduct");

        _queryBuilder.append('{');
        queryDef.define(new ProductQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The product on which the operation is being performed.
    */
    public ProductDuplicateOperationQuery product(ProductQueryDefinition queryDef) {
        startField("product");

        _queryBuilder.append('{');
        queryDef.define(new ProductQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The status of this operation.
    */
    public ProductDuplicateOperationQuery status() {
        startField("status");

        return this;
    }

    /**
    * Returns mutation errors occurred during background mutation processing.
    */
    public ProductDuplicateOperationQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
