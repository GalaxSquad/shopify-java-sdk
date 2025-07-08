// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The status that describes a fulfillment or delivery event.
*/
public enum FulfillmentEventStatus {
    /**
    * A delivery was attempted.
    */
    ATTEMPTED_DELIVERY,

    /**
    * The fulfillment is confirmed. This is the default value when no other information is available.
    */
    CONFIRMED,

    /**
    * The fulfillment is delayed.
    */
    DELAYED,

    /**
    * The fulfillment was successfully delivered.
    */
    DELIVERED,

    /**
    * The fulfillment request failed.
    */
    FAILURE,

    /**
    * The fulfillment is in transit.
    */
    IN_TRANSIT,

    /**
    * A purchased shipping label has been printed.
    */
    LABEL_PRINTED,

    /**
    * A shipping label has been purchased.
    */
    LABEL_PURCHASED,

    /**
    * The fulfillment is out for delivery.
    */
    OUT_FOR_DELIVERY,

    /**
    * The fulfillment is ready to be picked up.
    */
    READY_FOR_PICKUP,

    UNKNOWN_VALUE;

    public static FulfillmentEventStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ATTEMPTED_DELIVERY": {
                return ATTEMPTED_DELIVERY;
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

            case "IN_TRANSIT": {
                return IN_TRANSIT;
            }

            case "LABEL_PRINTED": {
                return LABEL_PRINTED;
            }

            case "LABEL_PURCHASED": {
                return LABEL_PURCHASED;
            }

            case "OUT_FOR_DELIVERY": {
                return OUT_FOR_DELIVERY;
            }

            case "READY_FOR_PICKUP": {
                return READY_FOR_PICKUP;
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

            case IN_TRANSIT: {
                return "IN_TRANSIT";
            }

            case LABEL_PRINTED: {
                return "LABEL_PRINTED";
            }

            case LABEL_PURCHASED: {
                return "LABEL_PURCHASED";
            }

            case OUT_FOR_DELIVERY: {
                return "OUT_FOR_DELIVERY";
            }

            case READY_FOR_PICKUP: {
                return "READY_FOR_PICKUP";
            }

            default: {
                return "";
            }
        }
    }
}

