// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Represents the origin of a price, either fixed (defined on the price list) or relative (calculated
* using a price list adjustment configuration). For examples, refer to
* [PriceList](https://shopify.dev/api/admin-graphql/latest/queries/priceList#section-examples).
*/
public enum PriceListPriceOriginType {
    /**
    * The price is defined on the price list.
    */
    FIXED,

    /**
    * The price is relative to the adjustment type and value.
    */
    RELATIVE,

    UNKNOWN_VALUE;

    public static PriceListPriceOriginType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "FIXED": {
                return FIXED;
            }

            case "RELATIVE": {
                return RELATIVE;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case FIXED: {
                return "FIXED";
            }

            case RELATIVE: {
                return "RELATIVE";
            }

            default: {
                return "";
            }
        }
    }
}

