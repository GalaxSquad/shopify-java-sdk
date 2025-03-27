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
* Return type for `locationAdd` mutation.
*/
public class LocationAddPayload extends AbstractResponse<LocationAddPayload> {
    public LocationAddPayload() {
    }

    public LocationAddPayload(JsonObject fields) throws SchemaViolationError {
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

                case "userErrors": {
                    List<LocationAddUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new LocationAddUserError(jsonAsObject(element1, key)));
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
        return "LocationAddPayload";
    }

    /**
    * The location that was added.
    */

    public Location getLocation() {
        return (Location) get("location");
    }

    public LocationAddPayload setLocation(Location arg) {
        optimisticData.put(getKey("location"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<LocationAddUserError> getUserErrors() {
        return (List<LocationAddUserError>) get("userErrors");
    }

    public LocationAddPayload setUserErrors(List<LocationAddUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "location": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

