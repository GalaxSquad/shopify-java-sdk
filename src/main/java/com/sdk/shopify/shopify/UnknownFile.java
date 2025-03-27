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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* A file interface.
*/
public class UnknownFile extends AbstractResponse<UnknownFile> implements File {
    public UnknownFile() {
    }

    public UnknownFile(JsonObject fields) throws SchemaViolationError {
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

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

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

    public static File create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "ExternalVideo": {
                return new ExternalVideo(fields);
            }

            case "GenericFile": {
                return new GenericFile(fields);
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
                return new UnknownFile(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    /**
    * A word or phrase to describe the contents or the function of a file.
    */

    public String getAlt() {
        return (String) get("alt");
    }

    public UnknownFile setAlt(String arg) {
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

    public UnknownFile setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * Any errors that have occurred on the file.
    */

    public List<FileError> getFileErrors() {
        return (List<FileError>) get("fileErrors");
    }

    public UnknownFile setFileErrors(List<FileError> arg) {
        optimisticData.put(getKey("fileErrors"), arg);
        return this;
    }

    /**
    * The status of the file.
    */

    public FileStatus getFileStatus() {
        return (FileStatus) get("fileStatus");
    }

    public UnknownFile setFileStatus(FileStatus arg) {
        optimisticData.put(getKey("fileStatus"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    public UnknownFile setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
    * The preview image for the media.
    */

    public MediaPreviewImage getPreview() {
        return (MediaPreviewImage) get("preview");
    }

    public UnknownFile setPreview(MediaPreviewImage arg) {
        optimisticData.put(getKey("preview"), arg);
        return this;
    }

    /**
    * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the file was last
    * updated.
    */

    public String getUpdatedAt() {
        return (String) get("updatedAt");
    }

    public UnknownFile setUpdatedAt(String arg) {
        optimisticData.put(getKey("updatedAt"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "alt": return false;

            case "createdAt": return false;

            case "fileErrors": return true;

            case "fileStatus": return false;

            case "id": return false;

            case "preview": return true;

            case "updatedAt": return false;

            default: return false;
        }
    }
}

