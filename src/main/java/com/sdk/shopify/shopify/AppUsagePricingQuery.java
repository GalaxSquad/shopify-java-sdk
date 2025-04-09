// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Defines a usage pricing model for the app subscription.
* These charges are variable based on how much the merchant uses the app.
*/
public class AppUsagePricingQuery extends Query<AppUsagePricingQuery> {
    AppUsagePricingQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The total usage records for interval.
    */
    public AppUsagePricingQuery balanceUsed(MoneyV2QueryDefinition queryDef) {
        startField("balanceUsed");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The capped amount prevents the merchant from being charged for any usage over that amount during a
    * billing period.
    * This prevents billing from exceeding a maximum threshold over the duration of the billing period.
    * For the merchant to continue using the app after exceeding a capped amount, they would need to agree
    * to a new usage charge.
    */
    public AppUsagePricingQuery cappedAmount(MoneyV2QueryDefinition queryDef) {
        startField("cappedAmount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The frequency with which the app usage records are billed.
    */
    public AppUsagePricingQuery interval() {
        startField("interval");

        return this;
    }

    /**
    * The terms and conditions for app usage pricing.
    * Must be present in order to create usage charges.
    * The terms are presented to the merchant when they approve an app's usage charges.
    */
    public AppUsagePricingQuery terms() {
        startField("terms");

        return this;
    }
}
