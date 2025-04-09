// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* Possible error codes that can be returned by
* `CustomerPaymentMethodCreateFromDuplicationDataUserError`.
*/
public enum CustomerPaymentMethodCreateFromDuplicationDataUserErrorCode {
    /**
    * Customer doesn't exist.
    */
    CUSTOMER_DOES_NOT_EXIST,

    /**
    * Invalid encrypted duplication data.
    */
    INVALID_ENCRYPTED_DUPLICATION_DATA,

    /**
    * Too many requests.
    */
    TOO_MANY_REQUESTS,

    UNKNOWN_VALUE;

    public static CustomerPaymentMethodCreateFromDuplicationDataUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CUSTOMER_DOES_NOT_EXIST": {
                return CUSTOMER_DOES_NOT_EXIST;
            }

            case "INVALID_ENCRYPTED_DUPLICATION_DATA": {
                return INVALID_ENCRYPTED_DUPLICATION_DATA;
            }

            case "TOO_MANY_REQUESTS": {
                return TOO_MANY_REQUESTS;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CUSTOMER_DOES_NOT_EXIST: {
                return "CUSTOMER_DOES_NOT_EXIST";
            }

            case INVALID_ENCRYPTED_DUPLICATION_DATA: {
                return "INVALID_ENCRYPTED_DUPLICATION_DATA";
            }

            case TOO_MANY_REQUESTS: {
                return "TOO_MANY_REQUESTS";
            }

            default: {
                return "";
            }
        }
    }
}

