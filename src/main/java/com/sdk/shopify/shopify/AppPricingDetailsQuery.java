// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

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
