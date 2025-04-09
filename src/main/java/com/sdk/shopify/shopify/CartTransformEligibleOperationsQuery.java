// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents the cart transform feature configuration for the shop.
*/
public class CartTransformEligibleOperationsQuery extends Query<CartTransformEligibleOperationsQuery> {
    CartTransformEligibleOperationsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The shop is eligible for expand operations.
    */
    public CartTransformEligibleOperationsQuery expandOperation() {
        startField("expandOperation");

        return this;
    }

    /**
    * The shop is eligible for merge operations.
    */
    public CartTransformEligibleOperationsQuery mergeOperation() {
        startField("mergeOperation");

        return this;
    }

    /**
    * The shop is eligible for update operations.
    */
    public CartTransformEligibleOperationsQuery updateOperation() {
        startField("updateOperation");

        return this;
    }
}
