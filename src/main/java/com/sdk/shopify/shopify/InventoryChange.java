// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents a change in an inventory quantity of an inventory item at a location.
*/
public class InventoryChange extends AbstractResponse<InventoryChange> {
    public InventoryChange() {
    }

    public InventoryChange(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "delta": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "item": {
                    InventoryItem optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new InventoryItem(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "ledgerDocumentUri": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "location": {
                    Location optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Location(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "quantityAfterChange": {
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
        return "InventoryChange";
    }

    /**
    * The amount by which the inventory quantity was changed.
    */

    public Integer getDelta() {
        return (Integer) get("delta");
    }

    public InventoryChange setDelta(Integer arg) {
        optimisticData.put(getKey("delta"), arg);
        return this;
    }

    /**
    * The inventory item associated with this inventory change.
    */

    public InventoryItem getItem() {
        return (InventoryItem) get("item");
    }

    public InventoryChange setItem(InventoryItem arg) {
        optimisticData.put(getKey("item"), arg);
        return this;
    }

    /**
    * A URI that represents what the inventory quantity change was applied to.
    */

    public String getLedgerDocumentUri() {
        return (String) get("ledgerDocumentUri");
    }

    public InventoryChange setLedgerDocumentUri(String arg) {
        optimisticData.put(getKey("ledgerDocumentUri"), arg);
        return this;
    }

    /**
    * The location associated with this inventory change.
    */

    public Location getLocation() {
        return (Location) get("location");
    }

    public InventoryChange setLocation(Location arg) {
        optimisticData.put(getKey("location"), arg);
        return this;
    }

    /**
    * The [name](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps#inventory-states)
    * of the inventory quantity that was changed.
    */

    public String getName() {
        return (String) get("name");
    }

    public InventoryChange setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * The quantity of named inventory after the change.
    */

    public Integer getQuantityAfterChange() {
        return (Integer) get("quantityAfterChange");
    }

    public InventoryChange setQuantityAfterChange(Integer arg) {
        optimisticData.put(getKey("quantityAfterChange"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "delta": return false;

            case "item": return true;

            case "ledgerDocumentUri": return false;

            case "location": return true;

            case "name": return false;

            case "quantityAfterChange": return false;

            default: return false;
        }
    }
}

