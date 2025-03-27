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
* Return type for `webPixelUpdate` mutation.
*/
public class WebPixelUpdatePayload extends AbstractResponse<WebPixelUpdatePayload> {
    public WebPixelUpdatePayload() {
    }

    public WebPixelUpdatePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "userErrors": {
                    List<ErrorsWebPixelUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new ErrorsWebPixelUserError(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "webPixel": {
                    WebPixel optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new WebPixel(jsonAsObject(field.getValue(), key));
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
        return "WebPixelUpdatePayload";
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<ErrorsWebPixelUserError> getUserErrors() {
        return (List<ErrorsWebPixelUserError>) get("userErrors");
    }

    public WebPixelUpdatePayload setUserErrors(List<ErrorsWebPixelUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    /**
    * The updated web pixel settings.
    */

    public WebPixel getWebPixel() {
        return (WebPixel) get("webPixel");
    }

    public WebPixelUpdatePayload setWebPixel(WebPixel arg) {
        optimisticData.put(getKey("webPixel"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "userErrors": return true;

            case "webPixel": return true;

            default: return false;
        }
    }
}

