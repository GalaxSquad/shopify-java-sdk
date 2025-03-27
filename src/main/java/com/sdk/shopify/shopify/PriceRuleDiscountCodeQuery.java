// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A discount code of a price rule.
*/
public class PriceRuleDiscountCodeQuery extends Query<PriceRuleDiscountCodeQuery> {
    PriceRuleDiscountCodeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The application that created the discount code.
    */
    public PriceRuleDiscountCodeQuery app(AppQueryDefinition queryDef) {
        startField("app");

        _queryBuilder.append('{');
        queryDef.define(new AppQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The code to apply the discount.
    */
    public PriceRuleDiscountCodeQuery code() {
        startField("code");

        return this;
    }

    /**
    * The number of times that the price rule has been used. This value is updated asynchronously and can
    * be different than the actual usage count.
    */
    public PriceRuleDiscountCodeQuery usageCount() {
        startField("usageCount");

        return this;
    }
}
