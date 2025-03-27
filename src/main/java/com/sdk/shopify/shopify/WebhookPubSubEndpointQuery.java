// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A Google Cloud Pub/Sub topic to which webhook subscriptions publish events.
*/
public class WebhookPubSubEndpointQuery extends Query<WebhookPubSubEndpointQuery> {
    WebhookPubSubEndpointQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The Google Cloud Pub/Sub project ID.
    */
    public WebhookPubSubEndpointQuery pubSubProject() {
        startField("pubSubProject");

        return this;
    }

    /**
    * The Google Cloud Pub/Sub topic ID.
    */
    public WebhookPubSubEndpointQuery pubSubTopic() {
        startField("pubSubTopic");

        return this;
    }
}
