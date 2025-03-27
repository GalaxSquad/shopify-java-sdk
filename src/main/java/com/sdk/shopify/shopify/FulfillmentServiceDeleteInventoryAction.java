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
* Actions that can be taken at the location when a client requests the deletion of the fulfillment
* service.
*/
public enum FulfillmentServiceDeleteInventoryAction {
    /**
    * Deactivate and delete the inventory and location.
    */
    DELETE,

    /**
    * Keep the inventory in place and convert the Fulfillment Service's location to be merchant managed.
    */
    KEEP,

    /**
    * Transfer the inventory and other dependencies to the provided location.
    */
    TRANSFER,

    UNKNOWN_VALUE;

    public static FulfillmentServiceDeleteInventoryAction fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "DELETE": {
                return DELETE;
            }

            case "KEEP": {
                return KEEP;
            }

            case "TRANSFER": {
                return TRANSFER;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case DELETE: {
                return "DELETE";
            }

            case KEEP: {
                return "KEEP";
            }

            case TRANSFER: {
                return "TRANSFER";
            }

            default: {
                return "";
            }
        }
    }
}

