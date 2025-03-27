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
* A time period during which a price rule is applicable.
*/
public class PriceRuleValidityPeriod extends AbstractResponse<PriceRuleValidityPeriod> {
    public PriceRuleValidityPeriod() {
    }

    public PriceRuleValidityPeriod(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "end": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "start": {
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
        return "PriceRuleValidityPeriod";
    }

    /**
    * The time after which the price rule becomes invalid.
    */

    public String getEnd() {
        return (String) get("end");
    }

    public PriceRuleValidityPeriod setEnd(String arg) {
        optimisticData.put(getKey("end"), arg);
        return this;
    }

    /**
    * The time after which the price rule is valid.
    */

    public String getStart() {
        return (String) get("start");
    }

    public PriceRuleValidityPeriod setStart(String arg) {
        optimisticData.put(getKey("start"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "end": return false;

            case "start": return false;

            default: return false;
        }
    }
}

