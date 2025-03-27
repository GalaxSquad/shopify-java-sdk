// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* Possible error codes that can be returned by `OrderEditRemoveDiscountUserError`.
*/
public enum OrderEditRemoveDiscountUserErrorCode {
    /**
    * The input value is invalid.
    */
    INVALID,

    UNKNOWN_VALUE;

    public static OrderEditRemoveDiscountUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "INVALID": {
                return INVALID;
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

            default: {
                return "";
            }
        }
    }
}

