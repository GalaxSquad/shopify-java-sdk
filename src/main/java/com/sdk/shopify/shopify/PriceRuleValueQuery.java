// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The type of the price rule value. The price rule value might be a percentage value, or a fixed
* amount.
*/
public class PriceRuleValueQuery extends Query<PriceRuleValueQuery> {
    PriceRuleValueQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public PriceRuleValueQuery onPriceRuleFixedAmountValue(PriceRuleFixedAmountValueQueryDefinition queryDef) {
        startInlineFragment("PriceRuleFixedAmountValue");
        queryDef.define(new PriceRuleFixedAmountValueQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public PriceRuleValueQuery onPriceRulePercentValue(PriceRulePercentValueQueryDefinition queryDef) {
        startInlineFragment("PriceRulePercentValue");
        queryDef.define(new PriceRulePercentValueQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
