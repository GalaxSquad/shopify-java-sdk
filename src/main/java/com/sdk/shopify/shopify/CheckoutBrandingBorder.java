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
* Possible values for the border.
*/
public enum CheckoutBrandingBorder {
    /**
    * The Block End border.
    */
    BLOCK_END,

    /**
    * The Full border.
    */
    FULL,

    /**
    * The None border.
    */
    NONE,

    UNKNOWN_VALUE;

    public static CheckoutBrandingBorder fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "BLOCK_END": {
                return BLOCK_END;
            }

            case "FULL": {
                return FULL;
            }

            case "NONE": {
                return NONE;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case BLOCK_END: {
                return "BLOCK_END";
            }

            case FULL: {
                return "FULL";
            }

            case NONE: {
                return "NONE";
            }

            default: {
                return "";
            }
        }
    }
}

