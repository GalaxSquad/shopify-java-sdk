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
* State of the tax app configuration.
*/
public enum TaxPartnerState {
    /**
    * App is configured and to be used for tax calculations.
    */
    ACTIVE,

    /**
    * App is not configured.
    */
    PENDING,

    /**
    * App is configured, but not used for tax calculations.
    */
    READY,

    UNKNOWN_VALUE;

    public static TaxPartnerState fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ACTIVE": {
                return ACTIVE;
            }

            case "PENDING": {
                return PENDING;
            }

            case "READY": {
                return READY;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ACTIVE: {
                return "ACTIVE";
            }

            case PENDING: {
                return "PENDING";
            }

            case READY: {
                return "READY";
            }

            default: {
                return "";
            }
        }
    }
}

