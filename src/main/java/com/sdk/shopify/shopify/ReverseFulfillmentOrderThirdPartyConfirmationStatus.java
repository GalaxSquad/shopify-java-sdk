// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* The status of a reverse fulfillment order third-party confirmation.
*/
public enum ReverseFulfillmentOrderThirdPartyConfirmationStatus {
    /**
    * The reverse fulfillment order was accepted by the fulfillment service.
    */
    ACCEPTED,

    /**
    * The reverse fulfillment order cancelation was accepted by the fulfillment service.
    */
    CANCEL_ACCEPTED,

    /**
    * The reverse fulfillment order cancelation was rejected by the fulfillment service.
    */
    CANCEL_REJECTED,

    /**
    * The reverse fulfillment order is awaiting acceptance by the fulfillment service.
    */
    PENDING_ACCEPTANCE,

    /**
    * The reverse fulfillment order is awaiting cancelation by the fulfillment service.
    */
    PENDING_CANCELATION,

    /**
    * The reverse fulfillment order was rejected by the fulfillment service.
    */
    REJECTED,

    UNKNOWN_VALUE;

    public static ReverseFulfillmentOrderThirdPartyConfirmationStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ACCEPTED": {
                return ACCEPTED;
            }

            case "CANCEL_ACCEPTED": {
                return CANCEL_ACCEPTED;
            }

            case "CANCEL_REJECTED": {
                return CANCEL_REJECTED;
            }

            case "PENDING_ACCEPTANCE": {
                return PENDING_ACCEPTANCE;
            }

            case "PENDING_CANCELATION": {
                return PENDING_CANCELATION;
            }

            case "REJECTED": {
                return REJECTED;
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

            case CANCEL_ACCEPTED: {
                return "CANCEL_ACCEPTED";
            }

            case CANCEL_REJECTED: {
                return "CANCEL_REJECTED";
            }

            case PENDING_ACCEPTANCE: {
                return "PENDING_ACCEPTANCE";
            }

            case PENDING_CANCELATION: {
                return "PENDING_CANCELATION";
            }

            case REJECTED: {
                return "REJECTED";
            }

            default: {
                return "";
            }
        }
    }
}

