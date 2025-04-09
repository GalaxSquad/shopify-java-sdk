// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Discount applied to the recurring pricing portion of a subscription.
*/
public class AppSubscriptionDiscount extends AbstractResponse<AppSubscriptionDiscount> {
    public AppSubscriptionDiscount() {
    }

    public AppSubscriptionDiscount(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "durationLimitInIntervals": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "priceAfterDiscount": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "remainingDurationInIntervals": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "value": {
                    responseData.put(key, UnknownAppSubscriptionDiscountValue.create(jsonAsObject(field.getValue(), key)));

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
        return "AppSubscriptionDiscount";
    }

    /**
    * The total number of billing intervals to which the discount will be applied.
    * The discount will be applied to an indefinite number of billing intervals if this value is blank.
    */

    public Integer getDurationLimitInIntervals() {
        return (Integer) get("durationLimitInIntervals");
    }

    public AppSubscriptionDiscount setDurationLimitInIntervals(Integer arg) {
        optimisticData.put(getKey("durationLimitInIntervals"), arg);
        return this;
    }

    /**
    * The price of the subscription after the discount is applied.
    */

    public MoneyV2 getPriceAfterDiscount() {
        return (MoneyV2) get("priceAfterDiscount");
    }

    public AppSubscriptionDiscount setPriceAfterDiscount(MoneyV2 arg) {
        optimisticData.put(getKey("priceAfterDiscount"), arg);
        return this;
    }

    /**
    * The remaining number of billing intervals to which the discount will be applied.
    */

    public Integer getRemainingDurationInIntervals() {
        return (Integer) get("remainingDurationInIntervals");
    }

    public AppSubscriptionDiscount setRemainingDurationInIntervals(Integer arg) {
        optimisticData.put(getKey("remainingDurationInIntervals"), arg);
        return this;
    }

    /**
    * The value of the discount applied every billing interval.
    */

    public AppSubscriptionDiscountValue getValue() {
        return (AppSubscriptionDiscountValue) get("value");
    }

    public AppSubscriptionDiscount setValue(AppSubscriptionDiscountValue arg) {
        optimisticData.put(getKey("value"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "durationLimitInIntervals": return false;

            case "priceAfterDiscount": return true;

            case "remainingDurationInIntervals": return false;

            case "value": return false;

            default: return false;
        }
    }
}

