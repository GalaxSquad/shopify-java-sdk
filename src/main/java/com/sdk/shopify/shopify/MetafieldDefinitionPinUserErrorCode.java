// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `MetafieldDefinitionPinUserError`.
*/
public enum MetafieldDefinitionPinUserErrorCode {
    /**
    * The metafield definition is already pinned.
    */
    ALREADY_PINNED,

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
    * The pinned limit has been reached for owner type.
    */
    PINNED_LIMIT_REACHED,

    /**
    * The metafield definition does not support pinning.
    */
    UNSUPPORTED_PINNING,

    UNKNOWN_VALUE;

    public static MetafieldDefinitionPinUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ALREADY_PINNED": {
                return ALREADY_PINNED;
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

            case "PINNED_LIMIT_REACHED": {
                return PINNED_LIMIT_REACHED;
            }

            case "UNSUPPORTED_PINNING": {
                return UNSUPPORTED_PINNING;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ALREADY_PINNED: {
                return "ALREADY_PINNED";
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

            case PINNED_LIMIT_REACHED: {
                return "PINNED_LIMIT_REACHED";
            }

            case UNSUPPORTED_PINNING: {
                return "UNSUPPORTED_PINNING";
            }

            default: {
                return "";
            }
        }
    }
}

