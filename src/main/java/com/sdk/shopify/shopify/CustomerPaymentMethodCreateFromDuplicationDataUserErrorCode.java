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
* Possible error codes that can be returned by
* `CustomerPaymentMethodCreateFromDuplicationDataUserError`.
*/
public enum CustomerPaymentMethodCreateFromDuplicationDataUserErrorCode {
    /**
    * Customer doesn't exist.
    */
    CUSTOMER_DOES_NOT_EXIST,

    /**
    * Invalid encrypted duplication data.
    */
    INVALID_ENCRYPTED_DUPLICATION_DATA,

    /**
    * Too many requests.
    */
    TOO_MANY_REQUESTS,

    UNKNOWN_VALUE;

    public static CustomerPaymentMethodCreateFromDuplicationDataUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CUSTOMER_DOES_NOT_EXIST": {
                return CUSTOMER_DOES_NOT_EXIST;
            }

            case "INVALID_ENCRYPTED_DUPLICATION_DATA": {
                return INVALID_ENCRYPTED_DUPLICATION_DATA;
            }

            case "TOO_MANY_REQUESTS": {
                return TOO_MANY_REQUESTS;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CUSTOMER_DOES_NOT_EXIST: {
                return "CUSTOMER_DOES_NOT_EXIST";
            }

            case INVALID_ENCRYPTED_DUPLICATION_DATA: {
                return "INVALID_ENCRYPTED_DUPLICATION_DATA";
            }

            case TOO_MANY_REQUESTS: {
                return "TOO_MANY_REQUESTS";
            }

            default: {
                return "";
            }
        }
    }
}

