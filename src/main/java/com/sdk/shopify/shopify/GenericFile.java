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
* Represents any file other than HTML.
*/
public class GenericFile extends AbstractResponse<GenericFile> implements File, MetafieldReference, Node {
    public GenericFile() {
    }

    public GenericFile(JsonObject fields) throws SchemaViolationError {
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

                case "mimeType": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "originalFileSize": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
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

                case "updatedAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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

    public GenericFile(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "GenericFile";
    }

    /**
    * A word or phrase to describe the contents or the function of a file.
    */

    public String getAlt() {
        return (String) get("alt");
    }

    public GenericFile setAlt(String arg) {
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

    public GenericFile setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * Any errors that have occurred on the file.
    */

    public List<FileError> getFileErrors() {
        return (List<FileError>) get("fileErrors");
    }

    public GenericFile setFileErrors(List<FileError> arg) {
        optimisticData.put(getKey("fileErrors"), arg);
        return this;
    }

    /**
    * The status of the file.
    */

    public FileStatus getFileStatus() {
        return (FileStatus) get("fileStatus");
    }

    public GenericFile setFileStatus(FileStatus arg) {
        optimisticData.put(getKey("fileStatus"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The generic file's MIME type.
    */

    public String getMimeType() {
        return (String) get("mimeType");
    }

    public GenericFile setMimeType(String arg) {
        optimisticData.put(getKey("mimeType"), arg);
        return this;
    }

    /**
    * The generic file's size in bytes.
    */

    public Integer getOriginalFileSize() {
        return (Integer) get("originalFileSize");
    }

    public GenericFile setOriginalFileSize(Integer arg) {
        optimisticData.put(getKey("originalFileSize"), arg);
        return this;
    }

    /**
    * The preview image for the media.
    */

    public MediaPreviewImage getPreview() {
        return (MediaPreviewImage) get("preview");
    }

    public GenericFile setPreview(MediaPreviewImage arg) {
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

    public GenericFile setUpdatedAt(String arg) {
        optimisticData.put(getKey("updatedAt"), arg);
        return this;
    }

    /**
    * The generic file's URL.
    */

    public String getUrl() {
        return (String) get("url");
    }

    public GenericFile setUrl(String arg) {
        optimisticData.put(getKey("url"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "alt": return false;

            case "createdAt": return false;

            case "fileErrors": return true;

            case "fileStatus": return false;

            case "id": return false;

            case "mimeType": return false;

            case "originalFileSize": return false;

            case "preview": return true;

            case "updatedAt": return false;

            case "url": return false;

            default: return false;
        }
    }
}

