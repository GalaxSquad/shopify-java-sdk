// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* A filter that's used to segment customers based on the date that an event occured. For example, the
* `product_bought` event filter allows you to segment customers based on what products they've bought.
*/
public class SegmentEventFilter extends AbstractResponse<SegmentEventFilter> implements SegmentFilter {
    public SegmentEventFilter() {
    }

    public SegmentEventFilter(JsonObject fields) throws SchemaViolationError {
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

                case "parameters": {
                    List<SegmentEventFilterParameter> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new SegmentEventFilterParameter(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "queryName": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "returnValueType": {
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
        return "SegmentEventFilter";
    }

    /**
    * The localized name of the filter.
    */

    public String getLocalizedName() {
        return (String) get("localizedName");
    }

    public SegmentEventFilter setLocalizedName(String arg) {
        optimisticData.put(getKey("localizedName"), arg);
        return this;
    }

    /**
    * Whether a file can have multiple values for a single customer.
    */

    public Boolean getMultiValue() {
        return (Boolean) get("multiValue");
    }

    public SegmentEventFilter setMultiValue(Boolean arg) {
        optimisticData.put(getKey("multiValue"), arg);
        return this;
    }

    /**
    * The parameters for an event segment filter.
    */

    public List<SegmentEventFilterParameter> getParameters() {
        return (List<SegmentEventFilterParameter>) get("parameters");
    }

    public SegmentEventFilter setParameters(List<SegmentEventFilterParameter> arg) {
        optimisticData.put(getKey("parameters"), arg);
        return this;
    }

    /**
    * The query name of the filter.
    */

    public String getQueryName() {
        return (String) get("queryName");
    }

    public SegmentEventFilter setQueryName(String arg) {
        optimisticData.put(getKey("queryName"), arg);
        return this;
    }

    /**
    * The return value type for an event segment filter.
    */

    public String getReturnValueType() {
        return (String) get("returnValueType");
    }

    public SegmentEventFilter setReturnValueType(String arg) {
        optimisticData.put(getKey("returnValueType"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "localizedName": return false;

            case "multiValue": return false;

            case "parameters": return true;

            case "queryName": return false;

            case "returnValueType": return false;

            default: return false;
        }
    }
}

