// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Return type for `locationLocalPickupDisable` mutation.
*/
public class LocationLocalPickupDisablePayload extends AbstractResponse<LocationLocalPickupDisablePayload> {
    public LocationLocalPickupDisablePayload() {
    }

    public LocationLocalPickupDisablePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "locationId": {
                    ID optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ID(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<DeliveryLocationLocalPickupSettingsError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new DeliveryLocationLocalPickupSettingsError(jsonAsObject(element1, key)));
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
        return "LocationLocalPickupDisablePayload";
    }

    /**
    * The ID of the location for which local pickup was disabled.
    */

    public ID getLocationId() {
        return (ID) get("locationId");
    }

    public LocationLocalPickupDisablePayload setLocationId(ID arg) {
        optimisticData.put(getKey("locationId"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<DeliveryLocationLocalPickupSettingsError> getUserErrors() {
        return (List<DeliveryLocationLocalPickupSettingsError>) get("userErrors");
    }

    public LocationLocalPickupDisablePayload setUserErrors(List<DeliveryLocationLocalPickupSettingsError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "locationId": return false;

            case "userErrors": return true;

            default: return false;
        }
    }
}

