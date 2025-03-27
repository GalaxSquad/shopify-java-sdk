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

import java.util.Map;

/**
* A server pixel stores configuration for streaming customer interactions to an EventBridge or PubSub
* endpoint.
*/
public class ServerPixel extends AbstractResponse<ServerPixel> implements Node {
    public ServerPixel() {
    }

    public ServerPixel(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "status": {
                    ServerPixelStatus optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = ServerPixelStatus.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "webhookEndpointAddress": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
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

    public ServerPixel(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "ServerPixel";
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The current state of this server pixel.
    */

    public ServerPixelStatus getStatus() {
        return (ServerPixelStatus) get("status");
    }

    public ServerPixel setStatus(ServerPixelStatus arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    /**
    * Address of the EventBridge or PubSub endpoint.
    */

    public String getWebhookEndpointAddress() {
        return (String) get("webhookEndpointAddress");
    }

    public ServerPixel setWebhookEndpointAddress(String arg) {
        optimisticData.put(getKey("webhookEndpointAddress"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "status": return false;

            case "webhookEndpointAddress": return false;

            default: return false;
        }
    }
}

