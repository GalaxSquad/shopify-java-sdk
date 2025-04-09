// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A filter with a set of possible values that's been added to a segment query.
*/
public class SegmentEnumFilter extends AbstractResponse<SegmentEnumFilter> implements SegmentFilter {
    public SegmentEnumFilter() {
    }

    public SegmentEnumFilter(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "localizedName": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "multiValue": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

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
        return "SegmentEnumFilter";
    }

    /**
    * The localized name of the filter.
    */

    public String getLocalizedName() {
        return (String) get("localizedName");
    }

    public SegmentEnumFilter setLocalizedName(String arg) {
        optimisticData.put(getKey("localizedName"), arg);
        return this;
    }

    /**
    * Whether a file can have multiple values for a single customer.
    */

    public Boolean getMultiValue() {
        return (Boolean) get("multiValue");
    }

    public SegmentEnumFilter setMultiValue(Boolean arg) {
        optimisticData.put(getKey("multiValue"), arg);
        return this;
    }

    /**
    * The query name of the filter.
    */

    public String getQueryName() {
        return (String) get("queryName");
    }

    public SegmentEnumFilter setQueryName(String arg) {
        optimisticData.put(getKey("queryName"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "localizedName": return false;

            case "multiValue": return false;

            case "queryName": return false;

            default: return false;
        }
    }
}

