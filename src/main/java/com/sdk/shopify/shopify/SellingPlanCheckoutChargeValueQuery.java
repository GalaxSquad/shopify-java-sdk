// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The portion of the price to be charged at checkout.
*/
public class SellingPlanCheckoutChargeValueQuery extends Query<SellingPlanCheckoutChargeValueQuery> {
    SellingPlanCheckoutChargeValueQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public SellingPlanCheckoutChargeValueQuery onMoneyV2(MoneyV2QueryDefinition queryDef) {
        startInlineFragment("MoneyV2");
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public SellingPlanCheckoutChargeValueQuery onSellingPlanCheckoutChargePercentageValue(SellingPlanCheckoutChargePercentageValueQueryDefinition queryDef) {
        startInlineFragment("SellingPlanCheckoutChargePercentageValue");
        queryDef.define(new SellingPlanCheckoutChargePercentageValueQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
