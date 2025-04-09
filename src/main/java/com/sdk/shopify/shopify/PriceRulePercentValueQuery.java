// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The value of a percent price rule.
*/
public class PriceRulePercentValueQuery extends Query<PriceRulePercentValueQuery> {
    PriceRulePercentValueQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The percent value of the price rule.
    */
    public PriceRulePercentValueQuery percentage() {
        startField("percentage");

        return this;
    }
}
