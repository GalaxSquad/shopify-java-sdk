// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents a line item belonging to an inventory transfer.
*/
public class InventoryTransferLineItem extends AbstractResponse<InventoryTransferLineItem> implements Node {
    public InventoryTransferLineItem() {
    }

    public InventoryTransferLineItem(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
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

                case "pickedForShipmentQuantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "processableQuantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "shippableQuantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "shippedQuantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "title": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "totalQuantity": {
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

    public InventoryTransferLineItem(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "InventoryTransferLineItem";
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

    public InventoryTransferLineItem setInventoryItem(InventoryItem arg) {
        optimisticData.put(getKey("inventoryItem"), arg);
        return this;
    }

    /**
    * The quantity of the item that has been picked for a draft shipment but not yet shipped.
    */

    public Integer getPickedForShipmentQuantity() {
        return (Integer) get("pickedForShipmentQuantity");
    }

    public InventoryTransferLineItem setPickedForShipmentQuantity(Integer arg) {
        optimisticData.put(getKey("pickedForShipmentQuantity"), arg);
        return this;
    }

    /**
    * The quantity of the item that can be actioned upon, such as editing the item quantity on the
    * transfer or adding to a shipment.
    */

    public Integer getProcessableQuantity() {
        return (Integer) get("processableQuantity");
    }

    public InventoryTransferLineItem setProcessableQuantity(Integer arg) {
        optimisticData.put(getKey("processableQuantity"), arg);
        return this;
    }

    /**
    * The quantity of the item that can be shipped.
    */

    public Integer getShippableQuantity() {
        return (Integer) get("shippableQuantity");
    }

    public InventoryTransferLineItem setShippableQuantity(Integer arg) {
        optimisticData.put(getKey("shippableQuantity"), arg);
        return this;
    }

    /**
    * The quantity of the item that has been shipped.
    */

    public Integer getShippedQuantity() {
        return (Integer) get("shippedQuantity");
    }

    public InventoryTransferLineItem setShippedQuantity(Integer arg) {
        optimisticData.put(getKey("shippedQuantity"), arg);
        return this;
    }

    /**
    * The title of the product associated with this line item.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public InventoryTransferLineItem setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    /**
    * The total quantity of items being transferred.
    */

    public Integer getTotalQuantity() {
        return (Integer) get("totalQuantity");
    }

    public InventoryTransferLineItem setTotalQuantity(Integer arg) {
        optimisticData.put(getKey("totalQuantity"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "inventoryItem": return true;

            case "pickedForShipmentQuantity": return false;

            case "processableQuantity": return false;

            case "shippableQuantity": return false;

            case "shippedQuantity": return false;

            case "title": return false;

            case "totalQuantity": return false;

            default: return false;
        }
    }
}

