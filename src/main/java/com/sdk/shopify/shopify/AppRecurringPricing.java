// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The pricing information about a subscription app.
* The object contains an interval (the frequency at which the shop is billed for an app subscription)
* and
* a price (the amount to be charged to the subscribing shop at each interval).
*/
public class AppRecurringPricing extends AbstractResponse<AppRecurringPricing> implements AppPricingDetails {
    public AppRecurringPricing() {
    }

    public AppRecurringPricing(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "discount": {
                    AppSubscriptionDiscount optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AppSubscriptionDiscount(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "interval": {
                    responseData.put(key, AppPricingInterval.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "planHandle": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "price": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

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
        return "AppRecurringPricing";
    }

    /**
    * The discount applied to the subscription for a given number of billing intervals.
    */

    public AppSubscriptionDiscount getDiscount() {
        return (AppSubscriptionDiscount) get("discount");
    }

    public AppRecurringPricing setDiscount(AppSubscriptionDiscount arg) {
        optimisticData.put(getKey("discount"), arg);
        return this;
    }

    /**
    * The frequency at which the subscribing shop is billed for an app subscription.
    */

    public AppPricingInterval getInterval() {
        return (AppPricingInterval) get("interval");
    }

    public AppRecurringPricing setInterval(AppPricingInterval arg) {
        optimisticData.put(getKey("interval"), arg);
        return this;
    }

    /**
    * The app store pricing plan handle.
    */

    public String getPlanHandle() {
        return (String) get("planHandle");
    }

    public AppRecurringPricing setPlanHandle(String arg) {
        optimisticData.put(getKey("planHandle"), arg);
        return this;
    }

    /**
    * The amount and currency to be charged to the subscribing shop every billing interval.
    */

    public MoneyV2 getPrice() {
        return (MoneyV2) get("price");
    }

    public AppRecurringPricing setPrice(MoneyV2 arg) {
        optimisticData.put(getKey("price"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "discount": return true;

            case "interval": return false;

            case "planHandle": return false;

            case "price": return true;

            default: return false;
        }
    }
}

