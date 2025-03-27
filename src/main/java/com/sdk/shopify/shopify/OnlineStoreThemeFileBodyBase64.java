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
* Represents the base64 encoded body of a theme file.
*/
public class OnlineStoreThemeFileBodyBase64 extends AbstractResponse<OnlineStoreThemeFileBodyBase64> implements OnlineStoreThemeFileBody {
    public OnlineStoreThemeFileBodyBase64() {
    }

    public OnlineStoreThemeFileBodyBase64(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "contentBase64": {
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
        return "OnlineStoreThemeFileBodyBase64";
    }

    /**
    * The body of the theme file, base64 encoded.
    */

    public String getContentBase64() {
        return (String) get("contentBase64");
    }

    public OnlineStoreThemeFileBodyBase64 setContentBase64(String arg) {
        optimisticData.put(getKey("contentBase64"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "contentBase64": return false;

            default: return false;
        }
    }
}

