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
* A channel definition represents channels surfaces on the platform.
* A channel definition can be a platform or a subsegment of it such as Facebook Home, Instagram Live,
* Instagram Shops, or WhatsApp chat.
*/
public class ChannelDefinition extends AbstractResponse<ChannelDefinition> implements Node {
    public ChannelDefinition() {
    }

    public ChannelDefinition(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "channelName": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "handle": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "isMarketplace": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "subChannelName": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "svgIcon": {
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

    public ChannelDefinition(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "ChannelDefinition";
    }

    /**
    * Name of the channel that this sub channel belongs to.
    */

    public String getChannelName() {
        return (String) get("channelName");
    }

    public ChannelDefinition setChannelName(String arg) {
        optimisticData.put(getKey("channelName"), arg);
        return this;
    }

    /**
    * Unique string used as a public identifier for the channel definition.
    */

    public String getHandle() {
        return (String) get("handle");
    }

    public ChannelDefinition setHandle(String arg) {
        optimisticData.put(getKey("handle"), arg);
        return this;
    }

    /**
    * The unique ID for the channel definition.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * Whether this channel definition represents a marketplace.
    */

    public Boolean getIsMarketplace() {
        return (Boolean) get("isMarketplace");
    }

    public ChannelDefinition setIsMarketplace(Boolean arg) {
        optimisticData.put(getKey("isMarketplace"), arg);
        return this;
    }

    /**
    * Name of the sub channel (e.g. Online Store, Instagram Shopping, TikTok Live).
    */

    public String getSubChannelName() {
        return (String) get("subChannelName");
    }

    public ChannelDefinition setSubChannelName(String arg) {
        optimisticData.put(getKey("subChannelName"), arg);
        return this;
    }

    /**
    * Icon displayed when showing the channel in admin.
    */

    public String getSvgIcon() {
        return (String) get("svgIcon");
    }

    public ChannelDefinition setSvgIcon(String arg) {
        optimisticData.put(getKey("svgIcon"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "channelName": return false;

            case "handle": return false;

            case "id": return false;

            case "isMarketplace": return false;

            case "subChannelName": return false;

            case "svgIcon": return false;

            default: return false;
        }
    }
}

