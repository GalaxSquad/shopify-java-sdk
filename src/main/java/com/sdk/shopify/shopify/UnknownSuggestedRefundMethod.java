// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Generic attributes of a suggested refund method.
*/
public class UnknownSuggestedRefundMethod extends AbstractResponse<UnknownSuggestedRefundMethod> implements SuggestedRefundMethod {
    public UnknownSuggestedRefundMethod() {
    }

    public UnknownSuggestedRefundMethod(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "amount": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "maximumRefundable": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

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

    public static SuggestedRefundMethod create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "SuggestedStoreCreditRefund": {
                return new SuggestedStoreCreditRefund(fields);
            }

            default: {
                return new UnknownSuggestedRefundMethod(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    /**
    * The suggested amount to refund in shop and presentment currencies.
    */

    public MoneyBag getAmount() {
        return (MoneyBag) get("amount");
    }

    public UnknownSuggestedRefundMethod setAmount(MoneyBag arg) {
        optimisticData.put(getKey("amount"), arg);
        return this;
    }

    /**
    * The maximum available amount to refund in shop and presentment currencies.
    */

    public MoneyBag getMaximumRefundable() {
        return (MoneyBag) get("maximumRefundable");
    }

    public UnknownSuggestedRefundMethod setMaximumRefundable(MoneyBag arg) {
        optimisticData.put(getKey("maximumRefundable"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "amount": return true;

            case "maximumRefundable": return true;

            default: return false;
        }
    }
}

