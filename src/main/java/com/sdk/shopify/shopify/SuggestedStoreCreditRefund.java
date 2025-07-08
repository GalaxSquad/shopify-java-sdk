// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The suggested values for a refund to store credit.
*/
public class SuggestedStoreCreditRefund extends AbstractResponse<SuggestedStoreCreditRefund> implements SuggestedRefundMethod {
    public SuggestedStoreCreditRefund() {
    }

    public SuggestedStoreCreditRefund(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "amount": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "expiresAt": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

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

    public String getGraphQlTypeName() {
        return "SuggestedStoreCreditRefund";
    }

    /**
    * The suggested amount to refund in shop and presentment currencies.
    */

    public MoneyBag getAmount() {
        return (MoneyBag) get("amount");
    }

    public SuggestedStoreCreditRefund setAmount(MoneyBag arg) {
        optimisticData.put(getKey("amount"), arg);
        return this;
    }

    /**
    * The suggested expiration date for the store credit.
    */

    public String getExpiresAt() {
        return (String) get("expiresAt");
    }

    public SuggestedStoreCreditRefund setExpiresAt(String arg) {
        optimisticData.put(getKey("expiresAt"), arg);
        return this;
    }

    /**
    * The maximum available amount to refund in shop and presentment currencies.
    */

    public MoneyBag getMaximumRefundable() {
        return (MoneyBag) get("maximumRefundable");
    }

    public SuggestedStoreCreditRefund setMaximumRefundable(MoneyBag arg) {
        optimisticData.put(getKey("maximumRefundable"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "amount": return true;

            case "expiresAt": return false;

            case "maximumRefundable": return true;

            default: return false;
        }
    }
}

