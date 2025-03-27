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
* The order associated to the balance transaction.
*/
public class ShopifyPaymentsAssociatedOrder extends AbstractResponse<ShopifyPaymentsAssociatedOrder> {
    public ShopifyPaymentsAssociatedOrder() {
    }

    public ShopifyPaymentsAssociatedOrder(JsonObject fields) throws SchemaViolationError {
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
        return "ShopifyPaymentsAssociatedOrder";
    }

    /**
    * The ID of the associated order.
    */

    public ID getId() {
        return (ID) get("id");
    }

    public ShopifyPaymentsAssociatedOrder setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
    * The name of the associated order.
    */

    public String getName() {
        return (String) get("name");
    }

    public ShopifyPaymentsAssociatedOrder setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "name": return false;

            default: return false;
        }
    }
}

