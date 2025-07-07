// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The type of a payment terms or a payment terms template.
*/
public enum PaymentTermsType {
    /**
    * The payment terms or payment terms template is a fixed type. It's due on a specified date.
    */
    FIXED,

    /**
    * The payment terms or payment terms template is due on fulfillment.
    */
    FULFILLMENT,

    /**
    * The payment terms or payment terms template is a net type. It's due a number of days after issue.
    */
    NET,

    /**
    * The payment terms or payment terms template is due on receipt.
    */
    RECEIPT,

    /**
    * The type of the payment terms or payment terms template is unknown.
    */
    UNKNOWN,

    UNKNOWN_VALUE;

    public static PaymentTermsType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "FIXED": {
                return FIXED;
            }

            case "FULFILLMENT": {
                return FULFILLMENT;
            }

            case "NET": {
                return NET;
            }

            case "RECEIPT": {
                return RECEIPT;
            }

            case "UNKNOWN": {
                return UNKNOWN;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case FIXED: {
                return "FIXED";
            }

            case FULFILLMENT: {
                return "FULFILLMENT";
            }

            case NET: {
                return "NET";
            }

            case RECEIPT: {
                return "RECEIPT";
            }

            case UNKNOWN: {
                return "UNKNOWN";
            }

            default: {
                return "";
            }
        }
    }
}

