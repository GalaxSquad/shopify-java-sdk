// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `MarketCurrencySettingsUserError`.
*/
public enum MarketCurrencySettingsUserErrorCode {
    /**
    * The currency settings of the given market cannot be changed because the market manager has exclusive
    * control of pricing.
    */
    MANAGED_MARKET,

    /**
    * The specified market wasn't found.
    */
    MARKET_NOT_FOUND,

    /**
    * The shop's payment gateway does not support enabling more than one currency.
    */
    MULTIPLE_CURRENCIES_NOT_SUPPORTED,

    /**
    * Can't enable or disable local currencies on a single country market.
    */
    NO_LOCAL_CURRENCIES_ON_SINGLE_COUNTRY_MARKET,

    /**
    * The primary market must use the shop currency.
    */
    PRIMARY_MARKET_USES_SHOP_CURRENCY,

    /**
    * This action is restricted if unified markets is enabled.
    */
    UNIFIED_MARKETS_ENABLED,

    /**
    * The specified currency is not supported.
    */
    UNSUPPORTED_CURRENCY,

    UNKNOWN_VALUE;

    public static MarketCurrencySettingsUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "MANAGED_MARKET": {
                return MANAGED_MARKET;
            }

            case "MARKET_NOT_FOUND": {
                return MARKET_NOT_FOUND;
            }

            case "MULTIPLE_CURRENCIES_NOT_SUPPORTED": {
                return MULTIPLE_CURRENCIES_NOT_SUPPORTED;
            }

            case "NO_LOCAL_CURRENCIES_ON_SINGLE_COUNTRY_MARKET": {
                return NO_LOCAL_CURRENCIES_ON_SINGLE_COUNTRY_MARKET;
            }

            case "PRIMARY_MARKET_USES_SHOP_CURRENCY": {
                return PRIMARY_MARKET_USES_SHOP_CURRENCY;
            }

            case "UNIFIED_MARKETS_ENABLED": {
                return UNIFIED_MARKETS_ENABLED;
            }

            case "UNSUPPORTED_CURRENCY": {
                return UNSUPPORTED_CURRENCY;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case MANAGED_MARKET: {
                return "MANAGED_MARKET";
            }

            case MARKET_NOT_FOUND: {
                return "MARKET_NOT_FOUND";
            }

            case MULTIPLE_CURRENCIES_NOT_SUPPORTED: {
                return "MULTIPLE_CURRENCIES_NOT_SUPPORTED";
            }

            case NO_LOCAL_CURRENCIES_ON_SINGLE_COUNTRY_MARKET: {
                return "NO_LOCAL_CURRENCIES_ON_SINGLE_COUNTRY_MARKET";
            }

            case PRIMARY_MARKET_USES_SHOP_CURRENCY: {
                return "PRIMARY_MARKET_USES_SHOP_CURRENCY";
            }

            case UNIFIED_MARKETS_ENABLED: {
                return "UNIFIED_MARKETS_ENABLED";
            }

            case UNSUPPORTED_CURRENCY: {
                return "UNSUPPORTED_CURRENCY";
            }

            default: {
                return "";
            }
        }
    }
}

