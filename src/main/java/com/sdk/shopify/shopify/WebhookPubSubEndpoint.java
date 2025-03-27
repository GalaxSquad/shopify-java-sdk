// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A Google Cloud Pub/Sub topic to which webhook subscriptions publish events.
*/
public class WebhookPubSubEndpoint extends AbstractResponse<WebhookPubSubEndpoint> implements WebhookSubscriptionEndpoint {
    public WebhookPubSubEndpoint() {
    }

    public WebhookPubSubEndpoint(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "pubSubProject": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "pubSubTopic": {
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
        return "WebhookPubSubEndpoint";
    }

    /**
    * The Google Cloud Pub/Sub project ID.
    */

    public String getPubSubProject() {
        return (String) get("pubSubProject");
    }

    public WebhookPubSubEndpoint setPubSubProject(String arg) {
        optimisticData.put(getKey("pubSubProject"), arg);
        return this;
    }

    /**
    * The Google Cloud Pub/Sub topic ID.
    */

    public String getPubSubTopic() {
        return (String) get("pubSubTopic");
    }

    public WebhookPubSubEndpoint setPubSubTopic(String arg) {
        optimisticData.put(getKey("pubSubTopic"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "pubSubProject": return false;

            case "pubSubTopic": return false;

            default: return false;
        }
    }
}

