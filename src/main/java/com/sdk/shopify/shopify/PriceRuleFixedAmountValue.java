// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The value of a fixed amount price rule.
*/
public class PriceRuleFixedAmountValue extends AbstractResponse<PriceRuleFixedAmountValue> implements PriceRuleValue {
    public PriceRuleFixedAmountValue() {
    }

    public PriceRuleFixedAmountValue(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "amount": {
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
        return "PriceRuleFixedAmountValue";
    }

    /**
    * The monetary value of the price rule.
    */

    public String getAmount() {
        return (String) get("amount");
    }

    public PriceRuleFixedAmountValue setAmount(String arg) {
        optimisticData.put(getKey("amount"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "amount": return false;

            default: return false;
        }
    }
}

