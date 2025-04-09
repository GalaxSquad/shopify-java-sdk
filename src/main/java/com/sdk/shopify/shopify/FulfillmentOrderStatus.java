// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* The status of a fulfillment order.
*/
public enum FulfillmentOrderStatus {
    /**
    * The fulfillment order has been cancelled by the merchant.
    */
    CANCELLED,

    /**
    * The fulfillment order has been completed and closed.
    */
    CLOSED,

    /**
    * The fulfillment order cannot be completed as requested.
    */
    INCOMPLETE,

    /**
    * The fulfillment order is being processed.
    */
    IN_PROGRESS,

    /**
    * The fulfillment order is on hold. The fulfillment process can't be initiated until the hold on the
    * fulfillment order is released.
    */
    ON_HOLD,

    /**
    * The fulfillment order is ready for fulfillment.
    */
    OPEN,

    /**
    * The fulfillment order is deferred and will be ready for fulfillment after the date and time
    * specified in `fulfill_at`.
    */
    SCHEDULED,

    UNKNOWN_VALUE;

    public static FulfillmentOrderStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CANCELLED": {
                return CANCELLED;
            }

            case "CLOSED": {
                return CLOSED;
            }

            case "INCOMPLETE": {
                return INCOMPLETE;
            }

            case "IN_PROGRESS": {
                return IN_PROGRESS;
            }

            case "ON_HOLD": {
                return ON_HOLD;
            }

            case "OPEN": {
                return OPEN;
            }

            case "SCHEDULED": {
                return SCHEDULED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CANCELLED: {
                return "CANCELLED";
            }

            case CLOSED: {
                return "CLOSED";
            }

            case INCOMPLETE: {
                return "INCOMPLETE";
            }

            case IN_PROGRESS: {
                return "IN_PROGRESS";
            }

            case ON_HOLD: {
                return "ON_HOLD";
            }

            case OPEN: {
                return "OPEN";
            }

            case SCHEDULED: {
                return "SCHEDULED";
            }

            default: {
                return "";
            }
        }
    }
}

