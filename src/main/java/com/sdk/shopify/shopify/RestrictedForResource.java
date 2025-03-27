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
* Information about product is restricted for a given resource.
*/
public class RestrictedForResource extends AbstractResponse<RestrictedForResource> {
    public RestrictedForResource() {
    }

    public RestrictedForResource(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "restricted": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "restrictedReason": {
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
        return "RestrictedForResource";
    }

    /**
    * Returns true when the product is restricted for the given resource.
    */

    public Boolean getRestricted() {
        return (Boolean) get("restricted");
    }

    public RestrictedForResource setRestricted(Boolean arg) {
        optimisticData.put(getKey("restricted"), arg);
        return this;
    }

    /**
    * Restriction reason for the given resource.
    */

    public String getRestrictedReason() {
        return (String) get("restrictedReason");
    }

    public RestrictedForResource setRestrictedReason(String arg) {
        optimisticData.put(getKey("restrictedReason"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "restricted": return false;

            case "restrictedReason": return false;

            default: return false;
        }
    }
}

