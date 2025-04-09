// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents the result of a read operation performed on a theme asset.
*/
public class OnlineStoreThemeFileReadResult extends AbstractResponse<OnlineStoreThemeFileReadResult> {
    public OnlineStoreThemeFileReadResult() {
    }

    public OnlineStoreThemeFileReadResult(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "code": {
                    responseData.put(key, OnlineStoreThemeFileResultType.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

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
        return "OnlineStoreThemeFileReadResult";
    }

    /**
    * Type that indicates the result of the operation.
    */

    public OnlineStoreThemeFileResultType getCode() {
        return (OnlineStoreThemeFileResultType) get("code");
    }

    public OnlineStoreThemeFileReadResult setCode(OnlineStoreThemeFileResultType arg) {
        optimisticData.put(getKey("code"), arg);
        return this;
    }

    /**
    * Unique identifier associated with the operation and the theme file.
    */

    public String getFilename() {
        return (String) get("filename");
    }

    public OnlineStoreThemeFileReadResult setFilename(String arg) {
        optimisticData.put(getKey("filename"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "code": return false;

            case "filename": return false;

            default: return false;
        }
    }
}

