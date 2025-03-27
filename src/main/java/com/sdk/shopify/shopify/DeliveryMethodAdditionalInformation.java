// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Additional information included on a delivery method that will help during the delivery process.
*/
public class DeliveryMethodAdditionalInformation extends AbstractResponse<DeliveryMethodAdditionalInformation> {
    public DeliveryMethodAdditionalInformation() {
    }

    public DeliveryMethodAdditionalInformation(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "instructions": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "phone": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

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
        return "DeliveryMethodAdditionalInformation";
    }

    /**
    * The delivery instructions to follow when performing the delivery.
    */

    public String getInstructions() {
        return (String) get("instructions");
    }

    public DeliveryMethodAdditionalInformation setInstructions(String arg) {
        optimisticData.put(getKey("instructions"), arg);
        return this;
    }

    /**
    * The phone number to contact when performing the delivery.
    */

    public String getPhone() {
        return (String) get("phone");
    }

    public DeliveryMethodAdditionalInformation setPhone(String arg) {
        optimisticData.put(getKey("phone"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "instructions": return false;

            case "phone": return false;

            default: return false;
        }
    }
}

