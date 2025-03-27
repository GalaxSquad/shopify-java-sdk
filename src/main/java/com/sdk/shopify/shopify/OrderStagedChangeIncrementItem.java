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
* An addition of items to an existing line item on the order.
*/
public class OrderStagedChangeIncrementItem extends AbstractResponse<OrderStagedChangeIncrementItem> implements OrderStagedChange {
    public OrderStagedChangeIncrementItem() {
    }

    public OrderStagedChangeIncrementItem(JsonObject fields) throws SchemaViolationError {
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
        return "OrderStagedChangeIncrementItem";
    }

    /**
    * The number of items added.
    */

    public Integer getDelta() {
        return (Integer) get("delta");
    }

    public OrderStagedChangeIncrementItem setDelta(Integer arg) {
        optimisticData.put(getKey("delta"), arg);
        return this;
    }

    /**
    * The original line item.
    */

    public LineItem getLineItem() {
        return (LineItem) get("lineItem");
    }

    public OrderStagedChangeIncrementItem setLineItem(LineItem arg) {
        optimisticData.put(getKey("lineItem"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "delta": return false;

            case "lineItem": return true;

            default: return false;
        }
    }
}

