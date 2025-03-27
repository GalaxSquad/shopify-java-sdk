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
* Possible error codes that can be returned by `ErrorsWebPixelUserError`.
*/
public enum ErrorsWebPixelUserErrorCode {
    /**
    * The input value is blank.
    */
    BLANK,

    /**
    * The provided settings does not match the expected settings definition on the app.
    */
    INVALID_SETTINGS,

    /**
    * The record with the ID used as the input value couldn't be found.
    */
    NOT_FOUND,

    /**
    * The input value is already taken.
    */
    TAKEN,

    UNKNOWN_VALUE;

    public static ErrorsWebPixelUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "BLANK": {
                return BLANK;
            }

            case "INVALID_SETTINGS": {
                return INVALID_SETTINGS;
            }

            case "NOT_FOUND": {
                return NOT_FOUND;
            }

            case "TAKEN": {
                return TAKEN;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case BLANK: {
                return "BLANK";
            }

            case INVALID_SETTINGS: {
                return "INVALID_SETTINGS";
            }

            case NOT_FOUND: {
                return "NOT_FOUND";
            }

            case TAKEN: {
                return "TAKEN";
            }

            default: {
                return "";
            }
        }
    }
}

