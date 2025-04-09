// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* Represents the order's aggregated fulfillment status for display purposes.
*/
public enum OrderDisplayFulfillmentStatus {
    /**
    * Displayed as **Fulfilled**. All the items in the order have been fulfilled.
    */
    FULFILLED,

    /**
    * Displayed as **In progress**. Some of the items in the order have been fulfilled, or a request for
    * fulfillment has been sent to the fulfillment service.
    */
    IN_PROGRESS,

    /**
    * Displayed as **On hold**. All of the unfulfilled items in this order are on hold.
    */
    ON_HOLD,

    /**
    * Displayed as **Open**. None of the items in the order have been fulfilled. Replaced by "UNFULFILLED"
    * status.
    */
    OPEN,

    /**
    * Displayed as **Partially fulfilled**. Some of the items in the order have been fulfilled.
    */
    PARTIALLY_FULFILLED,

    /**
    * Displayed as **Pending fulfillment**. A request for fulfillment of some items awaits a response from
    * the fulfillment service. Replaced by the "IN_PROGRESS" status.
    */
    PENDING_FULFILLMENT,

    /**
    * Displayed as **Request declined**. Some of the items in the order have been rejected for fulfillment
    * by the fulfillment service.
    */
    REQUEST_DECLINED,

    /**
    * Displayed as **Restocked**. All the items in the order have been restocked. Replaced by the
    * "UNFULFILLED" status.
    */
    RESTOCKED,

    /**
    * Displayed as **Scheduled**. All of the unfulfilled items in this order are scheduled for fulfillment
    * at later time.
    */
    SCHEDULED,

    /**
    * Displayed as **Unfulfilled**. None of the items in the order have been fulfilled.
    */
    UNFULFILLED,

    UNKNOWN_VALUE;

    public static OrderDisplayFulfillmentStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "FULFILLED": {
                return FULFILLED;
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

            case "PARTIALLY_FULFILLED": {
                return PARTIALLY_FULFILLED;
            }

            case "PENDING_FULFILLMENT": {
                return PENDING_FULFILLMENT;
            }

            case "REQUEST_DECLINED": {
                return REQUEST_DECLINED;
            }

            case "RESTOCKED": {
                return RESTOCKED;
            }

            case "SCHEDULED": {
                return SCHEDULED;
            }

            case "UNFULFILLED": {
                return UNFULFILLED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case FULFILLED: {
                return "FULFILLED";
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

            case PARTIALLY_FULFILLED: {
                return "PARTIALLY_FULFILLED";
            }

            case PENDING_FULFILLMENT: {
                return "PENDING_FULFILLMENT";
            }

            case REQUEST_DECLINED: {
                return "REQUEST_DECLINED";
            }

            case RESTOCKED: {
                return "RESTOCKED";
            }

            case SCHEDULED: {
                return "SCHEDULED";
            }

            case UNFULFILLED: {
                return "UNFULFILLED";
            }

            default: {
                return "";
            }
        }
    }
}

