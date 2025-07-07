// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Answers the question if prices include duties and / or taxes.
*/
public enum InclusiveDutiesPricingStrategy {
    /**
    * Add duties at checkout when configured to collect.
    */
    ADD_DUTIES_AT_CHECKOUT,

    /**
    * Include duties in price when configured to collect.
    */
    INCLUDE_DUTIES_IN_PRICE,

    UNKNOWN_VALUE;

    public static InclusiveDutiesPricingStrategy fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ADD_DUTIES_AT_CHECKOUT": {
                return ADD_DUTIES_AT_CHECKOUT;
            }

            case "INCLUDE_DUTIES_IN_PRICE": {
                return INCLUDE_DUTIES_IN_PRICE;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ADD_DUTIES_AT_CHECKOUT: {
                return "ADD_DUTIES_AT_CHECKOUT";
            }

            case INCLUDE_DUTIES_IN_PRICE: {
                return "INCLUDE_DUTIES_IN_PRICE";
            }

            default: {
                return "";
            }
        }
    }
}

