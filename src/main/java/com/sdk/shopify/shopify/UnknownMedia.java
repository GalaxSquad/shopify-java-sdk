// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Represents a media interface.
*/
public class UnknownMedia extends AbstractResponse<UnknownMedia> implements Media {
    public UnknownMedia() {
    }

    public UnknownMedia(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "alt": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "mediaContentType": {
                    responseData.put(key, MediaContentType.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "mediaErrors": {
                    List<MediaError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new MediaError(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "mediaWarnings": {
                    List<MediaWarning> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new MediaWarning(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "preview": {
                    MediaPreviewImage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MediaPreviewImage(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "status": {
                    responseData.put(key, MediaStatus.fromGraphQl(jsonAsString(field.getValue(), key)));

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

    public static Media create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "ExternalVideo": {
                return new ExternalVideo(fields);
            }

            case "MediaImage": {
                return new MediaImage(fields);
            }

            case "Model3d": {
                return new Model3d(fields);
            }

            case "Video": {
                return new Video(fields);
            }

            default: {
                return new UnknownMedia(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    /**
    * A word or phrase to share the nature or contents of a media.
    */

    public String getAlt() {
        return (String) get("alt");
    }

    public UnknownMedia setAlt(String arg) {
        optimisticData.put(getKey("alt"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    public UnknownMedia setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
    * The media content type.
    */

    public MediaContentType getMediaContentType() {
        return (MediaContentType) get("mediaContentType");
    }

    public UnknownMedia setMediaContentType(MediaContentType arg) {
        optimisticData.put(getKey("mediaContentType"), arg);
        return this;
    }

    /**
    * Any errors which have occurred on the media.
    */

    public List<MediaError> getMediaErrors() {
        return (List<MediaError>) get("mediaErrors");
    }

    public UnknownMedia setMediaErrors(List<MediaError> arg) {
        optimisticData.put(getKey("mediaErrors"), arg);
        return this;
    }

    /**
    * The warnings attached to the media.
    */

    public List<MediaWarning> getMediaWarnings() {
        return (List<MediaWarning>) get("mediaWarnings");
    }

    public UnknownMedia setMediaWarnings(List<MediaWarning> arg) {
        optimisticData.put(getKey("mediaWarnings"), arg);
        return this;
    }

    /**
    * The preview image for the media.
    */

    public MediaPreviewImage getPreview() {
        return (MediaPreviewImage) get("preview");
    }

    public UnknownMedia setPreview(MediaPreviewImage arg) {
        optimisticData.put(getKey("preview"), arg);
        return this;
    }

    /**
    * Current status of the media.
    */

    public MediaStatus getStatus() {
        return (MediaStatus) get("status");
    }

    public UnknownMedia setStatus(MediaStatus arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "alt": return false;

            case "id": return false;

            case "mediaContentType": return false;

            case "mediaErrors": return true;

            case "mediaWarnings": return true;

            case "preview": return true;

            case "status": return false;

            default: return false;
        }
    }
}

