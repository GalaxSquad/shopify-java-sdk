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
* Return type for `inventoryActivate` mutation.
*/
public class InventoryActivatePayload extends AbstractResponse<InventoryActivatePayload> {
    public InventoryActivatePayload() {
    }

    public InventoryActivatePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "inventoryLevel": {
                    InventoryLevel optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new InventoryLevel(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<UserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new UserError(jsonAsObject(element1, key)));
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
        return "InventoryActivatePayload";
    }

    /**
    * The inventory level that was activated.
    */

    public InventoryLevel getInventoryLevel() {
        return (InventoryLevel) get("inventoryLevel");
    }

    public InventoryActivatePayload setInventoryLevel(InventoryLevel arg) {
        optimisticData.put(getKey("inventoryLevel"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<UserError> getUserErrors() {
        return (List<UserError>) get("userErrors");
    }

    public InventoryActivatePayload setUserErrors(List<UserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "inventoryLevel": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

