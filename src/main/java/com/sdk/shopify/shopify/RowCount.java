// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A row count represents rows on background operation.
*/
public class RowCount extends AbstractResponse<RowCount> {
    public RowCount() {
    }

    public RowCount(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "count": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "exceedsMax": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

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
        return "RowCount";
    }

    /**
    * Estimated number of rows contained within this background operation.
    */

    public Integer getCount() {
        return (Integer) get("count");
    }

    public RowCount setCount(Integer arg) {
        optimisticData.put(getKey("count"), arg);
        return this;
    }

    /**
    * Whether the operation exceeds max number of reportable rows.
    */

    public Boolean getExceedsMax() {
        return (Boolean) get("exceedsMax");
    }

    public RowCount setExceedsMax(Boolean arg) {
        optimisticData.put(getKey("exceedsMax"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "count": return false;

            case "exceedsMax": return false;

            default: return false;
        }
    }
}

