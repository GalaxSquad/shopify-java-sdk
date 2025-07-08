// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `MetafieldDefinitionUnpinUserError`.
*/
public enum MetafieldDefinitionUnpinUserErrorCode {
    /**
    * Definition is managed by app configuration and cannot be modified through the API.
    */
    APP_CONFIG_MANAGED,

    /**
    * Owner type can't be used in this mutation.
    */
    DISALLOWED_OWNER_TYPE,

    /**
    * An internal error occurred.
    */
    INTERNAL_ERROR,

    /**
    * The metafield definition was not found.
    */
    NOT_FOUND,

    /**
    * The metafield definition isn't pinned.
    */
    NOT_PINNED,

    UNKNOWN_VALUE;

    public static MetafieldDefinitionUnpinUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "APP_CONFIG_MANAGED": {
                return APP_CONFIG_MANAGED;
            }

            case "DISALLOWED_OWNER_TYPE": {
                return DISALLOWED_OWNER_TYPE;
            }

            case "INTERNAL_ERROR": {
                return INTERNAL_ERROR;
            }

            case "NOT_FOUND": {
                return NOT_FOUND;
            }

            case "NOT_PINNED": {
                return NOT_PINNED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case APP_CONFIG_MANAGED: {
                return "APP_CONFIG_MANAGED";
            }

            case DISALLOWED_OWNER_TYPE: {
                return "DISALLOWED_OWNER_TYPE";
            }

            case INTERNAL_ERROR: {
                return "INTERNAL_ERROR";
            }

            case NOT_FOUND: {
                return "NOT_FOUND";
            }

            case NOT_PINNED: {
                return "NOT_PINNED";
            }

            default: {
                return "";
            }
        }
    }
}

