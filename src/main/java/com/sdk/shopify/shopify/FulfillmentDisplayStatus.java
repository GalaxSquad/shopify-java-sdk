// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* The display status of a fulfillment.
*/
public enum FulfillmentDisplayStatus {
    /**
    * Displayed as **Attempted delivery**.
    */
    ATTEMPTED_DELIVERY,

    /**
    * Displayed as **Canceled**.
    */
    CANCELED,

    /**
    * Displayed as **Confirmed**.
    */
    CONFIRMED,

    /**
    * Displayed as **Delayed**.
    */
    DELAYED,

    /**
    * Displayed as **Delivered**.
    */
    DELIVERED,

    /**
    * Displayed as **Failure**.
    */
    FAILURE,

    /**
    * Displayed as **Fulfilled**.
    */
    FULFILLED,

    /**
    * Displayed as **In transit**.
    */
    IN_TRANSIT,

    /**
    * Displayed as **Label printed**.
    */
    LABEL_PRINTED,

    /**
    * Displayed as **Label purchased**.
    */
    LABEL_PURCHASED,

    /**
    * Displayed as **Label voided**.
    */
    LABEL_VOIDED,

    /**
    * Displayed as **Marked as fulfilled**.
    */
    MARKED_AS_FULFILLED,

    /**
    * Displayed as **Not delivered**.
    */
    NOT_DELIVERED,

    /**
    * Displayed as **Out for delivery**.
    */
    OUT_FOR_DELIVERY,

    /**
    * Displayed as **Picked up**.
    */
    PICKED_UP,

    /**
    * Displayed as **Ready for pickup**.
    */
    READY_FOR_PICKUP,

    /**
    * Displayed as **Submitted**.
    */
    SUBMITTED,

    UNKNOWN_VALUE;

    public static FulfillmentDisplayStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ATTEMPTED_DELIVERY": {
                return ATTEMPTED_DELIVERY;
            }

            case "CANCELED": {
                return CANCELED;
            }

            case "CONFIRMED": {
                return CONFIRMED;
            }

            case "DELAYED": {
                return DELAYED;
            }

            case "DELIVERED": {
                return DELIVERED;
            }

            case "FAILURE": {
                return FAILURE;
            }

            case "FULFILLED": {
                return FULFILLED;
            }

            case "IN_TRANSIT": {
                return IN_TRANSIT;
            }

            case "LABEL_PRINTED": {
                return LABEL_PRINTED;
            }

            case "LABEL_PURCHASED": {
                return LABEL_PURCHASED;
            }

            case "LABEL_VOIDED": {
                return LABEL_VOIDED;
            }

            case "MARKED_AS_FULFILLED": {
                return MARKED_AS_FULFILLED;
            }

            case "NOT_DELIVERED": {
                return NOT_DELIVERED;
            }

            case "OUT_FOR_DELIVERY": {
                return OUT_FOR_DELIVERY;
            }

            case "PICKED_UP": {
                return PICKED_UP;
            }

            case "READY_FOR_PICKUP": {
                return READY_FOR_PICKUP;
            }

            case "SUBMITTED": {
                return SUBMITTED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ATTEMPTED_DELIVERY: {
                return "ATTEMPTED_DELIVERY";
            }

            case CANCELED: {
                return "CANCELED";
            }

            case CONFIRMED: {
                return "CONFIRMED";
            }

            case DELAYED: {
                return "DELAYED";
            }

            case DELIVERED: {
                return "DELIVERED";
            }

            case FAILURE: {
                return "FAILURE";
            }

            case FULFILLED: {
                return "FULFILLED";
            }

            case IN_TRANSIT: {
                return "IN_TRANSIT";
            }

            case LABEL_PRINTED: {
                return "LABEL_PRINTED";
            }

            case LABEL_PURCHASED: {
                return "LABEL_PURCHASED";
            }

            case LABEL_VOIDED: {
                return "LABEL_VOIDED";
            }

            case MARKED_AS_FULFILLED: {
                return "MARKED_AS_FULFILLED";
            }

            case NOT_DELIVERED: {
                return "NOT_DELIVERED";
            }

            case OUT_FOR_DELIVERY: {
                return "OUT_FOR_DELIVERY";
            }

            case PICKED_UP: {
                return "PICKED_UP";
            }

            case READY_FOR_PICKUP: {
                return "READY_FOR_PICKUP";
            }

            case SUBMITTED: {
                return "SUBMITTED";
            }

            default: {
                return "";
            }
        }
    }
}

