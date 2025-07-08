// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `SubscriptionBillingCycleBulkUserError`.
*/
public enum SubscriptionBillingCycleBulkUserErrorCode {
    /**
    * The input value is blank.
    */
    BLANK,

    /**
    * End date can't be more than 24 hours in the future.
    */
    END_DATE_IN_THE_FUTURE,

    /**
    * The input value is invalid.
    */
    INVALID,

    /**
    * The range between start date and end date shouldn't be more than 1 week.
    */
    INVALID_DATE_RANGE,

    /**
    * Start date should be before end date.
    */
    START_DATE_BEFORE_END_DATE,

    UNKNOWN_VALUE;

    public static SubscriptionBillingCycleBulkUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "BLANK": {
                return BLANK;
            }

            case "END_DATE_IN_THE_FUTURE": {
                return END_DATE_IN_THE_FUTURE;
            }

            case "INVALID": {
                return INVALID;
            }

            case "INVALID_DATE_RANGE": {
                return INVALID_DATE_RANGE;
            }

            case "START_DATE_BEFORE_END_DATE": {
                return START_DATE_BEFORE_END_DATE;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case BLANK: {
                return "BLANK";
            }

            case END_DATE_IN_THE_FUTURE: {
                return "END_DATE_IN_THE_FUTURE";
            }

            case INVALID: {
                return "INVALID";
            }

            case INVALID_DATE_RANGE: {
                return "INVALID_DATE_RANGE";
            }

            case START_DATE_BEFORE_END_DATE: {
                return "START_DATE_BEFORE_END_DATE";
            }

            default: {
                return "";
            }
        }
    }
}

