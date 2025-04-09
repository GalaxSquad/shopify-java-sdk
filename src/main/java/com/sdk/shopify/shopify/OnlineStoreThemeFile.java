// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents a theme file.
*/
public class OnlineStoreThemeFile extends AbstractResponse<OnlineStoreThemeFile> {
    public OnlineStoreThemeFile() {
    }

    public OnlineStoreThemeFile(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "body": {
                    responseData.put(key, UnknownOnlineStoreThemeFileBody.create(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "checksumMd5": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "contentType": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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
        return "OnlineStoreThemeFile";
    }

    /**
    * The body of the theme file.
    */

    public OnlineStoreThemeFileBody getBody() {
        return (OnlineStoreThemeFileBody) get("body");
    }

    public OnlineStoreThemeFile setBody(OnlineStoreThemeFileBody arg) {
        optimisticData.put(getKey("body"), arg);
        return this;
    }

    /**
    * The md5 digest of the theme file for data integrity.
    */

    public String getChecksumMd5() {
        return (String) get("checksumMd5");
    }

    public OnlineStoreThemeFile setChecksumMd5(String arg) {
        optimisticData.put(getKey("checksumMd5"), arg);
        return this;
    }

    /**
    * The content type of the theme file.
    */

    public String getContentType() {
        return (String) get("contentType");
    }

    public OnlineStoreThemeFile setContentType(String arg) {
        optimisticData.put(getKey("contentType"), arg);
        return this;
    }

    /**
    * The date and time when the theme file was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public OnlineStoreThemeFile setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * The unique identifier of the theme file.
    */

    public String getFilename() {
        return (String) get("filename");
    }

    public OnlineStoreThemeFile setFilename(String arg) {
        optimisticData.put(getKey("filename"), arg);
        return this;
    }

    /**
    * The size of the theme file in bytes.
    */

    public String getSize() {
        return (String) get("size");
    }

    public OnlineStoreThemeFile setSize(String arg) {
        optimisticData.put(getKey("size"), arg);
        return this;
    }

    /**
    * The date and time when the theme file was last updated.
    */

    public String getUpdatedAt() {
        return (String) get("updatedAt");
    }

    public OnlineStoreThemeFile setUpdatedAt(String arg) {
        optimisticData.put(getKey("updatedAt"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "body": return false;

            case "checksumMd5": return false;

            case "contentType": return false;

            case "createdAt": return false;

            case "filename": return false;

            case "size": return false;

            case "updatedAt": return false;

            default: return false;
        }
    }
}

