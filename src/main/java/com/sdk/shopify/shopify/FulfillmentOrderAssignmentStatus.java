// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The assigment status to be used to filter fulfillment orders.
*/
public enum FulfillmentOrderAssignmentStatus {
    /**
    * Fulfillment orders for which the merchant has requested cancellation of
    * the previously accepted fulfillment request.
    */
    CANCELLATION_REQUESTED,

    /**
    * Fulfillment orders for which the merchant's fulfillment request has been accepted.
    * Any number of fulfillments can be created on these fulfillment orders
    * to completely fulfill the requested items.
    */
    FULFILLMENT_ACCEPTED,

    /**
    * Fulfillment orders for which the merchant has requested fulfillment.
    */
    FULFILLMENT_REQUESTED,

    /**
    * Fulfillment orders for which the merchant hasn't yet requested fulfillment.
    */
    FULFILLMENT_UNSUBMITTED,

    UNKNOWN_VALUE;

    public static FulfillmentOrderAssignmentStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CANCELLATION_REQUESTED": {
                return CANCELLATION_REQUESTED;
            }

            case "FULFILLMENT_ACCEPTED": {
                return FULFILLMENT_ACCEPTED;
            }

            case "FULFILLMENT_REQUESTED": {
                return FULFILLMENT_REQUESTED;
            }

            case "FULFILLMENT_UNSUBMITTED": {
                return FULFILLMENT_UNSUBMITTED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CANCELLATION_REQUESTED: {
                return "CANCELLATION_REQUESTED";
            }

            case FULFILLMENT_ACCEPTED: {
                return "FULFILLMENT_ACCEPTED";
            }

            case FULFILLMENT_REQUESTED: {
                return "FULFILLMENT_REQUESTED";
            }

            case FULFILLMENT_UNSUBMITTED: {
                return "FULFILLMENT_UNSUBMITTED";
            }

            default: {
                return "";
            }
        }
    }
}

