// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* An auto-generated type which holds one OrderAdjustment and a cursor during pagination.
*/
public class OrderAdjustmentEdge extends AbstractResponse<OrderAdjustmentEdge> {
    public OrderAdjustmentEdge() {
    }

    public OrderAdjustmentEdge(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "cursor": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "node": {
                    responseData.put(key, new OrderAdjustment(jsonAsObject(field.getValue(), key)));

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
        return "OrderAdjustmentEdge";
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */

    public String getCursor() {
        return (String) get("cursor");
    }

    public OrderAdjustmentEdge setCursor(String arg) {
        optimisticData.put(getKey("cursor"), arg);
        return this;
    }

    /**
    * The item at the end of OrderAdjustmentEdge.
    */

    public OrderAdjustment getNode() {
        return (OrderAdjustment) get("node");
    }

    public OrderAdjustmentEdge setNode(OrderAdjustment arg) {
        optimisticData.put(getKey("node"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "cursor": return false;

            case "node": return true;

            default: return false;
        }
    }
}

