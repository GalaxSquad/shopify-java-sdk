// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Return type for `pubSubWebhookSubscriptionCreate` mutation.
*/
public class PubSubWebhookSubscriptionCreatePayload extends AbstractResponse<PubSubWebhookSubscriptionCreatePayload> {
    public PubSubWebhookSubscriptionCreatePayload() {
    }

    public PubSubWebhookSubscriptionCreatePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "userErrors": {
                    List<PubSubWebhookSubscriptionCreateUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new PubSubWebhookSubscriptionCreateUserError(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "webhookSubscription": {
                    WebhookSubscription optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new WebhookSubscription(jsonAsObject(field.getValue(), key));
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

    public String getGraphQlTypeName() {
        return "PubSubWebhookSubscriptionCreatePayload";
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<PubSubWebhookSubscriptionCreateUserError> getUserErrors() {
        return (List<PubSubWebhookSubscriptionCreateUserError>) get("userErrors");
    }

    public PubSubWebhookSubscriptionCreatePayload setUserErrors(List<PubSubWebhookSubscriptionCreateUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    /**
    * The webhook subscription that was created.
    */

    public WebhookSubscription getWebhookSubscription() {
        return (WebhookSubscription) get("webhookSubscription");
    }

    public PubSubWebhookSubscriptionCreatePayload setWebhookSubscription(WebhookSubscription arg) {
        optimisticData.put(getKey("webhookSubscription"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "userErrors": return true;

            case "webhookSubscription": return true;

            default: return false;
        }
    }
}

