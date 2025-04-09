// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An entity that represents details of an asynchronous
* [ProductDelete](https://shopify.dev/api/admin-graphql/current/mutations/productDelete) mutation.
* By querying this entity with the
* [productOperation](https://shopify.dev/api/admin-graphql/current/queries/productOperation) query
* using the ID that was returned when the product was deleted, this can be used to check the status of
* an operation.
* The `status` field indicates whether the operation is `CREATED`, `ACTIVE`, or `COMPLETE`.
* The `deletedProductId` field provides the ID of the deleted product.
* The `userErrors` field provides mutation errors that occurred during the operation.
*/
public class ProductDeleteOperationQuery extends Query<ProductDeleteOperationQuery> {
    ProductDeleteOperationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The ID of the deleted product.
    */
    public ProductDeleteOperationQuery deletedProductId() {
        startField("deletedProductId");

        return this;
    }

    /**
    * The product on which the operation is being performed.
    */
    public ProductDeleteOperationQuery product(ProductQueryDefinition queryDef) {
        startField("product");

        _queryBuilder.append('{');
        queryDef.define(new ProductQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The status of this operation.
    */
    public ProductDeleteOperationQuery status() {
        startField("status");

        return this;
    }

    /**
    * Returns mutation errors occurred during background mutation processing.
    */
    public ProductDeleteOperationQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
