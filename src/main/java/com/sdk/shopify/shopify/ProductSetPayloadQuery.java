// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `productSet` mutation.
*/
public class ProductSetPayloadQuery extends Query<ProductSetPayloadQuery> {
    ProductSetPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The product object.
    */
    public ProductSetPayloadQuery product(ProductQueryDefinition queryDef) {
        startField("product");

        _queryBuilder.append('{');
        queryDef.define(new ProductQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The product set operation, returned when run in asynchronous mode.
    */
    public ProductSetPayloadQuery productSetOperation(ProductSetOperationQueryDefinition queryDef) {
        startField("productSetOperation");

        _queryBuilder.append('{');
        queryDef.define(new ProductSetOperationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public ProductSetPayloadQuery userErrors(ProductSetUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new ProductSetUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
