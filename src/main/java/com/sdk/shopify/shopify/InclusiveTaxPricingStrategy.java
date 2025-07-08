// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Answers the question if prices include duties and / or taxes.
*/
public enum InclusiveTaxPricingStrategy {
    /**
    * Add taxes at checkout when configured to collect.
    */
    ADD_TAXES_AT_CHECKOUT,

    /**
    * Include taxes in price when configured to collect.
    */
    INCLUDES_TAXES_IN_PRICE,

    /**
    * Include taxes in price based on country when configured to collect.
    */
    INCLUDES_TAXES_IN_PRICE_BASED_ON_COUNTRY,

    UNKNOWN_VALUE;

    public static InclusiveTaxPricingStrategy fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ADD_TAXES_AT_CHECKOUT": {
                return ADD_TAXES_AT_CHECKOUT;
            }

            case "INCLUDES_TAXES_IN_PRICE": {
                return INCLUDES_TAXES_IN_PRICE;
            }

            case "INCLUDES_TAXES_IN_PRICE_BASED_ON_COUNTRY": {
                return INCLUDES_TAXES_IN_PRICE_BASED_ON_COUNTRY;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ADD_TAXES_AT_CHECKOUT: {
                return "ADD_TAXES_AT_CHECKOUT";
            }

            case INCLUDES_TAXES_IN_PRICE: {
                return "INCLUDES_TAXES_IN_PRICE";
            }

            case INCLUDES_TAXES_IN_PRICE_BASED_ON_COUNTRY: {
                return "INCLUDES_TAXES_IN_PRICE_BASED_ON_COUNTRY";
            }

            default: {
                return "";
            }
        }
    }
}

