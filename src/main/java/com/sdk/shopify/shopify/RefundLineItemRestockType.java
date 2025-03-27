// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* The type of restock performed for a particular refund line item.
*/
public enum RefundLineItemRestockType {
    /**
    * The refund line item was canceled. Use this when restocking unfulfilled line items.
    */
    CANCEL,

    /**
    * Deprecated. The refund line item was restocked, without specifically beingidentified as a return or
    * cancelation. This value is not accepted when creating new refunds.
    */
    LEGACY_RESTOCK,

    /**
    * Refund line item was not restocked.
    */
    NO_RESTOCK,

    /**
    * The refund line item was returned. Use this when restocking line items that were fulfilled.
    */
    RETURN,

    UNKNOWN_VALUE;

    public static RefundLineItemRestockType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CANCEL": {
                return CANCEL;
            }

            case "LEGACY_RESTOCK": {
                return LEGACY_RESTOCK;
            }

            case "NO_RESTOCK": {
                return NO_RESTOCK;
            }

            case "RETURN": {
                return RETURN;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CANCEL: {
                return "CANCEL";
            }

            case LEGACY_RESTOCK: {
                return "LEGACY_RESTOCK";
            }

            case NO_RESTOCK: {
                return "NO_RESTOCK";
            }

            case RETURN: {
                return "RETURN";
            }

            default: {
                return "";
            }
        }
    }
}

