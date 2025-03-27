// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Local pickup settings associated with a location.
*/
public class DeliveryLocalPickupSettings extends AbstractResponse<DeliveryLocalPickupSettings> {
    public DeliveryLocalPickupSettings() {
    }

    public DeliveryLocalPickupSettings(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "instructions": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "pickupTime": {
                    responseData.put(key, DeliveryLocalPickupTime.fromGraphQl(jsonAsString(field.getValue(), key)));

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
        return "DeliveryLocalPickupSettings";
    }

    /**
    * Additional instructions or information related to the local pickup.
    */

    public String getInstructions() {
        return (String) get("instructions");
    }

    public DeliveryLocalPickupSettings setInstructions(String arg) {
        optimisticData.put(getKey("instructions"), arg);
        return this;
    }

    /**
    * The estimated pickup time to show customers at checkout.
    */

    public DeliveryLocalPickupTime getPickupTime() {
        return (DeliveryLocalPickupTime) get("pickupTime");
    }

    public DeliveryLocalPickupSettings setPickupTime(DeliveryLocalPickupTime arg) {
        optimisticData.put(getKey("pickupTime"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "instructions": return false;

            case "pickupTime": return false;

            default: return false;
        }
    }
}

