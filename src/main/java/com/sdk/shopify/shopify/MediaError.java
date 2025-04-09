// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents a media error. This typically occurs when there is an issue with the media itself causing
* it to fail validation.
* Check the media before attempting to upload again.
*/
public class MediaError extends AbstractResponse<MediaError> {
    public MediaError() {
    }

    public MediaError(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "code": {
                    responseData.put(key, MediaErrorCode.fromGraphQl(jsonAsString(field.getValue(), key)));

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
        return "MediaError";
    }

    /**
    * Code representing the type of error.
    */

    public MediaErrorCode getCode() {
        return (MediaErrorCode) get("code");
    }

    public MediaError setCode(MediaErrorCode arg) {
        optimisticData.put(getKey("code"), arg);
        return this;
    }

    /**
    * Additional details regarding the error.
    */

    public String getDetails() {
        return (String) get("details");
    }

    public MediaError setDetails(String arg) {
        optimisticData.put(getKey("details"), arg);
        return this;
    }

    /**
    * Translated error message.
    */

    public String getMessage() {
        return (String) get("message");
    }

    public MediaError setMessage(String arg) {
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

