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
* Return type for `inventoryTransferCancel` mutation.
*/
public class InventoryTransferCancelPayload extends AbstractResponse<InventoryTransferCancelPayload> {
    public InventoryTransferCancelPayload() {
    }

    public InventoryTransferCancelPayload(JsonObject fields) throws SchemaViolationError {
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

                case "userErrors": {
                    List<InventoryTransferCancelUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new InventoryTransferCancelUserError(jsonAsObject(element1, key)));
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
        return "InventoryTransferCancelPayload";
    }

    /**
    * The cancelled inventory transfer.
    */

    public InventoryTransfer getInventoryTransfer() {
        return (InventoryTransfer) get("inventoryTransfer");
    }

    public InventoryTransferCancelPayload setInventoryTransfer(InventoryTransfer arg) {
        optimisticData.put(getKey("inventoryTransfer"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<InventoryTransferCancelUserError> getUserErrors() {
        return (List<InventoryTransferCancelUserError>) get("userErrors");
    }

    public InventoryTransferCancelPayload setUserErrors(List<InventoryTransferCancelUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "inventoryTransfer": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

