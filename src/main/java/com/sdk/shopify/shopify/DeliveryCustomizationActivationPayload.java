// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Return type for `deliveryCustomizationActivation` mutation.
*/
public class DeliveryCustomizationActivationPayload extends AbstractResponse<DeliveryCustomizationActivationPayload> {
    public DeliveryCustomizationActivationPayload() {
    }

    public DeliveryCustomizationActivationPayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "ids": {
                    List<String> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<String> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            list1.add(jsonAsString(element1, key));
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<DeliveryCustomizationError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new DeliveryCustomizationError(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

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
        return "DeliveryCustomizationActivationPayload";
    }

    /**
    * The IDs of the updated delivery customizations.
    */

    public List<String> getIds() {
        return (List<String>) get("ids");
    }

    public DeliveryCustomizationActivationPayload setIds(List<String> arg) {
        optimisticData.put(getKey("ids"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<DeliveryCustomizationError> getUserErrors() {
        return (List<DeliveryCustomizationError>) get("userErrors");
    }

    public DeliveryCustomizationActivationPayload setUserErrors(List<DeliveryCustomizationError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "ids": return false;

            case "userErrors": return true;

            default: return false;
        }
    }
}

