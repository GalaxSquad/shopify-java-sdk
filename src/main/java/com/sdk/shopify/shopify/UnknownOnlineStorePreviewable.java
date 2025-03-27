// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Online Store preview URL of the object.
*/
public class UnknownOnlineStorePreviewable extends AbstractResponse<UnknownOnlineStorePreviewable> implements OnlineStorePreviewable {
    public UnknownOnlineStorePreviewable() {
    }

    public UnknownOnlineStorePreviewable(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "onlineStorePreviewUrl": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
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

    public static OnlineStorePreviewable create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "Product": {
                return new Product(fields);
            }

            default: {
                return new UnknownOnlineStorePreviewable(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    /**
    * The [preview URL](https://help.shopify.com/manual/online-store/setting-up#preview-your-store) for
    * the online store.
    */

    public String getOnlineStorePreviewUrl() {
        return (String) get("onlineStorePreviewUrl");
    }

    public UnknownOnlineStorePreviewable setOnlineStorePreviewUrl(String arg) {
        optimisticData.put(getKey("onlineStorePreviewUrl"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "onlineStorePreviewUrl": return false;

            default: return false;
        }
    }
}

