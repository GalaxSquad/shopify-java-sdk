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
* Possible error codes that can be returned by `CustomerMergeUserError`.
*/
public enum CustomerMergeErrorCode {
    /**
    * The customer cannot be merged because it has associated gift cards.
    */
    CUSTOMER_HAS_GIFT_CARDS,

    /**
    * An internal error occurred.
    */
    INTERNAL_ERROR,

    /**
    * The customer cannot be merged.
    */
    INVALID_CUSTOMER,

    /**
    * The customer ID is invalid.
    */
    INVALID_CUSTOMER_ID,

    /**
    * The customer is missing the attribute requested for override.
    */
    MISSING_OVERRIDE_ATTRIBUTE,

    /**
    * The override attribute is invalid.
    */
    OVERRIDE_ATTRIBUTE_INVALID,

    UNKNOWN_VALUE;

    public static CustomerMergeErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CUSTOMER_HAS_GIFT_CARDS": {
                return CUSTOMER_HAS_GIFT_CARDS;
            }

            case "INTERNAL_ERROR": {
                return INTERNAL_ERROR;
            }

            case "INVALID_CUSTOMER": {
                return INVALID_CUSTOMER;
            }

            case "INVALID_CUSTOMER_ID": {
                return INVALID_CUSTOMER_ID;
            }

            case "MISSING_OVERRIDE_ATTRIBUTE": {
                return MISSING_OVERRIDE_ATTRIBUTE;
            }

            case "OVERRIDE_ATTRIBUTE_INVALID": {
                return OVERRIDE_ATTRIBUTE_INVALID;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CUSTOMER_HAS_GIFT_CARDS: {
                return "CUSTOMER_HAS_GIFT_CARDS";
            }

            case INTERNAL_ERROR: {
                return "INTERNAL_ERROR";
            }

            case INVALID_CUSTOMER: {
                return "INVALID_CUSTOMER";
            }

            case INVALID_CUSTOMER_ID: {
                return "INVALID_CUSTOMER_ID";
            }

            case MISSING_OVERRIDE_ATTRIBUTE: {
                return "MISSING_OVERRIDE_ATTRIBUTE";
            }

            case OVERRIDE_ATTRIBUTE_INVALID: {
                return "OVERRIDE_ATTRIBUTE_INVALID";
            }

            default: {
                return "";
            }
        }
    }
}

