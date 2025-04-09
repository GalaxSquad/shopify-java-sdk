// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `productChangeStatus` mutation.
*/
public class ProductChangeStatusPayloadQuery extends Query<ProductChangeStatusPayloadQuery> {
    ProductChangeStatusPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The product object.
    */
    public ProductChangeStatusPayloadQuery product(ProductQueryDefinition queryDef) {
        startField("product");

        _queryBuilder.append('{');
        queryDef.define(new ProductQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public ProductChangeStatusPayloadQuery userErrors(ProductChangeStatusUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new ProductChangeStatusUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
