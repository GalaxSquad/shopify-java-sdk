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
* Represents the staged status of a CalculatedShippingLine on a CalculatedOrder.
*/
public enum CalculatedShippingLineStagedStatus {
    /**
    * The shipping line was added as part of the current order edit.
    */
    ADDED,

    /**
    * The shipping line has no staged changes associated with it.
    */
    NONE,

    /**
    * The shipping line was removed as part of the current order edit.
    */
    REMOVED,

    UNKNOWN_VALUE;

    public static CalculatedShippingLineStagedStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ADDED": {
                return ADDED;
            }

            case "NONE": {
                return NONE;
            }

            case "REMOVED": {
                return REMOVED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ADDED: {
                return "ADDED";
            }

            case NONE: {
                return "NONE";
            }

            case REMOVED: {
                return "REMOVED";
            }

            default: {
                return "";
            }
        }
    }
}

