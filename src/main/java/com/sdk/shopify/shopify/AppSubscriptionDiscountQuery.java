// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Discount applied to the recurring pricing portion of a subscription.
*/
public class AppSubscriptionDiscountQuery extends Query<AppSubscriptionDiscountQuery> {
    AppSubscriptionDiscountQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The total number of billing intervals to which the discount will be applied.
    * The discount will be applied to an indefinite number of billing intervals if this value is blank.
    */
    public AppSubscriptionDiscountQuery durationLimitInIntervals() {
        startField("durationLimitInIntervals");

        return this;
    }

    /**
    * The price of the subscription after the discount is applied.
    */
    public AppSubscriptionDiscountQuery priceAfterDiscount(MoneyV2QueryDefinition queryDef) {
        startField("priceAfterDiscount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The remaining number of billing intervals to which the discount will be applied.
    */
    public AppSubscriptionDiscountQuery remainingDurationInIntervals() {
        startField("remainingDurationInIntervals");

        return this;
    }

    /**
    * The value of the discount applied every billing interval.
    */
    public AppSubscriptionDiscountQuery value(AppSubscriptionDiscountValueQueryDefinition queryDef) {
        startField("value");

        _queryBuilder.append('{');
        queryDef.define(new AppSubscriptionDiscountValueQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
