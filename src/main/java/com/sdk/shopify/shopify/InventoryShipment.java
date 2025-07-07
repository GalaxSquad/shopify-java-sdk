// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents an inventory shipment.
*/
public class InventoryShipment extends AbstractResponse<InventoryShipment> implements Node {
    public InventoryShipment() {
    }

    public InventoryShipment(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "lineItemTotalQuantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "lineItems": {
                    InventoryShipmentLineItemConnection optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new InventoryShipmentLineItemConnection(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "lineItemsCount": {
                    Count optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Count(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "status": {
                    responseData.put(key, InventoryShipmentStatus.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "totalAcceptedQuantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "totalReceivedQuantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "totalRejectedQuantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "tracking": {
                    InventoryShipmentTracking optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new InventoryShipmentTracking(jsonAsObject(field.getValue(), key));
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

    public InventoryShipment(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "InventoryShipment";
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The total quantity of all items in the shipment.
    */

    public Integer getLineItemTotalQuantity() {
        return (Integer) get("lineItemTotalQuantity");
    }

    public InventoryShipment setLineItemTotalQuantity(Integer arg) {
        optimisticData.put(getKey("lineItemTotalQuantity"), arg);
        return this;
    }

    /**
    * The line items included in this shipment.
    */

    public InventoryShipmentLineItemConnection getLineItems() {
        return (InventoryShipmentLineItemConnection) get("lineItems");
    }

    public InventoryShipment setLineItems(InventoryShipmentLineItemConnection arg) {
        optimisticData.put(getKey("lineItems"), arg);
        return this;
    }

    /**
    * The number of line items associated with the inventory shipment. Limited to a maximum of 10000 by
    * default.
    */

    public Count getLineItemsCount() {
        return (Count) get("lineItemsCount");
    }

    public InventoryShipment setLineItemsCount(Count arg) {
        optimisticData.put(getKey("lineItemsCount"), arg);
        return this;
    }

    /**
    * The name of the inventory shipment.
    */

    public String getName() {
        return (String) get("name");
    }

    public InventoryShipment setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * The current status of the shipment.
    */

    public InventoryShipmentStatus getStatus() {
        return (InventoryShipmentStatus) get("status");
    }

    public InventoryShipment setStatus(InventoryShipmentStatus arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    /**
    * The total quantity of items accepted across all line items in this shipment.
    */

    public Integer getTotalAcceptedQuantity() {
        return (Integer) get("totalAcceptedQuantity");
    }

    public InventoryShipment setTotalAcceptedQuantity(Integer arg) {
        optimisticData.put(getKey("totalAcceptedQuantity"), arg);
        return this;
    }

    /**
    * The total quantity of items received (both accepted and rejected) across all line items in this
    * shipment.
    */

    public Integer getTotalReceivedQuantity() {
        return (Integer) get("totalReceivedQuantity");
    }

    public InventoryShipment setTotalReceivedQuantity(Integer arg) {
        optimisticData.put(getKey("totalReceivedQuantity"), arg);
        return this;
    }

    /**
    * The total quantity of items rejected across all line items in this shipment.
    */

    public Integer getTotalRejectedQuantity() {
        return (Integer) get("totalRejectedQuantity");
    }

    public InventoryShipment setTotalRejectedQuantity(Integer arg) {
        optimisticData.put(getKey("totalRejectedQuantity"), arg);
        return this;
    }

    /**
    * The tracking information for the shipment.
    */

    public InventoryShipmentTracking getTracking() {
        return (InventoryShipmentTracking) get("tracking");
    }

    public InventoryShipment setTracking(InventoryShipmentTracking arg) {
        optimisticData.put(getKey("tracking"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "lineItemTotalQuantity": return false;

            case "lineItems": return true;

            case "lineItemsCount": return true;

            case "name": return false;

            case "status": return false;

            case "totalAcceptedQuantity": return false;

            case "totalReceivedQuantity": return false;

            case "totalRejectedQuantity": return false;

            case "tracking": return true;

            default: return false;
        }
    }
}

