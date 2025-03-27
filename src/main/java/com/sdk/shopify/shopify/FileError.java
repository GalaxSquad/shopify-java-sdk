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
* A file error. This typically occurs when there is an issue with the file itself causing it to fail
* validation.
* Check the file before attempting to upload again.
*/
public class FileError extends AbstractResponse<FileError> {
    public FileError() {
    }

    public FileError(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "code": {
                    responseData.put(key, FileErrorCode.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "details": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "message": {
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
        return "FileError";
    }

    /**
    * Code representing the type of error.
    */

    public FileErrorCode getCode() {
        return (FileErrorCode) get("code");
    }

    public FileError setCode(FileErrorCode arg) {
        optimisticData.put(getKey("code"), arg);
        return this;
    }

    /**
    * Additional details regarding the error.
    */

    public String getDetails() {
        return (String) get("details");
    }

    public FileError setDetails(String arg) {
        optimisticData.put(getKey("details"), arg);
        return this;
    }

    /**
    * Translated error message.
    */

    public String getMessage() {
        return (String) get("message");
    }

    public FileError setMessage(String arg) {
        optimisticData.put(getKey("message"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "code": return false;

            case "details": return false;

            case "message": return false;

            default: return false;
        }
    }
}

