// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Represents how the compare at price will be determined for a price list.
*/
public enum PriceListCompareAtMode {
    /**
    * The compare at price is adjusted based on percentage specified in price list.
    */
    ADJUSTED,

    /**
    * The compare at prices are set to `null` unless explicitly defined by a fixed price value.
    */
    NULLIFY,

    UNKNOWN_VALUE;

    public static PriceListCompareAtMode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ADJUSTED": {
                return ADJUSTED;
            }

            case "NULLIFY": {
                return NULLIFY;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ADJUSTED: {
                return "ADJUSTED";
            }

            case NULLIFY: {
                return "NULLIFY";
            }

            default: {
                return "";
            }
        }
    }
}

