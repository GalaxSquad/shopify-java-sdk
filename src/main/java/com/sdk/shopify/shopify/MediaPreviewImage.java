// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.util.Map;

/**
* Represents the preview image for a media.
*/
public class MediaPreviewImage extends AbstractResponse<MediaPreviewImage> {
    public MediaPreviewImage() {
    }

    public MediaPreviewImage(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "image": {
                    Image optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Image(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "status": {
                    responseData.put(key, MediaPreviewImageStatus.fromGraphQl(jsonAsString(field.getValue(), key)));

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
        return "MediaPreviewImage";
    }

    /**
    * The preview image for the media. Returns `null` until `status` is `READY`.
    */

    public Image getImage() {
        return (Image) get("image");
    }

    public MediaPreviewImage setImage(Image arg) {
        optimisticData.put(getKey("image"), arg);
        return this;
    }

    /**
    * Current status of the preview image.
    */

    public MediaPreviewImageStatus getStatus() {
        return (MediaPreviewImageStatus) get("status");
    }

    public MediaPreviewImage setStatus(MediaPreviewImageStatus arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "image": return true;

            case "status": return false;

            default: return false;
        }
    }
}

