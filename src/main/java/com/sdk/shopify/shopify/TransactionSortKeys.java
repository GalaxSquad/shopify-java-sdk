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
* The set of valid sort keys for the Transaction query.
*/
public enum TransactionSortKeys {
    /**
    * Sort by the `created_at` value.
    */
    CREATED_AT,

    /**
    * Sort by the `expires_at` value.
    */
    EXPIRES_AT,

    UNKNOWN_VALUE;

    public static TransactionSortKeys fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CREATED_AT": {
                return CREATED_AT;
            }

            case "EXPIRES_AT": {
                return EXPIRES_AT;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CREATED_AT: {
                return "CREATED_AT";
            }

            case EXPIRES_AT: {
                return "EXPIRES_AT";
            }

            default: {
                return "";
            }
        }
    }
}

