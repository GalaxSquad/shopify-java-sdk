// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The pricing information about a subscription app.
* The object contains an interval (the frequency at which the shop is billed for an app subscription)
* and
* a price (the amount to be charged to the subscribing shop at each interval).
*/
public class AppRecurringPricingQuery extends Query<AppRecurringPricingQuery> {
    AppRecurringPricingQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The discount applied to the subscription for a given number of billing intervals.
    */
    public AppRecurringPricingQuery discount(AppSubscriptionDiscountQueryDefinition queryDef) {
        startField("discount");

        _queryBuilder.append('{');
        queryDef.define(new AppSubscriptionDiscountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The frequency at which the subscribing shop is billed for an app subscription.
    */
    public AppRecurringPricingQuery interval() {
        startField("interval");

        return this;
    }

    /**
    * The amount and currency to be charged to the subscribing shop every billing interval.
    */
    public AppRecurringPricingQuery price(MoneyV2QueryDefinition queryDef) {
        startField("price");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
