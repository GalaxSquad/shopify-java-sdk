// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `CustomerPaymentMethodGetDuplicationDataUserError`.
*/
public enum CustomerPaymentMethodGetDuplicationDataUserErrorCode {
    /**
    * Customer doesn't exist.
    */
    CUSTOMER_DOES_NOT_EXIST,

    /**
    * Invalid payment instrument.
    */
    INVALID_INSTRUMENT,

    /**
    * Must be targeted to another shop in the same organization.
    */
    INVALID_ORGANIZATION_SHOP,

    /**
    * Payment method doesn't exist.
    */
    PAYMENT_METHOD_DOES_NOT_EXIST,

    /**
    * Target shop cannot be the same as the source.
    */
    SAME_SHOP,

    /**
    * Too many requests.
    */
    TOO_MANY_REQUESTS,

    UNKNOWN_VALUE;

    public static CustomerPaymentMethodGetDuplicationDataUserErrorCode fromGraphQl(String value) {
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

            case "INVALID_ORGANIZATION_SHOP": {
                return INVALID_ORGANIZATION_SHOP;
            }

            case "PAYMENT_METHOD_DOES_NOT_EXIST": {
                return PAYMENT_METHOD_DOES_NOT_EXIST;
            }

            case "SAME_SHOP": {
                return SAME_SHOP;
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

            case INVALID_ORGANIZATION_SHOP: {
                return "INVALID_ORGANIZATION_SHOP";
            }

            case PAYMENT_METHOD_DOES_NOT_EXIST: {
                return "PAYMENT_METHOD_DOES_NOT_EXIST";
            }

            case SAME_SHOP: {
                return "SAME_SHOP";
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

