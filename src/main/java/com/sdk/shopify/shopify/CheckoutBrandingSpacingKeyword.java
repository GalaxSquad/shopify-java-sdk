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
* The spacing between UI elements.
*/
public enum CheckoutBrandingSpacingKeyword {
    /**
    * The Base spacing.
    */
    BASE,

    /**
    * The Large spacing.
    */
    LARGE,

    /**
    * The Large 100 spacing.
    */
    LARGE_100,

    /**
    * The Large 200 spacing.
    */
    LARGE_200,

    /**
    * The Large 300 spacing.
    */
    LARGE_300,

    /**
    * The Large 400 spacing.
    */
    LARGE_400,

    /**
    * The Large 500 spacing.
    */
    LARGE_500,

    /**
    * The None spacing.
    */
    NONE,

    /**
    * The Small spacing.
    */
    SMALL,

    /**
    * The Small 100 spacing.
    */
    SMALL_100,

    /**
    * The Small 200 spacing.
    */
    SMALL_200,

    /**
    * The Small 300 spacing.
    */
    SMALL_300,

    /**
    * The Small 400 spacing.
    */
    SMALL_400,

    /**
    * The Small 500 spacing.
    */
    SMALL_500,

    UNKNOWN_VALUE;

    public static CheckoutBrandingSpacingKeyword fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "BASE": {
                return BASE;
            }

            case "LARGE": {
                return LARGE;
            }

            case "LARGE_100": {
                return LARGE_100;
            }

            case "LARGE_200": {
                return LARGE_200;
            }

            case "LARGE_300": {
                return LARGE_300;
            }

            case "LARGE_400": {
                return LARGE_400;
            }

            case "LARGE_500": {
                return LARGE_500;
            }

            case "NONE": {
                return NONE;
            }

            case "SMALL": {
                return SMALL;
            }

            case "SMALL_100": {
                return SMALL_100;
            }

            case "SMALL_200": {
                return SMALL_200;
            }

            case "SMALL_300": {
                return SMALL_300;
            }

            case "SMALL_400": {
                return SMALL_400;
            }

            case "SMALL_500": {
                return SMALL_500;
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

            case LARGE: {
                return "LARGE";
            }

            case LARGE_100: {
                return "LARGE_100";
            }

            case LARGE_200: {
                return "LARGE_200";
            }

            case LARGE_300: {
                return "LARGE_300";
            }

            case LARGE_400: {
                return "LARGE_400";
            }

            case LARGE_500: {
                return "LARGE_500";
            }

            case NONE: {
                return "NONE";
            }

            case SMALL: {
                return "SMALL";
            }

            case SMALL_100: {
                return "SMALL_100";
            }

            case SMALL_200: {
                return "SMALL_200";
            }

            case SMALL_300: {
                return "SMALL_300";
            }

            case SMALL_400: {
                return "SMALL_400";
            }

            case SMALL_500: {
                return "SMALL_500";
            }

            default: {
                return "";
            }
        }
    }
}

