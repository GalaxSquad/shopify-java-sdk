// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* Possible error codes that can be returned by `PaymentTermsCreateUserError`.
*/
public enum PaymentTermsCreateUserErrorCode {
    /**
    * An error occurred while creating payment terms.
    */
    PAYMENT_TERMS_CREATION_UNSUCCESSFUL,

    UNKNOWN_VALUE;

    public static PaymentTermsCreateUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "PAYMENT_TERMS_CREATION_UNSUCCESSFUL": {
                return PAYMENT_TERMS_CREATION_UNSUCCESSFUL;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case PAYMENT_TERMS_CREATION_UNSUCCESSFUL: {
                return "PAYMENT_TERMS_CREATION_UNSUCCESSFUL";
            }

            default: {
                return "";
            }
        }
    }
}

