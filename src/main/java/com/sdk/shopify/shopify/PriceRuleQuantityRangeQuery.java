// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A quantity range within which the price rule is applicable.
*/
public class PriceRuleQuantityRangeQuery extends Query<PriceRuleQuantityRangeQuery> {
    PriceRuleQuantityRangeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The lower bound of the quantity range.
    */
    public PriceRuleQuantityRangeQuery greaterThan() {
        startField("greaterThan");

        return this;
    }

    /**
    * The lower bound or equal of the quantity range.
    */
    public PriceRuleQuantityRangeQuery greaterThanOrEqualTo() {
        startField("greaterThanOrEqualTo");

        return this;
    }

    /**
    * The upper bound of the quantity range.
    */
    public PriceRuleQuantityRangeQuery lessThan() {
        startField("lessThan");

        return this;
    }

    /**
    * The upper bound or equal of the quantity range.
    */
    public PriceRuleQuantityRangeQuery lessThanOrEqualTo() {
        startField("lessThanOrEqualTo");

        return this;
    }
}
