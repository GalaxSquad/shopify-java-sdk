// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents the url of the body of a theme file.
*/
public class OnlineStoreThemeFileBodyUrl extends AbstractResponse<OnlineStoreThemeFileBodyUrl> implements OnlineStoreThemeFileBody {
    public OnlineStoreThemeFileBodyUrl() {
    }

    public OnlineStoreThemeFileBodyUrl(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "url": {
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
        return "OnlineStoreThemeFileBodyUrl";
    }

    /**
    * The short lived url for the body of the theme file.
    */

    public String getUrl() {
        return (String) get("url");
    }

    public OnlineStoreThemeFileBodyUrl setUrl(String arg) {
        optimisticData.put(getKey("url"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "url": return false;

            default: return false;
        }
    }
}

