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
* Return type for `locationActivate` mutation.
*/
public class LocationActivatePayload extends AbstractResponse<LocationActivatePayload> {
    public LocationActivatePayload() {
    }

    public LocationActivatePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "location": {
                    Location optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Location(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "locationActivateUserErrors": {
                    List<LocationActivateUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new LocationActivateUserError(jsonAsObject(element1, key)));
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
        return "LocationActivatePayload";
    }

    /**
    * The location that was activated.
    */

    public Location getLocation() {
        return (Location) get("location");
    }

    public LocationActivatePayload setLocation(Location arg) {
        optimisticData.put(getKey("location"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<LocationActivateUserError> getLocationActivateUserErrors() {
        return (List<LocationActivateUserError>) get("locationActivateUserErrors");
    }

    public LocationActivatePayload setLocationActivateUserErrors(List<LocationActivateUserError> arg) {
        optimisticData.put(getKey("locationActivateUserErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "location": return true;

            case "locationActivateUserErrors": return true;

            default: return false;
        }
    }
}

