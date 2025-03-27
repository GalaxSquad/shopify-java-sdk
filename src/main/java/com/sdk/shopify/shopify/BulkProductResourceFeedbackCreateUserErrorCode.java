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
* Possible error codes that can be returned by `BulkProductResourceFeedbackCreateUserError`.
*/
public enum BulkProductResourceFeedbackCreateUserErrorCode {
    /**
    * The input value is blank.
    */
    BLANK,

    /**
    * The input value is invalid.
    */
    INVALID,

    /**
    * The input value should be less than or equal to the maximum value allowed.
    */
    LESS_THAN_OR_EQUAL_TO,

    /**
    * The operation was attempted on too many feedback objects. The maximum number of feedback objects
    * that you can operate on is 50.
    */
    MAXIMUM_FEEDBACK_LIMIT_EXCEEDED,

    /**
    * The feedback for a later version of this resource was already accepted.
    */
    OUTDATED_FEEDBACK,

    /**
    * The input value needs to be blank.
    */
    PRESENT,

    /**
    * The product wasn't found or isn't available to the channel.
    */
    PRODUCT_NOT_FOUND,

    UNKNOWN_VALUE;

    public static BulkProductResourceFeedbackCreateUserErrorCode fromGraphQl(String value) {
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

            case "LESS_THAN_OR_EQUAL_TO": {
                return LESS_THAN_OR_EQUAL_TO;
            }

            case "MAXIMUM_FEEDBACK_LIMIT_EXCEEDED": {
                return MAXIMUM_FEEDBACK_LIMIT_EXCEEDED;
            }

            case "OUTDATED_FEEDBACK": {
                return OUTDATED_FEEDBACK;
            }

            case "PRESENT": {
                return PRESENT;
            }

            case "PRODUCT_NOT_FOUND": {
                return PRODUCT_NOT_FOUND;
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

            case LESS_THAN_OR_EQUAL_TO: {
                return "LESS_THAN_OR_EQUAL_TO";
            }

            case MAXIMUM_FEEDBACK_LIMIT_EXCEEDED: {
                return "MAXIMUM_FEEDBACK_LIMIT_EXCEEDED";
            }

            case OUTDATED_FEEDBACK: {
                return "OUTDATED_FEEDBACK";
            }

            case PRESENT: {
                return "PRESENT";
            }

            case PRODUCT_NOT_FOUND: {
                return "PRODUCT_NOT_FOUND";
            }

            default: {
                return "";
            }
        }
    }
}

