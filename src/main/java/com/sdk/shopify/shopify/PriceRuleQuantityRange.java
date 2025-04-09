// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A quantity range within which the price rule is applicable.
*/
public class PriceRuleQuantityRange extends AbstractResponse<PriceRuleQuantityRange> {
    public PriceRuleQuantityRange() {
    }

    public PriceRuleQuantityRange(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "greaterThan": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "greaterThanOrEqualTo": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "lessThan": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "lessThanOrEqualTo": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
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
        return "PriceRuleQuantityRange";
    }

    /**
    * The lower bound of the quantity range.
    */

    public Integer getGreaterThan() {
        return (Integer) get("greaterThan");
    }

    public PriceRuleQuantityRange setGreaterThan(Integer arg) {
        optimisticData.put(getKey("greaterThan"), arg);
        return this;
    }

    /**
    * The lower bound or equal of the quantity range.
    */

    public Integer getGreaterThanOrEqualTo() {
        return (Integer) get("greaterThanOrEqualTo");
    }

    public PriceRuleQuantityRange setGreaterThanOrEqualTo(Integer arg) {
        optimisticData.put(getKey("greaterThanOrEqualTo"), arg);
        return this;
    }

    /**
    * The upper bound of the quantity range.
    */

    public Integer getLessThan() {
        return (Integer) get("lessThan");
    }

    public PriceRuleQuantityRange setLessThan(Integer arg) {
        optimisticData.put(getKey("lessThan"), arg);
        return this;
    }

    /**
    * The upper bound or equal of the quantity range.
    */

    public Integer getLessThanOrEqualTo() {
        return (Integer) get("lessThanOrEqualTo");
    }

    public PriceRuleQuantityRange setLessThanOrEqualTo(Integer arg) {
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

