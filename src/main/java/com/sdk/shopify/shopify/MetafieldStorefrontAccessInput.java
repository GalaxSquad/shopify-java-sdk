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
* Metafield access permissions for the Storefront API.
*/
public enum MetafieldStorefrontAccessInput {
    /**
    * No access.
    */
    NONE,

    /**
    * Read-only access.
    */
    PUBLIC_READ,

    UNKNOWN_VALUE;

    public static MetafieldStorefrontAccessInput fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "NONE": {
                return NONE;
            }

            case "PUBLIC_READ": {
                return PUBLIC_READ;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case NONE: {
                return "NONE";
            }

            case PUBLIC_READ: {
                return "PUBLIC_READ";
            }

            default: {
                return "";
            }
        }
    }
}

