// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `PriceListPriceUserError`.
*/
public enum PriceListPriceUserErrorCode {
    /**
    * The input value is blank.
    */
    BLANK,

    /**
    * The specified currency doesn't match the price list's currency.
    */
    PRICE_LIST_CURRENCY_MISMATCH,

    /**
    * The price list doesn't exist.
    */
    PRICE_LIST_NOT_FOUND,

    /**
    * Only fixed prices can be deleted.
    */
    PRICE_NOT_FIXED,

    /**
    * A fixed price for the specified product variant doesn't exist.
    */
    VARIANT_NOT_FOUND,

    UNKNOWN_VALUE;

    public static PriceListPriceUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "BLANK": {
                return BLANK;
            }

            case "PRICE_LIST_CURRENCY_MISMATCH": {
                return PRICE_LIST_CURRENCY_MISMATCH;
            }

            case "PRICE_LIST_NOT_FOUND": {
                return PRICE_LIST_NOT_FOUND;
            }

            case "PRICE_NOT_FIXED": {
                return PRICE_NOT_FIXED;
            }

            case "VARIANT_NOT_FOUND": {
                return VARIANT_NOT_FOUND;
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

            case PRICE_LIST_CURRENCY_MISMATCH: {
                return "PRICE_LIST_CURRENCY_MISMATCH";
            }

            case PRICE_LIST_NOT_FOUND: {
                return "PRICE_LIST_NOT_FOUND";
            }

            case PRICE_NOT_FIXED: {
                return "PRICE_NOT_FIXED";
            }

            case VARIANT_NOT_FOUND: {
                return "VARIANT_NOT_FOUND";
            }

            default: {
                return "";
            }
        }
    }
}

