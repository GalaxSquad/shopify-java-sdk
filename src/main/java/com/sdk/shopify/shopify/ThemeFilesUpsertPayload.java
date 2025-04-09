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
* Return type for `themeFilesUpsert` mutation.
*/
public class ThemeFilesUpsertPayload extends AbstractResponse<ThemeFilesUpsertPayload> {
    public ThemeFilesUpsertPayload() {
    }

    public ThemeFilesUpsertPayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "job": {
                    Job optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Job(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "upsertedThemeFiles": {
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
        return "ThemeFilesUpsertPayload";
    }

    /**
    * The theme files write job triggered by the mutation.
    */

    public Job getJob() {
        return (Job) get("job");
    }

    public ThemeFilesUpsertPayload setJob(Job arg) {
        optimisticData.put(getKey("job"), arg);
        return this;
    }

    /**
    * The resulting theme files.
    */

    public List<OnlineStoreThemeFileOperationResult> getUpsertedThemeFiles() {
        return (List<OnlineStoreThemeFileOperationResult>) get("upsertedThemeFiles");
    }

    public ThemeFilesUpsertPayload setUpsertedThemeFiles(List<OnlineStoreThemeFileOperationResult> arg) {
        optimisticData.put(getKey("upsertedThemeFiles"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<OnlineStoreThemeFilesUserErrors> getUserErrors() {
        return (List<OnlineStoreThemeFilesUserErrors>) get("userErrors");
    }

    public ThemeFilesUpsertPayload setUserErrors(List<OnlineStoreThemeFilesUserErrors> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "job": return true;

            case "upsertedThemeFiles": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

