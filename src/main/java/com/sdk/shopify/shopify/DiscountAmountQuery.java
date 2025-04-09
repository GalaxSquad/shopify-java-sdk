// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The fixed amount value of a discount, and whether the amount is applied to each entitled item or
* spread evenly across the entitled items.
*/
public class DiscountAmountQuery extends Query<DiscountAmountQuery> {
    DiscountAmountQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The value of the discount.
    */
    public DiscountAmountQuery amount(MoneyV2QueryDefinition queryDef) {
        startField("amount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * If true, then the discount is applied to each of the entitled items. If false, then the amount is
    * split across all of the entitled items.
    */
    public DiscountAmountQuery appliesOnEachItem() {
        startField("appliesOnEachItem");

        return this;
    }
}
