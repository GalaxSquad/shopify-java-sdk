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
* Details about an individual quantity name.
*/
public class InventoryQuantityName extends AbstractResponse<InventoryQuantityName> {
    public InventoryQuantityName() {
    }

    public InventoryQuantityName(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "belongsTo": {
                    List<String> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(jsonAsString(element1, key));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "comprises": {
                    List<String> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(jsonAsString(element1, key));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "displayName": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "isInUse": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "name": {
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
        return "InventoryQuantityName";
    }

    /**
    * List of quantity names that this quantity name belongs to.
    */

    public List<String> getBelongsTo() {
        return (List<String>) get("belongsTo");
    }

    public InventoryQuantityName setBelongsTo(List<String> arg) {
        optimisticData.put(getKey("belongsTo"), arg);
        return this;
    }

    /**
    * List of quantity names that comprise this quantity name.
    */

    public List<String> getComprises() {
        return (List<String>) get("comprises");
    }

    public InventoryQuantityName setComprises(List<String> arg) {
        optimisticData.put(getKey("comprises"), arg);
        return this;
    }

    /**
    * The display name for quantity names translated into applicable language.
    */

    public String getDisplayName() {
        return (String) get("displayName");
    }

    public InventoryQuantityName setDisplayName(String arg) {
        optimisticData.put(getKey("displayName"), arg);
        return this;
    }

    /**
    * Whether the quantity name has been used by the merchant.
    */

    public Boolean getIsInUse() {
        return (Boolean) get("isInUse");
    }

    public InventoryQuantityName setIsInUse(Boolean arg) {
        optimisticData.put(getKey("isInUse"), arg);
        return this;
    }

    /**
    * The [name](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps#inventory-states) of
    * the inventory quantity. Used by
    * [inventory queries and
    * mutations](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps#graphql-queries-and-m
    * utations).
    */

    public String getName() {
        return (String) get("name");
    }

    public InventoryQuantityName setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "belongsTo": return false;

            case "comprises": return false;

            case "displayName": return false;

            case "isInUse": return false;

            case "name": return false;

            default: return false;
        }
    }
}

