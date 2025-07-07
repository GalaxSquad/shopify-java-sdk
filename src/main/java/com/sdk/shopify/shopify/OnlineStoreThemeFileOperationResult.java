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
                case "checksumMd5": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "createdAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "filename": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "size": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "updatedAt": {
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
    * The md5 digest of the theme file for data integrity.
    */

    public String getChecksumMd5() {
        return (String) get("checksumMd5");
    }

    public OnlineStoreThemeFileOperationResult setChecksumMd5(String arg) {
        optimisticData.put(getKey("checksumMd5"), arg);
        return this;
    }

    /**
    * The date and time when the theme file was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public OnlineStoreThemeFileOperationResult setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
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

    /**
    * The size of the theme file in bytes.
    */

    public String getSize() {
        return (String) get("size");
    }

    public OnlineStoreThemeFileOperationResult setSize(String arg) {
        optimisticData.put(getKey("size"), arg);
        return this;
    }

    /**
    * The date and time when the theme file was last updated.
    */

    public String getUpdatedAt() {
        return (String) get("updatedAt");
    }

    public OnlineStoreThemeFileOperationResult setUpdatedAt(String arg) {
        optimisticData.put(getKey("updatedAt"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "checksumMd5": return false;

            case "createdAt": return false;

            case "filename": return false;

            case "size": return false;

            case "updatedAt": return false;

            default: return false;
        }
    }
}

