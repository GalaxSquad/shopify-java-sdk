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
* An error that occurs during the execution of `ThemePublish`.
*/
public class ThemePublishUserError extends AbstractResponse<ThemePublishUserError> implements DisplayableError {
    public ThemePublishUserError() {
    }

    public ThemePublishUserError(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "code": {
                    ThemePublishUserErrorCode optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = ThemePublishUserErrorCode.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "field": {
                    List<String> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<String> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            list1.add(jsonAsString(element1, key));
                        }

                        optional1 = list1;
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
        return "ThemePublishUserError";
    }

    /**
    * The error code.
    */

    public ThemePublishUserErrorCode getCode() {
        return (ThemePublishUserErrorCode) get("code");
    }

    public ThemePublishUserError setCode(ThemePublishUserErrorCode arg) {
        optimisticData.put(getKey("code"), arg);
        return this;
    }

    /**
    * The path to the input field that caused the error.
    */

    public List<String> getField() {
        return (List<String>) get("field");
    }

    public ThemePublishUserError setField(List<String> arg) {
        optimisticData.put(getKey("field"), arg);
        return this;
    }

    /**
    * The error message.
    */

    public String getMessage() {
        return (String) get("message");
    }

    public ThemePublishUserError setMessage(String arg) {
        optimisticData.put(getKey("message"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "code": return false;

            case "field": return false;

            case "message": return false;

            default: return false;
        }
    }
}

