// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `DiscountUserError`.
*/
public enum DiscountErrorCode {
    /**
    * The active period overlaps with other automatic discounts. At any given time, only 25 automatic
    * discounts can be active.
    */
    ACTIVE_PERIOD_OVERLAP,

    /**
    * A discount cannot have both appliesOnOneTimePurchase and appliesOnSubscription set to false.
    */
    APPLIES_ON_NOTHING,

    /**
    * The input value is blank.
    */
    BLANK,

    /**
    * The attribute selection contains conflicting settings.
    */
    CONFLICT,

    /**
    * The input value is already present.
    */
    DUPLICATE,

    /**
    * The end date should be after the start date.
    */
    END_DATE_BEFORE_START_DATE,

    /**
    * The input value should be equal to the value allowed.
    */
    EQUAL_TO,

    /**
    * The value exceeded the maximum allowed value.
    */
    EXCEEDED_MAX,

    /**
    * The input value should be greater than the minimum allowed value.
    */
    GREATER_THAN,

    /**
    * The input value should be greater than or equal to the minimum value allowed.
    */
    GREATER_THAN_OR_EQUAL_TO,

    /**
    * The value is already present through another selection.
    */
    IMPLICIT_DUPLICATE,

    /**
    * The input value isn't included in the list.
    */
    INCLUSION,

    /**
    * Unexpected internal error happened.
    */
    INTERNAL_ERROR,

    /**
    * The input value is invalid.
    */
    INVALID,

    /**
    * The `combinesWith` settings are invalid for the discount class.
    */
    INVALID_COMBINES_WITH_FOR_DISCOUNT_CLASS,

    /**
    * The discountClass is invalid for the price rule.
    */
    INVALID_DISCOUNT_CLASS_FOR_PRICE_RULE,

    /**
    * The input value should be less than the maximum value allowed.
    */
    LESS_THAN,

    /**
    * The input value should be less than or equal to the maximum value allowed.
    */
    LESS_THAN_OR_EQUAL_TO,

    /**
    * The active period overlaps with too many other app-provided discounts. There's a limit on the number
    * of app discounts that can be active at any given time.
    */
    MAX_APP_DISCOUNTS,

    /**
    * Specify a minimum subtotal or a quantity, but not both.
    */
    MINIMUM_SUBTOTAL_AND_QUANTITY_RANGE_BOTH_PRESENT,

    /**
    * Missing a required argument.
    */
    MISSING_ARGUMENT,

    /**
    * Recurring cycle limit must be 1 when discount does not apply to subscription items.
    */
    MULTIPLE_RECURRING_CYCLE_LIMIT_FOR_NON_SUBSCRIPTION_ITEMS,

    /**
    * The input value needs to be blank.
    */
    PRESENT,

    /**
    * Recurring cycle limit must be a valid integer greater than or equal to 0.
    */
    RECURRING_CYCLE_LIMIT_NOT_A_VALID_INTEGER,

    /**
    * The input value is already taken.
    */
    TAKEN,

    /**
    * The input value is too long.
    */
    TOO_LONG,

    /**
    * Too many arguments provided.
    */
    TOO_MANY_ARGUMENTS,

    /**
    * The input value is too short.
    */
    TOO_SHORT,

    /**
    * The value is outside of the allowed range.
    */
    VALUE_OUTSIDE_RANGE,

    UNKNOWN_VALUE;

    public static DiscountErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ACTIVE_PERIOD_OVERLAP": {
                return ACTIVE_PERIOD_OVERLAP;
            }

            case "APPLIES_ON_NOTHING": {
                return APPLIES_ON_NOTHING;
            }

            case "BLANK": {
                return BLANK;
            }

            case "CONFLICT": {
                return CONFLICT;
            }

            case "DUPLICATE": {
                return DUPLICATE;
            }

            case "END_DATE_BEFORE_START_DATE": {
                return END_DATE_BEFORE_START_DATE;
            }

            case "EQUAL_TO": {
                return EQUAL_TO;
            }

            case "EXCEEDED_MAX": {
                return EXCEEDED_MAX;
            }

            case "GREATER_THAN": {
                return GREATER_THAN;
            }

            case "GREATER_THAN_OR_EQUAL_TO": {
                return GREATER_THAN_OR_EQUAL_TO;
            }

            case "IMPLICIT_DUPLICATE": {
                return IMPLICIT_DUPLICATE;
            }

            case "INCLUSION": {
                return INCLUSION;
            }

            case "INTERNAL_ERROR": {
                return INTERNAL_ERROR;
            }

            case "INVALID": {
                return INVALID;
            }

            case "INVALID_COMBINES_WITH_FOR_DISCOUNT_CLASS": {
                return INVALID_COMBINES_WITH_FOR_DISCOUNT_CLASS;
            }

            case "INVALID_DISCOUNT_CLASS_FOR_PRICE_RULE": {
                return INVALID_DISCOUNT_CLASS_FOR_PRICE_RULE;
            }

            case "LESS_THAN": {
                return LESS_THAN;
            }

            case "LESS_THAN_OR_EQUAL_TO": {
                return LESS_THAN_OR_EQUAL_TO;
            }

            case "MAX_APP_DISCOUNTS": {
                return MAX_APP_DISCOUNTS;
            }

            case "MINIMUM_SUBTOTAL_AND_QUANTITY_RANGE_BOTH_PRESENT": {
                return MINIMUM_SUBTOTAL_AND_QUANTITY_RANGE_BOTH_PRESENT;
            }

            case "MISSING_ARGUMENT": {
                return MISSING_ARGUMENT;
            }

            case "MULTIPLE_RECURRING_CYCLE_LIMIT_FOR_NON_SUBSCRIPTION_ITEMS": {
                return MULTIPLE_RECURRING_CYCLE_LIMIT_FOR_NON_SUBSCRIPTION_ITEMS;
            }

            case "PRESENT": {
                return PRESENT;
            }

            case "RECURRING_CYCLE_LIMIT_NOT_A_VALID_INTEGER": {
                return RECURRING_CYCLE_LIMIT_NOT_A_VALID_INTEGER;
            }

            case "TAKEN": {
                return TAKEN;
            }

            case "TOO_LONG": {
                return TOO_LONG;
            }

            case "TOO_MANY_ARGUMENTS": {
                return TOO_MANY_ARGUMENTS;
            }

            case "TOO_SHORT": {
                return TOO_SHORT;
            }

            case "VALUE_OUTSIDE_RANGE": {
                return VALUE_OUTSIDE_RANGE;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ACTIVE_PERIOD_OVERLAP: {
                return "ACTIVE_PERIOD_OVERLAP";
            }

            case APPLIES_ON_NOTHING: {
                return "APPLIES_ON_NOTHING";
            }

            case BLANK: {
                return "BLANK";
            }

            case CONFLICT: {
                return "CONFLICT";
            }

            case DUPLICATE: {
                return "DUPLICATE";
            }

            case END_DATE_BEFORE_START_DATE: {
                return "END_DATE_BEFORE_START_DATE";
            }

            case EQUAL_TO: {
                return "EQUAL_TO";
            }

            case EXCEEDED_MAX: {
                return "EXCEEDED_MAX";
            }

            case GREATER_THAN: {
                return "GREATER_THAN";
            }

            case GREATER_THAN_OR_EQUAL_TO: {
                return "GREATER_THAN_OR_EQUAL_TO";
            }

            case IMPLICIT_DUPLICATE: {
                return "IMPLICIT_DUPLICATE";
            }

            case INCLUSION: {
                return "INCLUSION";
            }

            case INTERNAL_ERROR: {
                return "INTERNAL_ERROR";
            }

            case INVALID: {
                return "INVALID";
            }

            case INVALID_COMBINES_WITH_FOR_DISCOUNT_CLASS: {
                return "INVALID_COMBINES_WITH_FOR_DISCOUNT_CLASS";
            }

            case INVALID_DISCOUNT_CLASS_FOR_PRICE_RULE: {
                return "INVALID_DISCOUNT_CLASS_FOR_PRICE_RULE";
            }

            case LESS_THAN: {
                return "LESS_THAN";
            }

            case LESS_THAN_OR_EQUAL_TO: {
                return "LESS_THAN_OR_EQUAL_TO";
            }

            case MAX_APP_DISCOUNTS: {
                return "MAX_APP_DISCOUNTS";
            }

            case MINIMUM_SUBTOTAL_AND_QUANTITY_RANGE_BOTH_PRESENT: {
                return "MINIMUM_SUBTOTAL_AND_QUANTITY_RANGE_BOTH_PRESENT";
            }

            case MISSING_ARGUMENT: {
                return "MISSING_ARGUMENT";
            }

            case MULTIPLE_RECURRING_CYCLE_LIMIT_FOR_NON_SUBSCRIPTION_ITEMS: {
                return "MULTIPLE_RECURRING_CYCLE_LIMIT_FOR_NON_SUBSCRIPTION_ITEMS";
            }

            case PRESENT: {
                return "PRESENT";
            }

            case RECURRING_CYCLE_LIMIT_NOT_A_VALID_INTEGER: {
                return "RECURRING_CYCLE_LIMIT_NOT_A_VALID_INTEGER";
            }

            case TAKEN: {
                return "TAKEN";
            }

            case TOO_LONG: {
                return "TOO_LONG";
            }

            case TOO_MANY_ARGUMENTS: {
                return "TOO_MANY_ARGUMENTS";
            }

            case TOO_SHORT: {
                return "TOO_SHORT";
            }

            case VALUE_OUTSIDE_RANGE: {
                return "VALUE_OUTSIDE_RANGE";
            }

            default: {
                return "";
            }
        }
    }
}

