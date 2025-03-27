// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A location that a fulfillment order can potentially move to.
*/
public class FulfillmentOrderLocationForMove extends AbstractResponse<FulfillmentOrderLocationForMove> {
    public FulfillmentOrderLocationForMove() {
    }

    public FulfillmentOrderLocationForMove(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "availableLineItems": {
                    responseData.put(key, new FulfillmentOrderLineItemConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "availableLineItemsCount": {
                    Count optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Count(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "location": {
                    responseData.put(key, new Location(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "message": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "movable": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "unavailableLineItems": {
                    responseData.put(key, new FulfillmentOrderLineItemConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "unavailableLineItemsCount": {
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

    public String getGraphQlTypeName() {
        return "FulfillmentOrderLocationForMove";
    }

    /**
    * Fulfillment order line items that can be moved from their current location to the given location.
    */

    public FulfillmentOrderLineItemConnection getAvailableLineItems() {
        return (FulfillmentOrderLineItemConnection) get("availableLineItems");
    }

    public FulfillmentOrderLocationForMove setAvailableLineItems(FulfillmentOrderLineItemConnection arg) {
        optimisticData.put(getKey("availableLineItems"), arg);
        return this;
    }

    /**
    * Total number of fulfillment order line items that can be moved from their current assigned location
    * to the
    * given location.
    */

    public Count getAvailableLineItemsCount() {
        return (Count) get("availableLineItemsCount");
    }

    public FulfillmentOrderLocationForMove setAvailableLineItemsCount(Count arg) {
        optimisticData.put(getKey("availableLineItemsCount"), arg);
        return this;
    }

    /**
    * The location being considered as the fulfillment order's new assigned location.
    */

    public Location getLocation() {
        return (Location) get("location");
    }

    public FulfillmentOrderLocationForMove setLocation(Location arg) {
        optimisticData.put(getKey("location"), arg);
        return this;
    }

    /**
    * A human-readable string with the reason why the fulfillment order, or some of its line items, can't
    * be
    * moved to the location.
    */

    public String getMessage() {
        return (String) get("message");
    }

    public FulfillmentOrderLocationForMove setMessage(String arg) {
        optimisticData.put(getKey("message"), arg);
        return this;
    }

    /**
    * Whether the fulfillment order can be moved to the location.
    */

    public Boolean getMovable() {
        return (Boolean) get("movable");
    }

    public FulfillmentOrderLocationForMove setMovable(Boolean arg) {
        optimisticData.put(getKey("movable"), arg);
        return this;
    }

    /**
    * Fulfillment order line items that cannot be moved from their current location to the given location.
    */

    public FulfillmentOrderLineItemConnection getUnavailableLineItems() {
        return (FulfillmentOrderLineItemConnection) get("unavailableLineItems");
    }

    public FulfillmentOrderLocationForMove setUnavailableLineItems(FulfillmentOrderLineItemConnection arg) {
        optimisticData.put(getKey("unavailableLineItems"), arg);
        return this;
    }

    /**
    * Total number of fulfillment order line items that can't be moved from their current assigned
    * location to the
    * given location.
    */

    public Count getUnavailableLineItemsCount() {
        return (Count) get("unavailableLineItemsCount");
    }

    public FulfillmentOrderLocationForMove setUnavailableLineItemsCount(Count arg) {
        optimisticData.put(getKey("unavailableLineItemsCount"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "availableLineItems": return true;

            case "availableLineItemsCount": return true;

            case "location": return true;

            case "message": return false;

            case "movable": return false;

            case "unavailableLineItems": return true;

            case "unavailableLineItemsCount": return true;

            default: return false;
        }
    }
}

