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
* Return type for `themePublish` mutation.
*/
public class ThemePublishPayload extends AbstractResponse<ThemePublishPayload> {
    public ThemePublishPayload() {
    }

    public ThemePublishPayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "theme": {
                    OnlineStoreTheme optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new OnlineStoreTheme(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<ThemePublishUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new ThemePublishUserError(jsonAsObject(element1, key)));
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
        return "ThemePublishPayload";
    }

    /**
    * The theme that was published.
    */

    public OnlineStoreTheme getTheme() {
        return (OnlineStoreTheme) get("theme");
    }

    public ThemePublishPayload setTheme(OnlineStoreTheme arg) {
        optimisticData.put(getKey("theme"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<ThemePublishUserError> getUserErrors() {
        return (List<ThemePublishUserError>) get("userErrors");
    }

    public ThemePublishPayload setUserErrors(List<ThemePublishUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "theme": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

