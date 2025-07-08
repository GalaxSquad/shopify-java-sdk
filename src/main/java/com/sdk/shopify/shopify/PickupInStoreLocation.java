// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A location for in-store pickup.
*/
public class PickupInStoreLocation extends AbstractResponse<PickupInStoreLocation> {
    public PickupInStoreLocation() {
    }

    public PickupInStoreLocation(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "code": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "distanceFromBuyer": {
                    Distance optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Distance(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "handle": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "instructions": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "locationId": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "source": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "title": {
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
        return "PickupInStoreLocation";
    }

    /**
    * The code of the pickup location.
    */

    public String getCode() {
        return (String) get("code");
    }

    public PickupInStoreLocation setCode(String arg) {
        optimisticData.put(getKey("code"), arg);
        return this;
    }

    /**
    * Distance from the buyer to the pickup location.
    */

    public Distance getDistanceFromBuyer() {
        return (Distance) get("distanceFromBuyer");
    }

    public PickupInStoreLocation setDistanceFromBuyer(Distance arg) {
        optimisticData.put(getKey("distanceFromBuyer"), arg);
        return this;
    }

    /**
    * A unique identifier for this pickup location.
    */

    public String getHandle() {
        return (String) get("handle");
    }

    public PickupInStoreLocation setHandle(String arg) {
        optimisticData.put(getKey("handle"), arg);
        return this;
    }

    /**
    * Pickup instructions.
    */

    public String getInstructions() {
        return (String) get("instructions");
    }

    public PickupInStoreLocation setInstructions(String arg) {
        optimisticData.put(getKey("instructions"), arg);
        return this;
    }

    /**
    * The location ID of the pickup location.
    */

    public ID getLocationId() {
        return (ID) get("locationId");
    }

    public PickupInStoreLocation setLocationId(ID arg) {
        optimisticData.put(getKey("locationId"), arg);
        return this;
    }

    /**
    * The source of the pickup location.
    */

    public String getSource() {
        return (String) get("source");
    }

    public PickupInStoreLocation setSource(String arg) {
        optimisticData.put(getKey("source"), arg);
        return this;
    }

    /**
    * Title of the pickup location.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public PickupInStoreLocation setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "code": return false;

            case "distanceFromBuyer": return true;

            case "handle": return false;

            case "instructions": return false;

            case "locationId": return false;

            case "source": return false;

            case "title": return false;

            default: return false;
        }
    }
}

