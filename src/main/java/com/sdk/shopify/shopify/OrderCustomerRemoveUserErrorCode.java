// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `OrderCustomerRemoveUserError`.
*/
public enum OrderCustomerRemoveUserErrorCode {
    /**
    * The input value is invalid.
    */
    INVALID,

    /**
    * The record with the ID used as the input value couldn't be found.
    */
    NOT_FOUND,

    /**
    * An error ocurred while saving the order.
    */
    NOT_SAVED,

    UNKNOWN_VALUE;

    public static OrderCustomerRemoveUserErrorCode fromGraphQl(String value) {
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

            case NOT_SAVED: {
                return "NOT_SAVED";
            }

            default: {
                return "";
            }
        }
    }
}

