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
* Return type for `metafieldDefinitionUpdate` mutation.
*/
public class MetafieldDefinitionUpdatePayload extends AbstractResponse<MetafieldDefinitionUpdatePayload> {
    public MetafieldDefinitionUpdatePayload() {
    }

    public MetafieldDefinitionUpdatePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "updatedDefinition": {
                    MetafieldDefinition optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MetafieldDefinition(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<MetafieldDefinitionUpdateUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new MetafieldDefinitionUpdateUserError(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "validationJob": {
                    Job optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Job(jsonAsObject(field.getValue(), key));
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
        return "MetafieldDefinitionUpdatePayload";
    }

    /**
    * The metafield definition that was updated.
    */

    public MetafieldDefinition getUpdatedDefinition() {
        return (MetafieldDefinition) get("updatedDefinition");
    }

    public MetafieldDefinitionUpdatePayload setUpdatedDefinition(MetafieldDefinition arg) {
        optimisticData.put(getKey("updatedDefinition"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<MetafieldDefinitionUpdateUserError> getUserErrors() {
        return (List<MetafieldDefinitionUpdateUserError>) get("userErrors");
    }

    public MetafieldDefinitionUpdatePayload setUserErrors(List<MetafieldDefinitionUpdateUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    /**
    * The asynchronous job updating the metafield definition's validation_status.
    */

    public Job getValidationJob() {
        return (Job) get("validationJob");
    }

    public MetafieldDefinitionUpdatePayload setValidationJob(Job arg) {
        optimisticData.put(getKey("validationJob"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "updatedDefinition": return true;

            case "userErrors": return true;

            case "validationJob": return true;

            default: return false;
        }
    }
}

