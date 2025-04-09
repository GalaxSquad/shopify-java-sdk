// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The percentage value of the discount.
*/
public class SubscriptionDiscountPercentageValueQuery extends Query<SubscriptionDiscountPercentageValueQuery> {
    SubscriptionDiscountPercentageValueQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The percentage value of the discount.
    */
    public SubscriptionDiscountPercentageValueQuery percentage() {
        startField("percentage");

        return this;
    }
}
