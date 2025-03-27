// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The percentage value of a selling plan pricing policy percentage type.
*/
public class SellingPlanPricingPolicyPercentageValueQuery extends Query<SellingPlanPricingPolicyPercentageValueQuery> {
    SellingPlanPricingPolicyPercentageValueQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The percentage value.
    */
    public SellingPlanPricingPolicyPercentageValueQuery percentage() {
        startField("percentage");

        return this;
    }
}
