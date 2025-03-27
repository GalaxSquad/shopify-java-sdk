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
* Possible error codes that can be returned by `BlogUpdateUserError`.
*/
public enum BlogUpdateUserErrorCode {
    /**
    * The input value is blank.
    */
    BLANK,

    /**
    * The input value isn't included in the list.
    */
    INCLUSION,

    /**
    * The input value is invalid.
    */
    INVALID,

    /**
    * The record with the ID used as the input value couldn't be found.
    */
    NOT_FOUND,

    /**
    * The input value is too long.
    */
    TOO_LONG,

    UNKNOWN_VALUE;

    public static BlogUpdateUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "BLANK": {
                return BLANK;
            }

            case "INCLUSION": {
                return INCLUSION;
            }

            case "INVALID": {
                return INVALID;
            }

            case "NOT_FOUND": {
                return NOT_FOUND;
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
            case BLANK: {
                return "BLANK";
            }

            case INCLUSION: {
                return "INCLUSION";
            }

            case INVALID: {
                return "INVALID";
            }

            case NOT_FOUND: {
                return "NOT_FOUND";
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

