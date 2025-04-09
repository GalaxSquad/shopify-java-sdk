// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The type of the price rule value. The price rule value might be a percentage value, or a fixed
* amount.
*/
public class UnknownPriceRuleValue extends AbstractResponse<UnknownPriceRuleValue> implements PriceRuleValue {
    public UnknownPriceRuleValue() {
    }

    public UnknownPriceRuleValue(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
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

    public static PriceRuleValue create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "PriceRuleFixedAmountValue": {
                return new PriceRuleFixedAmountValue(fields);
            }

            case "PriceRulePercentValue": {
                return new PriceRulePercentValue(fields);
            }

            default: {
                return new UnknownPriceRuleValue(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            default: return false;
        }
    }
}

