// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The value of the discount and how it will be applied.
*/
public class SubscriptionDiscountFixedAmountValueQuery extends Query<SubscriptionDiscountFixedAmountValueQuery> {
    SubscriptionDiscountFixedAmountValueQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The fixed amount value of the discount.
    */
    public SubscriptionDiscountFixedAmountValueQuery amount(MoneyV2QueryDefinition queryDef) {
        startField("amount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the amount is applied per item.
    */
    public SubscriptionDiscountFixedAmountValueQuery appliesOnEachItem() {
        startField("appliesOnEachItem");

        return this;
    }
}
