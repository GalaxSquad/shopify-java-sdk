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
* A list of suggested values associated with an individual segment. A
* segment is a group of members, such as customers, that meet specific
* criteria.
*/
public class SegmentValue extends AbstractResponse<SegmentValue> {
    public SegmentValue() {
    }

    public SegmentValue(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "localizedValue": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "queryName": {
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
        return "SegmentValue";
    }

    /**
    * The localized version of the value's name. This name is displayed to the merchant.
    */

    public String getLocalizedValue() {
        return (String) get("localizedValue");
    }

    public SegmentValue setLocalizedValue(String arg) {
        optimisticData.put(getKey("localizedValue"), arg);
        return this;
    }

    /**
    * The name of the query associated with the suggestion.
    */

    public String getQueryName() {
        return (String) get("queryName");
    }

    public SegmentValue setQueryName(String arg) {
        optimisticData.put(getKey("queryName"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "localizedValue": return false;

            case "queryName": return false;

            default: return false;
        }
    }
}

