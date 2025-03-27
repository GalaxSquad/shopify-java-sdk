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
* A return shipping fee is a fee captured as part of a return to cover the costs of shipping the
* return.
*/
public class ReturnShippingFee extends AbstractResponse<ReturnShippingFee> implements Fee {
    public ReturnShippingFee() {
    }

    public ReturnShippingFee(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "amountSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

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
        return "ReturnShippingFee";
    }

    /**
    * The amount of the return shipping fee, in shop and presentment currencies.
    */

    public MoneyBag getAmountSet() {
        return (MoneyBag) get("amountSet");
    }

    public ReturnShippingFee setAmountSet(MoneyBag arg) {
        optimisticData.put(getKey("amountSet"), arg);
        return this;
    }

    /**
    * The unique ID for the Fee.
    */

    public ID getId() {
        return (ID) get("id");
    }

    public ReturnShippingFee setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "amountSet": return true;

            case "id": return false;

            default: return false;
        }
    }
}

