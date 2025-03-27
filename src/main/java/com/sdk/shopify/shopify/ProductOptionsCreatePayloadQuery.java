// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `productOptionsCreate` mutation.
*/
public class ProductOptionsCreatePayloadQuery extends Query<ProductOptionsCreatePayloadQuery> {
    ProductOptionsCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The updated product object.
    */
    public ProductOptionsCreatePayloadQuery product(ProductQueryDefinition queryDef) {
        startField("product");

        _queryBuilder.append('{');
        queryDef.define(new ProductQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public ProductOptionsCreatePayloadQuery userErrors(ProductOptionsCreateUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new ProductOptionsCreateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
