// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* A webhook subscription is a persisted data object created by an app using the REST Admin API or
* GraphQL Admin API.
* It describes the topic that the app wants to receive, and a destination where Shopify should send
* webhooks of the specified topic.
* When an event for a given topic occurs, the webhook subscription sends a relevant payload to the
* destination.
* Learn more about the [webhooks system](https://shopify.dev/apps/webhooks).
*/
public class WebhookSubscription extends AbstractResponse<WebhookSubscription> implements LegacyInteroperability, Node {
    public WebhookSubscription() {
    }

    public WebhookSubscription(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "apiVersion": {
                    responseData.put(key, new ApiVersion(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "createdAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "endpoint": {
                    responseData.put(key, UnknownWebhookSubscriptionEndpoint.create(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "filter": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "format": {
                    responseData.put(key, WebhookSubscriptionFormat.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "includeFields": {
                    List<String> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(jsonAsString(element1, key));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "legacyResourceId": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "metafieldNamespaces": {
                    List<String> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(jsonAsString(element1, key));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "topic": {
                    responseData.put(key, WebhookSubscriptionTopic.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "updatedAt": {
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

    public WebhookSubscription(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "WebhookSubscription";
    }

    /**
    * The Admin API version that Shopify uses to serialize webhook events. This value is inherited from
    * the app that created the webhook subscription.
    */

    public ApiVersion getApiVersion() {
        return (ApiVersion) get("apiVersion");
    }

    public WebhookSubscription setApiVersion(ApiVersion arg) {
        optimisticData.put(getKey("apiVersion"), arg);
        return this;
    }

    /**
    * The date and time when the webhook subscription was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public WebhookSubscription setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * The endpoint to which the webhook subscription will send events.
    */

    public WebhookSubscriptionEndpoint getEndpoint() {
        return (WebhookSubscriptionEndpoint) get("endpoint");
    }

    public WebhookSubscription setEndpoint(WebhookSubscriptionEndpoint arg) {
        optimisticData.put(getKey("endpoint"), arg);
        return this;
    }

    /**
    * A constraint specified using search syntax that ensures only webhooks that match the specified
    * filter are emitted. See our [guide on
    * filters](https://shopify.dev/docs/apps/build/webhooks/customize/filters) for more details.
    */

    public String getFilter() {
        return (String) get("filter");
    }

    public WebhookSubscription setFilter(String arg) {
        optimisticData.put(getKey("filter"), arg);
        return this;
    }

    /**
    * The format in which the webhook subscription should send the data.
    */

    public WebhookSubscriptionFormat getFormat() {
        return (WebhookSubscriptionFormat) get("format");
    }

    public WebhookSubscription setFormat(WebhookSubscriptionFormat arg) {
        optimisticData.put(getKey("format"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * An optional array of top-level resource fields that should be serialized and sent in the webhook
    * message. If null, then all fields will be sent.
    */

    public List<String> getIncludeFields() {
        return (List<String>) get("includeFields");
    }

    public WebhookSubscription setIncludeFields(List<String> arg) {
        optimisticData.put(getKey("includeFields"), arg);
        return this;
    }

    /**
    * The ID of the corresponding resource in the REST Admin API.
    */

    public String getLegacyResourceId() {
        return (String) get("legacyResourceId");
    }

    public WebhookSubscription setLegacyResourceId(String arg) {
        optimisticData.put(getKey("legacyResourceId"), arg);
        return this;
    }

    /**
    * The list of namespaces for any metafields that should be included in the webhook subscription.
    */

    public List<String> getMetafieldNamespaces() {
        return (List<String>) get("metafieldNamespaces");
    }

    public WebhookSubscription setMetafieldNamespaces(List<String> arg) {
        optimisticData.put(getKey("metafieldNamespaces"), arg);
        return this;
    }

    /**
    * The type of event that triggers the webhook. The topic determines when the webhook subscription
    * sends a webhook, as well as what class of data object that webhook contains.
    */

    public WebhookSubscriptionTopic getTopic() {
        return (WebhookSubscriptionTopic) get("topic");
    }

    public WebhookSubscription setTopic(WebhookSubscriptionTopic arg) {
        optimisticData.put(getKey("topic"), arg);
        return this;
    }

    /**
    * The date and time when the webhook subscription was updated.
    */

    public String getUpdatedAt() {
        return (String) get("updatedAt");
    }

    public WebhookSubscription setUpdatedAt(String arg) {
        optimisticData.put(getKey("updatedAt"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "apiVersion": return true;

            case "createdAt": return false;

            case "endpoint": return false;

            case "filter": return false;

            case "format": return false;

            case "id": return false;

            case "includeFields": return false;

            case "legacyResourceId": return false;

            case "metafieldNamespaces": return false;

            case "topic": return false;

            case "updatedAt": return false;

            default: return false;
        }
    }
}

