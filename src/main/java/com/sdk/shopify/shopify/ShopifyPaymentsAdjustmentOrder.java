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
* The adjustment order object.
*/
public class ShopifyPaymentsAdjustmentOrder extends AbstractResponse<ShopifyPaymentsAdjustmentOrder> {
    public ShopifyPaymentsAdjustmentOrder() {
    }

    public ShopifyPaymentsAdjustmentOrder(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "amount": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "link": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "orderTransactionId": {
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
        return "ShopifyPaymentsAdjustmentOrder";
    }

    /**
    * The amount of the adjustment order.
    */

    public MoneyV2 getAmount() {
        return (MoneyV2) get("amount");
    }

    public ShopifyPaymentsAdjustmentOrder setAmount(MoneyV2 arg) {
        optimisticData.put(getKey("amount"), arg);
        return this;
    }

    /**
    * The link to the adjustment order.
    */

    public String getLink() {
        return (String) get("link");
    }

    public ShopifyPaymentsAdjustmentOrder setLink(String arg) {
        optimisticData.put(getKey("link"), arg);
        return this;
    }

    /**
    * The name of the adjustment order.
    */

    public String getName() {
        return (String) get("name");
    }

    public ShopifyPaymentsAdjustmentOrder setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * The ID of the order transaction.
    */

    public String getOrderTransactionId() {
        return (String) get("orderTransactionId");
    }

    public ShopifyPaymentsAdjustmentOrder setOrderTransactionId(String arg) {
        optimisticData.put(getKey("orderTransactionId"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "amount": return true;

            case "link": return false;

            case "name": return false;

            case "orderTransactionId": return false;

            default: return false;
        }
    }
}

