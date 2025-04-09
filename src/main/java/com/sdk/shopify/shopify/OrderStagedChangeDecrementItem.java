// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* An removal of items from an existing line item on the order.
*/
public class OrderStagedChangeDecrementItem extends AbstractResponse<OrderStagedChangeDecrementItem> implements OrderStagedChange {
    public OrderStagedChangeDecrementItem() {
    }

    public OrderStagedChangeDecrementItem(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "delta": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "lineItem": {
                    responseData.put(key, new LineItem(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "restock": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

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
        return "OrderStagedChangeDecrementItem";
    }

    /**
    * The number of items removed.
    */

    public Integer getDelta() {
        return (Integer) get("delta");
    }

    public OrderStagedChangeDecrementItem setDelta(Integer arg) {
        optimisticData.put(getKey("delta"), arg);
        return this;
    }

    /**
    * The original line item.
    */

    public LineItem getLineItem() {
        return (LineItem) get("lineItem");
    }

    public OrderStagedChangeDecrementItem setLineItem(LineItem arg) {
        optimisticData.put(getKey("lineItem"), arg);
        return this;
    }

    /**
    * The intention to restock the removed items.
    */

    public Boolean getRestock() {
        return (Boolean) get("restock");
    }

    public OrderStagedChangeDecrementItem setRestock(Boolean arg) {
        optimisticData.put(getKey("restock"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "delta": return false;

            case "lineItem": return true;

            case "restock": return false;

            default: return false;
        }
    }
}

