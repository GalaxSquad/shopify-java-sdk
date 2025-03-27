// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Subscription draft discount types.
*/
public class SubscriptionDiscountQuery extends Query<SubscriptionDiscountQuery> {
    SubscriptionDiscountQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public SubscriptionDiscountQuery onSubscriptionAppliedCodeDiscount(SubscriptionAppliedCodeDiscountQueryDefinition queryDef) {
        startInlineFragment("SubscriptionAppliedCodeDiscount");
        queryDef.define(new SubscriptionAppliedCodeDiscountQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public SubscriptionDiscountQuery onSubscriptionManualDiscount(SubscriptionManualDiscountQueryDefinition queryDef) {
        startInlineFragment("SubscriptionManualDiscount");
        queryDef.define(new SubscriptionManualDiscountQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
