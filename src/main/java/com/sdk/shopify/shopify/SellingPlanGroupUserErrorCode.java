// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `SellingPlanGroupUserError`.
*/
public enum SellingPlanGroupUserErrorCode {
    /**
    * Billing and delivery policy types must be the same.
    */
    BILLING_AND_DELIVERY_POLICY_TYPES_MUST_BE_THE_SAME,

    /**
    * Billing policy's interval is too large.
    */
    BILLING_POLICY_INTERVAL_TOO_LARGE,

    /**
    * The input value is blank.
    */
    BLANK,

    /**
    * A fixed billing policy's checkout charge value and type must match.
    */
    CHECKOUT_CHARGE_VALUE_AND_TYPE_MUST_MATCH,

    /**
    * Delivery policy's interval is too large.
    */
    DELIVERY_POLICY_INTERVAL_TOO_LARGE,

    /**
    * The input value should be equal to the value allowed.
    */
    EQUAL_TO,

    /**
    * Could not add the resource to the selling plan group.
    */
    ERROR_ADDING_RESOURCE_TO_GROUP,

    /**
    * A fixed billing policy's fulfillment_exact_time must not be present when the fulfillment_trigger
    * isn't EXACT_TIME.
    */
    FULFILLMENT_EXACT_TIME_NOT_ALLOWED,

    /**
    * A fixed billing policy's fulfillment_exact_time can't be blank when the fulfillment_trigger is
    * EXACT_TIME.
    */
    FULFILLMENT_EXACT_TIME_REQUIRED,

    /**
    * The input value should be greater than the minimum allowed value.
    */
    GREATER_THAN,

    /**
    * The input value should be greater than or equal to the minimum value allowed.
    */
    GREATER_THAN_OR_EQUAL_TO,

    /**
    * Selling plan group could not be deleted.
    */
    GROUP_COULD_NOT_BE_DELETED,

    /**
    * Selling plan group does not exist.
    */
    GROUP_DOES_NOT_EXIST,

    /**
    * The input value isn't included in the list.
    */
    INCLUSION,

    /**
    * The input value is invalid.
    */
    INVALID,

    /**
    * The input submitted is invalid.
    */
    INVALID_INPUT,

    /**
    * The input value should be less than the maximum value allowed.
    */
    LESS_THAN,

    /**
    * The input value should be less than or equal to the maximum value allowed.
    */
    LESS_THAN_OR_EQUAL_TO,

    /**
    * The input value is not a number.
    */
    NOT_A_NUMBER,

    /**
    * The record with the ID used as the input value couldn't be found.
    */
    NOT_FOUND,

    /**
    * Only one billing policy type can be defined.
    */
    ONLY_NEED_ONE_BILLING_POLICY_TYPE,

    /**
    * A fixed billing policy's checkout charge can have at most one value.
    */
    ONLY_NEED_ONE_CHECKOUT_CHARGE_VALUE,

    /**
    * Only one delivery policy type can be defined.
    */
    ONLY_NEED_ONE_DELIVERY_POLICY_TYPE,

    /**
    * Only one pricing policy type can be defined.
    */
    ONLY_NEED_ONE_PRICING_POLICY_TYPE,

    /**
    * Only one pricing policy adjustment value type can be defined.
    */
    ONLY_NEED_ONE_PRICING_POLICY_VALUE,

    /**
    * A selling plan can't have both fixed and recurring billing policies.
    */
    ONLY_ONE_OF_FIXED_OR_RECURRING_BILLING,

    /**
    * A selling plan can't have both fixed and recurring delivery policies.
    */
    ONLY_ONE_OF_FIXED_OR_RECURRING_DELIVERY,

    /**
    * Selling plan does not exist.
    */
    PLAN_DOES_NOT_EXIST,

    /**
    * Selling plan ID must be specified to update.
    */
    PLAN_ID_MUST_BE_SPECIFIED_TO_UPDATE,

    /**
    * The input value needs to be blank.
    */
    PRESENT,

    /**
    * Pricing policy's adjustment value and adjustment type must match.
    */
    PRICING_POLICY_ADJUSTMENT_VALUE_AND_TYPE_MUST_MATCH,

    /**
    * Product does not exist.
    */
    PRODUCT_DOES_NOT_EXIST,

    /**
    * Product variant does not exist.
    */
    PRODUCT_VARIANT_DOES_NOT_EXIST,

    /**
    * A fixed billing policy's remaining_balance_charge_exact_time must not be present when the
    * remaining_balance_charge_trigger isn't EXACT_TIME.
    */
    REMAINING_BALANCE_CHARGE_EXACT_TIME_NOT_ALLOWED,

    /**
    * A fixed billing policy's remaining_balance_charge_exact_time can't be blank when the
    * remaining_balance_charge_trigger is EXACT_TIME.
    */
    REMAINING_BALANCE_CHARGE_EXACT_TIME_REQUIRED,

    /**
    * A fixed billing policy's remaining_balance_charge_time_after_checkout must be present and greater
    * than zero when the remaining_balance_charge_trigger is TIME_AFTER_CHECKOUT.
    */
    REMAINING_BALANCE_CHARGE_TIME_AFTER_CHECKOUT_MUST_BE_GREATER_THAN_ZERO,

    /**
    * A fixed billing policy's remaining_balance_charge_trigger can't be NO_REMAINING_BALANCE when the
    * checkout_charge_type is PERCENTAGE and checkout_charge_value is less than 100.
    */
    REMAINING_BALANCE_CHARGE_TRIGGER_NO_REMAINING_BALANCE_ON_PARTIAL_PERCENTAGE_CHECKOUT_CHARGE,

    /**
    * A fixed billing policy's remaining_balance_charge_trigger can't be NO_REMAINING_BALANCE when the
    * checkout_charge_type is PRICE.
    */
    REMAINING_BALANCE_CHARGE_TRIGGER_NO_REMAINING_BALANCE_ON_PRICE_CHECKOUT_CHARGE,

    /**
    * A fixed billing policy's remaining_balance_charge_trigger must be NO_REMAINING_BALANCE when the
    * checkout_charge_type is PERCENTAGE and checkout_charge_value is 100.
    */
    REMAINING_BALANCE_CHARGE_TRIGGER_ON_FULL_CHECKOUT,

    /**
    * The selling plan list provided contains 1 or more invalid IDs.
    */
    RESOURCE_LIST_CONTAINS_INVALID_IDS,

    /**
    * A fixed delivery policy's anchors must not be present when the fulfillment_trigger isn't ANCHOR.
    */
    SELLING_PLAN_ANCHORS_NOT_ALLOWED,

    /**
    * A fixed delivery policy's anchors must be present when the fulfillment_trigger is ANCHOR.
    */
    SELLING_PLAN_ANCHORS_REQUIRED,

    /**
    * Selling plan's billing and delivery policies anchors must be equal.
    */
    SELLING_PLAN_BILLING_AND_DELIVERY_POLICY_ANCHORS_MUST_BE_EQUAL,

    /**
    * Selling plan's billing cycle must be a multiple of delivery cycle.
    */
    SELLING_PLAN_BILLING_CYCLE_MUST_BE_A_MULTIPLE_OF_DELIVERY_CYCLE,

    /**
    * Missing billing policy.
    */
    SELLING_PLAN_BILLING_POLICY_MISSING,

    /**
    * Must include at least one selling plan.
    */
    SELLING_PLAN_COUNT_LOWER_BOUND,

    /**
    * Exceeded the selling plan limit (31).
    */
    SELLING_PLAN_COUNT_UPPER_BOUND,

    /**
    * Missing delivery policy.
    */
    SELLING_PLAN_DELIVERY_POLICY_MISSING,

    /**
    * Cannot have multiple selling plans with the same name.
    */
    SELLING_PLAN_DUPLICATE_NAME,

    /**
    * Cannot have multiple selling plans with the same options.
    */
    SELLING_PLAN_DUPLICATE_OPTIONS,

    /**
    * A fixed selling plan can have at most one pricing policy.
    */
    SELLING_PLAN_FIXED_PRICING_POLICIES_LIMIT,

    /**
    * Selling plan's billing policy max cycles must be greater than min cycles.
    */
    SELLING_PLAN_MAX_CYCLES_MUST_BE_GREATER_THAN_MIN_CYCLES,

    /**
    * Cannot define option2 on this selling plan as there's no label on the parent selling plan group.
    */
    SELLING_PLAN_MISSING_OPTION2_LABEL_ON_PARENT_GROUP,

    /**
    * Cannot define option3 on this selling plan as there's no label on the parent selling plan group.
    */
    SELLING_PLAN_MISSING_OPTION3_LABEL_ON_PARENT_GROUP,

    /**
    * Selling plan's option2 is required because option2 exists.
    */
    SELLING_PLAN_OPTION2_REQUIRED_AS_DEFINED_ON_PARENT_GROUP,

    /**
    * Selling plan's option3 is required because option3 exists.
    */
    SELLING_PLAN_OPTION3_REQUIRED_AS_DEFINED_ON_PARENT_GROUP,

    /**
    * Selling plans can't have more than 2 pricing policies.
    */
    SELLING_PLAN_PRICING_POLICIES_LIMIT,

    /**
    * Selling plan's pricing policies must contain one fixed pricing policy.
    */
    SELLING_PLAN_PRICING_POLICIES_MUST_CONTAIN_A_FIXED_PRICING_POLICY,

    /**
    * The input value is already taken.
    */
    TAKEN,

    /**
    * The input value is too big.
    */
    TOO_BIG,

    /**
    * The input value is too long.
    */
    TOO_LONG,

    /**
    * The input value is too short.
    */
    TOO_SHORT,

    /**
    * The input value is the wrong length.
    */
    WRONG_LENGTH,

    UNKNOWN_VALUE;

    public static SellingPlanGroupUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "BILLING_AND_DELIVERY_POLICY_TYPES_MUST_BE_THE_SAME": {
                return BILLING_AND_DELIVERY_POLICY_TYPES_MUST_BE_THE_SAME;
            }

            case "BILLING_POLICY_INTERVAL_TOO_LARGE": {
                return BILLING_POLICY_INTERVAL_TOO_LARGE;
            }

            case "BLANK": {
                return BLANK;
            }

            case "CHECKOUT_CHARGE_VALUE_AND_TYPE_MUST_MATCH": {
                return CHECKOUT_CHARGE_VALUE_AND_TYPE_MUST_MATCH;
            }

            case "DELIVERY_POLICY_INTERVAL_TOO_LARGE": {
                return DELIVERY_POLICY_INTERVAL_TOO_LARGE;
            }

            case "EQUAL_TO": {
                return EQUAL_TO;
            }

            case "ERROR_ADDING_RESOURCE_TO_GROUP": {
                return ERROR_ADDING_RESOURCE_TO_GROUP;
            }

            case "FULFILLMENT_EXACT_TIME_NOT_ALLOWED": {
                return FULFILLMENT_EXACT_TIME_NOT_ALLOWED;
            }

            case "FULFILLMENT_EXACT_TIME_REQUIRED": {
                return FULFILLMENT_EXACT_TIME_REQUIRED;
            }

            case "GREATER_THAN": {
                return GREATER_THAN;
            }

            case "GREATER_THAN_OR_EQUAL_TO": {
                return GREATER_THAN_OR_EQUAL_TO;
            }

            case "GROUP_COULD_NOT_BE_DELETED": {
                return GROUP_COULD_NOT_BE_DELETED;
            }

            case "GROUP_DOES_NOT_EXIST": {
                return GROUP_DOES_NOT_EXIST;
            }

            case "INCLUSION": {
                return INCLUSION;
            }

            case "INVALID": {
                return INVALID;
            }

            case "INVALID_INPUT": {
                return INVALID_INPUT;
            }

            case "LESS_THAN": {
                return LESS_THAN;
            }

            case "LESS_THAN_OR_EQUAL_TO": {
                return LESS_THAN_OR_EQUAL_TO;
            }

            case "NOT_A_NUMBER": {
                return NOT_A_NUMBER;
            }

            case "NOT_FOUND": {
                return NOT_FOUND;
            }

            case "ONLY_NEED_ONE_BILLING_POLICY_TYPE": {
                return ONLY_NEED_ONE_BILLING_POLICY_TYPE;
            }

            case "ONLY_NEED_ONE_CHECKOUT_CHARGE_VALUE": {
                return ONLY_NEED_ONE_CHECKOUT_CHARGE_VALUE;
            }

            case "ONLY_NEED_ONE_DELIVERY_POLICY_TYPE": {
                return ONLY_NEED_ONE_DELIVERY_POLICY_TYPE;
            }

            case "ONLY_NEED_ONE_PRICING_POLICY_TYPE": {
                return ONLY_NEED_ONE_PRICING_POLICY_TYPE;
            }

            case "ONLY_NEED_ONE_PRICING_POLICY_VALUE": {
                return ONLY_NEED_ONE_PRICING_POLICY_VALUE;
            }

            case "ONLY_ONE_OF_FIXED_OR_RECURRING_BILLING": {
                return ONLY_ONE_OF_FIXED_OR_RECURRING_BILLING;
            }

            case "ONLY_ONE_OF_FIXED_OR_RECURRING_DELIVERY": {
                return ONLY_ONE_OF_FIXED_OR_RECURRING_DELIVERY;
            }

            case "PLAN_DOES_NOT_EXIST": {
                return PLAN_DOES_NOT_EXIST;
            }

            case "PLAN_ID_MUST_BE_SPECIFIED_TO_UPDATE": {
                return PLAN_ID_MUST_BE_SPECIFIED_TO_UPDATE;
            }

            case "PRESENT": {
                return PRESENT;
            }

            case "PRICING_POLICY_ADJUSTMENT_VALUE_AND_TYPE_MUST_MATCH": {
                return PRICING_POLICY_ADJUSTMENT_VALUE_AND_TYPE_MUST_MATCH;
            }

            case "PRODUCT_DOES_NOT_EXIST": {
                return PRODUCT_DOES_NOT_EXIST;
            }

            case "PRODUCT_VARIANT_DOES_NOT_EXIST": {
                return PRODUCT_VARIANT_DOES_NOT_EXIST;
            }

            case "REMAINING_BALANCE_CHARGE_EXACT_TIME_NOT_ALLOWED": {
                return REMAINING_BALANCE_CHARGE_EXACT_TIME_NOT_ALLOWED;
            }

            case "REMAINING_BALANCE_CHARGE_EXACT_TIME_REQUIRED": {
                return REMAINING_BALANCE_CHARGE_EXACT_TIME_REQUIRED;
            }

            case "REMAINING_BALANCE_CHARGE_TIME_AFTER_CHECKOUT_MUST_BE_GREATER_THAN_ZERO": {
                return REMAINING_BALANCE_CHARGE_TIME_AFTER_CHECKOUT_MUST_BE_GREATER_THAN_ZERO;
            }

            case "REMAINING_BALANCE_CHARGE_TRIGGER_NO_REMAINING_BALANCE_ON_PARTIAL_PERCENTAGE_CHECKOUT_CHARGE": {
                return REMAINING_BALANCE_CHARGE_TRIGGER_NO_REMAINING_BALANCE_ON_PARTIAL_PERCENTAGE_CHECKOUT_CHARGE;
            }

            case "REMAINING_BALANCE_CHARGE_TRIGGER_NO_REMAINING_BALANCE_ON_PRICE_CHECKOUT_CHARGE": {
                return REMAINING_BALANCE_CHARGE_TRIGGER_NO_REMAINING_BALANCE_ON_PRICE_CHECKOUT_CHARGE;
            }

            case "REMAINING_BALANCE_CHARGE_TRIGGER_ON_FULL_CHECKOUT": {
                return REMAINING_BALANCE_CHARGE_TRIGGER_ON_FULL_CHECKOUT;
            }

            case "RESOURCE_LIST_CONTAINS_INVALID_IDS": {
                return RESOURCE_LIST_CONTAINS_INVALID_IDS;
            }

            case "SELLING_PLAN_ANCHORS_NOT_ALLOWED": {
                return SELLING_PLAN_ANCHORS_NOT_ALLOWED;
            }

            case "SELLING_PLAN_ANCHORS_REQUIRED": {
                return SELLING_PLAN_ANCHORS_REQUIRED;
            }

            case "SELLING_PLAN_BILLING_AND_DELIVERY_POLICY_ANCHORS_MUST_BE_EQUAL": {
                return SELLING_PLAN_BILLING_AND_DELIVERY_POLICY_ANCHORS_MUST_BE_EQUAL;
            }

            case "SELLING_PLAN_BILLING_CYCLE_MUST_BE_A_MULTIPLE_OF_DELIVERY_CYCLE": {
                return SELLING_PLAN_BILLING_CYCLE_MUST_BE_A_MULTIPLE_OF_DELIVERY_CYCLE;
            }

            case "SELLING_PLAN_BILLING_POLICY_MISSING": {
                return SELLING_PLAN_BILLING_POLICY_MISSING;
            }

            case "SELLING_PLAN_COUNT_LOWER_BOUND": {
                return SELLING_PLAN_COUNT_LOWER_BOUND;
            }

            case "SELLING_PLAN_COUNT_UPPER_BOUND": {
                return SELLING_PLAN_COUNT_UPPER_BOUND;
            }

            case "SELLING_PLAN_DELIVERY_POLICY_MISSING": {
                return SELLING_PLAN_DELIVERY_POLICY_MISSING;
            }

            case "SELLING_PLAN_DUPLICATE_NAME": {
                return SELLING_PLAN_DUPLICATE_NAME;
            }

            case "SELLING_PLAN_DUPLICATE_OPTIONS": {
                return SELLING_PLAN_DUPLICATE_OPTIONS;
            }

            case "SELLING_PLAN_FIXED_PRICING_POLICIES_LIMIT": {
                return SELLING_PLAN_FIXED_PRICING_POLICIES_LIMIT;
            }

            case "SELLING_PLAN_MAX_CYCLES_MUST_BE_GREATER_THAN_MIN_CYCLES": {
                return SELLING_PLAN_MAX_CYCLES_MUST_BE_GREATER_THAN_MIN_CYCLES;
            }

            case "SELLING_PLAN_MISSING_OPTION2_LABEL_ON_PARENT_GROUP": {
                return SELLING_PLAN_MISSING_OPTION2_LABEL_ON_PARENT_GROUP;
            }

            case "SELLING_PLAN_MISSING_OPTION3_LABEL_ON_PARENT_GROUP": {
                return SELLING_PLAN_MISSING_OPTION3_LABEL_ON_PARENT_GROUP;
            }

            case "SELLING_PLAN_OPTION2_REQUIRED_AS_DEFINED_ON_PARENT_GROUP": {
                return SELLING_PLAN_OPTION2_REQUIRED_AS_DEFINED_ON_PARENT_GROUP;
            }

            case "SELLING_PLAN_OPTION3_REQUIRED_AS_DEFINED_ON_PARENT_GROUP": {
                return SELLING_PLAN_OPTION3_REQUIRED_AS_DEFINED_ON_PARENT_GROUP;
            }

            case "SELLING_PLAN_PRICING_POLICIES_LIMIT": {
                return SELLING_PLAN_PRICING_POLICIES_LIMIT;
            }

            case "SELLING_PLAN_PRICING_POLICIES_MUST_CONTAIN_A_FIXED_PRICING_POLICY": {
                return SELLING_PLAN_PRICING_POLICIES_MUST_CONTAIN_A_FIXED_PRICING_POLICY;
            }

            case "TAKEN": {
                return TAKEN;
            }

            case "TOO_BIG": {
                return TOO_BIG;
            }

            case "TOO_LONG": {
                return TOO_LONG;
            }

            case "TOO_SHORT": {
                return TOO_SHORT;
            }

            case "WRONG_LENGTH": {
                return WRONG_LENGTH;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case BILLING_AND_DELIVERY_POLICY_TYPES_MUST_BE_THE_SAME: {
                return "BILLING_AND_DELIVERY_POLICY_TYPES_MUST_BE_THE_SAME";
            }

            case BILLING_POLICY_INTERVAL_TOO_LARGE: {
                return "BILLING_POLICY_INTERVAL_TOO_LARGE";
            }

            case BLANK: {
                return "BLANK";
            }

            case CHECKOUT_CHARGE_VALUE_AND_TYPE_MUST_MATCH: {
                return "CHECKOUT_CHARGE_VALUE_AND_TYPE_MUST_MATCH";
            }

            case DELIVERY_POLICY_INTERVAL_TOO_LARGE: {
                return "DELIVERY_POLICY_INTERVAL_TOO_LARGE";
            }

            case EQUAL_TO: {
                return "EQUAL_TO";
            }

            case ERROR_ADDING_RESOURCE_TO_GROUP: {
                return "ERROR_ADDING_RESOURCE_TO_GROUP";
            }

            case FULFILLMENT_EXACT_TIME_NOT_ALLOWED: {
                return "FULFILLMENT_EXACT_TIME_NOT_ALLOWED";
            }

            case FULFILLMENT_EXACT_TIME_REQUIRED: {
                return "FULFILLMENT_EXACT_TIME_REQUIRED";
            }

            case GREATER_THAN: {
                return "GREATER_THAN";
            }

            case GREATER_THAN_OR_EQUAL_TO: {
                return "GREATER_THAN_OR_EQUAL_TO";
            }

            case GROUP_COULD_NOT_BE_DELETED: {
                return "GROUP_COULD_NOT_BE_DELETED";
            }

            case GROUP_DOES_NOT_EXIST: {
                return "GROUP_DOES_NOT_EXIST";
            }

            case INCLUSION: {
                return "INCLUSION";
            }

            case INVALID: {
                return "INVALID";
            }

            case INVALID_INPUT: {
                return "INVALID_INPUT";
            }

            case LESS_THAN: {
                return "LESS_THAN";
            }

            case LESS_THAN_OR_EQUAL_TO: {
                return "LESS_THAN_OR_EQUAL_TO";
            }

            case NOT_A_NUMBER: {
                return "NOT_A_NUMBER";
            }

            case NOT_FOUND: {
                return "NOT_FOUND";
            }

            case ONLY_NEED_ONE_BILLING_POLICY_TYPE: {
                return "ONLY_NEED_ONE_BILLING_POLICY_TYPE";
            }

            case ONLY_NEED_ONE_CHECKOUT_CHARGE_VALUE: {
                return "ONLY_NEED_ONE_CHECKOUT_CHARGE_VALUE";
            }

            case ONLY_NEED_ONE_DELIVERY_POLICY_TYPE: {
                return "ONLY_NEED_ONE_DELIVERY_POLICY_TYPE";
            }

            case ONLY_NEED_ONE_PRICING_POLICY_TYPE: {
                return "ONLY_NEED_ONE_PRICING_POLICY_TYPE";
            }

            case ONLY_NEED_ONE_PRICING_POLICY_VALUE: {
                return "ONLY_NEED_ONE_PRICING_POLICY_VALUE";
            }

            case ONLY_ONE_OF_FIXED_OR_RECURRING_BILLING: {
                return "ONLY_ONE_OF_FIXED_OR_RECURRING_BILLING";
            }

            case ONLY_ONE_OF_FIXED_OR_RECURRING_DELIVERY: {
                return "ONLY_ONE_OF_FIXED_OR_RECURRING_DELIVERY";
            }

            case PLAN_DOES_NOT_EXIST: {
                return "PLAN_DOES_NOT_EXIST";
            }

            case PLAN_ID_MUST_BE_SPECIFIED_TO_UPDATE: {
                return "PLAN_ID_MUST_BE_SPECIFIED_TO_UPDATE";
            }

            case PRESENT: {
                return "PRESENT";
            }

            case PRICING_POLICY_ADJUSTMENT_VALUE_AND_TYPE_MUST_MATCH: {
                return "PRICING_POLICY_ADJUSTMENT_VALUE_AND_TYPE_MUST_MATCH";
            }

            case PRODUCT_DOES_NOT_EXIST: {
                return "PRODUCT_DOES_NOT_EXIST";
            }

            case PRODUCT_VARIANT_DOES_NOT_EXIST: {
                return "PRODUCT_VARIANT_DOES_NOT_EXIST";
            }

            case REMAINING_BALANCE_CHARGE_EXACT_TIME_NOT_ALLOWED: {
                return "REMAINING_BALANCE_CHARGE_EXACT_TIME_NOT_ALLOWED";
            }

            case REMAINING_BALANCE_CHARGE_EXACT_TIME_REQUIRED: {
                return "REMAINING_BALANCE_CHARGE_EXACT_TIME_REQUIRED";
            }

            case REMAINING_BALANCE_CHARGE_TIME_AFTER_CHECKOUT_MUST_BE_GREATER_THAN_ZERO: {
                return "REMAINING_BALANCE_CHARGE_TIME_AFTER_CHECKOUT_MUST_BE_GREATER_THAN_ZERO";
            }

            case REMAINING_BALANCE_CHARGE_TRIGGER_NO_REMAINING_BALANCE_ON_PARTIAL_PERCENTAGE_CHECKOUT_CHARGE: {
                return "REMAINING_BALANCE_CHARGE_TRIGGER_NO_REMAINING_BALANCE_ON_PARTIAL_PERCENTAGE_CHECKOUT_CHARGE";
            }

            case REMAINING_BALANCE_CHARGE_TRIGGER_NO_REMAINING_BALANCE_ON_PRICE_CHECKOUT_CHARGE: {
                return "REMAINING_BALANCE_CHARGE_TRIGGER_NO_REMAINING_BALANCE_ON_PRICE_CHECKOUT_CHARGE";
            }

            case REMAINING_BALANCE_CHARGE_TRIGGER_ON_FULL_CHECKOUT: {
                return "REMAINING_BALANCE_CHARGE_TRIGGER_ON_FULL_CHECKOUT";
            }

            case RESOURCE_LIST_CONTAINS_INVALID_IDS: {
                return "RESOURCE_LIST_CONTAINS_INVALID_IDS";
            }

            case SELLING_PLAN_ANCHORS_NOT_ALLOWED: {
                return "SELLING_PLAN_ANCHORS_NOT_ALLOWED";
            }

            case SELLING_PLAN_ANCHORS_REQUIRED: {
                return "SELLING_PLAN_ANCHORS_REQUIRED";
            }

            case SELLING_PLAN_BILLING_AND_DELIVERY_POLICY_ANCHORS_MUST_BE_EQUAL: {
                return "SELLING_PLAN_BILLING_AND_DELIVERY_POLICY_ANCHORS_MUST_BE_EQUAL";
            }

            case SELLING_PLAN_BILLING_CYCLE_MUST_BE_A_MULTIPLE_OF_DELIVERY_CYCLE: {
                return "SELLING_PLAN_BILLING_CYCLE_MUST_BE_A_MULTIPLE_OF_DELIVERY_CYCLE";
            }

            case SELLING_PLAN_BILLING_POLICY_MISSING: {
                return "SELLING_PLAN_BILLING_POLICY_MISSING";
            }

            case SELLING_PLAN_COUNT_LOWER_BOUND: {
                return "SELLING_PLAN_COUNT_LOWER_BOUND";
            }

            case SELLING_PLAN_COUNT_UPPER_BOUND: {
                return "SELLING_PLAN_COUNT_UPPER_BOUND";
            }

            case SELLING_PLAN_DELIVERY_POLICY_MISSING: {
                return "SELLING_PLAN_DELIVERY_POLICY_MISSING";
            }

            case SELLING_PLAN_DUPLICATE_NAME: {
                return "SELLING_PLAN_DUPLICATE_NAME";
            }

            case SELLING_PLAN_DUPLICATE_OPTIONS: {
                return "SELLING_PLAN_DUPLICATE_OPTIONS";
            }

            case SELLING_PLAN_FIXED_PRICING_POLICIES_LIMIT: {
                return "SELLING_PLAN_FIXED_PRICING_POLICIES_LIMIT";
            }

            case SELLING_PLAN_MAX_CYCLES_MUST_BE_GREATER_THAN_MIN_CYCLES: {
                return "SELLING_PLAN_MAX_CYCLES_MUST_BE_GREATER_THAN_MIN_CYCLES";
            }

            case SELLING_PLAN_MISSING_OPTION2_LABEL_ON_PARENT_GROUP: {
                return "SELLING_PLAN_MISSING_OPTION2_LABEL_ON_PARENT_GROUP";
            }

            case SELLING_PLAN_MISSING_OPTION3_LABEL_ON_PARENT_GROUP: {
                return "SELLING_PLAN_MISSING_OPTION3_LABEL_ON_PARENT_GROUP";
            }

            case SELLING_PLAN_OPTION2_REQUIRED_AS_DEFINED_ON_PARENT_GROUP: {
                return "SELLING_PLAN_OPTION2_REQUIRED_AS_DEFINED_ON_PARENT_GROUP";
            }

            case SELLING_PLAN_OPTION3_REQUIRED_AS_DEFINED_ON_PARENT_GROUP: {
                return "SELLING_PLAN_OPTION3_REQUIRED_AS_DEFINED_ON_PARENT_GROUP";
            }

            case SELLING_PLAN_PRICING_POLICIES_LIMIT: {
                return "SELLING_PLAN_PRICING_POLICIES_LIMIT";
            }

            case SELLING_PLAN_PRICING_POLICIES_MUST_CONTAIN_A_FIXED_PRICING_POLICY: {
                return "SELLING_PLAN_PRICING_POLICIES_MUST_CONTAIN_A_FIXED_PRICING_POLICY";
            }

            case TAKEN: {
                return "TAKEN";
            }

            case TOO_BIG: {
                return "TOO_BIG";
            }

            case TOO_LONG: {
                return "TOO_LONG";
            }

            case TOO_SHORT: {
                return "TOO_SHORT";
            }

            case WRONG_LENGTH: {
                return "WRONG_LENGTH";
            }

            default: {
                return "";
            }
        }
    }
}

