// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `productOptionsDelete` mutation.
*/
public class ProductOptionsDeletePayloadQuery extends Query<ProductOptionsDeletePayloadQuery> {
    ProductOptionsDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * IDs of the options deleted.
    */
    public ProductOptionsDeletePayloadQuery deletedOptionsIds() {
        startField("deletedOptionsIds");

        return this;
    }

    /**
    * The updated product object.
    */
    public ProductOptionsDeletePayloadQuery product(ProductQueryDefinition queryDef) {
        startField("product");

        _queryBuilder.append('{');
        queryDef.define(new ProductQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public ProductOptionsDeletePayloadQuery userErrors(ProductOptionsDeleteUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new ProductOptionsDeleteUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
