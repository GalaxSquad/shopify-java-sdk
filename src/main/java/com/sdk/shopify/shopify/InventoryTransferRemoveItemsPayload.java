// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Return type for `inventoryTransferRemoveItems` mutation.
*/
public class InventoryTransferRemoveItemsPayload extends AbstractResponse<InventoryTransferRemoveItemsPayload> {
    public InventoryTransferRemoveItemsPayload() {
    }

    public InventoryTransferRemoveItemsPayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "inventoryTransfer": {
                    InventoryTransfer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new InventoryTransfer(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "removedQuantities": {
                    List<InventoryTransferLineItemUpdate> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<InventoryTransferLineItemUpdate> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            list1.add(new InventoryTransferLineItemUpdate(jsonAsObject(element1, key)));
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<InventoryTransferRemoveItemsUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new InventoryTransferRemoveItemsUserError(jsonAsObject(element1, key)));
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
        return "InventoryTransferRemoveItemsPayload";
    }

    /**
    * The transfer with line items removed.
    */

    public InventoryTransfer getInventoryTransfer() {
        return (InventoryTransfer) get("inventoryTransfer");
    }

    public InventoryTransferRemoveItemsPayload setInventoryTransfer(InventoryTransfer arg) {
        optimisticData.put(getKey("inventoryTransfer"), arg);
        return this;
    }

    /**
    * The line items that have had their shippable quantity removed.
    */

    public List<InventoryTransferLineItemUpdate> getRemovedQuantities() {
        return (List<InventoryTransferLineItemUpdate>) get("removedQuantities");
    }

    public InventoryTransferRemoveItemsPayload setRemovedQuantities(List<InventoryTransferLineItemUpdate> arg) {
        optimisticData.put(getKey("removedQuantities"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<InventoryTransferRemoveItemsUserError> getUserErrors() {
        return (List<InventoryTransferRemoveItemsUserError>) get("userErrors");
    }

    public InventoryTransferRemoveItemsPayload setUserErrors(List<InventoryTransferRemoveItemsUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "inventoryTransfer": return true;

            case "removedQuantities": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

