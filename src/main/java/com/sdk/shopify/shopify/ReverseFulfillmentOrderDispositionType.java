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
* The final arrangement of an item from a reverse fulfillment order.
*/
public enum ReverseFulfillmentOrderDispositionType {
    /**
    * An item that was expected but absent.
    */
    MISSING,

    /**
    * An item that wasn't restocked.
    */
    NOT_RESTOCKED,

    /**
    * An item that requires further processing before being restocked or discarded.
    */
    PROCESSING_REQUIRED,

    /**
    * An item that was restocked.
    */
    RESTOCKED,

    UNKNOWN_VALUE;

    public static ReverseFulfillmentOrderDispositionType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "MISSING": {
                return MISSING;
            }

            case "NOT_RESTOCKED": {
                return NOT_RESTOCKED;
            }

            case "PROCESSING_REQUIRED": {
                return PROCESSING_REQUIRED;
            }

            case "RESTOCKED": {
                return RESTOCKED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case MISSING: {
                return "MISSING";
            }

            case NOT_RESTOCKED: {
                return "NOT_RESTOCKED";
            }

            case PROCESSING_REQUIRED: {
                return "PROCESSING_REQUIRED";
            }

            case RESTOCKED: {
                return "RESTOCKED";
            }

            default: {
                return "";
            }
        }
    }
}

