// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `productBundleCreate` mutation.
*/
public class ProductBundleCreatePayloadQuery extends Query<ProductBundleCreatePayloadQuery> {
    ProductBundleCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The asynchronous ProductBundleOperation creating the componentized product.
    */
    public ProductBundleCreatePayloadQuery productBundleOperation(ProductBundleOperationQueryDefinition queryDef) {
        startField("productBundleOperation");

        _queryBuilder.append('{');
        queryDef.define(new ProductBundleOperationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public ProductBundleCreatePayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
