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
* A change to the order representing the addition of a
* custom line item. For example, you might want to add gift wrapping service
* as a custom line item.
*/
public class OrderStagedChangeAddCustomItem extends AbstractResponse<OrderStagedChangeAddCustomItem> implements OrderStagedChange {
    public OrderStagedChangeAddCustomItem() {
    }

    public OrderStagedChangeAddCustomItem(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "originalUnitPrice": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "quantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "title": {
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
        return "OrderStagedChangeAddCustomItem";
    }

    /**
    * The price of an individual item without any discounts applied. This value can't be negative.
    */

    public MoneyV2 getOriginalUnitPrice() {
        return (MoneyV2) get("originalUnitPrice");
    }

    public OrderStagedChangeAddCustomItem setOriginalUnitPrice(MoneyV2 arg) {
        optimisticData.put(getKey("originalUnitPrice"), arg);
        return this;
    }

    /**
    * The quantity of the custom item to add to the order. This value must be greater than zero.
    */

    public Integer getQuantity() {
        return (Integer) get("quantity");
    }

    public OrderStagedChangeAddCustomItem setQuantity(Integer arg) {
        optimisticData.put(getKey("quantity"), arg);
        return this;
    }

    /**
    * The title of the custom item.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public OrderStagedChangeAddCustomItem setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "originalUnitPrice": return true;

            case "quantity": return false;

            case "title": return false;

            default: return false;
        }
    }
}

