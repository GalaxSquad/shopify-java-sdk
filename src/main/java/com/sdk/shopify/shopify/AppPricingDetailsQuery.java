// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The information about the price that's charged to a shop every plan period.
* The concrete type can be `AppRecurringPricing` for recurring billing or `AppUsagePricing` for
* usage-based billing.
*/
public class AppPricingDetailsQuery extends Query<AppPricingDetailsQuery> {
    AppPricingDetailsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public AppPricingDetailsQuery onAppRecurringPricing(AppRecurringPricingQueryDefinition queryDef) {
        startInlineFragment("AppRecurringPricing");
        queryDef.define(new AppRecurringPricingQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public AppPricingDetailsQuery onAppUsagePricing(AppUsagePricingQueryDefinition queryDef) {
        startInlineFragment("AppUsagePricing");
        queryDef.define(new AppUsagePricingQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
