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
* The font loading strategy determines how a font face is displayed after it is loaded or failed to
* load.
* For more information: https://developer.mozilla.org/en-US/docs/Web/CSS/@font-face/font-display.
*/
public enum CheckoutBrandingFontLoadingStrategy {
    /**
    * The font display strategy is defined by the browser user agent.
    */
    AUTO,

    /**
    * Gives the font face a short block period and an infinite swap period.
    */
    BLOCK,

    /**
    * Gives the font face an extremely small block period and a short swap period.
    */
    FALLBACK,

    /**
    * Gives the font face an extremely small block period and no swap period.
    */
    OPTIONAL,

    /**
    * Gives the font face an extremely small block period and an infinite swap period.
    */
    SWAP,

    UNKNOWN_VALUE;

    public static CheckoutBrandingFontLoadingStrategy fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "AUTO": {
                return AUTO;
            }

            case "BLOCK": {
                return BLOCK;
            }

            case "FALLBACK": {
                return FALLBACK;
            }

            case "OPTIONAL": {
                return OPTIONAL;
            }

            case "SWAP": {
                return SWAP;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case AUTO: {
                return "AUTO";
            }

            case BLOCK: {
                return "BLOCK";
            }

            case FALLBACK: {
                return "FALLBACK";
            }

            case OPTIONAL: {
                return "OPTIONAL";
            }

            case SWAP: {
                return "SWAP";
            }

            default: {
                return "";
            }
        }
    }
}

