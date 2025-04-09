// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The type of value given to a customer when a discount is applied to an order. For example, the
* application of the discount might give the customer a percentage off a specified item.
* Alternatively, the application of the discount might give the customer a monetary value in a given
* currency off an order.
*/
public class PricingValueQuery extends Query<PricingValueQuery> {
    PricingValueQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public PricingValueQuery onMoneyV2(MoneyV2QueryDefinition queryDef) {
        startInlineFragment("MoneyV2");
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public PricingValueQuery onPricingPercentageValue(PricingPercentageValueQueryDefinition queryDef) {
        startInlineFragment("PricingPercentageValue");
        queryDef.define(new PricingPercentageValueQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
