// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The shop's online store channel.
*/
public class OnlineStore extends AbstractResponse<OnlineStore> {
    public OnlineStore() {
    }

    public OnlineStore(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "passwordProtection": {
                    responseData.put(key, new OnlineStorePasswordProtection(jsonAsObject(field.getValue(), key)));

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
        return "OnlineStore";
    }

    /**
    * Storefront password information.
    */

    public OnlineStorePasswordProtection getPasswordProtection() {
        return (OnlineStorePasswordProtection) get("passwordProtection");
    }

    public OnlineStore setPasswordProtection(OnlineStorePasswordProtection arg) {
        optimisticData.put(getKey("passwordProtection"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "passwordProtection": return true;

            default: return false;
        }
    }
}

