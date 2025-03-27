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
* A shipping line removed during an order edit.
*/
public class OrderStagedChangeRemoveShippingLine extends AbstractResponse<OrderStagedChangeRemoveShippingLine> implements OrderStagedChange {
    public OrderStagedChangeRemoveShippingLine() {
    }

    public OrderStagedChangeRemoveShippingLine(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "shippingLine": {
                    responseData.put(key, new ShippingLine(jsonAsObject(field.getValue(), key)));

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
        return "OrderStagedChangeRemoveShippingLine";
    }

    /**
    * The removed shipping line.
    */

    public ShippingLine getShippingLine() {
        return (ShippingLine) get("shippingLine");
    }

    public OrderStagedChangeRemoveShippingLine setShippingLine(ShippingLine arg) {
        optimisticData.put(getKey("shippingLine"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "shippingLine": return true;

            default: return false;
        }
    }
}

