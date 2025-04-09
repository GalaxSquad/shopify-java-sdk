// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `productOptionsReorder` mutation.
*/
public class ProductOptionsReorderPayloadQuery extends Query<ProductOptionsReorderPayloadQuery> {
    ProductOptionsReorderPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The updated product object.
    */
    public ProductOptionsReorderPayloadQuery product(ProductQueryDefinition queryDef) {
        startField("product");

        _queryBuilder.append('{');
        queryDef.define(new ProductQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public ProductOptionsReorderPayloadQuery userErrors(ProductOptionsReorderUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new ProductOptionsReorderUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
