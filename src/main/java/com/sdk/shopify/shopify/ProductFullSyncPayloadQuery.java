// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `productFullSync` mutation.
*/
public class ProductFullSyncPayloadQuery extends Query<ProductFullSyncPayloadQuery> {
    ProductFullSyncPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public ProductFullSyncPayloadQuery userErrors(ProductFullSyncUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new ProductFullSyncUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
