// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `cartTransformCreate` mutation.
*/
public class CartTransformCreatePayloadQuery extends Query<CartTransformCreatePayloadQuery> {
    CartTransformCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The newly created cart transform function.
    */
    public CartTransformCreatePayloadQuery cartTransform(CartTransformQueryDefinition queryDef) {
        startField("cartTransform");

        _queryBuilder.append('{');
        queryDef.define(new CartTransformQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CartTransformCreatePayloadQuery userErrors(CartTransformCreateUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new CartTransformCreateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
