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
* Return type for `pubSubWebhookSubscriptionUpdate` mutation.
*/
public class PubSubWebhookSubscriptionUpdatePayload extends AbstractResponse<PubSubWebhookSubscriptionUpdatePayload> {
    public PubSubWebhookSubscriptionUpdatePayload() {
    }

    public PubSubWebhookSubscriptionUpdatePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "userErrors": {
                    List<PubSubWebhookSubscriptionUpdateUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new PubSubWebhookSubscriptionUpdateUserError(jsonAsObject(element1, key)));
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
        return "PubSubWebhookSubscriptionUpdatePayload";
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<PubSubWebhookSubscriptionUpdateUserError> getUserErrors() {
        return (List<PubSubWebhookSubscriptionUpdateUserError>) get("userErrors");
    }

    public PubSubWebhookSubscriptionUpdatePayload setUserErrors(List<PubSubWebhookSubscriptionUpdateUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    /**
    * The webhook subscription that was updated.
    */

    public WebhookSubscription getWebhookSubscription() {
        return (WebhookSubscription) get("webhookSubscription");
    }

    public PubSubWebhookSubscriptionUpdatePayload setWebhookSubscription(WebhookSubscription arg) {
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

