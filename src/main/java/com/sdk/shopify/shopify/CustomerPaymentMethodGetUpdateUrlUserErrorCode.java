// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* Possible error codes that can be returned by `CustomerPaymentMethodGetUpdateUrlUserError`.
*/
public enum CustomerPaymentMethodGetUpdateUrlUserErrorCode {
    /**
    * Customer doesn't exist.
    */
    CUSTOMER_DOES_NOT_EXIST,

    /**
    * Invalid payment instrument.
    */
    INVALID_INSTRUMENT,

    /**
    * Payment method doesn't exist.
    */
    PAYMENT_METHOD_DOES_NOT_EXIST,

    /**
    * Too many requests.
    */
    TOO_MANY_REQUESTS,

    UNKNOWN_VALUE;

    public static CustomerPaymentMethodGetUpdateUrlUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CUSTOMER_DOES_NOT_EXIST": {
                return CUSTOMER_DOES_NOT_EXIST;
            }

            case "INVALID_INSTRUMENT": {
                return INVALID_INSTRUMENT;
            }

            case "PAYMENT_METHOD_DOES_NOT_EXIST": {
                return PAYMENT_METHOD_DOES_NOT_EXIST;
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

            case INVALID_INSTRUMENT: {
                return "INVALID_INSTRUMENT";
            }

            case PAYMENT_METHOD_DOES_NOT_EXIST: {
                return "PAYMENT_METHOD_DOES_NOT_EXIST";
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

