// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* The level at which the discount's value is applied.
*/
public enum DiscountApplicationLevel {
    /**
    * The discount is applied at the line level.
    * Line level discounts are factored into the discountedUnitPriceSet on line items.
    */
    LINE,

    /**
    * The discount is applied at the order level.
    * Order level discounts are not factored into the discountedUnitPriceSet on line items.
    */
    ORDER,

    UNKNOWN_VALUE;

    public static DiscountApplicationLevel fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "LINE": {
                return LINE;
            }

            case "ORDER": {
                return ORDER;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case LINE: {
                return "LINE";
            }

            case ORDER: {
                return "ORDER";
            }

            default: {
                return "";
            }
        }
    }
}

