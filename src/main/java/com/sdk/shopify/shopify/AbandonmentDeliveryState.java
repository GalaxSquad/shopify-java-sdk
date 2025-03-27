// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* Specifies the delivery state of a marketing activity.
*/
public enum AbandonmentDeliveryState {
    /**
    * The marketing activity action has not yet been sent.
    */
    NOT_SENT,

    /**
    * The marketing activity action has been scheduled for later delivery.
    */
    SCHEDULED,

    /**
    * The marketing activity action has been sent.
    */
    SENT,

    UNKNOWN_VALUE;

    public static AbandonmentDeliveryState fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "NOT_SENT": {
                return NOT_SENT;
            }

            case "SCHEDULED": {
                return SCHEDULED;
            }

            case "SENT": {
                return SENT;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case NOT_SENT: {
                return "NOT_SENT";
            }

            case SCHEDULED: {
                return "SCHEDULED";
            }

            case SENT: {
                return "SENT";
            }

            default: {
                return "";
            }
        }
    }
}

