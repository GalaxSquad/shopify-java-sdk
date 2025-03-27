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
* The Online Store capability of a metaobject definition.
*/
public class MetaobjectCapabilitiesOnlineStore extends AbstractResponse<MetaobjectCapabilitiesOnlineStore> {
    public MetaobjectCapabilitiesOnlineStore() {
    }

    public MetaobjectCapabilitiesOnlineStore(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "data": {
                    MetaobjectCapabilityDefinitionDataOnlineStore optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MetaobjectCapabilityDefinitionDataOnlineStore(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "enabled": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

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
        return "MetaobjectCapabilitiesOnlineStore";
    }

    /**
    * The data associated with the Online Store capability.
    */

    public MetaobjectCapabilityDefinitionDataOnlineStore getData() {
        return (MetaobjectCapabilityDefinitionDataOnlineStore) get("data");
    }

    public MetaobjectCapabilitiesOnlineStore setData(MetaobjectCapabilityDefinitionDataOnlineStore arg) {
        optimisticData.put(getKey("data"), arg);
        return this;
    }

    /**
    * Indicates if the capability is enabled.
    */

    public Boolean getEnabled() {
        return (Boolean) get("enabled");
    }

    public MetaobjectCapabilitiesOnlineStore setEnabled(Boolean arg) {
        optimisticData.put(getKey("enabled"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "data": return true;

            case "enabled": return false;

            default: return false;
        }
    }
}

