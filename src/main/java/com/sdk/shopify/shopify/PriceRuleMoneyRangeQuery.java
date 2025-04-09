// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A money range within which the price rule is applicable.
*/
public class PriceRuleMoneyRangeQuery extends Query<PriceRuleMoneyRangeQuery> {
    PriceRuleMoneyRangeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The lower bound of the money range.
    */
    public PriceRuleMoneyRangeQuery greaterThan() {
        startField("greaterThan");

        return this;
    }

    /**
    * The lower bound or equal of the money range.
    */
    public PriceRuleMoneyRangeQuery greaterThanOrEqualTo() {
        startField("greaterThanOrEqualTo");

        return this;
    }

    /**
    * The upper bound of the money range.
    */
    public PriceRuleMoneyRangeQuery lessThan() {
        startField("lessThan");

        return this;
    }

    /**
    * The upper bound or equal of the money range.
    */
    public PriceRuleMoneyRangeQuery lessThanOrEqualTo() {
        startField("lessThanOrEqualTo");

        return this;
    }
}
