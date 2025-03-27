// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The percentage value of the price used for checkout charge.
*/
public class SellingPlanCheckoutChargePercentageValueQuery extends Query<SellingPlanCheckoutChargePercentageValueQuery> {
    SellingPlanCheckoutChargePercentageValueQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The percentage value of the price used for checkout charge.
    */
    public SellingPlanCheckoutChargePercentageValueQuery percentage() {
        startField("percentage");

        return this;
    }
}
