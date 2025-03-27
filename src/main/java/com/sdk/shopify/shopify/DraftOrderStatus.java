// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* The valid statuses for a draft order.
*/
public enum DraftOrderStatus {
    /**
    * The draft order has been paid.
    */
    COMPLETED,

    /**
    * An invoice for the draft order has been sent to the customer.
    */
    INVOICE_SENT,

    /**
    * The draft order is open. It has not been paid, and an invoice hasn't been sent.
    */
    OPEN,

    UNKNOWN_VALUE;

    public static DraftOrderStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "COMPLETED": {
                return COMPLETED;
            }

            case "INVOICE_SENT": {
                return INVOICE_SENT;
            }

            case "OPEN": {
                return OPEN;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case COMPLETED: {
                return "COMPLETED";
            }

            case INVOICE_SENT: {
                return "INVOICE_SENT";
            }

            case OPEN: {
                return "OPEN";
            }

            default: {
                return "";
            }
        }
    }
}

