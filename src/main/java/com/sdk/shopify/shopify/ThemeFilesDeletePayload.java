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
* Return type for `themeFilesDelete` mutation.
*/
public class ThemeFilesDeletePayload extends AbstractResponse<ThemeFilesDeletePayload> {
    public ThemeFilesDeletePayload() {
    }

    public ThemeFilesDeletePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "deletedThemeFiles": {
                    List<OnlineStoreThemeFileOperationResult> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<OnlineStoreThemeFileOperationResult> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            list1.add(new OnlineStoreThemeFileOperationResult(jsonAsObject(element1, key)));
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<OnlineStoreThemeFilesUserErrors> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new OnlineStoreThemeFilesUserErrors(jsonAsObject(element1, key)));
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
        return "ThemeFilesDeletePayload";
    }

    /**
    * The resulting theme files.
    */

    public List<OnlineStoreThemeFileOperationResult> getDeletedThemeFiles() {
        return (List<OnlineStoreThemeFileOperationResult>) get("deletedThemeFiles");
    }

    public ThemeFilesDeletePayload setDeletedThemeFiles(List<OnlineStoreThemeFileOperationResult> arg) {
        optimisticData.put(getKey("deletedThemeFiles"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<OnlineStoreThemeFilesUserErrors> getUserErrors() {
        return (List<OnlineStoreThemeFilesUserErrors>) get("userErrors");
    }

    public ThemeFilesDeletePayload setUserErrors(List<OnlineStoreThemeFilesUserErrors> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "deletedThemeFiles": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

