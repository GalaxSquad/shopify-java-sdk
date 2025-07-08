// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `BillingAttemptUserError`.
*/
public enum BillingAttemptUserErrorCode {
    /**
    * Billing cycle charge attempt made more than 24 hours before the billing cycle
    * `billingAttemptExpectedDate`.
    */
    BILLING_CYCLE_CHARGE_BEFORE_EXPECTED_DATE,

    /**
    * Billing cycle must not be skipped.
    */
    BILLING_CYCLE_SKIPPED,

    /**
    * The input value is blank.
    */
    BLANK,

    /**
    * Subscription contract does not exist.
    */
    CONTRACT_NOT_FOUND,

    /**
    * Subscription contract cannot be billed if paused.
    */
    CONTRACT_PAUSED,

    /**
    * Subscription contract cannot be billed once terminated.
    */
    CONTRACT_TERMINATED,

    /**
    * Subscription contract is under review.
    */
    CONTRACT_UNDER_REVIEW,

    /**
    * Billing cycle selector cannot select billing cycle outside of index range.
    */
    CYCLE_INDEX_OUT_OF_RANGE,

    /**
    * Billing cycle selector cannot select billing cycle outside of start date range.
    */
    CYCLE_START_DATE_OUT_OF_RANGE,

    /**
    * The input value is invalid.
    */
    INVALID,

    /**
    * Origin time cannot be before the contract creation time.
    */
    ORIGIN_TIME_BEFORE_CONTRACT_CREATION,

    /**
    * Origin time needs to be within the selected billing cycle's start and end at date.
    */
    ORIGIN_TIME_OUT_OF_RANGE,

    /**
    * Billing cycle selector cannot select upcoming billing cycle past limit.
    */
    UPCOMING_CYCLE_LIMIT_EXCEEDED,

    UNKNOWN_VALUE;

    public static BillingAttemptUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "BILLING_CYCLE_CHARGE_BEFORE_EXPECTED_DATE": {
                return BILLING_CYCLE_CHARGE_BEFORE_EXPECTED_DATE;
            }

            case "BILLING_CYCLE_SKIPPED": {
                return BILLING_CYCLE_SKIPPED;
            }

            case "BLANK": {
                return BLANK;
            }

            case "CONTRACT_NOT_FOUND": {
                return CONTRACT_NOT_FOUND;
            }

            case "CONTRACT_PAUSED": {
                return CONTRACT_PAUSED;
            }

            case "CONTRACT_TERMINATED": {
                return CONTRACT_TERMINATED;
            }

            case "CONTRACT_UNDER_REVIEW": {
                return CONTRACT_UNDER_REVIEW;
            }

            case "CYCLE_INDEX_OUT_OF_RANGE": {
                return CYCLE_INDEX_OUT_OF_RANGE;
            }

            case "CYCLE_START_DATE_OUT_OF_RANGE": {
                return CYCLE_START_DATE_OUT_OF_RANGE;
            }

            case "INVALID": {
                return INVALID;
            }

            case "ORIGIN_TIME_BEFORE_CONTRACT_CREATION": {
                return ORIGIN_TIME_BEFORE_CONTRACT_CREATION;
            }

            case "ORIGIN_TIME_OUT_OF_RANGE": {
                return ORIGIN_TIME_OUT_OF_RANGE;
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
            case BILLING_CYCLE_CHARGE_BEFORE_EXPECTED_DATE: {
                return "BILLING_CYCLE_CHARGE_BEFORE_EXPECTED_DATE";
            }

            case BILLING_CYCLE_SKIPPED: {
                return "BILLING_CYCLE_SKIPPED";
            }

            case BLANK: {
                return "BLANK";
            }

            case CONTRACT_NOT_FOUND: {
                return "CONTRACT_NOT_FOUND";
            }

            case CONTRACT_PAUSED: {
                return "CONTRACT_PAUSED";
            }

            case CONTRACT_TERMINATED: {
                return "CONTRACT_TERMINATED";
            }

            case CONTRACT_UNDER_REVIEW: {
                return "CONTRACT_UNDER_REVIEW";
            }

            case CYCLE_INDEX_OUT_OF_RANGE: {
                return "CYCLE_INDEX_OUT_OF_RANGE";
            }

            case CYCLE_START_DATE_OUT_OF_RANGE: {
                return "CYCLE_START_DATE_OUT_OF_RANGE";
            }

            case INVALID: {
                return "INVALID";
            }

            case ORIGIN_TIME_BEFORE_CONTRACT_CREATION: {
                return "ORIGIN_TIME_BEFORE_CONTRACT_CREATION";
            }

            case ORIGIN_TIME_OUT_OF_RANGE: {
                return "ORIGIN_TIME_OUT_OF_RANGE";
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

