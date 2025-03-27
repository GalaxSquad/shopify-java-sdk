// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

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
