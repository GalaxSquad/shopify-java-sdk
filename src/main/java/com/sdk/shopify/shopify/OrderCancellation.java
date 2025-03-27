// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Details about the order cancellation.
*/
public class OrderCancellation extends AbstractResponse<OrderCancellation> {
    public OrderCancellation() {
    }

    public OrderCancellation(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "staffNote": {
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

    public String getGraphQlTypeName() {
        return "OrderCancellation";
    }

    /**
    * Staff provided note for the order cancellation.
    */

    public String getStaffNote() {
        return (String) get("staffNote");
    }

    public OrderCancellation setStaffNote(String arg) {
        optimisticData.put(getKey("staffNote"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "staffNote": return false;

            default: return false;
        }
    }
}

