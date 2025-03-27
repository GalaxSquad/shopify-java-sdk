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
* The container border style.
*/
public enum CheckoutBrandingBorderStyle {
    /**
    * The Base border style.
    */
    BASE,

    /**
    * The Dashed border style.
    */
    DASHED,

    /**
    * The Dotted border style.
    */
    DOTTED,

    UNKNOWN_VALUE;

    public static CheckoutBrandingBorderStyle fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "BASE": {
                return BASE;
            }

            case "DASHED": {
                return DASHED;
            }

            case "DOTTED": {
                return DOTTED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case BASE: {
                return "BASE";
            }

            case DASHED: {
                return "DASHED";
            }

            case DOTTED: {
                return "DOTTED";
            }

            default: {
                return "";
            }
        }
    }
}

