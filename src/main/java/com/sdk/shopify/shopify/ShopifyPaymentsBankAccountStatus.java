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
* The bank account status.
*/
public enum ShopifyPaymentsBankAccountStatus {
    /**
    * A payout to the bank account failed.
    */
    ERRORED,

    /**
    * A bank account that hasn't had any activity and that's not validated.
    */
    NEW,

    /**
    * It was determined that the bank account exists.
    */
    VALIDATED,

    /**
    * Bank account validation was successful.
    */
    VERIFIED,

    UNKNOWN_VALUE;

    public static ShopifyPaymentsBankAccountStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ERRORED": {
                return ERRORED;
            }

            case "NEW": {
                return NEW;
            }

            case "VALIDATED": {
                return VALIDATED;
            }

            case "VERIFIED": {
                return VERIFIED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ERRORED: {
                return "ERRORED";
            }

            case NEW: {
                return "NEW";
            }

            case VALIDATED: {
                return "VALIDATED";
            }

            case VERIFIED: {
                return "VERIFIED";
            }

            default: {
                return "";
            }
        }
    }
}

