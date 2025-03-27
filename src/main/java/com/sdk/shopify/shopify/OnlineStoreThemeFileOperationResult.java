// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents the result of a copy, delete, or write operation performed on a theme file.
*/
public class OnlineStoreThemeFileOperationResult extends AbstractResponse<OnlineStoreThemeFileOperationResult> {
    public OnlineStoreThemeFileOperationResult() {
    }

    public OnlineStoreThemeFileOperationResult(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "filename": {
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
        return "OnlineStoreThemeFileOperationResult";
    }

    /**
    * Unique identifier of the theme file.
    */

    public String getFilename() {
        return (String) get("filename");
    }

    public OnlineStoreThemeFileOperationResult setFilename(String arg) {
        optimisticData.put(getKey("filename"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "filename": return false;

            default: return false;
        }
    }
}

