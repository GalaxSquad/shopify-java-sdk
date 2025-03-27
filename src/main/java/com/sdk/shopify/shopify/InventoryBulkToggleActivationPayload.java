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
* Return type for `inventoryBulkToggleActivation` mutation.
*/
public class InventoryBulkToggleActivationPayload extends AbstractResponse<InventoryBulkToggleActivationPayload> {
    public InventoryBulkToggleActivationPayload() {
    }

    public InventoryBulkToggleActivationPayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "inventoryItem": {
                    InventoryItem optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new InventoryItem(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "inventoryLevels": {
                    List<InventoryLevel> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<InventoryLevel> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            list1.add(new InventoryLevel(jsonAsObject(element1, key)));
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<InventoryBulkToggleActivationUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new InventoryBulkToggleActivationUserError(jsonAsObject(element1, key)));
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
        return "InventoryBulkToggleActivationPayload";
    }

    /**
    * The inventory item that was updated.
    */

    public InventoryItem getInventoryItem() {
        return (InventoryItem) get("inventoryItem");
    }

    public InventoryBulkToggleActivationPayload setInventoryItem(InventoryItem arg) {
        optimisticData.put(getKey("inventoryItem"), arg);
        return this;
    }

    /**
    * The activated inventory levels.
    */

    public List<InventoryLevel> getInventoryLevels() {
        return (List<InventoryLevel>) get("inventoryLevels");
    }

    public InventoryBulkToggleActivationPayload setInventoryLevels(List<InventoryLevel> arg) {
        optimisticData.put(getKey("inventoryLevels"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<InventoryBulkToggleActivationUserError> getUserErrors() {
        return (List<InventoryBulkToggleActivationUserError>) get("userErrors");
    }

    public InventoryBulkToggleActivationPayload setUserErrors(List<InventoryBulkToggleActivationUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "inventoryItem": return true;

            case "inventoryLevels": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

