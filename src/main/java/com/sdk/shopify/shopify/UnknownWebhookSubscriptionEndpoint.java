// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* An endpoint to which webhook subscriptions send webhooks events.
*/
public class UnknownWebhookSubscriptionEndpoint extends AbstractResponse<UnknownWebhookSubscriptionEndpoint> implements WebhookSubscriptionEndpoint {
    public UnknownWebhookSubscriptionEndpoint() {
    }

    public UnknownWebhookSubscriptionEndpoint(JsonObject fields) throws SchemaViolationError {
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

    public static WebhookSubscriptionEndpoint create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "WebhookEventBridgeEndpoint": {
                return new WebhookEventBridgeEndpoint(fields);
            }

            case "WebhookHttpEndpoint": {
                return new WebhookHttpEndpoint(fields);
            }

            case "WebhookPubSubEndpoint": {
                return new WebhookPubSubEndpoint(fields);
            }

            default: {
                return new UnknownWebhookSubscriptionEndpoint(fields);
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

