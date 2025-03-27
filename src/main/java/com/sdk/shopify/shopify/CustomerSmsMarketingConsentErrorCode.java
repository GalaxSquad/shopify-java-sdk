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
* Possible error codes that can be returned by `CustomerSmsMarketingConsentError`.
*/
public enum CustomerSmsMarketingConsentErrorCode {
    /**
    * The input value isn't included in the list.
    */
    INCLUSION,

    /**
    * Unexpected internal error happened.
    */
    INTERNAL_ERROR,

    /**
    * The input value is invalid.
    */
    INVALID,

    /**
    * Missing a required argument.
    */
    MISSING_ARGUMENT,

    UNKNOWN_VALUE;

    public static CustomerSmsMarketingConsentErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "INCLUSION": {
                return INCLUSION;
            }

            case "INTERNAL_ERROR": {
                return INTERNAL_ERROR;
            }

            case "INVALID": {
                return INVALID;
            }

            case "MISSING_ARGUMENT": {
                return MISSING_ARGUMENT;
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

            case INTERNAL_ERROR: {
                return "INTERNAL_ERROR";
            }

            case INVALID: {
                return "INVALID";
            }

            case MISSING_ARGUMENT: {
                return "MISSING_ARGUMENT";
            }

            default: {
                return "";
            }
        }
    }
}

