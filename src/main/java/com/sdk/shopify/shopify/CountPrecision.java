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
* The precision of the value returned by a count field.
*/
public enum CountPrecision {
    /**
    * The count is at least the value. A limit was imposed and reached.
    */
    AT_LEAST,

    /**
    * The count is exactly the value.
    */
    EXACT,

    UNKNOWN_VALUE;

    public static CountPrecision fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "AT_LEAST": {
                return AT_LEAST;
            }

            case "EXACT": {
                return EXACT;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case AT_LEAST: {
                return "AT_LEAST";
            }

            case EXACT: {
                return "EXACT";
            }

            default: {
                return "";
            }
        }
    }
}

