// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `OrderDeleteUserError`.
*/
public enum OrderDeleteUserErrorCode {
    /**
    * The input value is invalid.
    */
    INVALID,

    /**
    * The record with the ID used as the input value couldn't be found.
    */
    NOT_FOUND,

    UNKNOWN_VALUE;

    public static OrderDeleteUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "INVALID": {
                return INVALID;
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
            case INVALID: {
                return "INVALID";
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

