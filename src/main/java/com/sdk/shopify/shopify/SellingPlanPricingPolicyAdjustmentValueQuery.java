// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents a selling plan pricing policy adjustment value type.
*/
public class SellingPlanPricingPolicyAdjustmentValueQuery extends Query<SellingPlanPricingPolicyAdjustmentValueQuery> {
    SellingPlanPricingPolicyAdjustmentValueQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public SellingPlanPricingPolicyAdjustmentValueQuery onMoneyV2(MoneyV2QueryDefinition queryDef) {
        startInlineFragment("MoneyV2");
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public SellingPlanPricingPolicyAdjustmentValueQuery onSellingPlanPricingPolicyPercentageValue(SellingPlanPricingPolicyPercentageValueQueryDefinition queryDef) {
        startInlineFragment("SellingPlanPricingPolicyPercentageValue");
        queryDef.define(new SellingPlanPricingPolicyPercentageValueQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
