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
* The permission required to access a Shopify Admin API or Storefront API resource for a shop.
* Merchants grant access scopes that are requested by applications.
*/
public class AccessScope extends AbstractResponse<AccessScope> {
    public AccessScope() {
    }

    public AccessScope(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "description": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "handle": {
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
        return "AccessScope";
    }

    /**
    * A description of the actions that the access scope allows an app to perform.
    */

    public String getDescription() {
        return (String) get("description");
    }

    public AccessScope setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    /**
    * A readable string that represents the access scope. The string usually follows the format
    * `{action}_{resource}`. `{action}` is `read` or `write`, and `{resource}` is the resource that the
    * action can be performed on. `{action}` and `{resource}` are separated by an underscore. For example,
    * `read_orders` or `write_products`.
    */

    public String getHandle() {
        return (String) get("handle");
    }

    public AccessScope setHandle(String arg) {
        optimisticData.put(getKey("handle"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "description": return false;

            case "handle": return false;

            default: return false;
        }
    }
}

