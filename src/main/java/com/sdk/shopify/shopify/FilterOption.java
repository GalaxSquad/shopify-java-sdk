// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A filter option is one possible value in a search filter.
*/
public class FilterOption extends AbstractResponse<FilterOption> {
    public FilterOption() {
    }

    public FilterOption(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "label": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "value": {
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
        return "FilterOption";
    }

    /**
    * The filter option's label for display purposes.
    */

    public String getLabel() {
        return (String) get("label");
    }

    public FilterOption setLabel(String arg) {
        optimisticData.put(getKey("label"), arg);
        return this;
    }

    /**
    * The filter option's value.
    */

    public String getValue() {
        return (String) get("value");
    }

    public FilterOption setValue(String arg) {
        optimisticData.put(getKey("value"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "label": return false;

            case "value": return false;

            default: return false;
        }
    }
}

