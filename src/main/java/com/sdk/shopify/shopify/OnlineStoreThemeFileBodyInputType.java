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
* The input type for a theme file body.
*/
public enum OnlineStoreThemeFileBodyInputType {
    /**
    * The base64 encoded body of a theme file.
    */
    BASE64,

    /**
    * The text body of the theme file.
    */
    TEXT,

    /**
    * The url of the body of a theme file.
    */
    URL,

    UNKNOWN_VALUE;

    public static OnlineStoreThemeFileBodyInputType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "BASE64": {
                return BASE64;
            }

            case "TEXT": {
                return TEXT;
            }

            case "URL": {
                return URL;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case BASE64: {
                return "BASE64";
            }

            case TEXT: {
                return "TEXT";
            }

            case URL: {
                return "URL";
            }

            default: {
                return "";
            }
        }
    }
}

