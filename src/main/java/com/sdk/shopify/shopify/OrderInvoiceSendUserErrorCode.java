// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* Possible error codes that can be returned by `OrderInvoiceSendUserError`.
*/
public enum OrderInvoiceSendUserErrorCode {
    /**
    * An error occurred while sending the invoice.
    */
    ORDER_INVOICE_SEND_UNSUCCESSFUL,

    UNKNOWN_VALUE;

    public static OrderInvoiceSendUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ORDER_INVOICE_SEND_UNSUCCESSFUL": {
                return ORDER_INVOICE_SEND_UNSUCCESSFUL;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ORDER_INVOICE_SEND_UNSUCCESSFUL: {
                return "ORDER_INVOICE_SEND_UNSUCCESSFUL";
            }

            default: {
                return "";
            }
        }
    }
}

