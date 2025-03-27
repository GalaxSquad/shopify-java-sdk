// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* Represents the reason for the order's cancellation.
*/
public enum OrderCancelReason {
    /**
    * The customer wanted to cancel the order.
    */
    CUSTOMER,

    /**
    * Payment was declined.
    */
    DECLINED,

    /**
    * The order was fraudulent.
    */
    FRAUD,

    /**
    * There was insufficient inventory.
    */
    INVENTORY,

    /**
    * The order was canceled for an unlisted reason.
    */
    OTHER,

    /**
    * Staff made an error.
    */
    STAFF,

    UNKNOWN_VALUE;

    public static OrderCancelReason fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CUSTOMER": {
                return CUSTOMER;
            }

            case "DECLINED": {
                return DECLINED;
            }

            case "FRAUD": {
                return FRAUD;
            }

            case "INVENTORY": {
                return INVENTORY;
            }

            case "OTHER": {
                return OTHER;
            }

            case "STAFF": {
                return STAFF;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CUSTOMER: {
                return "CUSTOMER";
            }

            case DECLINED: {
                return "DECLINED";
            }

            case FRAUD: {
                return "FRAUD";
            }

            case INVENTORY: {
                return "INVENTORY";
            }

            case OTHER: {
                return "OTHER";
            }

            case STAFF: {
                return "STAFF";
            }

            default: {
                return "";
            }
        }
    }
}

