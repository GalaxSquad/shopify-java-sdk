// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `cartTransformDelete` mutation.
*/
public class CartTransformDeletePayloadQuery extends Query<CartTransformDeletePayloadQuery> {
    CartTransformDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The globally-unique ID for the deleted cart transform.
    */
    public CartTransformDeletePayloadQuery deletedId() {
        startField("deletedId");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CartTransformDeletePayloadQuery userErrors(CartTransformDeleteUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new CartTransformDeleteUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
