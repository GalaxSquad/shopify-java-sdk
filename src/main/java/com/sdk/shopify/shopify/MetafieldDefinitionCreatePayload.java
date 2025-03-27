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
* Return type for `metafieldDefinitionCreate` mutation.
*/
public class MetafieldDefinitionCreatePayload extends AbstractResponse<MetafieldDefinitionCreatePayload> {
    public MetafieldDefinitionCreatePayload() {
    }

    public MetafieldDefinitionCreatePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "createdDefinition": {
                    MetafieldDefinition optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MetafieldDefinition(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<MetafieldDefinitionCreateUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new MetafieldDefinitionCreateUserError(jsonAsObject(element1, key)));
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
        return "MetafieldDefinitionCreatePayload";
    }

    /**
    * The metafield definition that was created.
    */

    public MetafieldDefinition getCreatedDefinition() {
        return (MetafieldDefinition) get("createdDefinition");
    }

    public MetafieldDefinitionCreatePayload setCreatedDefinition(MetafieldDefinition arg) {
        optimisticData.put(getKey("createdDefinition"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<MetafieldDefinitionCreateUserError> getUserErrors() {
        return (List<MetafieldDefinitionCreateUserError>) get("userErrors");
    }

    public MetafieldDefinitionCreatePayload setUserErrors(List<MetafieldDefinitionCreateUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "createdDefinition": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

