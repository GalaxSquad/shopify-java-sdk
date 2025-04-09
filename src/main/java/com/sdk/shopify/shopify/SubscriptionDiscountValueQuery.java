// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The value of the discount and how it will be applied.
*/
public class SubscriptionDiscountValueQuery extends Query<SubscriptionDiscountValueQuery> {
    SubscriptionDiscountValueQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public SubscriptionDiscountValueQuery onSubscriptionDiscountFixedAmountValue(SubscriptionDiscountFixedAmountValueQueryDefinition queryDef) {
        startInlineFragment("SubscriptionDiscountFixedAmountValue");
        queryDef.define(new SubscriptionDiscountFixedAmountValueQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public SubscriptionDiscountValueQuery onSubscriptionDiscountPercentageValue(SubscriptionDiscountPercentageValueQueryDefinition queryDef) {
        startInlineFragment("SubscriptionDiscountPercentageValue");
        queryDef.define(new SubscriptionDiscountPercentageValueQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
