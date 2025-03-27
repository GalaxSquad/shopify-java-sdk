// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* The request status of a fulfillment order.
*/
public enum FulfillmentOrderRequestStatus {
    /**
    * The fulfillment service accepted the merchant's fulfillment request.
    */
    ACCEPTED,

    /**
    * The fulfillment service accepted the merchant's fulfillment cancellation request.
    */
    CANCELLATION_ACCEPTED,

    /**
    * The fulfillment service rejected the merchant's fulfillment cancellation request.
    */
    CANCELLATION_REJECTED,

    /**
    * The merchant requested a cancellation of the fulfillment request for this fulfillment order.
    */
    CANCELLATION_REQUESTED,

    /**
    * The fulfillment service closed the fulfillment order without completing it.
    */
    CLOSED,

    /**
    * The fulfillment service rejected the merchant's fulfillment request.
    */
    REJECTED,

    /**
    * The merchant requested fulfillment for this fulfillment order.
    */
    SUBMITTED,

    /**
    * The initial request status for the newly-created fulfillment orders. This is the only valid
    * request status for fulfillment orders that aren't assigned to a fulfillment service.
    */
    UNSUBMITTED,

    UNKNOWN_VALUE;

    public static FulfillmentOrderRequestStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ACCEPTED": {
                return ACCEPTED;
            }

            case "CANCELLATION_ACCEPTED": {
                return CANCELLATION_ACCEPTED;
            }

            case "CANCELLATION_REJECTED": {
                return CANCELLATION_REJECTED;
            }

            case "CANCELLATION_REQUESTED": {
                return CANCELLATION_REQUESTED;
            }

            case "CLOSED": {
                return CLOSED;
            }

            case "REJECTED": {
                return REJECTED;
            }

            case "SUBMITTED": {
                return SUBMITTED;
            }

            case "UNSUBMITTED": {
                return UNSUBMITTED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ACCEPTED: {
                return "ACCEPTED";
            }

            case CANCELLATION_ACCEPTED: {
                return "CANCELLATION_ACCEPTED";
            }

            case CANCELLATION_REJECTED: {
                return "CANCELLATION_REJECTED";
            }

            case CANCELLATION_REQUESTED: {
                return "CANCELLATION_REQUESTED";
            }

            case CLOSED: {
                return "CLOSED";
            }

            case REJECTED: {
                return "REJECTED";
            }

            case SUBMITTED: {
                return "SUBMITTED";
            }

            case UNSUBMITTED: {
                return "UNSUBMITTED";
            }

            default: {
                return "";
            }
        }
    }
}

