// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Return type for `fileAcknowledgeUpdateFailed` mutation.
*/
public class FileAcknowledgeUpdateFailedPayload extends AbstractResponse<FileAcknowledgeUpdateFailedPayload> {
    public FileAcknowledgeUpdateFailedPayload() {
    }

    public FileAcknowledgeUpdateFailedPayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "files": {
                    List<File> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<File> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            list1.add(UnknownFile.create(jsonAsObject(element1, key)));
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<FilesUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new FilesUserError(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

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
        return "FileAcknowledgeUpdateFailedPayload";
    }

    /**
    * The updated file(s).
    */

    public List<File> getFiles() {
        return (List<File>) get("files");
    }

    public FileAcknowledgeUpdateFailedPayload setFiles(List<File> arg) {
        optimisticData.put(getKey("files"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<FilesUserError> getUserErrors() {
        return (List<FilesUserError>) get("userErrors");
    }

    public FileAcknowledgeUpdateFailedPayload setUserErrors(List<FilesUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "files": return false;

            case "userErrors": return true;

            default: return false;
        }
    }
}

