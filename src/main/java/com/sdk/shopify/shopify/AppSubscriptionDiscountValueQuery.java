// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The value of the discount.
*/
public class AppSubscriptionDiscountValueQuery extends Query<AppSubscriptionDiscountValueQuery> {
    AppSubscriptionDiscountValueQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public AppSubscriptionDiscountValueQuery onAppSubscriptionDiscountAmount(AppSubscriptionDiscountAmountQueryDefinition queryDef) {
        startInlineFragment("AppSubscriptionDiscountAmount");
        queryDef.define(new AppSubscriptionDiscountAmountQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public AppSubscriptionDiscountValueQuery onAppSubscriptionDiscountPercentage(AppSubscriptionDiscountPercentageQueryDefinition queryDef) {
        startInlineFragment("AppSubscriptionDiscountPercentage");
        queryDef.define(new AppSubscriptionDiscountPercentageQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
