// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* Possible error codes that can be returned by `MenuUpdateUserError`.
*/
public enum MenuUpdateUserErrorCode {
    /**
    * The menu cannot be nested more than 3 level deep.
    */
    NESTING_TOO_DEEP,

    /**
    * The record with the ID used as the input value couldn't be found.
    */
    NOT_FOUND,

    UNKNOWN_VALUE;

    public static MenuUpdateUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "NESTING_TOO_DEEP": {
                return NESTING_TOO_DEEP;
            }

            case "NOT_FOUND": {
                return NOT_FOUND;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case NESTING_TOO_DEEP: {
                return "NESTING_TOO_DEEP";
            }

            case NOT_FOUND: {
                return "NOT_FOUND";
            }

            default: {
                return "";
            }
        }
    }
}

