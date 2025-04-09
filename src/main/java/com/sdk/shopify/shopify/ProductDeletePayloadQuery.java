// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `productDelete` mutation.
*/
public class ProductDeletePayloadQuery extends Query<ProductDeletePayloadQuery> {
    ProductDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ID of the deleted product.
    */
    public ProductDeletePayloadQuery deletedProductId() {
        startField("deletedProductId");

        return this;
    }

    /**
    * The product delete operation, returned when run in asynchronous mode.
    */
    public ProductDeletePayloadQuery productDeleteOperation(ProductDeleteOperationQueryDefinition queryDef) {
        startField("productDeleteOperation");

        _queryBuilder.append('{');
        queryDef.define(new ProductDeleteOperationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The shop associated with the product.
    */
    public ProductDeletePayloadQuery shop(ShopQueryDefinition queryDef) {
        startField("shop");

        _queryBuilder.append('{');
        queryDef.define(new ShopQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public ProductDeletePayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
