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
* Return type for `inventoryMoveQuantities` mutation.
*/
public class InventoryMoveQuantitiesPayload extends AbstractResponse<InventoryMoveQuantitiesPayload> {
    public InventoryMoveQuantitiesPayload() {
    }

    public InventoryMoveQuantitiesPayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "inventoryAdjustmentGroup": {
                    InventoryAdjustmentGroup optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new InventoryAdjustmentGroup(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<InventoryMoveQuantitiesUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new InventoryMoveQuantitiesUserError(jsonAsObject(element1, key)));
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
        return "InventoryMoveQuantitiesPayload";
    }

    /**
    * The group of changes made by the operation.
    */

    public InventoryAdjustmentGroup getInventoryAdjustmentGroup() {
        return (InventoryAdjustmentGroup) get("inventoryAdjustmentGroup");
    }

    public InventoryMoveQuantitiesPayload setInventoryAdjustmentGroup(InventoryAdjustmentGroup arg) {
        optimisticData.put(getKey("inventoryAdjustmentGroup"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<InventoryMoveQuantitiesUserError> getUserErrors() {
        return (List<InventoryMoveQuantitiesUserError>) get("userErrors");
    }

    public InventoryMoveQuantitiesPayload setUserErrors(List<InventoryMoveQuantitiesUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "inventoryAdjustmentGroup": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

