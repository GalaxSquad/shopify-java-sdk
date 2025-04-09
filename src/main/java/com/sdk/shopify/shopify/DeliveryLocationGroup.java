// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A location group is a collection of locations. They share zones and delivery methods across delivery
* profiles.
*/
public class DeliveryLocationGroup extends AbstractResponse<DeliveryLocationGroup> implements Node {
    public DeliveryLocationGroup() {
    }

    public DeliveryLocationGroup(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "locations": {
                    responseData.put(key, new LocationConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "locationsCount": {
                    Count optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Count(jsonAsObject(field.getValue(), key));
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

    public DeliveryLocationGroup(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "DeliveryLocationGroup";
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * A list of all locations that are part of this location group.
    */

    public LocationConnection getLocations() {
        return (LocationConnection) get("locations");
    }

    public DeliveryLocationGroup setLocations(LocationConnection arg) {
        optimisticData.put(getKey("locations"), arg);
        return this;
    }

    /**
    * A count of all locations that are part of this location group.
    */

    public Count getLocationsCount() {
        return (Count) get("locationsCount");
    }

    public DeliveryLocationGroup setLocationsCount(Count arg) {
        optimisticData.put(getKey("locationsCount"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "locations": return true;

            case "locationsCount": return true;

            default: return false;
        }
    }
}

