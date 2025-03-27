// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

/**
* Possible error codes that can be returned by `QuantityPricingByVariantUserError`.
*/
public enum QuantityPricingByVariantUserErrorCode {
    /**
    * The input value is blank.
    */
    BLANK,

    /**
    * Something went wrong when trying to update quantity pricing. Please try again later.
    */
    GENERIC_ERROR,

    /**
    * Price list and fixed price currency mismatch.
    */
    PRICE_ADD_CURRENCY_MISMATCH,

    /**
    * Prices to add inputs must be unique by variant id.
    */
    PRICE_ADD_DUPLICATE_INPUT_FOR_VARIANT,

    /**
    * Fixed price's variant not found.
    */
    PRICE_ADD_VARIANT_NOT_FOUND,

    /**
    * Price is not fixed.
    */
    PRICE_DELETE_PRICE_NOT_FIXED,

    /**
    * Fixed price's variant not found.
    */
    PRICE_DELETE_VARIANT_NOT_FOUND,

    /**
    * Price List does not exist.
    */
    PRICE_LIST_NOT_FOUND,

    /**
    * Price list and quantity price break currency mismatch.
    */
    QUANTITY_PRICE_BREAK_ADD_CURRENCY_MISMATCH,

    /**
    * Quantity price breaks to add inputs must be unique by variant id and minimum quantity.
    */
    QUANTITY_PRICE_BREAK_ADD_DUPLICATE_INPUT_FOR_VARIANT_AND_MIN,

    /**
    * Failed to save quantity price break.
    */
    QUANTITY_PRICE_BREAK_ADD_FAILED_TO_SAVE,

    /**
    * Invalid quantity price break.
    */
    QUANTITY_PRICE_BREAK_ADD_INVALID,

    /**
    * Exceeded the allowed number of quantity price breaks per variant.
    */
    QUANTITY_PRICE_BREAK_ADD_LIMIT_EXCEEDED,

    /**
    * Quantity price break miniumum is higher than the quantity rule maximum.
    */
    QUANTITY_PRICE_BREAK_ADD_MIN_HIGHER_THAN_QUANTITY_RULES_MAX,

    /**
    * Quantity price break miniumum is less than the quantity rule minimum.
    */
    QUANTITY_PRICE_BREAK_ADD_MIN_LOWER_THAN_QUANTITY_RULES_MIN,

    /**
    * Quantity price break miniumum is not multiple of the quantity rule increment.
    */
    QUANTITY_PRICE_BREAK_ADD_MIN_NOT_A_MULTIPLE_OF_QUANTITY_RULES_INCREMENT,

    /**
    * Quantity price break's fixed price not found.
    */
    QUANTITY_PRICE_BREAK_ADD_PRICE_LIST_PRICE_NOT_FOUND,

    /**
    * Quantity price break variant not found.
    */
    QUANTITY_PRICE_BREAK_ADD_VARIANT_NOT_FOUND,

    /**
    * Failed to delete quantity price break.
    */
    QUANTITY_PRICE_BREAK_DELETE_FAILED,

    /**
    * Quantity price break not found.
    */
    QUANTITY_PRICE_BREAK_DELETE_NOT_FOUND,

    /**
    * Quantity rule catalog context not supported.
    */
    QUANTITY_RULE_ADD_CATALOG_CONTEXT_NOT_SUPPORTED,

    /**
    * Quantity rules to add inputs must be unique by variant id.
    */
    QUANTITY_RULE_ADD_DUPLICATE_INPUT_FOR_VARIANT,

    /**
    * Quantity rule increment is greater than minimum.
    */
    QUANTITY_RULE_ADD_INCREMENT_IS_GREATER_THAN_MINIMUM,

    /**
    * Quantity rule increment is less than one.
    */
    QUANTITY_RULE_ADD_INCREMENT_IS_LESS_THAN_ONE,

    /**
    * Quantity rule increment must be a multiple of the quantity price break minimum.
    */
    QUANTITY_RULE_ADD_INCREMENT_NOT_A_MULTIPLE_OF_QUANTITY_PRICE_BREAK_MIN,

    /**
    * Quantity rule maximum is less than one.
    */
    QUANTITY_RULE_ADD_MAXIMUM_IS_LESS_THAN_ONE,

    /**
    * Quantity rule maximum is not a multiple of increment.
    */
    QUANTITY_RULE_ADD_MAXIMUM_NOT_A_MULTIPLE_OF_INCREMENT,

    /**
    * Quantity rule maximum is less than the quantity price break minimum.
    */
    QUANTITY_RULE_ADD_MAX_LOWER_THAN_QUANTITY_PRICE_BREAK_MIN,

    /**
    * Quantity rule minimum is greater than maximum.
    */
    QUANTITY_RULE_ADD_MINIMUM_GREATER_THAN_MAXIMUM,

    /**
    * Quantity rule minimum is less than one.
    */
    QUANTITY_RULE_ADD_MINIMUM_IS_LESS_THAN_ONE,

    /**
    * Quantity rule minimum is not a multiple of increment.
    */
    QUANTITY_RULE_ADD_MINIMUM_NOT_A_MULTIPLE_OF_INCREMENT,

    /**
    * Quantity rule minimum is higher than the quantity price break minimum.
    */
    QUANTITY_RULE_ADD_MIN_HIGHER_THAN_QUANTITY_PRICE_BREAK_MIN,

    /**
    * Quantity rule variant not found.
    */
    QUANTITY_RULE_ADD_VARIANT_NOT_FOUND,

    /**
    * Quantity rule not found.
    */
    QUANTITY_RULE_DELETE_RULE_NOT_FOUND,

    /**
    * Quantity rule variant not found.
    */
    QUANTITY_RULE_DELETE_VARIANT_NOT_FOUND,

    UNKNOWN_VALUE;

    public static QuantityPricingByVariantUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "BLANK": {
                return BLANK;
            }

            case "GENERIC_ERROR": {
                return GENERIC_ERROR;
            }

            case "PRICE_ADD_CURRENCY_MISMATCH": {
                return PRICE_ADD_CURRENCY_MISMATCH;
            }

            case "PRICE_ADD_DUPLICATE_INPUT_FOR_VARIANT": {
                return PRICE_ADD_DUPLICATE_INPUT_FOR_VARIANT;
            }

            case "PRICE_ADD_VARIANT_NOT_FOUND": {
                return PRICE_ADD_VARIANT_NOT_FOUND;
            }

            case "PRICE_DELETE_PRICE_NOT_FIXED": {
                return PRICE_DELETE_PRICE_NOT_FIXED;
            }

            case "PRICE_DELETE_VARIANT_NOT_FOUND": {
                return PRICE_DELETE_VARIANT_NOT_FOUND;
            }

            case "PRICE_LIST_NOT_FOUND": {
                return PRICE_LIST_NOT_FOUND;
            }

            case "QUANTITY_PRICE_BREAK_ADD_CURRENCY_MISMATCH": {
                return QUANTITY_PRICE_BREAK_ADD_CURRENCY_MISMATCH;
            }

            case "QUANTITY_PRICE_BREAK_ADD_DUPLICATE_INPUT_FOR_VARIANT_AND_MIN": {
                return QUANTITY_PRICE_BREAK_ADD_DUPLICATE_INPUT_FOR_VARIANT_AND_MIN;
            }

            case "QUANTITY_PRICE_BREAK_ADD_FAILED_TO_SAVE": {
                return QUANTITY_PRICE_BREAK_ADD_FAILED_TO_SAVE;
            }

            case "QUANTITY_PRICE_BREAK_ADD_INVALID": {
                return QUANTITY_PRICE_BREAK_ADD_INVALID;
            }

            case "QUANTITY_PRICE_BREAK_ADD_LIMIT_EXCEEDED": {
                return QUANTITY_PRICE_BREAK_ADD_LIMIT_EXCEEDED;
            }

            case "QUANTITY_PRICE_BREAK_ADD_MIN_HIGHER_THAN_QUANTITY_RULES_MAX": {
                return QUANTITY_PRICE_BREAK_ADD_MIN_HIGHER_THAN_QUANTITY_RULES_MAX;
            }

            case "QUANTITY_PRICE_BREAK_ADD_MIN_LOWER_THAN_QUANTITY_RULES_MIN": {
                return QUANTITY_PRICE_BREAK_ADD_MIN_LOWER_THAN_QUANTITY_RULES_MIN;
            }

            case "QUANTITY_PRICE_BREAK_ADD_MIN_NOT_A_MULTIPLE_OF_QUANTITY_RULES_INCREMENT": {
                return QUANTITY_PRICE_BREAK_ADD_MIN_NOT_A_MULTIPLE_OF_QUANTITY_RULES_INCREMENT;
            }

            case "QUANTITY_PRICE_BREAK_ADD_PRICE_LIST_PRICE_NOT_FOUND": {
                return QUANTITY_PRICE_BREAK_ADD_PRICE_LIST_PRICE_NOT_FOUND;
            }

            case "QUANTITY_PRICE_BREAK_ADD_VARIANT_NOT_FOUND": {
                return QUANTITY_PRICE_BREAK_ADD_VARIANT_NOT_FOUND;
            }

            case "QUANTITY_PRICE_BREAK_DELETE_FAILED": {
                return QUANTITY_PRICE_BREAK_DELETE_FAILED;
            }

            case "QUANTITY_PRICE_BREAK_DELETE_NOT_FOUND": {
                return QUANTITY_PRICE_BREAK_DELETE_NOT_FOUND;
            }

            case "QUANTITY_RULE_ADD_CATALOG_CONTEXT_NOT_SUPPORTED": {
                return QUANTITY_RULE_ADD_CATALOG_CONTEXT_NOT_SUPPORTED;
            }

            case "QUANTITY_RULE_ADD_DUPLICATE_INPUT_FOR_VARIANT": {
                return QUANTITY_RULE_ADD_DUPLICATE_INPUT_FOR_VARIANT;
            }

            case "QUANTITY_RULE_ADD_INCREMENT_IS_GREATER_THAN_MINIMUM": {
                return QUANTITY_RULE_ADD_INCREMENT_IS_GREATER_THAN_MINIMUM;
            }

            case "QUANTITY_RULE_ADD_INCREMENT_IS_LESS_THAN_ONE": {
                return QUANTITY_RULE_ADD_INCREMENT_IS_LESS_THAN_ONE;
            }

            case "QUANTITY_RULE_ADD_INCREMENT_NOT_A_MULTIPLE_OF_QUANTITY_PRICE_BREAK_MIN": {
                return QUANTITY_RULE_ADD_INCREMENT_NOT_A_MULTIPLE_OF_QUANTITY_PRICE_BREAK_MIN;
            }

            case "QUANTITY_RULE_ADD_MAXIMUM_IS_LESS_THAN_ONE": {
                return QUANTITY_RULE_ADD_MAXIMUM_IS_LESS_THAN_ONE;
            }

            case "QUANTITY_RULE_ADD_MAXIMUM_NOT_A_MULTIPLE_OF_INCREMENT": {
                return QUANTITY_RULE_ADD_MAXIMUM_NOT_A_MULTIPLE_OF_INCREMENT;
            }

            case "QUANTITY_RULE_ADD_MAX_LOWER_THAN_QUANTITY_PRICE_BREAK_MIN": {
                return QUANTITY_RULE_ADD_MAX_LOWER_THAN_QUANTITY_PRICE_BREAK_MIN;
            }

            case "QUANTITY_RULE_ADD_MINIMUM_GREATER_THAN_MAXIMUM": {
                return QUANTITY_RULE_ADD_MINIMUM_GREATER_THAN_MAXIMUM;
            }

            case "QUANTITY_RULE_ADD_MINIMUM_IS_LESS_THAN_ONE": {
                return QUANTITY_RULE_ADD_MINIMUM_IS_LESS_THAN_ONE;
            }

            case "QUANTITY_RULE_ADD_MINIMUM_NOT_A_MULTIPLE_OF_INCREMENT": {
                return QUANTITY_RULE_ADD_MINIMUM_NOT_A_MULTIPLE_OF_INCREMENT;
            }

            case "QUANTITY_RULE_ADD_MIN_HIGHER_THAN_QUANTITY_PRICE_BREAK_MIN": {
                return QUANTITY_RULE_ADD_MIN_HIGHER_THAN_QUANTITY_PRICE_BREAK_MIN;
            }

            case "QUANTITY_RULE_ADD_VARIANT_NOT_FOUND": {
                return QUANTITY_RULE_ADD_VARIANT_NOT_FOUND;
            }

            case "QUANTITY_RULE_DELETE_RULE_NOT_FOUND": {
                return QUANTITY_RULE_DELETE_RULE_NOT_FOUND;
            }

            case "QUANTITY_RULE_DELETE_VARIANT_NOT_FOUND": {
                return QUANTITY_RULE_DELETE_VARIANT_NOT_FOUND;
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

            case GENERIC_ERROR: {
                return "GENERIC_ERROR";
            }

            case PRICE_ADD_CURRENCY_MISMATCH: {
                return "PRICE_ADD_CURRENCY_MISMATCH";
            }

            case PRICE_ADD_DUPLICATE_INPUT_FOR_VARIANT: {
                return "PRICE_ADD_DUPLICATE_INPUT_FOR_VARIANT";
            }

            case PRICE_ADD_VARIANT_NOT_FOUND: {
                return "PRICE_ADD_VARIANT_NOT_FOUND";
            }

            case PRICE_DELETE_PRICE_NOT_FIXED: {
                return "PRICE_DELETE_PRICE_NOT_FIXED";
            }

            case PRICE_DELETE_VARIANT_NOT_FOUND: {
                return "PRICE_DELETE_VARIANT_NOT_FOUND";
            }

            case PRICE_LIST_NOT_FOUND: {
                return "PRICE_LIST_NOT_FOUND";
            }

            case QUANTITY_PRICE_BREAK_ADD_CURRENCY_MISMATCH: {
                return "QUANTITY_PRICE_BREAK_ADD_CURRENCY_MISMATCH";
            }

            case QUANTITY_PRICE_BREAK_ADD_DUPLICATE_INPUT_FOR_VARIANT_AND_MIN: {
                return "QUANTITY_PRICE_BREAK_ADD_DUPLICATE_INPUT_FOR_VARIANT_AND_MIN";
            }

            case QUANTITY_PRICE_BREAK_ADD_FAILED_TO_SAVE: {
                return "QUANTITY_PRICE_BREAK_ADD_FAILED_TO_SAVE";
            }

            case QUANTITY_PRICE_BREAK_ADD_INVALID: {
                return "QUANTITY_PRICE_BREAK_ADD_INVALID";
            }

            case QUANTITY_PRICE_BREAK_ADD_LIMIT_EXCEEDED: {
                return "QUANTITY_PRICE_BREAK_ADD_LIMIT_EXCEEDED";
            }

            case QUANTITY_PRICE_BREAK_ADD_MIN_HIGHER_THAN_QUANTITY_RULES_MAX: {
                return "QUANTITY_PRICE_BREAK_ADD_MIN_HIGHER_THAN_QUANTITY_RULES_MAX";
            }

            case QUANTITY_PRICE_BREAK_ADD_MIN_LOWER_THAN_QUANTITY_RULES_MIN: {
                return "QUANTITY_PRICE_BREAK_ADD_MIN_LOWER_THAN_QUANTITY_RULES_MIN";
            }

            case QUANTITY_PRICE_BREAK_ADD_MIN_NOT_A_MULTIPLE_OF_QUANTITY_RULES_INCREMENT: {
                return "QUANTITY_PRICE_BREAK_ADD_MIN_NOT_A_MULTIPLE_OF_QUANTITY_RULES_INCREMENT";
            }

            case QUANTITY_PRICE_BREAK_ADD_PRICE_LIST_PRICE_NOT_FOUND: {
                return "QUANTITY_PRICE_BREAK_ADD_PRICE_LIST_PRICE_NOT_FOUND";
            }

            case QUANTITY_PRICE_BREAK_ADD_VARIANT_NOT_FOUND: {
                return "QUANTITY_PRICE_BREAK_ADD_VARIANT_NOT_FOUND";
            }

            case QUANTITY_PRICE_BREAK_DELETE_FAILED: {
                return "QUANTITY_PRICE_BREAK_DELETE_FAILED";
            }

            case QUANTITY_PRICE_BREAK_DELETE_NOT_FOUND: {
                return "QUANTITY_PRICE_BREAK_DELETE_NOT_FOUND";
            }

            case QUANTITY_RULE_ADD_CATALOG_CONTEXT_NOT_SUPPORTED: {
                return "QUANTITY_RULE_ADD_CATALOG_CONTEXT_NOT_SUPPORTED";
            }

            case QUANTITY_RULE_ADD_DUPLICATE_INPUT_FOR_VARIANT: {
                return "QUANTITY_RULE_ADD_DUPLICATE_INPUT_FOR_VARIANT";
            }

            case QUANTITY_RULE_ADD_INCREMENT_IS_GREATER_THAN_MINIMUM: {
                return "QUANTITY_RULE_ADD_INCREMENT_IS_GREATER_THAN_MINIMUM";
            }

            case QUANTITY_RULE_ADD_INCREMENT_IS_LESS_THAN_ONE: {
                return "QUANTITY_RULE_ADD_INCREMENT_IS_LESS_THAN_ONE";
            }

            case QUANTITY_RULE_ADD_INCREMENT_NOT_A_MULTIPLE_OF_QUANTITY_PRICE_BREAK_MIN: {
                return "QUANTITY_RULE_ADD_INCREMENT_NOT_A_MULTIPLE_OF_QUANTITY_PRICE_BREAK_MIN";
            }

            case QUANTITY_RULE_ADD_MAXIMUM_IS_LESS_THAN_ONE: {
                return "QUANTITY_RULE_ADD_MAXIMUM_IS_LESS_THAN_ONE";
            }

            case QUANTITY_RULE_ADD_MAXIMUM_NOT_A_MULTIPLE_OF_INCREMENT: {
                return "QUANTITY_RULE_ADD_MAXIMUM_NOT_A_MULTIPLE_OF_INCREMENT";
            }

            case QUANTITY_RULE_ADD_MAX_LOWER_THAN_QUANTITY_PRICE_BREAK_MIN: {
                return "QUANTITY_RULE_ADD_MAX_LOWER_THAN_QUANTITY_PRICE_BREAK_MIN";
            }

            case QUANTITY_RULE_ADD_MINIMUM_GREATER_THAN_MAXIMUM: {
                return "QUANTITY_RULE_ADD_MINIMUM_GREATER_THAN_MAXIMUM";
            }

            case QUANTITY_RULE_ADD_MINIMUM_IS_LESS_THAN_ONE: {
                return "QUANTITY_RULE_ADD_MINIMUM_IS_LESS_THAN_ONE";
            }

            case QUANTITY_RULE_ADD_MINIMUM_NOT_A_MULTIPLE_OF_INCREMENT: {
                return "QUANTITY_RULE_ADD_MINIMUM_NOT_A_MULTIPLE_OF_INCREMENT";
            }

            case QUANTITY_RULE_ADD_MIN_HIGHER_THAN_QUANTITY_PRICE_BREAK_MIN: {
                return "QUANTITY_RULE_ADD_MIN_HIGHER_THAN_QUANTITY_PRICE_BREAK_MIN";
            }

            case QUANTITY_RULE_ADD_VARIANT_NOT_FOUND: {
                return "QUANTITY_RULE_ADD_VARIANT_NOT_FOUND";
            }

            case QUANTITY_RULE_DELETE_RULE_NOT_FOUND: {
                return "QUANTITY_RULE_DELETE_RULE_NOT_FOUND";
            }

            case QUANTITY_RULE_DELETE_VARIANT_NOT_FOUND: {
                return "QUANTITY_RULE_DELETE_VARIANT_NOT_FOUND";
            }

            default: {
                return "";
            }
        }
    }
}

