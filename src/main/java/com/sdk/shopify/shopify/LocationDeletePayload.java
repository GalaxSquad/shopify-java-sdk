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
* Return type for `locationDelete` mutation.
*/
public class LocationDeletePayload extends AbstractResponse<LocationDeletePayload> {
    public LocationDeletePayload() {
    }

    public LocationDeletePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "deletedLocationId": {
                    ID optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ID(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "locationDeleteUserErrors": {
                    List<LocationDeleteUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new LocationDeleteUserError(jsonAsObject(element1, key)));
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
        return "LocationDeletePayload";
    }

    /**
    * The ID of the location that was deleted.
    */

    public ID getDeletedLocationId() {
        return (ID) get("deletedLocationId");
    }

    public LocationDeletePayload setDeletedLocationId(ID arg) {
        optimisticData.put(getKey("deletedLocationId"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<LocationDeleteUserError> getLocationDeleteUserErrors() {
        return (List<LocationDeleteUserError>) get("locationDeleteUserErrors");
    }

    public LocationDeletePayload setLocationDeleteUserErrors(List<LocationDeleteUserError> arg) {
        optimisticData.put(getKey("locationDeleteUserErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "deletedLocationId": return false;

            case "locationDeleteUserErrors": return true;

            default: return false;
        }
    }
}

