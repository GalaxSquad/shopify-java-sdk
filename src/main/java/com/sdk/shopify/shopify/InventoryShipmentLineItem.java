// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents a single line item within an inventory shipment.
*/
public class InventoryShipmentLineItem extends AbstractResponse<InventoryShipmentLineItem> implements Node {
    public InventoryShipmentLineItem() {
    }

    public InventoryShipmentLineItem(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "acceptedQuantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "inventoryItem": {
                    InventoryItem optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new InventoryItem(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "quantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "rejectedQuantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "unreceivedQuantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

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

    public InventoryShipmentLineItem(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "InventoryShipmentLineItem";
    }

    /**
    * The quantity of items that were accepted in this shipment line item.
    */

    public Integer getAcceptedQuantity() {
        return (Integer) get("acceptedQuantity");
    }

    public InventoryShipmentLineItem setAcceptedQuantity(Integer arg) {
        optimisticData.put(getKey("acceptedQuantity"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The inventory item associated with this line item.
    */

    public InventoryItem getInventoryItem() {
        return (InventoryItem) get("inventoryItem");
    }

    public InventoryShipmentLineItem setInventoryItem(InventoryItem arg) {
        optimisticData.put(getKey("inventoryItem"), arg);
        return this;
    }

    /**
    * The quantity of items in this shipment line item.
    */

    public Integer getQuantity() {
        return (Integer) get("quantity");
    }

    public InventoryShipmentLineItem setQuantity(Integer arg) {
        optimisticData.put(getKey("quantity"), arg);
        return this;
    }

    /**
    * The quantity of items that were rejected in this shipment line item.
    */

    public Integer getRejectedQuantity() {
        return (Integer) get("rejectedQuantity");
    }

    public InventoryShipmentLineItem setRejectedQuantity(Integer arg) {
        optimisticData.put(getKey("rejectedQuantity"), arg);
        return this;
    }

    /**
    * The total quantity of units that haven't been received (neither accepted or rejected) in this
    * shipment line item.
    */

    public Integer getUnreceivedQuantity() {
        return (Integer) get("unreceivedQuantity");
    }

    public InventoryShipmentLineItem setUnreceivedQuantity(Integer arg) {
        optimisticData.put(getKey("unreceivedQuantity"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "acceptedQuantity": return false;

            case "id": return false;

            case "inventoryItem": return true;

            case "quantity": return false;

            case "rejectedQuantity": return false;

            case "unreceivedQuantity": return false;

            default: return false;
        }
    }
}

