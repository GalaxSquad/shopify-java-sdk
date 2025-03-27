// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* Specifies the email state.
*/
public enum AbandonmentEmailState {
    /**
    * The email has not yet been sent.
    */
    NOT_SENT,

    /**
    * The email has been scheduled for later delivery.
    */
    SCHEDULED,

    /**
    * The email has been sent.
    */
    SENT,

    UNKNOWN_VALUE;

    public static AbandonmentEmailState fromGraphQl(String value) {
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

