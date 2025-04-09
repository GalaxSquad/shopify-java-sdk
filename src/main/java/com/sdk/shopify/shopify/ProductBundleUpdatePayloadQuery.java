// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `productBundleUpdate` mutation.
*/
public class ProductBundleUpdatePayloadQuery extends Query<ProductBundleUpdatePayloadQuery> {
    ProductBundleUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The asynchronous ProductBundleOperation updating the componentized product.
    */
    public ProductBundleUpdatePayloadQuery productBundleOperation(ProductBundleOperationQueryDefinition queryDef) {
        startField("productBundleOperation");

        _queryBuilder.append('{');
        queryDef.define(new ProductBundleOperationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public ProductBundleUpdatePayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
