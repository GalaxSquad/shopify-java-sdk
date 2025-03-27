// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents the type of pricing associated to the selling plan (for example, a $10 or 20% discount
* that is set
* for a limited period or that is fixed for the duration of the subscription). Selling plan pricing
* policies and
* associated records (selling plan groups, selling plans, billing policy, and delivery policy) are
* deleted 48
* hours after a merchant uninstalls their subscriptions app. We recommend backing up these records if
* you need
* to restore them later.
*/
public class SellingPlanPricingPolicyQuery extends Query<SellingPlanPricingPolicyQuery> {
    SellingPlanPricingPolicyQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public SellingPlanPricingPolicyQuery onSellingPlanFixedPricingPolicy(SellingPlanFixedPricingPolicyQueryDefinition queryDef) {
        startInlineFragment("SellingPlanFixedPricingPolicy");
        queryDef.define(new SellingPlanFixedPricingPolicyQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public SellingPlanPricingPolicyQuery onSellingPlanRecurringPricingPolicy(SellingPlanRecurringPricingPolicyQueryDefinition queryDef) {
        startInlineFragment("SellingPlanRecurringPricingPolicy");
        queryDef.define(new SellingPlanRecurringPricingPolicyQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
