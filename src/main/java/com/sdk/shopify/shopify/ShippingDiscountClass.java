// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* The [discount
* class](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
* that's used to control how discounts can be combined.
*/
public enum ShippingDiscountClass {
    /**
    * Combined as a shipping discount.
    */
    SHIPPING,

    UNKNOWN_VALUE;

    public static ShippingDiscountClass fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "SHIPPING": {
                return SHIPPING;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case SHIPPING: {
                return "SHIPPING";
            }

            default: {
                return "";
            }
        }
    }
}

