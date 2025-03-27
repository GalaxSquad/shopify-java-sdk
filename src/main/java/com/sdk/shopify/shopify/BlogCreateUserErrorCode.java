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
* Possible error codes that can be returned by `BlogCreateUserError`.
*/
public enum BlogCreateUserErrorCode {
    /**
    * The input value isn't included in the list.
    */
    INCLUSION,

    /**
    * The input value is invalid.
    */
    INVALID,

    /**
    * The metafield type is invalid.
    */
    INVALID_TYPE,

    /**
    * The value is invalid for the metafield type or for the definition options.
    */
    INVALID_VALUE,

    /**
    * The input value is too long.
    */
    TOO_LONG,

    UNKNOWN_VALUE;

    public static BlogCreateUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "INCLUSION": {
                return INCLUSION;
            }

            case "INVALID": {
                return INVALID;
            }

            case "INVALID_TYPE": {
                return INVALID_TYPE;
            }

            case "INVALID_VALUE": {
                return INVALID_VALUE;
            }

            case "TOO_LONG": {
                return TOO_LONG;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case INCLUSION: {
                return "INCLUSION";
            }

            case INVALID: {
                return "INVALID";
            }

            case INVALID_TYPE: {
                return "INVALID_TYPE";
            }

            case INVALID_VALUE: {
                return "INVALID_VALUE";
            }

            case TOO_LONG: {
                return "TOO_LONG";
            }

            default: {
                return "";
            }
        }
    }
}

