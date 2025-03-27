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
* Represents an object containing all information for channels available to a shop.
*/
public class AvailableChannelDefinitionsByChannel extends AbstractResponse<AvailableChannelDefinitionsByChannel> {
    public AvailableChannelDefinitionsByChannel() {
    }

    public AvailableChannelDefinitionsByChannel(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "channelDefinitions": {
                    List<ChannelDefinition> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new ChannelDefinition(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "channelName": {
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

    public String getGraphQlTypeName() {
        return "AvailableChannelDefinitionsByChannel";
    }

    /**
    * The channel definitions for channels installed on a shop.
    */

    public List<ChannelDefinition> getChannelDefinitions() {
        return (List<ChannelDefinition>) get("channelDefinitions");
    }

    public AvailableChannelDefinitionsByChannel setChannelDefinitions(List<ChannelDefinition> arg) {
        optimisticData.put(getKey("channelDefinitions"), arg);
        return this;
    }

    /**
    * The name of the channel.
    */

    public String getChannelName() {
        return (String) get("channelName");
    }

    public AvailableChannelDefinitionsByChannel setChannelName(String arg) {
        optimisticData.put(getKey("channelName"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "channelDefinitions": return true;

            case "channelName": return false;

            default: return false;
        }
    }
}

