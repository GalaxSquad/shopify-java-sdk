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
* Possible error codes that can be returned by `PageCreateUserError`.
*/
public enum PageCreateUserErrorCode {
    /**
    * The input value is blank.
    */
    BLANK,

    /**
    * Can’t set isPublished to true and also set a future publish date.
    */
    INVALID_PUBLISH_DATE,

    /**
    * The metafield type is invalid.
    */
    INVALID_TYPE,

    /**
    * The value is invalid for the metafield type or for the definition options.
    */
    INVALID_VALUE,

    /**
    * The input value is already taken.
    */
    TAKEN,

    /**
    * The input value is too long.
    */
    TOO_LONG,

    UNKNOWN_VALUE;

    public static PageCreateUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "BLANK": {
                return BLANK;
            }

            case "INVALID_PUBLISH_DATE": {
                return INVALID_PUBLISH_DATE;
            }

            case "INVALID_TYPE": {
                return INVALID_TYPE;
            }

            case "INVALID_VALUE": {
                return INVALID_VALUE;
            }

            case "TAKEN": {
                return TAKEN;
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

            case INVALID_PUBLISH_DATE: {
                return "INVALID_PUBLISH_DATE";
            }

            case INVALID_TYPE: {
                return "INVALID_TYPE";
            }

            case INVALID_VALUE: {
                return "INVALID_VALUE";
            }

            case TAKEN: {
                return "TAKEN";
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

