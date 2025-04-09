// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* Possible error codes that can be returned by `SubscriptionDraftUserError`.
*/
public enum SubscriptionDraftErrorCode {
    /**
    * This line has already been removed.
    */
    ALREADY_REMOVED,

    /**
    * Cannot commit a contract draft with this mutation. Please use SubscriptionDraftCommit.
    */
    BILLING_CYCLE_ABSENT,

    /**
    * Billing policy cannot be updated for billing cycle contract drafts.
    */
    BILLING_CYCLE_CONTRACT_DRAFT_BILLING_POLICY_INVALID,

    /**
    * Delivery policy cannot be updated for billing cycle contract drafts.
    */
    BILLING_CYCLE_CONTRACT_DRAFT_DELIVERY_POLICY_INVALID,

    /**
    * Cannot commit a billing cycle contract draft with this mutation. Please use
    * SubscriptionBillingCycleContractDraftCommit.
    */
    BILLING_CYCLE_PRESENT,

    /**
    * The input value is blank.
    */
    BLANK,

    /**
    * Subscription draft has been already committed.
    */
    COMMITTED,

    /**
    * Contract draft must be a billing cycle contract draft for contract concatenation.
    */
    CONCATENATION_BILLING_CYCLE_CONTRACT_DRAFT_REQUIRED,

    /**
    * Cannot concatenate a contract draft from subscriptionContractCreate mutation.
    */
    CONCATENATION_UNCOMMITTED_CONTRACT_DRAFT,

    /**
    * Currency is not enabled.
    */
    CURRENCY_NOT_ENABLED,

    /**
    * The customer doesn't exist.
    */
    CUSTOMER_DOES_NOT_EXIST,

    /**
    * The payment method customer must be the same as the contract customer.
    */
    CUSTOMER_MISMATCH,

    /**
    * Customer is scheduled for redaction or has been redacted.
    */
    CUSTOMER_REDACTED,

    /**
    * The after cycle attribute must be unique between cycle discounts.
    */
    CYCLE_DISCOUNTS_UNIQUE_AFTER_CYCLE,

    /**
    * Billing cycle selector cannot select billing cycle outside of index range.
    */
    CYCLE_INDEX_OUT_OF_RANGE,

    /**
    * Billing cycle selector requires exactly one of index or date to be provided.
    */
    CYCLE_SELECTOR_VALIDATE_ONE_OF,

    /**
    * Billing cycle selector cannot select billing cycle outside of start date range.
    */
    CYCLE_START_DATE_OUT_OF_RANGE,

    /**
    * The delivery method can't be blank if any lines require shipping.
    */
    DELIVERY_METHOD_REQUIRED,

    /**
    * The delivery policy interval must be a multiple of the billing policy interval.
    */
    DELIVERY_MUST_BE_MULTIPLE_OF_BILLING,

    /**
    * Concatenated contracts cannot contain duplicate subscription contracts.
    */
    DUPLICATE_CONCATENATED_CONTRACTS,

    /**
    * Maximum number of concatenated contracts on a billing cycle contract draft exceeded.
    */
    EXCEEDED_MAX_CONCATENATED_CONTRACTS,

    /**
    * The input value should be greater than the minimum allowed value.
    */
    GREATER_THAN,

    /**
    * The input value should be greater than or equal to the minimum value allowed.
    */
    GREATER_THAN_OR_EQUAL_TO,

    /**
    * Cannot update a subscription contract with a current or upcoming billing cycle contract edit.
    */
    HAS_FUTURE_EDITS,

    /**
    * The input value is invalid.
    */
    INVALID,

    /**
    * The adjustment value must the same type as the adjustment type.
    */
    INVALID_ADJUSTMENT_TYPE,

    /**
    * The adjustment value must be either fixed_value or percentage.
    */
    INVALID_ADJUSTMENT_VALUE,

    /**
    * Next billing date is invalid.
    */
    INVALID_BILLING_DATE,

    /**
    * Must have at least one line.
    */
    INVALID_LINES,

    /**
    * Note length is too long.
    */
    INVALID_NOTE_LENGTH,

    /**
    * The input value should be less than the maximum value allowed.
    */
    LESS_THAN,

    /**
    * The input value should be less than or equal to the maximum value allowed.
    */
    LESS_THAN_OR_EQUAL_TO,

    /**
    * Customer payment method is required.
    */
    MISSING_CUSTOMER_PAYMENT_METHOD,

    /**
    * The local delivery options must be set for local delivery.
    */
    MISSING_LOCAL_DELIVERY_OPTIONS,

    /**
    * The value is not an integer.
    */
    NOT_AN_INTEGER,

    /**
    * Value is not in range.
    */
    NOT_IN_RANGE,

    /**
    * Discount must have at least one entitled line.
    */
    NO_ENTITLED_LINES,

    /**
    * Input value is not present.
    */
    PRESENCE,

    /**
    * The maximum number of cycles must be greater than the minimum.
    */
    SELLING_PLAN_MAX_CYCLES_MUST_BE_GREATER_THAN_MIN_CYCLES,

    /**
    * Another operation updated the contract concurrently as the commit was in progress.
    */
    STALE_CONTRACT,

    /**
    * The input value is too long.
    */
    TOO_LONG,

    /**
    * The input value is too short.
    */
    TOO_SHORT,

    /**
    * Billing cycle selector cannot select upcoming billing cycle past limit.
    */
    UPCOMING_CYCLE_LIMIT_EXCEEDED,

    UNKNOWN_VALUE;

    public static SubscriptionDraftErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ALREADY_REMOVED": {
                return ALREADY_REMOVED;
            }

            case "BILLING_CYCLE_ABSENT": {
                return BILLING_CYCLE_ABSENT;
            }

            case "BILLING_CYCLE_CONTRACT_DRAFT_BILLING_POLICY_INVALID": {
                return BILLING_CYCLE_CONTRACT_DRAFT_BILLING_POLICY_INVALID;
            }

            case "BILLING_CYCLE_CONTRACT_DRAFT_DELIVERY_POLICY_INVALID": {
                return BILLING_CYCLE_CONTRACT_DRAFT_DELIVERY_POLICY_INVALID;
            }

            case "BILLING_CYCLE_PRESENT": {
                return BILLING_CYCLE_PRESENT;
            }

            case "BLANK": {
                return BLANK;
            }

            case "COMMITTED": {
                return COMMITTED;
            }

            case "CONCATENATION_BILLING_CYCLE_CONTRACT_DRAFT_REQUIRED": {
                return CONCATENATION_BILLING_CYCLE_CONTRACT_DRAFT_REQUIRED;
            }

            case "CONCATENATION_UNCOMMITTED_CONTRACT_DRAFT": {
                return CONCATENATION_UNCOMMITTED_CONTRACT_DRAFT;
            }

            case "CURRENCY_NOT_ENABLED": {
                return CURRENCY_NOT_ENABLED;
            }

            case "CUSTOMER_DOES_NOT_EXIST": {
                return CUSTOMER_DOES_NOT_EXIST;
            }

            case "CUSTOMER_MISMATCH": {
                return CUSTOMER_MISMATCH;
            }

            case "CUSTOMER_REDACTED": {
                return CUSTOMER_REDACTED;
            }

            case "CYCLE_DISCOUNTS_UNIQUE_AFTER_CYCLE": {
                return CYCLE_DISCOUNTS_UNIQUE_AFTER_CYCLE;
            }

            case "CYCLE_INDEX_OUT_OF_RANGE": {
                return CYCLE_INDEX_OUT_OF_RANGE;
            }

            case "CYCLE_SELECTOR_VALIDATE_ONE_OF": {
                return CYCLE_SELECTOR_VALIDATE_ONE_OF;
            }

            case "CYCLE_START_DATE_OUT_OF_RANGE": {
                return CYCLE_START_DATE_OUT_OF_RANGE;
            }

            case "DELIVERY_METHOD_REQUIRED": {
                return DELIVERY_METHOD_REQUIRED;
            }

            case "DELIVERY_MUST_BE_MULTIPLE_OF_BILLING": {
                return DELIVERY_MUST_BE_MULTIPLE_OF_BILLING;
            }

            case "DUPLICATE_CONCATENATED_CONTRACTS": {
                return DUPLICATE_CONCATENATED_CONTRACTS;
            }

            case "EXCEEDED_MAX_CONCATENATED_CONTRACTS": {
                return EXCEEDED_MAX_CONCATENATED_CONTRACTS;
            }

            case "GREATER_THAN": {
                return GREATER_THAN;
            }

            case "GREATER_THAN_OR_EQUAL_TO": {
                return GREATER_THAN_OR_EQUAL_TO;
            }

            case "HAS_FUTURE_EDITS": {
                return HAS_FUTURE_EDITS;
            }

            case "INVALID": {
                return INVALID;
            }

            case "INVALID_ADJUSTMENT_TYPE": {
                return INVALID_ADJUSTMENT_TYPE;
            }

            case "INVALID_ADJUSTMENT_VALUE": {
                return INVALID_ADJUSTMENT_VALUE;
            }

            case "INVALID_BILLING_DATE": {
                return INVALID_BILLING_DATE;
            }

            case "INVALID_LINES": {
                return INVALID_LINES;
            }

            case "INVALID_NOTE_LENGTH": {
                return INVALID_NOTE_LENGTH;
            }

            case "LESS_THAN": {
                return LESS_THAN;
            }

            case "LESS_THAN_OR_EQUAL_TO": {
                return LESS_THAN_OR_EQUAL_TO;
            }

            case "MISSING_CUSTOMER_PAYMENT_METHOD": {
                return MISSING_CUSTOMER_PAYMENT_METHOD;
            }

            case "MISSING_LOCAL_DELIVERY_OPTIONS": {
                return MISSING_LOCAL_DELIVERY_OPTIONS;
            }

            case "NOT_AN_INTEGER": {
                return NOT_AN_INTEGER;
            }

            case "NOT_IN_RANGE": {
                return NOT_IN_RANGE;
            }

            case "NO_ENTITLED_LINES": {
                return NO_ENTITLED_LINES;
            }

            case "PRESENCE": {
                return PRESENCE;
            }

            case "SELLING_PLAN_MAX_CYCLES_MUST_BE_GREATER_THAN_MIN_CYCLES": {
                return SELLING_PLAN_MAX_CYCLES_MUST_BE_GREATER_THAN_MIN_CYCLES;
            }

            case "STALE_CONTRACT": {
                return STALE_CONTRACT;
            }

            case "TOO_LONG": {
                return TOO_LONG;
            }

            case "TOO_SHORT": {
                return TOO_SHORT;
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
            case ALREADY_REMOVED: {
                return "ALREADY_REMOVED";
            }

            case BILLING_CYCLE_ABSENT: {
                return "BILLING_CYCLE_ABSENT";
            }

            case BILLING_CYCLE_CONTRACT_DRAFT_BILLING_POLICY_INVALID: {
                return "BILLING_CYCLE_CONTRACT_DRAFT_BILLING_POLICY_INVALID";
            }

            case BILLING_CYCLE_CONTRACT_DRAFT_DELIVERY_POLICY_INVALID: {
                return "BILLING_CYCLE_CONTRACT_DRAFT_DELIVERY_POLICY_INVALID";
            }

            case BILLING_CYCLE_PRESENT: {
                return "BILLING_CYCLE_PRESENT";
            }

            case BLANK: {
                return "BLANK";
            }

            case COMMITTED: {
                return "COMMITTED";
            }

            case CONCATENATION_BILLING_CYCLE_CONTRACT_DRAFT_REQUIRED: {
                return "CONCATENATION_BILLING_CYCLE_CONTRACT_DRAFT_REQUIRED";
            }

            case CONCATENATION_UNCOMMITTED_CONTRACT_DRAFT: {
                return "CONCATENATION_UNCOMMITTED_CONTRACT_DRAFT";
            }

            case CURRENCY_NOT_ENABLED: {
                return "CURRENCY_NOT_ENABLED";
            }

            case CUSTOMER_DOES_NOT_EXIST: {
                return "CUSTOMER_DOES_NOT_EXIST";
            }

            case CUSTOMER_MISMATCH: {
                return "CUSTOMER_MISMATCH";
            }

            case CUSTOMER_REDACTED: {
                return "CUSTOMER_REDACTED";
            }

            case CYCLE_DISCOUNTS_UNIQUE_AFTER_CYCLE: {
                return "CYCLE_DISCOUNTS_UNIQUE_AFTER_CYCLE";
            }

            case CYCLE_INDEX_OUT_OF_RANGE: {
                return "CYCLE_INDEX_OUT_OF_RANGE";
            }

            case CYCLE_SELECTOR_VALIDATE_ONE_OF: {
                return "CYCLE_SELECTOR_VALIDATE_ONE_OF";
            }

            case CYCLE_START_DATE_OUT_OF_RANGE: {
                return "CYCLE_START_DATE_OUT_OF_RANGE";
            }

            case DELIVERY_METHOD_REQUIRED: {
                return "DELIVERY_METHOD_REQUIRED";
            }

            case DELIVERY_MUST_BE_MULTIPLE_OF_BILLING: {
                return "DELIVERY_MUST_BE_MULTIPLE_OF_BILLING";
            }

            case DUPLICATE_CONCATENATED_CONTRACTS: {
                return "DUPLICATE_CONCATENATED_CONTRACTS";
            }

            case EXCEEDED_MAX_CONCATENATED_CONTRACTS: {
                return "EXCEEDED_MAX_CONCATENATED_CONTRACTS";
            }

            case GREATER_THAN: {
                return "GREATER_THAN";
            }

            case GREATER_THAN_OR_EQUAL_TO: {
                return "GREATER_THAN_OR_EQUAL_TO";
            }

            case HAS_FUTURE_EDITS: {
                return "HAS_FUTURE_EDITS";
            }

            case INVALID: {
                return "INVALID";
            }

            case INVALID_ADJUSTMENT_TYPE: {
                return "INVALID_ADJUSTMENT_TYPE";
            }

            case INVALID_ADJUSTMENT_VALUE: {
                return "INVALID_ADJUSTMENT_VALUE";
            }

            case INVALID_BILLING_DATE: {
                return "INVALID_BILLING_DATE";
            }

            case INVALID_LINES: {
                return "INVALID_LINES";
            }

            case INVALID_NOTE_LENGTH: {
                return "INVALID_NOTE_LENGTH";
            }

            case LESS_THAN: {
                return "LESS_THAN";
            }

            case LESS_THAN_OR_EQUAL_TO: {
                return "LESS_THAN_OR_EQUAL_TO";
            }

            case MISSING_CUSTOMER_PAYMENT_METHOD: {
                return "MISSING_CUSTOMER_PAYMENT_METHOD";
            }

            case MISSING_LOCAL_DELIVERY_OPTIONS: {
                return "MISSING_LOCAL_DELIVERY_OPTIONS";
            }

            case NOT_AN_INTEGER: {
                return "NOT_AN_INTEGER";
            }

            case NOT_IN_RANGE: {
                return "NOT_IN_RANGE";
            }

            case NO_ENTITLED_LINES: {
                return "NO_ENTITLED_LINES";
            }

            case PRESENCE: {
                return "PRESENCE";
            }

            case SELLING_PLAN_MAX_CYCLES_MUST_BE_GREATER_THAN_MIN_CYCLES: {
                return "SELLING_PLAN_MAX_CYCLES_MUST_BE_GREATER_THAN_MIN_CYCLES";
            }

            case STALE_CONTRACT: {
                return "STALE_CONTRACT";
            }

            case TOO_LONG: {
                return "TOO_LONG";
            }

            case TOO_SHORT: {
                return "TOO_SHORT";
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

