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
* Represents a Shopify hosted 3D model.
*/
public class Model3d extends AbstractResponse<Model3d> implements File, Media, MetafieldReference, Node {
    public Model3d() {
    }

    public Model3d(JsonObject fields) throws SchemaViolationError {
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

                case "boundingBox": {
                    Model3dBoundingBox optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Model3dBoundingBox(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "createdAt": {
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

                case "filename": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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

                case "originalSource": {
                    Model3dSource optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Model3dSource(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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

                case "sources": {
                    List<Model3dSource> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new Model3dSource(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

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

    public Model3d(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "Model3d";
    }

    /**
    * A word or phrase to describe the contents or the function of a file.
    */

    public String getAlt() {
        return (String) get("alt");
    }

    public Model3d setAlt(String arg) {
        optimisticData.put(getKey("alt"), arg);
        return this;
    }

    /**
    * The 3d model's bounding box information.
    */

    public Model3dBoundingBox getBoundingBox() {
        return (Model3dBoundingBox) get("boundingBox");
    }

    public Model3d setBoundingBox(Model3dBoundingBox arg) {
        optimisticData.put(getKey("boundingBox"), arg);
        return this;
    }

    /**
    * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the file was
    * created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public Model3d setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * Any errors that have occurred on the file.
    */

    public List<FileError> getFileErrors() {
        return (List<FileError>) get("fileErrors");
    }

    public Model3d setFileErrors(List<FileError> arg) {
        optimisticData.put(getKey("fileErrors"), arg);
        return this;
    }

    /**
    * The status of the file.
    */

    public FileStatus getFileStatus() {
        return (FileStatus) get("fileStatus");
    }

    public Model3d setFileStatus(FileStatus arg) {
        optimisticData.put(getKey("fileStatus"), arg);
        return this;
    }

    /**
    * The 3d model's filename.
    */

    public String getFilename() {
        return (String) get("filename");
    }

    public Model3d setFilename(String arg) {
        optimisticData.put(getKey("filename"), arg);
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

    public Model3d setMediaContentType(MediaContentType arg) {
        optimisticData.put(getKey("mediaContentType"), arg);
        return this;
    }

    /**
    * Any errors which have occurred on the media.
    */

    public List<MediaError> getMediaErrors() {
        return (List<MediaError>) get("mediaErrors");
    }

    public Model3d setMediaErrors(List<MediaError> arg) {
        optimisticData.put(getKey("mediaErrors"), arg);
        return this;
    }

    /**
    * The warnings attached to the media.
    */

    public List<MediaWarning> getMediaWarnings() {
        return (List<MediaWarning>) get("mediaWarnings");
    }

    public Model3d setMediaWarnings(List<MediaWarning> arg) {
        optimisticData.put(getKey("mediaWarnings"), arg);
        return this;
    }

    /**
    * The 3d model's original source.
    */

    public Model3dSource getOriginalSource() {
        return (Model3dSource) get("originalSource");
    }

    public Model3d setOriginalSource(Model3dSource arg) {
        optimisticData.put(getKey("originalSource"), arg);
        return this;
    }

    /**
    * The preview image for the media.
    */

    public MediaPreviewImage getPreview() {
        return (MediaPreviewImage) get("preview");
    }

    public Model3d setPreview(MediaPreviewImage arg) {
        optimisticData.put(getKey("preview"), arg);
        return this;
    }

    /**
    * The 3d model's sources.
    */

    public List<Model3dSource> getSources() {
        return (List<Model3dSource>) get("sources");
    }

    public Model3d setSources(List<Model3dSource> arg) {
        optimisticData.put(getKey("sources"), arg);
        return this;
    }

    /**
    * Current status of the media.
    */

    public MediaStatus getStatus() {
        return (MediaStatus) get("status");
    }

    public Model3d setStatus(MediaStatus arg) {
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

    public Model3d setUpdatedAt(String arg) {
        optimisticData.put(getKey("updatedAt"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "alt": return false;

            case "boundingBox": return true;

            case "createdAt": return false;

            case "fileErrors": return true;

            case "fileStatus": return false;

            case "filename": return false;

            case "id": return false;

            case "mediaContentType": return false;

            case "mediaErrors": return true;

            case "mediaWarnings": return true;

            case "originalSource": return true;

            case "preview": return true;

            case "sources": return true;

            case "status": return false;

            case "updatedAt": return false;

            default: return false;
        }
    }
}

