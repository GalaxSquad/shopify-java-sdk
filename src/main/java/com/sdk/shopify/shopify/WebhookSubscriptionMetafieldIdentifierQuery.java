// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Identifies metafields by their namespace, and key.
*/
public class WebhookSubscriptionMetafieldIdentifierQuery extends Query<WebhookSubscriptionMetafieldIdentifierQuery> {
    WebhookSubscriptionMetafieldIdentifierQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The unique identifier for the metafield definition within its namespace.
    */
    public WebhookSubscriptionMetafieldIdentifierQuery key() {
        startField("key");

        return this;
    }

    /**
    * The container for a group of metafields that the metafield definition is associated with.
    */
    public WebhookSubscriptionMetafieldIdentifierQuery namespace() {
        startField("namespace");

        return this;
    }
}
