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
* Possible marketing states for the customer’s email address.
*/
public enum CustomerEmailAddressMarketingState {
    /**
    * The customer’s email address marketing state is invalid.
    */
    INVALID,

    /**
    * The customer is not subscribed to email marketing.
    */
    NOT_SUBSCRIBED,

    /**
    * The customer is in the process of subscribing to email marketing.
    */
    PENDING,

    /**
    * The customer is subscribed to email marketing.
    */
    SUBSCRIBED,

    /**
    * The customer is not subscribed to email marketing but was previously subscribed.
    */
    UNSUBSCRIBED,

    UNKNOWN_VALUE;

    public static CustomerEmailAddressMarketingState fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "INVALID": {
                return INVALID;
            }

            case "NOT_SUBSCRIBED": {
                return NOT_SUBSCRIBED;
            }

            case "PENDING": {
                return PENDING;
            }

            case "SUBSCRIBED": {
                return SUBSCRIBED;
            }

            case "UNSUBSCRIBED": {
                return UNSUBSCRIBED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case INVALID: {
                return "INVALID";
            }

            case NOT_SUBSCRIBED: {
                return "NOT_SUBSCRIBED";
            }

            case PENDING: {
                return "PENDING";
            }

            case SUBSCRIBED: {
                return "SUBSCRIBED";
            }

            case UNSUBSCRIBED: {
                return "UNSUBSCRIBED";
            }

            default: {
                return "";
            }
        }
    }
}

