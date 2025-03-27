// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The value of a fixed amount price rule.
*/
public class PriceRuleFixedAmountValueQuery extends Query<PriceRuleFixedAmountValueQuery> {
    PriceRuleFixedAmountValueQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The monetary value of the price rule.
    */
    public PriceRuleFixedAmountValueQuery amount() {
        startField("amount");

        return this;
    }
}
