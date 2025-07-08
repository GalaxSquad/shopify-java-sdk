// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The details of the arrangement of an item.
*/
public class ReverseFulfillmentOrderDisposition extends AbstractResponse<ReverseFulfillmentOrderDisposition> implements Node {
    public ReverseFulfillmentOrderDisposition() {
    }

    public ReverseFulfillmentOrderDisposition(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "createdAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

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

                case "quantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "type": {
                    responseData.put(key, ReverseFulfillmentOrderDispositionType.fromGraphQl(jsonAsString(field.getValue(), key)));

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

    public ReverseFulfillmentOrderDisposition(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "ReverseFulfillmentOrderDisposition";
    }

    /**
    * The date and time when the disposition was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public ReverseFulfillmentOrderDisposition setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The location where the disposition occurred.
    */

    public Location getLocation() {
        return (Location) get("location");
    }

    public ReverseFulfillmentOrderDisposition setLocation(Location arg) {
        optimisticData.put(getKey("location"), arg);
        return this;
    }

    /**
    * The number of disposed units.
    */

    public Integer getQuantity() {
        return (Integer) get("quantity");
    }

    public ReverseFulfillmentOrderDisposition setQuantity(Integer arg) {
        optimisticData.put(getKey("quantity"), arg);
        return this;
    }

    /**
    * The final arrangement of an item.
    */

    public ReverseFulfillmentOrderDispositionType getType() {
        return (ReverseFulfillmentOrderDispositionType) get("type");
    }

    public ReverseFulfillmentOrderDisposition setType(ReverseFulfillmentOrderDispositionType arg) {
        optimisticData.put(getKey("type"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "createdAt": return false;

            case "id": return false;

            case "location": return true;

            case "quantity": return false;

            case "type": return false;

            default: return false;
        }
    }
}

