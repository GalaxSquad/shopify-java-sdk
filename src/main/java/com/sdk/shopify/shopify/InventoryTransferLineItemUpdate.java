// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents an update to a single transfer line item.
*/
public class InventoryTransferLineItemUpdate extends AbstractResponse<InventoryTransferLineItemUpdate> {
    public InventoryTransferLineItemUpdate() {
    }

    public InventoryTransferLineItemUpdate(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "deltaQuantity": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "inventoryItemId": {
                    ID optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ID(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "newQuantity": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
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
        return "InventoryTransferLineItemUpdate";
    }

    /**
    * The delta quantity for the transfer line item.
    */

    public Integer getDeltaQuantity() {
        return (Integer) get("deltaQuantity");
    }

    public InventoryTransferLineItemUpdate setDeltaQuantity(Integer arg) {
        optimisticData.put(getKey("deltaQuantity"), arg);
        return this;
    }

    /**
    * The inventory item ID for the transfer line item.
    */

    public ID getInventoryItemId() {
        return (ID) get("inventoryItemId");
    }

    public InventoryTransferLineItemUpdate setInventoryItemId(ID arg) {
        optimisticData.put(getKey("inventoryItemId"), arg);
        return this;
    }

    /**
    * The new quantity for the transfer line item.
    */

    public Integer getNewQuantity() {
        return (Integer) get("newQuantity");
    }

    public InventoryTransferLineItemUpdate setNewQuantity(Integer arg) {
        optimisticData.put(getKey("newQuantity"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "deltaQuantity": return false;

            case "inventoryItemId": return false;

            case "newQuantity": return false;

            default: return false;
        }
    }
}

