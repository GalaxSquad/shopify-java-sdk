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
* The statistics of a given segment.
*/
public class SegmentStatistics extends AbstractResponse<SegmentStatistics> {
    public SegmentStatistics() {
    }

    public SegmentStatistics(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "attributeStatistics": {
                    responseData.put(key, new SegmentAttributeStatistics(jsonAsObject(field.getValue(), key)));

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
        return "SegmentStatistics";
    }

    /**
    * The statistics of a given attribute.
    */

    public SegmentAttributeStatistics getAttributeStatistics() {
        return (SegmentAttributeStatistics) get("attributeStatistics");
    }

    public SegmentStatistics setAttributeStatistics(SegmentAttributeStatistics arg) {
        optimisticData.put(getKey("attributeStatistics"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "attributeStatistics": return true;

            default: return false;
        }
    }
}

