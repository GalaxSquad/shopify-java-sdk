// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A money range within which the price rule is applicable.
*/
public class PriceRuleMoneyRange extends AbstractResponse<PriceRuleMoneyRange> {
    public PriceRuleMoneyRange() {
    }

    public PriceRuleMoneyRange(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "greaterThan": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "greaterThanOrEqualTo": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "lessThan": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "lessThanOrEqualTo": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

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
        return "PriceRuleMoneyRange";
    }

    /**
    * The lower bound of the money range.
    */

    public String getGreaterThan() {
        return (String) get("greaterThan");
    }

    public PriceRuleMoneyRange setGreaterThan(String arg) {
        optimisticData.put(getKey("greaterThan"), arg);
        return this;
    }

    /**
    * The lower bound or equal of the money range.
    */

    public String getGreaterThanOrEqualTo() {
        return (String) get("greaterThanOrEqualTo");
    }

    public PriceRuleMoneyRange setGreaterThanOrEqualTo(String arg) {
        optimisticData.put(getKey("greaterThanOrEqualTo"), arg);
        return this;
    }

    /**
    * The upper bound of the money range.
    */

    public String getLessThan() {
        return (String) get("lessThan");
    }

    public PriceRuleMoneyRange setLessThan(String arg) {
        optimisticData.put(getKey("lessThan"), arg);
        return this;
    }

    /**
    * The upper bound or equal of the money range.
    */

    public String getLessThanOrEqualTo() {
        return (String) get("lessThanOrEqualTo");
    }

    public PriceRuleMoneyRange setLessThanOrEqualTo(String arg) {
        optimisticData.put(getKey("lessThanOrEqualTo"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "greaterThan": return false;

            case "greaterThanOrEqualTo": return false;

            case "lessThan": return false;

            case "lessThanOrEqualTo": return false;

            default: return false;
        }
    }
}

