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
* Return type for `inventorySetScheduledChanges` mutation.
*/
public class InventorySetScheduledChangesPayload extends AbstractResponse<InventorySetScheduledChangesPayload> {
    public InventorySetScheduledChangesPayload() {
    }

    public InventorySetScheduledChangesPayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "scheduledChanges": {
                    List<InventoryScheduledChange> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<InventoryScheduledChange> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            list1.add(new InventoryScheduledChange(jsonAsObject(element1, key)));
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<InventorySetScheduledChangesUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new InventorySetScheduledChangesUserError(jsonAsObject(element1, key)));
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
        return "InventorySetScheduledChangesPayload";
    }

    /**
    * The scheduled changes that were created.
    */

    public List<InventoryScheduledChange> getScheduledChanges() {
        return (List<InventoryScheduledChange>) get("scheduledChanges");
    }

    public InventorySetScheduledChangesPayload setScheduledChanges(List<InventoryScheduledChange> arg) {
        optimisticData.put(getKey("scheduledChanges"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<InventorySetScheduledChangesUserError> getUserErrors() {
        return (List<InventorySetScheduledChangesUserError>) get("userErrors");
    }

    public InventorySetScheduledChangesPayload setUserErrors(List<InventorySetScheduledChangesUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "scheduledChanges": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

