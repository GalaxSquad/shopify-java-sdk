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
* Contains the information for a given sales channel.
*/
public class ChannelInformation extends AbstractResponse<ChannelInformation> implements Node {
    public ChannelInformation() {
    }

    public ChannelInformation(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "app": {
                    responseData.put(key, new App(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "channelDefinition": {
                    ChannelDefinition optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ChannelDefinition(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "channelId": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

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

    public ChannelInformation(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "ChannelInformation";
    }

    /**
    * The app associated with the channel.
    */

    public App getApp() {
        return (App) get("app");
    }

    public ChannelInformation setApp(App arg) {
        optimisticData.put(getKey("app"), arg);
        return this;
    }

    /**
    * The channel definition associated with the channel.
    */

    public ChannelDefinition getChannelDefinition() {
        return (ChannelDefinition) get("channelDefinition");
    }

    public ChannelInformation setChannelDefinition(ChannelDefinition arg) {
        optimisticData.put(getKey("channelDefinition"), arg);
        return this;
    }

    /**
    * The unique ID for the channel.
    */

    public ID getChannelId() {
        return (ID) get("channelId");
    }

    public ChannelInformation setChannelId(ID arg) {
        optimisticData.put(getKey("channelId"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "app": return true;

            case "channelDefinition": return true;

            case "channelId": return false;

            case "id": return false;

            default: return false;
        }
    }
}

