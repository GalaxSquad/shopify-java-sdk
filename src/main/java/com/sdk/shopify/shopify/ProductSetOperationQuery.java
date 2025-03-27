// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An entity that represents details of an asynchronous
* [ProductSet](https://shopify.dev/api/admin-graphql/current/mutations/productSet) mutation.
* By querying this entity with the
* [productOperation](https://shopify.dev/api/admin-graphql/current/queries/productOperation) query
* using the ID that was returned
* [when the product was created or
* updated](https://shopify.dev/api/admin/migrate/new-product-model/sync-data#create-a-product-with-var
* iants-and-options-asynchronously),
* this can be used to check the status of an operation.
* The `status` field indicates whether the operation is `CREATED`, `ACTIVE`, or `COMPLETE`.
* The `product` field provides the details of the created or updated product.
* The `userErrors` field provides mutation errors that occurred during the operation.
*/
public class ProductSetOperationQuery extends Query<ProductSetOperationQuery> {
    ProductSetOperationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The product on which the operation is being performed.
    */
    public ProductSetOperationQuery product(ProductQueryDefinition queryDef) {
        startField("product");

        _queryBuilder.append('{');
        queryDef.define(new ProductQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The status of this operation.
    */
    public ProductSetOperationQuery status() {
        startField("status");

        return this;
    }

    /**
    * Returns mutation errors occurred during background mutation processing.
    */
    public ProductSetOperationQuery userErrors(ProductSetUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new ProductSetUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
