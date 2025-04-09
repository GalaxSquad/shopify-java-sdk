// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents the pricing policy of a subscription or deferred purchase option selling plan.
* The selling plan fixed pricing policy works with the billing and delivery policy
* to determine the final price. Discounts are divided among fulfillments.
* For example, a subscription with a $10 discount and two deliveries will have a $5
* discount applied to each delivery.
*/
public class SellingPlanFixedPricingPolicyQuery extends Query<SellingPlanFixedPricingPolicyQuery> {
    SellingPlanFixedPricingPolicyQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The price adjustment type.
    */
    public SellingPlanFixedPricingPolicyQuery adjustmentType() {
        startField("adjustmentType");

        return this;
    }

    /**
    * The price adjustment value.
    */
    public SellingPlanFixedPricingPolicyQuery adjustmentValue(SellingPlanPricingPolicyAdjustmentValueQueryDefinition queryDef) {
        startField("adjustmentValue");

        _queryBuilder.append('{');
        queryDef.define(new SellingPlanPricingPolicyAdjustmentValueQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time when the fixed selling plan pricing policy was created.
    */
    public SellingPlanFixedPricingPolicyQuery createdAt() {
        startField("createdAt");

        return this;
    }
}
