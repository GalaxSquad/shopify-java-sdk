// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The percentage value of a discount.
*/
public class AppSubscriptionDiscountPercentageQuery extends Query<AppSubscriptionDiscountPercentageQuery> {
    AppSubscriptionDiscountPercentageQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The percentage value of a discount.
    */
    public AppSubscriptionDiscountPercentageQuery percentage() {
        startField("percentage");

        return this;
    }
}
