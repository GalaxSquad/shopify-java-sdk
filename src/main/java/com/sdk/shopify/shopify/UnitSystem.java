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
* Systems of weights and measures.
*/
public enum UnitSystem {
    /**
    * Imperial system of weights and measures.
    */
    IMPERIAL_SYSTEM,

    /**
    * Metric system of weights and measures.
    */
    METRIC_SYSTEM,

    UNKNOWN_VALUE;

    public static UnitSystem fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "IMPERIAL_SYSTEM": {
                return IMPERIAL_SYSTEM;
            }

            case "METRIC_SYSTEM": {
                return METRIC_SYSTEM;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case IMPERIAL_SYSTEM: {
                return "IMPERIAL_SYSTEM";
            }

            case METRIC_SYSTEM: {
                return "METRIC_SYSTEM";
            }

            default: {
                return "";
            }
        }
    }
}

