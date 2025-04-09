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
* General inventory properties for the shop.
*/
public class InventoryProperties extends AbstractResponse<InventoryProperties> {
    public InventoryProperties() {
    }

    public InventoryProperties(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "quantityNames": {
                    List<InventoryQuantityName> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new InventoryQuantityName(jsonAsObject(element1, key)));
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
        return "InventoryProperties";
    }

    /**
    * All the quantity names.
    */

    public List<InventoryQuantityName> getQuantityNames() {
        return (List<InventoryQuantityName>) get("quantityNames");
    }

    public InventoryProperties setQuantityNames(List<InventoryQuantityName> arg) {
        optimisticData.put(getKey("quantityNames"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "quantityNames": return true;

            default: return false;
        }
    }
}

