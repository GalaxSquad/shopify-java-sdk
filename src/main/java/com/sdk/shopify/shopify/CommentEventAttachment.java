// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A file attachment associated to a comment event.
*/
public class CommentEventAttachment extends AbstractResponse<CommentEventAttachment> {
    public CommentEventAttachment() {
    }

    public CommentEventAttachment(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "fileExtension": {
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

                case "image": {
                    Image optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Image(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "size": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "url": {
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
        return "CommentEventAttachment";
    }

    /**
    * The file extension of the comment event attachment, indicating the file format.
    */

    public String getFileExtension() {
        return (String) get("fileExtension");
    }

    public CommentEventAttachment setFileExtension(String arg) {
        optimisticData.put(getKey("fileExtension"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    public CommentEventAttachment setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
    * The image attached to the comment event.
    */

    public Image getImage() {
        return (Image) get("image");
    }

    public CommentEventAttachment setImage(Image arg) {
        optimisticData.put(getKey("image"), arg);
        return this;
    }

    /**
    * The filename of the comment event attachment.
    */

    public String getName() {
        return (String) get("name");
    }

    public CommentEventAttachment setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * The size of the attachment.
    */

    public Integer getSize() {
        return (Integer) get("size");
    }

    public CommentEventAttachment setSize(Integer arg) {
        optimisticData.put(getKey("size"), arg);
        return this;
    }

    /**
    * The URL of the attachment.
    */

    public String getUrl() {
        return (String) get("url");
    }

    public CommentEventAttachment setUrl(String arg) {
        optimisticData.put(getKey("url"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "fileExtension": return false;

            case "id": return false;

            case "image": return true;

            case "name": return false;

            case "size": return false;

            case "url": return false;

            default: return false;
        }
    }
}

