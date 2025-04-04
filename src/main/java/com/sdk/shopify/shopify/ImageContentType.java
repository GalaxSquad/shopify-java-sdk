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
* List of supported image content types.
*/
public enum ImageContentType {
    /**
    * A JPG image.
    */
    JPG,

    /**
    * A PNG image.
    */
    PNG,

    /**
    * A WEBP image.
    */
    WEBP,

    UNKNOWN_VALUE;

    public static ImageContentType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "JPG": {
                return JPG;
            }

            case "PNG": {
                return PNG;
            }

            case "WEBP": {
                return WEBP;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case JPG: {
                return "JPG";
            }

            case PNG: {
                return "PNG";
            }

            case WEBP: {
                return "WEBP";
            }

            default: {
                return "";
            }
        }
    }
}

