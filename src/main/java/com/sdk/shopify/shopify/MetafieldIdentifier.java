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

import java.util.Map;

/**
* Identifies a metafield by its owner resource, namespace, and key.
*/
public class MetafieldIdentifier extends AbstractResponse<MetafieldIdentifier> {
    public MetafieldIdentifier() {
    }

    public MetafieldIdentifier(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "key": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "namespace": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "ownerId": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

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
        return "MetafieldIdentifier";
    }

    /**
    * The key of the metafield.
    */

    public String getKey() {
        return (String) get("key");
    }

    public MetafieldIdentifier setKey(String arg) {
        optimisticData.put(getKey("key"), arg);
        return this;
    }

    /**
    * The namespace of the metafield.
    */

    public String getNamespace() {
        return (String) get("namespace");
    }

    public MetafieldIdentifier setNamespace(String arg) {
        optimisticData.put(getKey("namespace"), arg);
        return this;
    }

    /**
    * GID of the owner resource that the metafield belongs to.
    */

    public ID getOwnerId() {
        return (ID) get("ownerId");
    }

    public MetafieldIdentifier setOwnerId(ID arg) {
        optimisticData.put(getKey("ownerId"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "key": return false;

            case "namespace": return false;

            case "ownerId": return false;

            default: return false;
        }
    }
}

