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
* The statistics of a given attribute.
*/
public class SegmentAttributeStatistics extends AbstractResponse<SegmentAttributeStatistics> {
    public SegmentAttributeStatistics() {
    }

    public SegmentAttributeStatistics(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "average": {
                    responseData.put(key, jsonAsDouble(field.getValue(), key));

                    break;
                }

                case "sum": {
                    responseData.put(key, jsonAsDouble(field.getValue(), key));

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
        return "SegmentAttributeStatistics";
    }

    /**
    * The average of a given attribute.
    */

    public Double getAverage() {
        return (Double) get("average");
    }

    public SegmentAttributeStatistics setAverage(Double arg) {
        optimisticData.put(getKey("average"), arg);
        return this;
    }

    /**
    * The sum of a given attribute.
    */

    public Double getSum() {
        return (Double) get("sum");
    }

    public SegmentAttributeStatistics setSum(Double arg) {
        optimisticData.put(getKey("sum"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "average": return false;

            case "sum": return false;

            default: return false;
        }
    }
}

