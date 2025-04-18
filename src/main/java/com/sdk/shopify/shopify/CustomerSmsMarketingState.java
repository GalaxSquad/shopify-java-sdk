// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* The valid SMS marketing states for a customer’s phone number.
*/
public enum CustomerSmsMarketingState {
    /**
    * The customer hasn't subscribed to SMS marketing.
    */
    NOT_SUBSCRIBED,

    /**
    * The customer is in the process of subscribing to SMS marketing.
    */
    PENDING,

    /**
    * The customer's personal data is erased. This value is internally-set and read-only.
    */
    REDACTED,

    /**
    * The customer is subscribed to SMS marketing.
    */
    SUBSCRIBED,

    /**
    * The customer isn't currently subscribed to SMS marketing but was previously subscribed.
    */
    UNSUBSCRIBED,

    UNKNOWN_VALUE;

    public static CustomerSmsMarketingState fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "NOT_SUBSCRIBED": {
                return NOT_SUBSCRIBED;
            }

            case "PENDING": {
                return PENDING;
            }

            case "REDACTED": {
                return REDACTED;
            }

            case "SUBSCRIBED": {
                return SUBSCRIBED;
            }

            case "UNSUBSCRIBED": {
                return UNSUBSCRIBED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case NOT_SUBSCRIBED: {
                return "NOT_SUBSCRIBED";
            }

            case PENDING: {
                return "PENDING";
            }

            case REDACTED: {
                return "REDACTED";
            }

            case SUBSCRIBED: {
                return "SUBSCRIBED";
            }

            case UNSUBSCRIBED: {
                return "UNSUBSCRIBED";
            }

            default: {
                return "";
            }
        }
    }
}

