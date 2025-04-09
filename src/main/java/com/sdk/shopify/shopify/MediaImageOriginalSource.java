// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The original source for an image.
*/
public class MediaImageOriginalSource extends AbstractResponse<MediaImageOriginalSource> {
    public MediaImageOriginalSource() {
    }

    public MediaImageOriginalSource(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "fileSize": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "url": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

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
        return "MediaImageOriginalSource";
    }

    /**
    * The size of the original file in bytes.
    */

    public Integer getFileSize() {
        return (Integer) get("fileSize");
    }

    public MediaImageOriginalSource setFileSize(Integer arg) {
        optimisticData.put(getKey("fileSize"), arg);
        return this;
    }

    /**
    * The URL of the original image, valid only for a short period.
    */

    public String getUrl() {
        return (String) get("url");
    }

    public MediaImageOriginalSource setUrl(String arg) {
        optimisticData.put(getKey("url"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "fileSize": return false;

            case "url": return false;

            default: return false;
        }
    }
}

