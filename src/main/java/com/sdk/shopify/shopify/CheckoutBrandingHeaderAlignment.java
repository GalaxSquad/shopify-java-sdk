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
* The possible header alignments.
*/
public enum CheckoutBrandingHeaderAlignment {
    /**
    * Center alignment.
    */
    CENTER,

    /**
    * End alignment.
    */
    END,

    /**
    * Start alignment.
    */
    START,

    UNKNOWN_VALUE;

    public static CheckoutBrandingHeaderAlignment fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CENTER": {
                return CENTER;
            }

            case "END": {
                return END;
            }

            case "START": {
                return START;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CENTER: {
                return "CENTER";
            }

            case END: {
                return "END";
            }

            case START: {
                return "START";
            }

            default: {
                return "";
            }
        }
    }
}

