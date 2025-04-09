// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* Possible error codes that can be returned by `PaymentTermsDeleteUserError`.
*/
public enum PaymentTermsDeleteUserErrorCode {
    /**
    * An error occurred while deleting payment terms.
    */
    PAYMENT_TERMS_DELETE_UNSUCCESSFUL,

    UNKNOWN_VALUE;

    public static PaymentTermsDeleteUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "PAYMENT_TERMS_DELETE_UNSUCCESSFUL": {
                return PAYMENT_TERMS_DELETE_UNSUCCESSFUL;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case PAYMENT_TERMS_DELETE_UNSUCCESSFUL: {
                return "PAYMENT_TERMS_DELETE_UNSUCCESSFUL";
            }

            default: {
                return "";
            }
        }
    }
}

