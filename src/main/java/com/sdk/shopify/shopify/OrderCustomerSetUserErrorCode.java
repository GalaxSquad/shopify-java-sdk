// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `OrderCustomerSetUserError`.
*/
public enum OrderCustomerSetUserErrorCode {
    /**
    * The input value is invalid.
    */
    INVALID,

    /**
    * The record with the ID used as the input value couldn't be found.
    */
    NOT_FOUND,

    /**
    * The customer does not have the permissions to place this order.
    */
    NOT_PERMITTED,

    /**
    * An error ocurred while saving the order.
    */
    NOT_SAVED,

    UNKNOWN_VALUE;

    public static OrderCustomerSetUserErrorCode fromGraphQl(String value) {
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

            case "NOT_PERMITTED": {
                return NOT_PERMITTED;
            }

            case "NOT_SAVED": {
                return NOT_SAVED;
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

            case NOT_PERMITTED: {
                return "NOT_PERMITTED";
            }

            case NOT_SAVED: {
                return "NOT_SAVED";
            }

            default: {
                return "";
            }
        }
    }
}

