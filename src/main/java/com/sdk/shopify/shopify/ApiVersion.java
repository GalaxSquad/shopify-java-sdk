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
* A version of the API, as defined by [Shopify API
* versioning](https://shopify.dev/api/usage/versioning).
* Versions are commonly referred to by their handle (for example, `2021-10`).
*/
public class ApiVersion extends AbstractResponse<ApiVersion> {
    public ApiVersion() {
    }

    public ApiVersion(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "displayName": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "handle": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "supported": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

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
        return "ApiVersion";
    }

    /**
    * The human-readable name of the version.
    */

    public String getDisplayName() {
        return (String) get("displayName");
    }

    public ApiVersion setDisplayName(String arg) {
        optimisticData.put(getKey("displayName"), arg);
        return this;
    }

    /**
    * The unique identifier of an ApiVersion. All supported API versions have a date-based (YYYY-MM) or
    * `unstable` handle.
    */

    public String getHandle() {
        return (String) get("handle");
    }

    public ApiVersion setHandle(String arg) {
        optimisticData.put(getKey("handle"), arg);
        return this;
    }

    /**
    * Whether the version is actively supported by Shopify. Supported API versions are guaranteed to be
    * stable. Unsupported API versions include unstable, release candidate, and end-of-life versions that
    * are marked as unsupported. For more information, refer to
    * [Versioning](https://shopify.dev/api/usage/versioning).
    */

    public Boolean getSupported() {
        return (Boolean) get("supported");
    }

    public ApiVersion setSupported(Boolean arg) {
        optimisticData.put(getKey("supported"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "displayName": return false;

            case "handle": return false;

            case "supported": return false;

            default: return false;
        }
    }
}

