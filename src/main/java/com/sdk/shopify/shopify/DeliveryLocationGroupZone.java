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
* Links a location group with a zone and the associated method definitions.
*/
public class DeliveryLocationGroupZone extends AbstractResponse<DeliveryLocationGroupZone> {
    public DeliveryLocationGroupZone() {
    }

    public DeliveryLocationGroupZone(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "methodDefinitionCounts": {
                    responseData.put(key, new DeliveryMethodDefinitionCounts(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "methodDefinitions": {
                    responseData.put(key, new DeliveryMethodDefinitionConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "zone": {
                    responseData.put(key, new DeliveryZone(jsonAsObject(field.getValue(), key)));

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
        return "DeliveryLocationGroupZone";
    }

    /**
    * The number of method definitions for the zone.
    */

    public DeliveryMethodDefinitionCounts getMethodDefinitionCounts() {
        return (DeliveryMethodDefinitionCounts) get("methodDefinitionCounts");
    }

    public DeliveryLocationGroupZone setMethodDefinitionCounts(DeliveryMethodDefinitionCounts arg) {
        optimisticData.put(getKey("methodDefinitionCounts"), arg);
        return this;
    }

    /**
    * The method definitions associated to a zone and location group.
    */

    public DeliveryMethodDefinitionConnection getMethodDefinitions() {
        return (DeliveryMethodDefinitionConnection) get("methodDefinitions");
    }

    public DeliveryLocationGroupZone setMethodDefinitions(DeliveryMethodDefinitionConnection arg) {
        optimisticData.put(getKey("methodDefinitions"), arg);
        return this;
    }

    /**
    * The zone associated to a location group.
    */

    public DeliveryZone getZone() {
        return (DeliveryZone) get("zone");
    }

    public DeliveryLocationGroupZone setZone(DeliveryZone arg) {
        optimisticData.put(getKey("zone"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "methodDefinitionCounts": return true;

            case "methodDefinitions": return true;

            case "zone": return true;

            default: return false;
        }
    }
}

