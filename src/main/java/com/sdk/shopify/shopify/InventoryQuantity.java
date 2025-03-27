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
* Represents a quantity of an inventory item at a specific location, for a specific name.
*/
public class InventoryQuantity extends AbstractResponse<InventoryQuantity> implements Node {
    public InventoryQuantity() {
    }

    public InventoryQuantity(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "quantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "updatedAt": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
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

    public InventoryQuantity(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "InventoryQuantity";
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The [name](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps#inventory-states)
    * that identifies the inventory quantity.
    */

    public String getName() {
        return (String) get("name");
    }

    public InventoryQuantity setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * The quantity for the quantity name.
    */

    public Integer getQuantity() {
        return (Integer) get("quantity");
    }

    public InventoryQuantity setQuantity(Integer arg) {
        optimisticData.put(getKey("quantity"), arg);
        return this;
    }

    /**
    * When the quantity was last updated.
    */

    public String getUpdatedAt() {
        return (String) get("updatedAt");
    }

    public InventoryQuantity setUpdatedAt(String arg) {
        optimisticData.put(getKey("updatedAt"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "name": return false;

            case "quantity": return false;

            case "updatedAt": return false;

            default: return false;
        }
    }
}

