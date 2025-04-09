// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* Possible error codes that can be returned by `QuantityRuleUserError`.
*/
public enum QuantityRuleUserErrorCode {
    /**
    * The input value is blank.
    */
    BLANK,

    /**
    * Quantity rules can be associated only with company location catalogs.
    */
    CATALOG_CONTEXT_DOES_NOT_SUPPORT_QUANTITY_RULES,

    /**
    * Quantity rule inputs must be unique by variant id.
    */
    DUPLICATE_INPUT_FOR_VARIANT,

    /**
    * Something went wrong when trying to save the quantity rule. Please try again later.
    */
    GENERIC_ERROR,

    /**
    * Value must be greater than or equal to 1.
    */
    GREATER_THAN_OR_EQUAL_TO,

    /**
    * Increment must be lower than or equal to the minimum.
    */
    INCREMENT_IS_GREATER_THAN_MINIMUM,

    /**
    * Increment must be a multiple of all quantity price break minimums associated with this variant in
    * the specified price list.
    */
    INCREMENT_NOT_A_MULTIPLE_OF_QUANTITY_PRICE_BREAK_MINIMUM,

    /**
    * Maximum must be greater than or equal to all quantity price break minimums associated with this
    * variant in the specified price list.
    */
    MAXIMUM_IS_LOWER_THAN_QUANTITY_PRICE_BREAK_MINIMUM,

    /**
    * The maximum must be a multiple of the increment.
    */
    MAXIMUM_NOT_MULTIPLE_OF_INCREMENT,

    /**
    * Minimum must be lower than or equal to the maximum.
    */
    MINIMUM_IS_GREATER_THAN_MAXIMUM,

    /**
    * Minimum must be less than or equal to all quantity price break minimums associated with this variant
    * in the specified price list.
    */
    MINIMUM_IS_HIGHER_THAN_QUANTITY_PRICE_BREAK_MINIMUM,

    /**
    * The minimum must be a multiple of the increment.
    */
    MINIMUM_NOT_MULTIPLE_OF_INCREMENT,

    /**
    * Price list does not exist.
    */
    PRICE_LIST_DOES_NOT_EXIST,

    /**
    * Product variant ID does not exist.
    */
    PRODUCT_VARIANT_DOES_NOT_EXIST,

    /**
    * Quantity rule for variant associated with the price list provided does not exist.
    */
    VARIANT_QUANTITY_RULE_DOES_NOT_EXIST,

    UNKNOWN_VALUE;

    public static QuantityRuleUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "BLANK": {
                return BLANK;
            }

            case "CATALOG_CONTEXT_DOES_NOT_SUPPORT_QUANTITY_RULES": {
                return CATALOG_CONTEXT_DOES_NOT_SUPPORT_QUANTITY_RULES;
            }

            case "DUPLICATE_INPUT_FOR_VARIANT": {
                return DUPLICATE_INPUT_FOR_VARIANT;
            }

            case "GENERIC_ERROR": {
                return GENERIC_ERROR;
            }

            case "GREATER_THAN_OR_EQUAL_TO": {
                return GREATER_THAN_OR_EQUAL_TO;
            }

            case "INCREMENT_IS_GREATER_THAN_MINIMUM": {
                return INCREMENT_IS_GREATER_THAN_MINIMUM;
            }

            case "INCREMENT_NOT_A_MULTIPLE_OF_QUANTITY_PRICE_BREAK_MINIMUM": {
                return INCREMENT_NOT_A_MULTIPLE_OF_QUANTITY_PRICE_BREAK_MINIMUM;
            }

            case "MAXIMUM_IS_LOWER_THAN_QUANTITY_PRICE_BREAK_MINIMUM": {
                return MAXIMUM_IS_LOWER_THAN_QUANTITY_PRICE_BREAK_MINIMUM;
            }

            case "MAXIMUM_NOT_MULTIPLE_OF_INCREMENT": {
                return MAXIMUM_NOT_MULTIPLE_OF_INCREMENT;
            }

            case "MINIMUM_IS_GREATER_THAN_MAXIMUM": {
                return MINIMUM_IS_GREATER_THAN_MAXIMUM;
            }

            case "MINIMUM_IS_HIGHER_THAN_QUANTITY_PRICE_BREAK_MINIMUM": {
                return MINIMUM_IS_HIGHER_THAN_QUANTITY_PRICE_BREAK_MINIMUM;
            }

            case "MINIMUM_NOT_MULTIPLE_OF_INCREMENT": {
                return MINIMUM_NOT_MULTIPLE_OF_INCREMENT;
            }

            case "PRICE_LIST_DOES_NOT_EXIST": {
                return PRICE_LIST_DOES_NOT_EXIST;
            }

            case "PRODUCT_VARIANT_DOES_NOT_EXIST": {
                return PRODUCT_VARIANT_DOES_NOT_EXIST;
            }

            case "VARIANT_QUANTITY_RULE_DOES_NOT_EXIST": {
                return VARIANT_QUANTITY_RULE_DOES_NOT_EXIST;
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

            case CATALOG_CONTEXT_DOES_NOT_SUPPORT_QUANTITY_RULES: {
                return "CATALOG_CONTEXT_DOES_NOT_SUPPORT_QUANTITY_RULES";
            }

            case DUPLICATE_INPUT_FOR_VARIANT: {
                return "DUPLICATE_INPUT_FOR_VARIANT";
            }

            case GENERIC_ERROR: {
                return "GENERIC_ERROR";
            }

            case GREATER_THAN_OR_EQUAL_TO: {
                return "GREATER_THAN_OR_EQUAL_TO";
            }

            case INCREMENT_IS_GREATER_THAN_MINIMUM: {
                return "INCREMENT_IS_GREATER_THAN_MINIMUM";
            }

            case INCREMENT_NOT_A_MULTIPLE_OF_QUANTITY_PRICE_BREAK_MINIMUM: {
                return "INCREMENT_NOT_A_MULTIPLE_OF_QUANTITY_PRICE_BREAK_MINIMUM";
            }

            case MAXIMUM_IS_LOWER_THAN_QUANTITY_PRICE_BREAK_MINIMUM: {
                return "MAXIMUM_IS_LOWER_THAN_QUANTITY_PRICE_BREAK_MINIMUM";
            }

            case MAXIMUM_NOT_MULTIPLE_OF_INCREMENT: {
                return "MAXIMUM_NOT_MULTIPLE_OF_INCREMENT";
            }

            case MINIMUM_IS_GREATER_THAN_MAXIMUM: {
                return "MINIMUM_IS_GREATER_THAN_MAXIMUM";
            }

            case MINIMUM_IS_HIGHER_THAN_QUANTITY_PRICE_BREAK_MINIMUM: {
                return "MINIMUM_IS_HIGHER_THAN_QUANTITY_PRICE_BREAK_MINIMUM";
            }

            case MINIMUM_NOT_MULTIPLE_OF_INCREMENT: {
                return "MINIMUM_NOT_MULTIPLE_OF_INCREMENT";
            }

            case PRICE_LIST_DOES_NOT_EXIST: {
                return "PRICE_LIST_DOES_NOT_EXIST";
            }

            case PRODUCT_VARIANT_DOES_NOT_EXIST: {
                return "PRODUCT_VARIANT_DOES_NOT_EXIST";
            }

            case VARIANT_QUANTITY_RULE_DOES_NOT_EXIST: {
                return "VARIANT_QUANTITY_RULE_DOES_NOT_EXIST";
            }

            default: {
                return "";
            }
        }
    }
}

