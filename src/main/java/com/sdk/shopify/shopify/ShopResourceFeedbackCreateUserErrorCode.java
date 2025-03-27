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
* Possible error codes that can be returned by `ShopResourceFeedbackCreateUserError`.
*/
public enum ShopResourceFeedbackCreateUserErrorCode {
    /**
    * The input value is blank.
    */
    BLANK,

    /**
    * The input value is invalid.
    */
    INVALID,

    /**
    * The feedback for a later version of the resource was already accepted.
    */
    OUTDATED_FEEDBACK,

    /**
    * The input value needs to be blank.
    */
    PRESENT,

    UNKNOWN_VALUE;

    public static ShopResourceFeedbackCreateUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "BLANK": {
                return BLANK;
            }

            case "INVALID": {
                return INVALID;
            }

            case "OUTDATED_FEEDBACK": {
                return OUTDATED_FEEDBACK;
            }

            case "PRESENT": {
                return PRESENT;
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

            case INVALID: {
                return "INVALID";
            }

            case OUTDATED_FEEDBACK: {
                return "OUTDATED_FEEDBACK";
            }

            case PRESENT: {
                return "PRESENT";
            }

            default: {
                return "";
            }
        }
    }
}

