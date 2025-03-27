// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* A theme for display on the storefront.
*/
public class OnlineStoreTheme extends AbstractResponse<OnlineStoreTheme> implements HasPublishedTranslations, Node {
    public OnlineStoreTheme() {
    }

    public OnlineStoreTheme(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "createdAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "files": {
                    OnlineStoreThemeFileConnection optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new OnlineStoreThemeFileConnection(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "prefix": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "processing": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "processingFailed": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "role": {
                    responseData.put(key, ThemeRole.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "themeStoreId": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "translations": {
                    List<Translation> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new Translation(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "updatedAt": {
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

    public OnlineStoreTheme(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "OnlineStoreTheme";
    }

    /**
    * The date and time when the theme was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public OnlineStoreTheme setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * The files in the theme.
    */

    public OnlineStoreThemeFileConnection getFiles() {
        return (OnlineStoreThemeFileConnection) get("files");
    }

    public OnlineStoreTheme setFiles(OnlineStoreThemeFileConnection arg) {
        optimisticData.put(getKey("files"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The name of the theme, set by the merchant.
    */

    public String getName() {
        return (String) get("name");
    }

    public OnlineStoreTheme setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * The prefix of the theme.
    */

    public String getPrefix() {
        return (String) get("prefix");
    }

    public OnlineStoreTheme setPrefix(String arg) {
        optimisticData.put(getKey("prefix"), arg);
        return this;
    }

    /**
    * Whether the theme is processing.
    */

    public Boolean getProcessing() {
        return (Boolean) get("processing");
    }

    public OnlineStoreTheme setProcessing(Boolean arg) {
        optimisticData.put(getKey("processing"), arg);
        return this;
    }

    /**
    * Whether the theme processing failed.
    */

    public Boolean getProcessingFailed() {
        return (Boolean) get("processingFailed");
    }

    public OnlineStoreTheme setProcessingFailed(Boolean arg) {
        optimisticData.put(getKey("processingFailed"), arg);
        return this;
    }

    /**
    * The role of the theme.
    */

    public ThemeRole getRole() {
        return (ThemeRole) get("role");
    }

    public OnlineStoreTheme setRole(ThemeRole arg) {
        optimisticData.put(getKey("role"), arg);
        return this;
    }

    /**
    * The theme store ID.
    */

    public Integer getThemeStoreId() {
        return (Integer) get("themeStoreId");
    }

    public OnlineStoreTheme setThemeStoreId(Integer arg) {
        optimisticData.put(getKey("themeStoreId"), arg);
        return this;
    }

    /**
    * The published translations associated with the resource.
    */

    public List<Translation> getTranslations() {
        return (List<Translation>) get("translations");
    }

    public OnlineStoreTheme setTranslations(List<Translation> arg) {
        optimisticData.put(getKey("translations"), arg);
        return this;
    }

    /**
    * The date and time when the theme was last updated.
    */

    public String getUpdatedAt() {
        return (String) get("updatedAt");
    }

    public OnlineStoreTheme setUpdatedAt(String arg) {
        optimisticData.put(getKey("updatedAt"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "createdAt": return false;

            case "files": return true;

            case "id": return false;

            case "name": return false;

            case "prefix": return false;

            case "processing": return false;

            case "processingFailed": return false;

            case "role": return false;

            case "themeStoreId": return false;

            case "translations": return true;

            case "updatedAt": return false;

            default: return false;
        }
    }
}

