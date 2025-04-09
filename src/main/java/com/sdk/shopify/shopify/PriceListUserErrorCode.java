// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* Possible error codes that can be returned by `PriceListUserError`.
*/
public enum PriceListUserErrorCode {
    /**
    * An app catalog cannot be assigned to a price list.
    */
    APP_CATALOG_PRICE_LIST_ASSIGNMENT,

    /**
    * The input value is blank.
    */
    BLANK,

    /**
    * Cannot assign a catalog to a price list that also has context rules.
    */
    CATALOG_ASSIGNMENT_NOT_ALLOWED,

    /**
    * The context type of a catalog cannot be changed.
    */
    CATALOG_CANNOT_CHANGE_CONTEXT_TYPE,

    /**
    * Quantity price breaks can be associated only with company location catalogs.
    */
    CATALOG_CONTEXT_DOES_NOT_SUPPORT_QUANTITY_PRICE_BREAKS,

    /**
    * Quantity rules can be associated only with company location catalogs.
    */
    CATALOG_CONTEXT_DOES_NOT_SUPPORT_QUANTITY_RULES,

    /**
    * The specified catalog does not exist.
    */
    CATALOG_DOES_NOT_EXIST,

    /**
    * The price list currency must match the market catalog currency.
    */
    CATALOG_MARKET_AND_PRICE_LIST_CURRENCY_MISMATCH,

    /**
    * Catalog has a price list already assigned.
    */
    CATALOG_TAKEN,

    /**
    * Only one context rule option may be specified.
    */
    CONTEXT_RULE_LIMIT_ONE_OPTION,

    /**
    * A country catalog cannot be assigned to a price list.
    */
    COUNTRY_PRICE_LIST_ASSIGNMENT,

    /**
    * A price list’s currency must be the market currency.
    */
    CURRENCY_MARKET_MISMATCH,

    /**
    * The price list currency is not supported by the shop's payment gateway.
    */
    CURRENCY_NOT_SUPPORTED,

    /**
    * Something went wrong when trying to save the price list. Please try again.
    */
    GENERIC_ERROR,

    /**
    * The input value isn't included in the list.
    */
    INCLUSION,

    /**
    * The adjustment value must not be greater than 1000% for `type` `PERCENTAGE_INCREASE`.
    */
    INVALID_ADJUSTMENT_MAX_VALUE,

    /**
    * The adjustment value must not be greater than 100% for `type` `PERCENTAGE_DECREASE`.
    */
    INVALID_ADJUSTMENT_MIN_VALUE,

    /**
    * The adjustment value must be a positive value and not be greater than 100% for `type`
    * `PERCENTAGE_DECREASE` and not be greater than 1000% for `type` `PERCENTAGE_INCREASE`.
    */
    INVALID_ADJUSTMENT_VALUE,

    /**
    * The price list is currently being modified. Please try again later.
    */
    PRICE_LIST_LOCKED,

    /**
    * Cannot create price list for a primary market.
    */
    PRICE_LIST_NOT_ALLOWED_FOR_PRIMARY_MARKET,

    /**
    * The specified price list doesn't exist.
    */
    PRICE_LIST_NOT_FOUND,

    /**
    * The input value is already taken.
    */
    TAKEN,

    /**
    * The input value is too long.
    */
    TOO_LONG,

    UNKNOWN_VALUE;

    public static PriceListUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "APP_CATALOG_PRICE_LIST_ASSIGNMENT": {
                return APP_CATALOG_PRICE_LIST_ASSIGNMENT;
            }

            case "BLANK": {
                return BLANK;
            }

            case "CATALOG_ASSIGNMENT_NOT_ALLOWED": {
                return CATALOG_ASSIGNMENT_NOT_ALLOWED;
            }

            case "CATALOG_CANNOT_CHANGE_CONTEXT_TYPE": {
                return CATALOG_CANNOT_CHANGE_CONTEXT_TYPE;
            }

            case "CATALOG_CONTEXT_DOES_NOT_SUPPORT_QUANTITY_PRICE_BREAKS": {
                return CATALOG_CONTEXT_DOES_NOT_SUPPORT_QUANTITY_PRICE_BREAKS;
            }

            case "CATALOG_CONTEXT_DOES_NOT_SUPPORT_QUANTITY_RULES": {
                return CATALOG_CONTEXT_DOES_NOT_SUPPORT_QUANTITY_RULES;
            }

            case "CATALOG_DOES_NOT_EXIST": {
                return CATALOG_DOES_NOT_EXIST;
            }

            case "CATALOG_MARKET_AND_PRICE_LIST_CURRENCY_MISMATCH": {
                return CATALOG_MARKET_AND_PRICE_LIST_CURRENCY_MISMATCH;
            }

            case "CATALOG_TAKEN": {
                return CATALOG_TAKEN;
            }

            case "CONTEXT_RULE_LIMIT_ONE_OPTION": {
                return CONTEXT_RULE_LIMIT_ONE_OPTION;
            }

            case "COUNTRY_PRICE_LIST_ASSIGNMENT": {
                return COUNTRY_PRICE_LIST_ASSIGNMENT;
            }

            case "CURRENCY_MARKET_MISMATCH": {
                return CURRENCY_MARKET_MISMATCH;
            }

            case "CURRENCY_NOT_SUPPORTED": {
                return CURRENCY_NOT_SUPPORTED;
            }

            case "GENERIC_ERROR": {
                return GENERIC_ERROR;
            }

            case "INCLUSION": {
                return INCLUSION;
            }

            case "INVALID_ADJUSTMENT_MAX_VALUE": {
                return INVALID_ADJUSTMENT_MAX_VALUE;
            }

            case "INVALID_ADJUSTMENT_MIN_VALUE": {
                return INVALID_ADJUSTMENT_MIN_VALUE;
            }

            case "INVALID_ADJUSTMENT_VALUE": {
                return INVALID_ADJUSTMENT_VALUE;
            }

            case "PRICE_LIST_LOCKED": {
                return PRICE_LIST_LOCKED;
            }

            case "PRICE_LIST_NOT_ALLOWED_FOR_PRIMARY_MARKET": {
                return PRICE_LIST_NOT_ALLOWED_FOR_PRIMARY_MARKET;
            }

            case "PRICE_LIST_NOT_FOUND": {
                return PRICE_LIST_NOT_FOUND;
            }

            case "TAKEN": {
                return TAKEN;
            }

            case "TOO_LONG": {
                return TOO_LONG;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case APP_CATALOG_PRICE_LIST_ASSIGNMENT: {
                return "APP_CATALOG_PRICE_LIST_ASSIGNMENT";
            }

            case BLANK: {
                return "BLANK";
            }

            case CATALOG_ASSIGNMENT_NOT_ALLOWED: {
                return "CATALOG_ASSIGNMENT_NOT_ALLOWED";
            }

            case CATALOG_CANNOT_CHANGE_CONTEXT_TYPE: {
                return "CATALOG_CANNOT_CHANGE_CONTEXT_TYPE";
            }

            case CATALOG_CONTEXT_DOES_NOT_SUPPORT_QUANTITY_PRICE_BREAKS: {
                return "CATALOG_CONTEXT_DOES_NOT_SUPPORT_QUANTITY_PRICE_BREAKS";
            }

            case CATALOG_CONTEXT_DOES_NOT_SUPPORT_QUANTITY_RULES: {
                return "CATALOG_CONTEXT_DOES_NOT_SUPPORT_QUANTITY_RULES";
            }

            case CATALOG_DOES_NOT_EXIST: {
                return "CATALOG_DOES_NOT_EXIST";
            }

            case CATALOG_MARKET_AND_PRICE_LIST_CURRENCY_MISMATCH: {
                return "CATALOG_MARKET_AND_PRICE_LIST_CURRENCY_MISMATCH";
            }

            case CATALOG_TAKEN: {
                return "CATALOG_TAKEN";
            }

            case CONTEXT_RULE_LIMIT_ONE_OPTION: {
                return "CONTEXT_RULE_LIMIT_ONE_OPTION";
            }

            case COUNTRY_PRICE_LIST_ASSIGNMENT: {
                return "COUNTRY_PRICE_LIST_ASSIGNMENT";
            }

            case CURRENCY_MARKET_MISMATCH: {
                return "CURRENCY_MARKET_MISMATCH";
            }

            case CURRENCY_NOT_SUPPORTED: {
                return "CURRENCY_NOT_SUPPORTED";
            }

            case GENERIC_ERROR: {
                return "GENERIC_ERROR";
            }

            case INCLUSION: {
                return "INCLUSION";
            }

            case INVALID_ADJUSTMENT_MAX_VALUE: {
                return "INVALID_ADJUSTMENT_MAX_VALUE";
            }

            case INVALID_ADJUSTMENT_MIN_VALUE: {
                return "INVALID_ADJUSTMENT_MIN_VALUE";
            }

            case INVALID_ADJUSTMENT_VALUE: {
                return "INVALID_ADJUSTMENT_VALUE";
            }

            case PRICE_LIST_LOCKED: {
                return "PRICE_LIST_LOCKED";
            }

            case PRICE_LIST_NOT_ALLOWED_FOR_PRIMARY_MARKET: {
                return "PRICE_LIST_NOT_ALLOWED_FOR_PRIMARY_MARKET";
            }

            case PRICE_LIST_NOT_FOUND: {
                return "PRICE_LIST_NOT_FOUND";
            }

            case TAKEN: {
                return "TAKEN";
            }

            case TOO_LONG: {
                return "TOO_LONG";
            }

            default: {
                return "";
            }
        }
    }
}

