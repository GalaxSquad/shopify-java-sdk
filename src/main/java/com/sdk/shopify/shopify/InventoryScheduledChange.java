// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.util.Map;

/**
* Returns the scheduled changes to inventory states related to the ledger document.
*/
public class InventoryScheduledChange extends AbstractResponse<InventoryScheduledChange> {
    public InventoryScheduledChange() {
    }

    public InventoryScheduledChange(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "expectedAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "fromName": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "inventoryLevel": {
                    responseData.put(key, new InventoryLevel(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "ledgerDocumentUri": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "quantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "toName": {
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

    public String getGraphQlTypeName() {
        return "InventoryScheduledChange";
    }

    /**
    * The date and time that the scheduled change is expected to happen.
    */

    public String getExpectedAt() {
        return (String) get("expectedAt");
    }

    public InventoryScheduledChange setExpectedAt(String arg) {
        optimisticData.put(getKey("expectedAt"), arg);
        return this;
    }

    /**
    * The quantity
    * [name](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps/quantities-states#move-in
    * ventory-quantities-between-states)
    * to transition from.
    */

    public String getFromName() {
        return (String) get("fromName");
    }

    public InventoryScheduledChange setFromName(String arg) {
        optimisticData.put(getKey("fromName"), arg);
        return this;
    }

    /**
    * The quantities of an inventory item that are related to a specific location.
    */

    public InventoryLevel getInventoryLevel() {
        return (InventoryLevel) get("inventoryLevel");
    }

    public InventoryScheduledChange setInventoryLevel(InventoryLevel arg) {
        optimisticData.put(getKey("inventoryLevel"), arg);
        return this;
    }

    /**
    * A freeform URI that represents what changed the inventory quantities.
    */

    public String getLedgerDocumentUri() {
        return (String) get("ledgerDocumentUri");
    }

    public InventoryScheduledChange setLedgerDocumentUri(String arg) {
        optimisticData.put(getKey("ledgerDocumentUri"), arg);
        return this;
    }

    /**
    * The quantity of the scheduled change associated with the ledger document in the `fromName` state.
    */

    public Integer getQuantity() {
        return (Integer) get("quantity");
    }

    public InventoryScheduledChange setQuantity(Integer arg) {
        optimisticData.put(getKey("quantity"), arg);
        return this;
    }

    /**
    * The quantity
    * [name](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps/quantities-states#move-in
    * ventory-quantities-between-states)
    * to transition to.
    */

    public String getToName() {
        return (String) get("toName");
    }

    public InventoryScheduledChange setToName(String arg) {
        optimisticData.put(getKey("toName"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "expectedAt": return false;

            case "fromName": return false;

            case "inventoryLevel": return true;

            case "ledgerDocumentUri": return false;

            case "quantity": return false;

            case "toName": return false;

            default: return false;
        }
    }
}

