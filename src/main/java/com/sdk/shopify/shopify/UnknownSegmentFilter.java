// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The filters used in segment queries associated with a shop.
*/
public class UnknownSegmentFilter extends AbstractResponse<UnknownSegmentFilter> implements SegmentFilter {
    public UnknownSegmentFilter() {
    }

    public UnknownSegmentFilter(JsonObject fields) throws SchemaViolationError {
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

    public static SegmentFilter create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "SegmentAssociationFilter": {
                return new SegmentAssociationFilter(fields);
            }

            case "SegmentBooleanFilter": {
                return new SegmentBooleanFilter(fields);
            }

            case "SegmentDateFilter": {
                return new SegmentDateFilter(fields);
            }

            case "SegmentEnumFilter": {
                return new SegmentEnumFilter(fields);
            }

            case "SegmentEventFilter": {
                return new SegmentEventFilter(fields);
            }

            case "SegmentFloatFilter": {
                return new SegmentFloatFilter(fields);
            }

            case "SegmentIntegerFilter": {
                return new SegmentIntegerFilter(fields);
            }

            case "SegmentStringFilter": {
                return new SegmentStringFilter(fields);
            }

            default: {
                return new UnknownSegmentFilter(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    /**
    * The localized name of the filter.
    */

    public String getLocalizedName() {
        return (String) get("localizedName");
    }

    public UnknownSegmentFilter setLocalizedName(String arg) {
        optimisticData.put(getKey("localizedName"), arg);
        return this;
    }

    /**
    * Whether a file can have multiple values for a single customer.
    */

    public Boolean getMultiValue() {
        return (Boolean) get("multiValue");
    }

    public UnknownSegmentFilter setMultiValue(Boolean arg) {
        optimisticData.put(getKey("multiValue"), arg);
        return this;
    }

    /**
    * The query name of the filter.
    */

    public String getQueryName() {
        return (String) get("queryName");
    }

    public UnknownSegmentFilter setQueryName(String arg) {
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

