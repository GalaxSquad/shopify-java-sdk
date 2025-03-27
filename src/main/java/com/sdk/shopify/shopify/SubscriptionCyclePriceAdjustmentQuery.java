// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents a Subscription Line Pricing Cycle Adjustment.
*/
public class SubscriptionCyclePriceAdjustmentQuery extends Query<SubscriptionCyclePriceAdjustmentQuery> {
    SubscriptionCyclePriceAdjustmentQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Price adjustment type.
    */
    public SubscriptionCyclePriceAdjustmentQuery adjustmentType() {
        startField("adjustmentType");

        return this;
    }

    /**
    * Price adjustment value.
    */
    public SubscriptionCyclePriceAdjustmentQuery adjustmentValue(SellingPlanPricingPolicyAdjustmentValueQueryDefinition queryDef) {
        startField("adjustmentValue");

        _queryBuilder.append('{');
        queryDef.define(new SellingPlanPricingPolicyAdjustmentValueQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The number of cycles required before this pricing policy applies.
    */
    public SubscriptionCyclePriceAdjustmentQuery afterCycle() {
        startField("afterCycle");

        return this;
    }

    /**
    * The computed price after the adjustments applied.
    */
    public SubscriptionCyclePriceAdjustmentQuery computedPrice(MoneyV2QueryDefinition queryDef) {
        startField("computedPrice");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
