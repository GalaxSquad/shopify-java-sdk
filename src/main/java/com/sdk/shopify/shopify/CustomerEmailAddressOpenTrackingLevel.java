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
* The different levels related to whether a customer has opted in to having their opened emails
* tracked.
*/
public enum CustomerEmailAddressOpenTrackingLevel {
    /**
    * The customer has opted in to having their open emails tracked.
    */
    OPTED_IN,

    /**
    * The customer has opted out of having their open emails tracked.
    */
    OPTED_OUT,

    /**
    * The customer has not specified whether they want to opt in or out of having their open emails
    * tracked.
    */
    UNKNOWN,

    UNKNOWN_VALUE;

    public static CustomerEmailAddressOpenTrackingLevel fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "OPTED_IN": {
                return OPTED_IN;
            }

            case "OPTED_OUT": {
                return OPTED_OUT;
            }

            case "UNKNOWN": {
                return UNKNOWN;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case OPTED_IN: {
                return "OPTED_IN";
            }

            case OPTED_OUT: {
                return "OPTED_OUT";
            }

            case UNKNOWN: {
                return "UNKNOWN";
            }

            default: {
                return "";
            }
        }
    }
}

