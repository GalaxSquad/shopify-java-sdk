// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A server pixel stores configuration for streaming customer interactions to an EventBridge or PubSub
* endpoint.
*/
public class ServerPixelQuery extends Query<ServerPixelQuery> {
    ServerPixelQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The current state of this server pixel.
    */
    public ServerPixelQuery status() {
        startField("status");

        return this;
    }

    /**
    * Address of the EventBridge or PubSub endpoint.
    */
    public ServerPixelQuery webhookEndpointAddress() {
        startField("webhookEndpointAddress");

        return this;
    }
}
