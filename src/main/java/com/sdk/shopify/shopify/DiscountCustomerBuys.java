// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The prerequisite items and prerequisite value that a customer must have on the order for the
* discount to be applicable.
*/
public class DiscountCustomerBuys extends AbstractResponse<DiscountCustomerBuys> {
    public DiscountCustomerBuys() {
    }

    public DiscountCustomerBuys(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "isOneTimePurchase": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "isSubscription": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "items": {
                    responseData.put(key, UnknownDiscountItems.create(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "value": {
                    responseData.put(key, UnknownDiscountCustomerBuysValue.create(jsonAsObject(field.getValue(), key)));

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
        return "DiscountCustomerBuys";
    }

    /**
    * If the discount is applicable when a customer buys a one-time purchase.
    */

    public Boolean getIsOneTimePurchase() {
        return (Boolean) get("isOneTimePurchase");
    }

    public DiscountCustomerBuys setIsOneTimePurchase(Boolean arg) {
        optimisticData.put(getKey("isOneTimePurchase"), arg);
        return this;
    }

    /**
    * If the discount is applicable when a customer buys a subscription purchase.
    */

    public Boolean getIsSubscription() {
        return (Boolean) get("isSubscription");
    }

    public DiscountCustomerBuys setIsSubscription(Boolean arg) {
        optimisticData.put(getKey("isSubscription"), arg);
        return this;
    }

    /**
    * The items required for the discount to be applicable.
    */

    public DiscountItems getItems() {
        return (DiscountItems) get("items");
    }

    public DiscountCustomerBuys setItems(DiscountItems arg) {
        optimisticData.put(getKey("items"), arg);
        return this;
    }

    /**
    * The prerequisite value.
    */

    public DiscountCustomerBuysValue getValue() {
        return (DiscountCustomerBuysValue) get("value");
    }

    public DiscountCustomerBuys setValue(DiscountCustomerBuysValue arg) {
        optimisticData.put(getKey("value"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "isOneTimePurchase": return false;

            case "isSubscription": return false;

            case "items": return false;

            case "value": return false;

            default: return false;
        }
    }
}

