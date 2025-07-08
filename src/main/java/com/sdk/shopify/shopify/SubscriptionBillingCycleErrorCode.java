// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `SubscriptionBillingCycleUserError`.
*/
public enum SubscriptionBillingCycleErrorCode {
    /**
    * Billing date cannot be set on skipped billing cycle.
    */
    BILLING_DATE_SET_ON_SKIPPED,

    /**
    * Billing cycle selector cannot select billing cycle outside of index range.
    */
    CYCLE_INDEX_OUT_OF_RANGE,

    /**
    * Can't find the billing cycle.
    */
    CYCLE_NOT_FOUND,

    /**
    * Billing cycle selector cannot select billing cycle outside of start date range.
    */
    CYCLE_START_DATE_OUT_OF_RANGE,

    /**
    * Billing cycle schedule edit input provided is empty. Must take in parameters to modify schedule.
    */
    EMPTY_BILLING_CYCLE_EDIT_SCHEDULE_INPUT,

    /**
    * Billing cycle has incomplete billing attempts in progress.
    */
    INCOMPLETE_BILLING_ATTEMPTS,

    /**
    * The input value is invalid.
    */
    INVALID,

    /**
    * The index selector is invalid.
    */
    INVALID_CYCLE_INDEX,

    /**
    * The date selector is invalid.
    */
    INVALID_DATE,

    /**
    * There's no contract or schedule edit associated with the targeted billing cycle(s).
    */
    NO_CYCLE_EDITS,

    /**
    * Billing date of a cycle cannot be set to a value outside of its billing date range.
    */
    OUT_OF_BOUNDS,

    /**
    * Billing cycle selector cannot select upcoming billing cycle past limit.
    */
    UPCOMING_CYCLE_LIMIT_EXCEEDED,

    UNKNOWN_VALUE;

    public static SubscriptionBillingCycleErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "BILLING_DATE_SET_ON_SKIPPED": {
                return BILLING_DATE_SET_ON_SKIPPED;
            }

            case "CYCLE_INDEX_OUT_OF_RANGE": {
                return CYCLE_INDEX_OUT_OF_RANGE;
            }

            case "CYCLE_NOT_FOUND": {
                return CYCLE_NOT_FOUND;
            }

            case "CYCLE_START_DATE_OUT_OF_RANGE": {
                return CYCLE_START_DATE_OUT_OF_RANGE;
            }

            case "EMPTY_BILLING_CYCLE_EDIT_SCHEDULE_INPUT": {
                return EMPTY_BILLING_CYCLE_EDIT_SCHEDULE_INPUT;
            }

            case "INCOMPLETE_BILLING_ATTEMPTS": {
                return INCOMPLETE_BILLING_ATTEMPTS;
            }

            case "INVALID": {
                return INVALID;
            }

            case "INVALID_CYCLE_INDEX": {
                return INVALID_CYCLE_INDEX;
            }

            case "INVALID_DATE": {
                return INVALID_DATE;
            }

            case "NO_CYCLE_EDITS": {
                return NO_CYCLE_EDITS;
            }

            case "OUT_OF_BOUNDS": {
                return OUT_OF_BOUNDS;
            }

            case "UPCOMING_CYCLE_LIMIT_EXCEEDED": {
                return UPCOMING_CYCLE_LIMIT_EXCEEDED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case BILLING_DATE_SET_ON_SKIPPED: {
                return "BILLING_DATE_SET_ON_SKIPPED";
            }

            case CYCLE_INDEX_OUT_OF_RANGE: {
                return "CYCLE_INDEX_OUT_OF_RANGE";
            }

            case CYCLE_NOT_FOUND: {
                return "CYCLE_NOT_FOUND";
            }

            case CYCLE_START_DATE_OUT_OF_RANGE: {
                return "CYCLE_START_DATE_OUT_OF_RANGE";
            }

            case EMPTY_BILLING_CYCLE_EDIT_SCHEDULE_INPUT: {
                return "EMPTY_BILLING_CYCLE_EDIT_SCHEDULE_INPUT";
            }

            case INCOMPLETE_BILLING_ATTEMPTS: {
                return "INCOMPLETE_BILLING_ATTEMPTS";
            }

            case INVALID: {
                return "INVALID";
            }

            case INVALID_CYCLE_INDEX: {
                return "INVALID_CYCLE_INDEX";
            }

            case INVALID_DATE: {
                return "INVALID_DATE";
            }

            case NO_CYCLE_EDITS: {
                return "NO_CYCLE_EDITS";
            }

            case OUT_OF_BOUNDS: {
                return "OUT_OF_BOUNDS";
            }

            case UPCOMING_CYCLE_LIMIT_EXCEEDED: {
                return "UPCOMING_CYCLE_LIMIT_EXCEEDED";
            }

            default: {
                return "";
            }
        }
    }
}

