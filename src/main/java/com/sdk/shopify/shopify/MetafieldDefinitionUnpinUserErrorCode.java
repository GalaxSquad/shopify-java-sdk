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
* Possible error codes that can be returned by `MetafieldDefinitionUnpinUserError`.
*/
public enum MetafieldDefinitionUnpinUserErrorCode {
    /**
    * Owner type can't be used in this mutation.
    */
    DISALLOWED_OWNER_TYPE,

    /**
    * An internal error occurred.
    */
    INTERNAL_ERROR,

    /**
    * The metafield definition was not found.
    */
    NOT_FOUND,

    /**
    * The metafield definition isn't pinned.
    */
    NOT_PINNED,

    UNKNOWN_VALUE;

    public static MetafieldDefinitionUnpinUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "DISALLOWED_OWNER_TYPE": {
                return DISALLOWED_OWNER_TYPE;
            }

            case "INTERNAL_ERROR": {
                return INTERNAL_ERROR;
            }

            case "NOT_FOUND": {
                return NOT_FOUND;
            }

            case "NOT_PINNED": {
                return NOT_PINNED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case DISALLOWED_OWNER_TYPE: {
                return "DISALLOWED_OWNER_TYPE";
            }

            case INTERNAL_ERROR: {
                return "INTERNAL_ERROR";
            }

            case NOT_FOUND: {
                return "NOT_FOUND";
            }

            case NOT_PINNED: {
                return "NOT_PINNED";
            }

            default: {
                return "";
            }
        }
    }
}

