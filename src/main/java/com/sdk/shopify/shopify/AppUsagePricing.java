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

import java.util.Map;

/**
* Defines a usage pricing model for the app subscription.
* These charges are variable based on how much the merchant uses the app.
*/
public class AppUsagePricing extends AbstractResponse<AppUsagePricing> implements AppPricingDetails {
    public AppUsagePricing() {
    }

    public AppUsagePricing(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "balanceUsed": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "cappedAmount": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "interval": {
                    responseData.put(key, AppPricingInterval.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "terms": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "__typename": {
                    responseData.put(key, jsonAsString(field.getValue(), key));
                    break;
                }
                default: {
                    throw new SchemaViolationError(this, key, field.getValue());
                }
            }
        }
    }

    public String getGraphQlTypeName() {
        return "AppUsagePricing";
    }

    /**
    * The total usage records for interval.
    */

    public MoneyV2 getBalanceUsed() {
        return (MoneyV2) get("balanceUsed");
    }

    public AppUsagePricing setBalanceUsed(MoneyV2 arg) {
        optimisticData.put(getKey("balanceUsed"), arg);
        return this;
    }

    /**
    * The capped amount prevents the merchant from being charged for any usage over that amount during a
    * billing period.
    * This prevents billing from exceeding a maximum threshold over the duration of the billing period.
    * For the merchant to continue using the app after exceeding a capped amount, they would need to agree
    * to a new usage charge.
    */

    public MoneyV2 getCappedAmount() {
        return (MoneyV2) get("cappedAmount");
    }

    public AppUsagePricing setCappedAmount(MoneyV2 arg) {
        optimisticData.put(getKey("cappedAmount"), arg);
        return this;
    }

    /**
    * The frequency with which the app usage records are billed.
    */

    public AppPricingInterval getInterval() {
        return (AppPricingInterval) get("interval");
    }

    public AppUsagePricing setInterval(AppPricingInterval arg) {
        optimisticData.put(getKey("interval"), arg);
        return this;
    }

    /**
    * The terms and conditions for app usage pricing.
    * Must be present in order to create usage charges.
    * The terms are presented to the merchant when they approve an app's usage charges.
    */

    public String getTerms() {
        return (String) get("terms");
    }

    public AppUsagePricing setTerms(String arg) {
        optimisticData.put(getKey("terms"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "balanceUsed": return true;

            case "cappedAmount": return true;

            case "interval": return false;

            case "terms": return false;

            default: return false;
        }
    }
}

