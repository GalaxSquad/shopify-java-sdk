// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents a Subscription Line Pricing Policy.
*/
public class SubscriptionPricingPolicyQuery extends Query<SubscriptionPricingPolicyQuery> {
    SubscriptionPricingPolicyQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The base price per unit for the subscription line in the contract's currency.
    */
    public SubscriptionPricingPolicyQuery basePrice(MoneyV2QueryDefinition queryDef) {
        startField("basePrice");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The adjustments per cycle for the subscription line.
    */
    public SubscriptionPricingPolicyQuery cycleDiscounts(SubscriptionCyclePriceAdjustmentQueryDefinition queryDef) {
        startField("cycleDiscounts");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionCyclePriceAdjustmentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
