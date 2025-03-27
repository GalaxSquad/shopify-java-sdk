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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* A resource that has translatable fields.
*/
public class TranslatableResource extends AbstractResponse<TranslatableResource> {
    public TranslatableResource() {
    }

    public TranslatableResource(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "nestedTranslatableResources": {
                    responseData.put(key, new TranslatableResourceConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "resourceId": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "translatableContent": {
                    List<TranslatableContent> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new TranslatableContent(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

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
        return "TranslatableResource";
    }

    /**
    * Nested translatable resources under the current resource.
    */

    public TranslatableResourceConnection getNestedTranslatableResources() {
        return (TranslatableResourceConnection) get("nestedTranslatableResources");
    }

    public TranslatableResource setNestedTranslatableResources(TranslatableResourceConnection arg) {
        optimisticData.put(getKey("nestedTranslatableResources"), arg);
        return this;
    }

    /**
    * GID of the resource.
    */

    public ID getResourceId() {
        return (ID) get("resourceId");
    }

    public TranslatableResource setResourceId(ID arg) {
        optimisticData.put(getKey("resourceId"), arg);
        return this;
    }

    /**
    * Translatable content.
    */

    public List<TranslatableContent> getTranslatableContent() {
        return (List<TranslatableContent>) get("translatableContent");
    }

    public TranslatableResource setTranslatableContent(List<TranslatableContent> arg) {
        optimisticData.put(getKey("translatableContent"), arg);
        return this;
    }

    /**
    * Translatable content translations (includes unpublished locales).
    */

    public List<Translation> getTranslations() {
        return (List<Translation>) get("translations");
    }

    public TranslatableResource setTranslations(List<Translation> arg) {
        optimisticData.put(getKey("translations"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "nestedTranslatableResources": return true;

            case "resourceId": return false;

            case "translatableContent": return true;

            case "translations": return true;

            default: return false;
        }
    }
}

