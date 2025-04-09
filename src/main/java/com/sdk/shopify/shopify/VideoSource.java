// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents a source for a Shopify hosted video.
* Types of sources include the original video, lower resolution versions of the original video,
* and an m3u8 playlist file.
* Only [videos](https://shopify.dev/api/admin-graphql/latest/objects/video) with a status field
* of [READY](https://shopify.dev/api/admin-graphql/latest/enums/MediaStatus#value-ready) have sources.
*/
public class VideoSource extends AbstractResponse<VideoSource> {
    public VideoSource() {
    }

    public VideoSource(JsonObject fields) throws SchemaViolationError {
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

                case "format": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "height": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "mimeType": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "url": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "width": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

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
        return "VideoSource";
    }

    /**
    * The video source's file size in bytes.
    */

    public Integer getFileSize() {
        return (Integer) get("fileSize");
    }

    public VideoSource setFileSize(Integer arg) {
        optimisticData.put(getKey("fileSize"), arg);
        return this;
    }

    /**
    * The video source's file format extension.
    */

    public String getFormat() {
        return (String) get("format");
    }

    public VideoSource setFormat(String arg) {
        optimisticData.put(getKey("format"), arg);
        return this;
    }

    /**
    * The video source's height.
    */

    public Integer getHeight() {
        return (Integer) get("height");
    }

    public VideoSource setHeight(Integer arg) {
        optimisticData.put(getKey("height"), arg);
        return this;
    }

    /**
    * The video source's MIME type.
    */

    public String getMimeType() {
        return (String) get("mimeType");
    }

    public VideoSource setMimeType(String arg) {
        optimisticData.put(getKey("mimeType"), arg);
        return this;
    }

    /**
    * The video source's URL.
    */

    public String getUrl() {
        return (String) get("url");
    }

    public VideoSource setUrl(String arg) {
        optimisticData.put(getKey("url"), arg);
        return this;
    }

    /**
    * The video source's width.
    */

    public Integer getWidth() {
        return (Integer) get("width");
    }

    public VideoSource setWidth(Integer arg) {
        optimisticData.put(getKey("width"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "fileSize": return false;

            case "format": return false;

            case "height": return false;

            case "mimeType": return false;

            case "url": return false;

            case "width": return false;

            default: return false;
        }
    }
}

