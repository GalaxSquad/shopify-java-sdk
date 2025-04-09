// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A purchase amount in the context of a discount. This object can be used to define the minimum
* purchase amount required for a discount to be applicable.
*/
public class DiscountPurchaseAmountQuery extends Query<DiscountPurchaseAmountQuery> {
    DiscountPurchaseAmountQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The purchase amount in decimal format.
    */
    public DiscountPurchaseAmountQuery amount() {
        startField("amount");

        return this;
    }
}
