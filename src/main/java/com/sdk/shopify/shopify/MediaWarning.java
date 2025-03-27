// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents a media warning. This occurs when there is a non-blocking concern regarding your media.
* Consider reviewing your media to ensure it is correct and its parameters are as expected.
*/
public class MediaWarning extends AbstractResponse<MediaWarning> {
    public MediaWarning() {
    }

    public MediaWarning(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "code": {
                    responseData.put(key, MediaWarningCode.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "message": {
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

    public String getGraphQlTypeName() {
        return "MediaWarning";
    }

    /**
    * The code representing the type of warning.
    */

    public MediaWarningCode getCode() {
        return (MediaWarningCode) get("code");
    }

    public MediaWarning setCode(MediaWarningCode arg) {
        optimisticData.put(getKey("code"), arg);
        return this;
    }

    /**
    * Translated warning message.
    */

    public String getMessage() {
        return (String) get("message");
    }

    public MediaWarning setMessage(String arg) {
        optimisticData.put(getKey("message"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "code": return false;

            case "message": return false;

            default: return false;
        }
    }
}

