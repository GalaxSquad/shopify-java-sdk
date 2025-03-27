// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The minimum quantity of items required for the discount to apply.
*/
public class DiscountMinimumQuantityQuery extends Query<DiscountMinimumQuantityQuery> {
    DiscountMinimumQuantityQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The minimum quantity of items that's required for the discount to be applied.
    */
    public DiscountMinimumQuantityQuery greaterThanOrEqualToQuantity() {
        startField("greaterThanOrEqualToQuantity");

        return this;
    }
}
