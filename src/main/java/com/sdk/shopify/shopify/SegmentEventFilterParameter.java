// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The parameters for an event segment filter.
*/
public class SegmentEventFilterParameter extends AbstractResponse<SegmentEventFilterParameter> {
    public SegmentEventFilterParameter() {
    }

    public SegmentEventFilterParameter(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "acceptsMultipleValues": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "localizedDescription": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "localizedName": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "optional": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "parameterType": {
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
        return "SegmentEventFilterParameter";
    }

    /**
    * Whether the parameter accepts a list of values.
    */

    public Boolean getAcceptsMultipleValues() {
        return (Boolean) get("acceptsMultipleValues");
    }

    public SegmentEventFilterParameter setAcceptsMultipleValues(Boolean arg) {
        optimisticData.put(getKey("acceptsMultipleValues"), arg);
        return this;
    }

    /**
    * The localized description of the parameter.
    */

    public String getLocalizedDescription() {
        return (String) get("localizedDescription");
    }

    public SegmentEventFilterParameter setLocalizedDescription(String arg) {
        optimisticData.put(getKey("localizedDescription"), arg);
        return this;
    }

    /**
    * The localized name of the parameter.
    */

    public String getLocalizedName() {
        return (String) get("localizedName");
    }

    public SegmentEventFilterParameter setLocalizedName(String arg) {
        optimisticData.put(getKey("localizedName"), arg);
        return this;
    }

    /**
    * Whether the parameter is optional.
    */

    public Boolean getOptional() {
        return (Boolean) get("optional");
    }

    public SegmentEventFilterParameter setOptional(Boolean arg) {
        optimisticData.put(getKey("optional"), arg);
        return this;
    }

    /**
    * The type of the parameter.
    */

    public String getParameterType() {
        return (String) get("parameterType");
    }

    public SegmentEventFilterParameter setParameterType(String arg) {
        optimisticData.put(getKey("parameterType"), arg);
        return this;
    }

    /**
    * The query name of the parameter.
    */

    public String getQueryName() {
        return (String) get("queryName");
    }

    public SegmentEventFilterParameter setQueryName(String arg) {
        optimisticData.put(getKey("queryName"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "acceptsMultipleValues": return false;

            case "localizedDescription": return false;

            case "localizedName": return false;

            case "optional": return false;

            case "parameterType": return false;

            case "queryName": return false;

            default: return false;
        }
    }
}

