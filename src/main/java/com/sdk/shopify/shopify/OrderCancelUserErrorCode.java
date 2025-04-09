// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* Possible error codes that can be returned by `OrderCancelUserError`.
*/
public enum OrderCancelUserErrorCode {
    /**
    * The input value is invalid.
    */
    INVALID,

    /**
    * The record with the ID used as the input value couldn't be found.
    */
    NOT_FOUND,

    /**
    * An order refund was requested but the user does not have the refund_orders permission.
    */
    NO_REFUND_PERMISSION,

    UNKNOWN_VALUE;

    public static OrderCancelUserErrorCode fromGraphQl(String value) {
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

            case "NO_REFUND_PERMISSION": {
                return NO_REFUND_PERMISSION;
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

            case NO_REFUND_PERMISSION: {
                return "NO_REFUND_PERMISSION";
            }

            default: {
                return "";
            }
        }
    }
}

