// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A snapshot of location details including name and address captured at a specific point in time.
* Refer to the parent model to know the lifecycle.
*/
public class LocationSnapshot extends AbstractResponse<LocationSnapshot> {
    public LocationSnapshot() {
    }

    public LocationSnapshot(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "address": {
                    responseData.put(key, new LocationAddress(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "location": {
                    Location optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Location(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "snapshottedAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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
        return "LocationSnapshot";
    }

    /**
    * The address details of the location as they were when the snapshot was recorded.
    */

    public LocationAddress getAddress() {
        return (LocationAddress) get("address");
    }

    public LocationSnapshot setAddress(LocationAddress arg) {
        optimisticData.put(getKey("address"), arg);
        return this;
    }

    /**
    * A reference to the live Location object, if it still exists and is accessible. This provides current
    * details of the location, which may differ from the snapshotted name and address.
    */

    public Location getLocation() {
        return (Location) get("location");
    }

    public LocationSnapshot setLocation(Location arg) {
        optimisticData.put(getKey("location"), arg);
        return this;
    }

    /**
    * The name of the location as it was when the snapshot was recorded.
    */

    public String getName() {
        return (String) get("name");
    }

    public LocationSnapshot setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * The date and time when these snapshot details (name and address) were recorded.
    */

    public String getSnapshottedAt() {
        return (String) get("snapshottedAt");
    }

    public LocationSnapshot setSnapshottedAt(String arg) {
        optimisticData.put(getKey("snapshottedAt"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "address": return true;

            case "location": return true;

            case "name": return false;

            case "snapshottedAt": return false;

            default: return false;
        }
    }
}

