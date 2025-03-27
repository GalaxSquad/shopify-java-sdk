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
* The fixed amount value of a discount.
*/
public class AppSubscriptionDiscountAmount extends AbstractResponse<AppSubscriptionDiscountAmount> implements AppSubscriptionDiscountValue {
    public AppSubscriptionDiscountAmount() {
    }

    public AppSubscriptionDiscountAmount(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "amount": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

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
        return "AppSubscriptionDiscountAmount";
    }

    /**
    * The fixed amount value of a discount.
    */

    public MoneyV2 getAmount() {
        return (MoneyV2) get("amount");
    }

    public AppSubscriptionDiscountAmount setAmount(MoneyV2 arg) {
        optimisticData.put(getKey("amount"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "amount": return true;

            default: return false;
        }
    }
}

