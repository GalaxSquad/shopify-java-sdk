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
* Represents a video hosted outside of Shopify.
*/
public class ExternalVideo extends AbstractResponse<ExternalVideo> implements File, Media, Node {
    public ExternalVideo() {
    }

    public ExternalVideo(JsonObject fields) throws SchemaViolationError {
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

                case "createdAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "embedUrl": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "fileErrors": {
                    List<FileError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new FileError(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "fileStatus": {
                    responseData.put(key, FileStatus.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "host": {
                    responseData.put(key, MediaHost.fromGraphQl(jsonAsString(field.getValue(), key)));

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

                case "originUrl": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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

    public ExternalVideo(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "ExternalVideo";
    }

    /**
    * A word or phrase to describe the contents or the function of a file.
    */

    public String getAlt() {
        return (String) get("alt");
    }

    public ExternalVideo setAlt(String arg) {
        optimisticData.put(getKey("alt"), arg);
        return this;
    }

    /**
    * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the file was
    * created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public ExternalVideo setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * The embed URL of the video for the respective host.
    */

    public String getEmbedUrl() {
        return (String) get("embedUrl");
    }

    public ExternalVideo setEmbedUrl(String arg) {
        optimisticData.put(getKey("embedUrl"), arg);
        return this;
    }

    /**
    * Any errors that have occurred on the file.
    */

    public List<FileError> getFileErrors() {
        return (List<FileError>) get("fileErrors");
    }

    public ExternalVideo setFileErrors(List<FileError> arg) {
        optimisticData.put(getKey("fileErrors"), arg);
        return this;
    }

    /**
    * The status of the file.
    */

    public FileStatus getFileStatus() {
        return (FileStatus) get("fileStatus");
    }

    public ExternalVideo setFileStatus(FileStatus arg) {
        optimisticData.put(getKey("fileStatus"), arg);
        return this;
    }

    /**
    * The host of the external video.
    */

    public MediaHost getHost() {
        return (MediaHost) get("host");
    }

    public ExternalVideo setHost(MediaHost arg) {
        optimisticData.put(getKey("host"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The media content type.
    */

    public MediaContentType getMediaContentType() {
        return (MediaContentType) get("mediaContentType");
    }

    public ExternalVideo setMediaContentType(MediaContentType arg) {
        optimisticData.put(getKey("mediaContentType"), arg);
        return this;
    }

    /**
    * Any errors which have occurred on the media.
    */

    public List<MediaError> getMediaErrors() {
        return (List<MediaError>) get("mediaErrors");
    }

    public ExternalVideo setMediaErrors(List<MediaError> arg) {
        optimisticData.put(getKey("mediaErrors"), arg);
        return this;
    }

    /**
    * The warnings attached to the media.
    */

    public List<MediaWarning> getMediaWarnings() {
        return (List<MediaWarning>) get("mediaWarnings");
    }

    public ExternalVideo setMediaWarnings(List<MediaWarning> arg) {
        optimisticData.put(getKey("mediaWarnings"), arg);
        return this;
    }

    /**
    * The origin URL of the video on the respective host.
    */

    public String getOriginUrl() {
        return (String) get("originUrl");
    }

    public ExternalVideo setOriginUrl(String arg) {
        optimisticData.put(getKey("originUrl"), arg);
        return this;
    }

    /**
    * The preview image for the media.
    */

    public MediaPreviewImage getPreview() {
        return (MediaPreviewImage) get("preview");
    }

    public ExternalVideo setPreview(MediaPreviewImage arg) {
        optimisticData.put(getKey("preview"), arg);
        return this;
    }

    /**
    * Current status of the media.
    */

    public MediaStatus getStatus() {
        return (MediaStatus) get("status");
    }

    public ExternalVideo setStatus(MediaStatus arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    /**
    * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the file was last
    * updated.
    */

    public String getUpdatedAt() {
        return (String) get("updatedAt");
    }

    public ExternalVideo setUpdatedAt(String arg) {
        optimisticData.put(getKey("updatedAt"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "alt": return false;

            case "createdAt": return false;

            case "embedUrl": return false;

            case "fileErrors": return true;

            case "fileStatus": return false;

            case "host": return false;

            case "id": return false;

            case "mediaContentType": return false;

            case "mediaErrors": return true;

            case "mediaWarnings": return true;

            case "originUrl": return false;

            case "preview": return true;

            case "status": return false;

            case "updatedAt": return false;

            default: return false;
        }
    }
}

