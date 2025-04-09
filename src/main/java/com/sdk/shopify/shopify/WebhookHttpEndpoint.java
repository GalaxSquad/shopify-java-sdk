// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* An HTTPS endpoint to which webhook subscriptions send POST requests.
*/
public class WebhookHttpEndpoint extends AbstractResponse<WebhookHttpEndpoint> implements WebhookSubscriptionEndpoint {
    public WebhookHttpEndpoint() {
    }

    public WebhookHttpEndpoint(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "callbackUrl": {
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
        return "WebhookHttpEndpoint";
    }

    /**
    * The URL to which the webhooks events are sent.
    */

    public String getCallbackUrl() {
        return (String) get("callbackUrl");
    }

    public WebhookHttpEndpoint setCallbackUrl(String arg) {
        optimisticData.put(getKey("callbackUrl"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "callbackUrl": return false;

            default: return false;
        }
    }
}

