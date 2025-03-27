// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents the cart transform feature configuration for the shop.
*/
public class CartTransformFeatureQuery extends Query<CartTransformFeatureQuery> {
    CartTransformFeatureQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The cart transform operations eligible for the shop.
    */
    public CartTransformFeatureQuery eligibleOperations(CartTransformEligibleOperationsQueryDefinition queryDef) {
        startField("eligibleOperations");

        _queryBuilder.append('{');
        queryDef.define(new CartTransformEligibleOperationsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
