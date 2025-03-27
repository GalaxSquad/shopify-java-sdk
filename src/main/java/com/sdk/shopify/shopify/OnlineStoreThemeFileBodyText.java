// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents the body of a theme file.
*/
public class OnlineStoreThemeFileBodyText extends AbstractResponse<OnlineStoreThemeFileBodyText> implements OnlineStoreThemeFileBody {
    public OnlineStoreThemeFileBodyText() {
    }

    public OnlineStoreThemeFileBodyText(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "content": {
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
        return "OnlineStoreThemeFileBodyText";
    }

    /**
    * The body of the theme file.
    */

    public String getContent() {
        return (String) get("content");
    }

    public OnlineStoreThemeFileBodyText setContent(String arg) {
        optimisticData.put(getKey("content"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "content": return false;

            default: return false;
        }
    }
}

