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
* The international duties relevant to a fulfillment order.
*/
public class FulfillmentOrderInternationalDuties extends AbstractResponse<FulfillmentOrderInternationalDuties> {
    public FulfillmentOrderInternationalDuties() {
    }

    public FulfillmentOrderInternationalDuties(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "incoterm": {
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
        return "FulfillmentOrderInternationalDuties";
    }

    /**
    * The method of duties payment. Example values: `DDP`, `DAP`.
    */

    public String getIncoterm() {
        return (String) get("incoterm");
    }

    public FulfillmentOrderInternationalDuties setIncoterm(String arg) {
        optimisticData.put(getKey("incoterm"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "incoterm": return false;

            default: return false;
        }
    }
}

