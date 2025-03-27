// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A webhook subscription is a persisted data object created by an app using the REST Admin API or
* GraphQL Admin API.
* It describes the topic that the app wants to receive, and a destination where Shopify should send
* webhooks of the specified topic.
* When an event for a given topic occurs, the webhook subscription sends a relevant payload to the
* destination.
* Learn more about the [webhooks system](https://shopify.dev/apps/webhooks).
*/
public class WebhookSubscriptionQuery extends Query<WebhookSubscriptionQuery> {
    WebhookSubscriptionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The Admin API version that Shopify uses to serialize webhook events. This value is inherited from
    * the app that created the webhook subscription.
    */
    public WebhookSubscriptionQuery apiVersion(ApiVersionQueryDefinition queryDef) {
        startField("apiVersion");

        _queryBuilder.append('{');
        queryDef.define(new ApiVersionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time when the webhook subscription was created.
    */
    public WebhookSubscriptionQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * The endpoint to which the webhook subscription will send events.
    */
    public WebhookSubscriptionQuery endpoint(WebhookSubscriptionEndpointQueryDefinition queryDef) {
        startField("endpoint");

        _queryBuilder.append('{');
        queryDef.define(new WebhookSubscriptionEndpointQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A constraint specified using search syntax that ensures only webhooks that match the specified
    * filter are emitted. See our [guide on
    * filters](https://shopify.dev/docs/apps/build/webhooks/customize/filters) for more details.
    */
    public WebhookSubscriptionQuery filter() {
        startField("filter");

        return this;
    }

    /**
    * The format in which the webhook subscription should send the data.
    */
    public WebhookSubscriptionQuery format() {
        startField("format");

        return this;
    }

    /**
    * An optional array of top-level resource fields that should be serialized and sent in the webhook
    * message. If null, then all fields will be sent.
    */
    public WebhookSubscriptionQuery includeFields() {
        startField("includeFields");

        return this;
    }

    /**
    * The ID of the corresponding resource in the REST Admin API.
    */
    public WebhookSubscriptionQuery legacyResourceId() {
        startField("legacyResourceId");

        return this;
    }

    /**
    * The list of namespaces for any metafields that should be included in the webhook subscription.
    */
    public WebhookSubscriptionQuery metafieldNamespaces() {
        startField("metafieldNamespaces");

        return this;
    }

    /**
    * The type of event that triggers the webhook. The topic determines when the webhook subscription
    * sends a webhook, as well as what class of data object that webhook contains.
    */
    public WebhookSubscriptionQuery topic() {
        startField("topic");

        return this;
    }

    /**
    * The date and time when the webhook subscription was updated.
    */
    public WebhookSubscriptionQuery updatedAt() {
        startField("updatedAt");

        return this;
    }
}
