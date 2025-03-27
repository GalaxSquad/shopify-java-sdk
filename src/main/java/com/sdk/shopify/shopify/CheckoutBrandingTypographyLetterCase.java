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
* Possible values for the typography letter case.
*/
public enum CheckoutBrandingTypographyLetterCase {
    /**
    * All letters are is lower case.
    */
    LOWER,

    /**
    * No letter casing applied.
    */
    NONE,

    /**
    * Capitalize the first letter of each word.
    */
    TITLE,

    /**
    * All letters are uppercase.
    */
    UPPER,

    UNKNOWN_VALUE;

    public static CheckoutBrandingTypographyLetterCase fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "LOWER": {
                return LOWER;
            }

            case "NONE": {
                return NONE;
            }

            case "TITLE": {
                return TITLE;
            }

            case "UPPER": {
                return UPPER;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case LOWER: {
                return "LOWER";
            }

            case NONE: {
                return "NONE";
            }

            case TITLE: {
                return "TITLE";
            }

            case UPPER: {
                return "UPPER";
            }

            default: {
                return "";
            }
        }
    }
}

