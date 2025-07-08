// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `CheckoutBrandingUpsertUserError`.
*/
public enum CheckoutBrandingUpsertUserErrorCode {
    /**
    * Unexpected internal error happened.
    */
    INTERNAL_ERROR,

    UNKNOWN_VALUE;

    public static CheckoutBrandingUpsertUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "INTERNAL_ERROR": {
                return INTERNAL_ERROR;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case INTERNAL_ERROR: {
                return "INTERNAL_ERROR";
            }

            default: {
                return "";
            }
        }
    }
}

