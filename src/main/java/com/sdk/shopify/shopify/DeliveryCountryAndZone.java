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
* The country details and the associated shipping zone.
*/
public class DeliveryCountryAndZone extends AbstractResponse<DeliveryCountryAndZone> {
    public DeliveryCountryAndZone() {
    }

    public DeliveryCountryAndZone(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "country": {
                    responseData.put(key, new DeliveryCountry(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "zone": {
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
        return "DeliveryCountryAndZone";
    }

    /**
    * The country details.
    */

    public DeliveryCountry getCountry() {
        return (DeliveryCountry) get("country");
    }

    public DeliveryCountryAndZone setCountry(DeliveryCountry arg) {
        optimisticData.put(getKey("country"), arg);
        return this;
    }

    /**
    * The name of the shipping zone.
    */

    public String getZone() {
        return (String) get("zone");
    }

    public DeliveryCountryAndZone setZone(String arg) {
        optimisticData.put(getKey("zone"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "country": return true;

            case "zone": return false;

            default: return false;
        }
    }
}

