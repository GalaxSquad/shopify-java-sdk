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
* The valid values for the bulk operation's type.
*/
public enum BulkOperationType {
    /**
    * The bulk operation is a mutation.
    */
    MUTATION,

    /**
    * The bulk operation is a query.
    */
    QUERY,

    UNKNOWN_VALUE;

    public static BulkOperationType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "MUTATION": {
                return MUTATION;
            }

            case "QUERY": {
                return QUERY;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case MUTATION: {
                return "MUTATION";
            }

            case QUERY: {
                return "QUERY";
            }

            default: {
                return "";
            }
        }
    }
}

