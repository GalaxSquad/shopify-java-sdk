// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The possible email marketing states for a customer.
*/
public enum CustomerEmailMarketingState {
    /**
    * The customer’s email address marketing state is invalid.
    */
    INVALID,

    /**
    * The customer isn't subscribed to email marketing.
    */
    NOT_SUBSCRIBED,

    /**
    * The customer is in the process of subscribing to email marketing.
    */
    PENDING,

    /**
    * The customer's personal data is erased. This value is internally-set and read-only.
    */
    REDACTED,

    /**
    * The customer is subscribed to email marketing.
    */
    SUBSCRIBED,

    /**
    * The customer isn't currently subscribed to email marketing but was previously subscribed.
    */
    UNSUBSCRIBED,

    UNKNOWN_VALUE;

    public static CustomerEmailMarketingState fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "INVALID": {
                return INVALID;
            }

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
            case INVALID: {
                return "INVALID";
            }

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

