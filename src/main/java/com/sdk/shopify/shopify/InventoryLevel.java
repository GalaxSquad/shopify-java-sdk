// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* The quantities of an inventory item that are related to a specific location.
* Learn [more about the relationships between inventory
* objects](https://shopify.dev/docs/apps/build/orders-fulfillment/inventory-management-apps/manage-qua
* ntities-states#inventory-object-relationships).
*/
public class InventoryLevel extends AbstractResponse<InventoryLevel> implements Node {
    public InventoryLevel() {
    }

    public InventoryLevel(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "canDeactivate": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "createdAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "deactivationAlert": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "item": {
                    responseData.put(key, new InventoryItem(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "location": {
                    responseData.put(key, new Location(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "quantities": {
                    List<InventoryQuantity> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new InventoryQuantity(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "scheduledChanges": {
                    responseData.put(key, new InventoryScheduledChangeConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "updatedAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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

    public InventoryLevel(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "InventoryLevel";
    }

    /**
    * Whether the inventory items associated with the inventory level can be deactivated.
    */

    public Boolean getCanDeactivate() {
        return (Boolean) get("canDeactivate");
    }

    public InventoryLevel setCanDeactivate(Boolean arg) {
        optimisticData.put(getKey("canDeactivate"), arg);
        return this;
    }

    /**
    * The date and time when the inventory level was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public InventoryLevel setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * Describes either the impact of deactivating the inventory level, or why the inventory level can't be
    * deactivated.
    */

    public String getDeactivationAlert() {
        return (String) get("deactivationAlert");
    }

    public InventoryLevel setDeactivationAlert(String arg) {
        optimisticData.put(getKey("deactivationAlert"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * Inventory item associated with the inventory level.
    */

    public InventoryItem getItem() {
        return (InventoryItem) get("item");
    }

    public InventoryLevel setItem(InventoryItem arg) {
        optimisticData.put(getKey("item"), arg);
        return this;
    }

    /**
    * The location associated with the inventory level.
    */

    public Location getLocation() {
        return (Location) get("location");
    }

    public InventoryLevel setLocation(Location arg) {
        optimisticData.put(getKey("location"), arg);
        return this;
    }

    /**
    * Quantities for the requested names.
    */

    public List<InventoryQuantity> getQuantities() {
        return (List<InventoryQuantity>) get("quantities");
    }

    public InventoryLevel setQuantities(List<InventoryQuantity> arg) {
        optimisticData.put(getKey("quantities"), arg);
        return this;
    }

    /**
    * Scheduled changes for the requested quantity names.
    */

    public InventoryScheduledChangeConnection getScheduledChanges() {
        return (InventoryScheduledChangeConnection) get("scheduledChanges");
    }

    public InventoryLevel setScheduledChanges(InventoryScheduledChangeConnection arg) {
        optimisticData.put(getKey("scheduledChanges"), arg);
        return this;
    }

    /**
    * The date and time when the inventory level was updated.
    */

    public String getUpdatedAt() {
        return (String) get("updatedAt");
    }

    public InventoryLevel setUpdatedAt(String arg) {
        optimisticData.put(getKey("updatedAt"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "canDeactivate": return false;

            case "createdAt": return false;

            case "deactivationAlert": return false;

            case "id": return false;

            case "item": return true;

            case "location": return true;

            case "quantities": return true;

            case "scheduledChanges": return true;

            case "updatedAt": return false;

            default: return false;
        }
    }
}

