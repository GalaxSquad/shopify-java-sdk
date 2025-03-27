// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A delivery method with a pickup option.
*/
public class SubscriptionDeliveryMethodPickup extends AbstractResponse<SubscriptionDeliveryMethodPickup> implements SubscriptionDeliveryMethod {
    public SubscriptionDeliveryMethodPickup() {
    }

    public SubscriptionDeliveryMethodPickup(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "pickupOption": {
                    responseData.put(key, new SubscriptionDeliveryMethodPickupOption(jsonAsObject(field.getValue(), key)));

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
        return "SubscriptionDeliveryMethodPickup";
    }

    /**
    * The details of the pickup delivery method to use.
    */

    public SubscriptionDeliveryMethodPickupOption getPickupOption() {
        return (SubscriptionDeliveryMethodPickupOption) get("pickupOption");
    }

    public SubscriptionDeliveryMethodPickup setPickupOption(SubscriptionDeliveryMethodPickupOption arg) {
        optimisticData.put(getKey("pickupOption"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "pickupOption": return true;

            default: return false;
        }
    }
}

