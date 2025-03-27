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
public class UnknownOnlineStoreThemeFileBody extends AbstractResponse<UnknownOnlineStoreThemeFileBody> implements OnlineStoreThemeFileBody {
    public UnknownOnlineStoreThemeFileBody() {
    }

    public UnknownOnlineStoreThemeFileBody(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
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

    public static OnlineStoreThemeFileBody create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "OnlineStoreThemeFileBodyBase64": {
                return new OnlineStoreThemeFileBodyBase64(fields);
            }

            case "OnlineStoreThemeFileBodyText": {
                return new OnlineStoreThemeFileBodyText(fields);
            }

            case "OnlineStoreThemeFileBodyUrl": {
                return new OnlineStoreThemeFileBodyUrl(fields);
            }

            default: {
                return new UnknownOnlineStoreThemeFileBody(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            default: return false;
        }
    }
}

