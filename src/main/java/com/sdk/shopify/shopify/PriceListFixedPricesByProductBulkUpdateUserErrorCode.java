// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* Possible error codes that can be returned by `PriceListFixedPricesByProductBulkUpdateUserError`.
*/
public enum PriceListFixedPricesByProductBulkUpdateUserErrorCode {
    /**
    * Duplicate ID in input.
    */
    DUPLICATE_ID_IN_INPUT,

    /**
    * IDs must be mutually exclusive across add or delete operations.
    */
    ID_MUST_BE_MUTUALLY_EXCLUSIVE,

    /**
    * No update operations specified.
    */
    NO_UPDATE_OPERATIONS_SPECIFIED,

    /**
    * The currency specified does not match the price list's currency.
    */
    PRICES_TO_ADD_CURRENCY_MISMATCH,

    /**
    * Exceeded the 10000 prices to add limit.
    */
    PRICE_LIMIT_EXCEEDED,

    /**
    * Price list does not exist.
    */
    PRICE_LIST_DOES_NOT_EXIST,

    /**
    * Product does not exist.
    */
    PRODUCT_DOES_NOT_EXIST,

    UNKNOWN_VALUE;

    public static PriceListFixedPricesByProductBulkUpdateUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "DUPLICATE_ID_IN_INPUT": {
                return DUPLICATE_ID_IN_INPUT;
            }

            case "ID_MUST_BE_MUTUALLY_EXCLUSIVE": {
                return ID_MUST_BE_MUTUALLY_EXCLUSIVE;
            }

            case "NO_UPDATE_OPERATIONS_SPECIFIED": {
                return NO_UPDATE_OPERATIONS_SPECIFIED;
            }

            case "PRICES_TO_ADD_CURRENCY_MISMATCH": {
                return PRICES_TO_ADD_CURRENCY_MISMATCH;
            }

            case "PRICE_LIMIT_EXCEEDED": {
                return PRICE_LIMIT_EXCEEDED;
            }

            case "PRICE_LIST_DOES_NOT_EXIST": {
                return PRICE_LIST_DOES_NOT_EXIST;
            }

            case "PRODUCT_DOES_NOT_EXIST": {
                return PRODUCT_DOES_NOT_EXIST;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case DUPLICATE_ID_IN_INPUT: {
                return "DUPLICATE_ID_IN_INPUT";
            }

            case ID_MUST_BE_MUTUALLY_EXCLUSIVE: {
                return "ID_MUST_BE_MUTUALLY_EXCLUSIVE";
            }

            case NO_UPDATE_OPERATIONS_SPECIFIED: {
                return "NO_UPDATE_OPERATIONS_SPECIFIED";
            }

            case PRICES_TO_ADD_CURRENCY_MISMATCH: {
                return "PRICES_TO_ADD_CURRENCY_MISMATCH";
            }

            case PRICE_LIMIT_EXCEEDED: {
                return "PRICE_LIMIT_EXCEEDED";
            }

            case PRICE_LIST_DOES_NOT_EXIST: {
                return "PRICE_LIST_DOES_NOT_EXIST";
            }

            case PRODUCT_DOES_NOT_EXIST: {
                return "PRODUCT_DOES_NOT_EXIST";
            }

            default: {
                return "";
            }
        }
    }
}

