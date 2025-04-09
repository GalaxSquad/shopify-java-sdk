// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A time period during which a price rule is applicable.
*/
public class PriceRuleValidityPeriodQuery extends Query<PriceRuleValidityPeriodQuery> {
    PriceRuleValidityPeriodQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The time after which the price rule becomes invalid.
    */
    public PriceRuleValidityPeriodQuery end() {
        startField("end");

        return this;
    }

    /**
    * The time after which the price rule is valid.
    */
    public PriceRuleValidityPeriodQuery start() {
        startField("start");

        return this;
    }
}
