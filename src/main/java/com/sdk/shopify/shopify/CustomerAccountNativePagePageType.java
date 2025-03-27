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
* The type of customer account native page.
*/
public enum CustomerAccountNativePagePageType {
    /**
    * An orders page type.
    */
    NATIVE_ORDERS,

    /**
    * A profile page type.
    */
    NATIVE_PROFILE,

    /**
    * A settings page type.
    */
    NATIVE_SETTINGS,

    /**
    * An unknown page type. Represents new page types that may be added in future versions.
    */
    UNKNOWN,

    UNKNOWN_VALUE;

    public static CustomerAccountNativePagePageType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "NATIVE_ORDERS": {
                return NATIVE_ORDERS;
            }

            case "NATIVE_PROFILE": {
                return NATIVE_PROFILE;
            }

            case "NATIVE_SETTINGS": {
                return NATIVE_SETTINGS;
            }

            case "UNKNOWN": {
                return UNKNOWN;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case NATIVE_ORDERS: {
                return "NATIVE_ORDERS";
            }

            case NATIVE_PROFILE: {
                return "NATIVE_PROFILE";
            }

            case NATIVE_SETTINGS: {
                return "NATIVE_SETTINGS";
            }

            case UNKNOWN: {
                return "UNKNOWN";
            }

            default: {
                return "";
            }
        }
    }
}

