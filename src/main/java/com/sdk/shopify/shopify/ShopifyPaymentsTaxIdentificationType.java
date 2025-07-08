// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The type of tax identification field.
*/
public enum ShopifyPaymentsTaxIdentificationType {
    /**
    * Business EIN.
    */
    EIN,

    /**
    * Full SSN.
    */
    FULL_SSN,

    /**
    * The last 4 digits of the SSN.
    */
    SSN_LAST4_DIGITS,

    UNKNOWN_VALUE;

    public static ShopifyPaymentsTaxIdentificationType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "EIN": {
                return EIN;
            }

            case "FULL_SSN": {
                return FULL_SSN;
            }

            case "SSN_LAST4_DIGITS": {
                return SSN_LAST4_DIGITS;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case EIN: {
                return "EIN";
            }

            case FULL_SSN: {
                return "FULL_SSN";
            }

            case SSN_LAST4_DIGITS: {
                return "SSN_LAST4_DIGITS";
            }

            default: {
                return "";
            }
        }
    }
}

