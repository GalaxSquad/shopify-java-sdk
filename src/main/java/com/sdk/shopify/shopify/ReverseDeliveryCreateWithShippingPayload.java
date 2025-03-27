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
* Return type for `reverseDeliveryCreateWithShipping` mutation.
*/
public class ReverseDeliveryCreateWithShippingPayload extends AbstractResponse<ReverseDeliveryCreateWithShippingPayload> {
    public ReverseDeliveryCreateWithShippingPayload() {
    }

    public ReverseDeliveryCreateWithShippingPayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "reverseDelivery": {
                    ReverseDelivery optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ReverseDelivery(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<ReturnUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new ReturnUserError(jsonAsObject(element1, key)));
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
        return "ReverseDeliveryCreateWithShippingPayload";
    }

    /**
    * The created reverse delivery.
    */

    public ReverseDelivery getReverseDelivery() {
        return (ReverseDelivery) get("reverseDelivery");
    }

    public ReverseDeliveryCreateWithShippingPayload setReverseDelivery(ReverseDelivery arg) {
        optimisticData.put(getKey("reverseDelivery"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<ReturnUserError> getUserErrors() {
        return (List<ReturnUserError>) get("userErrors");
    }

    public ReverseDeliveryCreateWithShippingPayload setUserErrors(List<ReturnUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "reverseDelivery": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

