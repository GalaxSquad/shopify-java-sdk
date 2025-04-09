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
* Return type for `carrierServiceCreate` mutation.
*/
public class CarrierServiceCreatePayload extends AbstractResponse<CarrierServiceCreatePayload> {
    public CarrierServiceCreatePayload() {
    }

    public CarrierServiceCreatePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "carrierService": {
                    DeliveryCarrierService optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeliveryCarrierService(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<CarrierServiceCreateUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new CarrierServiceCreateUserError(jsonAsObject(element1, key)));
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
        return "CarrierServiceCreatePayload";
    }

    /**
    * The created carrier service.
    */

    public DeliveryCarrierService getCarrierService() {
        return (DeliveryCarrierService) get("carrierService");
    }

    public CarrierServiceCreatePayload setCarrierService(DeliveryCarrierService arg) {
        optimisticData.put(getKey("carrierService"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<CarrierServiceCreateUserError> getUserErrors() {
        return (List<CarrierServiceCreateUserError>) get("userErrors");
    }

    public CarrierServiceCreatePayload setUserErrors(List<CarrierServiceCreateUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "carrierService": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

