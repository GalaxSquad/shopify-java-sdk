// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* The [discount
* class](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
* that's used to control how discounts can be combined.
*/
public enum MerchandiseDiscountClass {
    /**
    * The discount is combined with an
    * [order
    * discount](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
    * class.
    */
    ORDER,

    /**
    * The discount is combined with a
    * [product
    * discount](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
    * class.
    */
    PRODUCT,

    UNKNOWN_VALUE;

    public static MerchandiseDiscountClass fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ORDER": {
                return ORDER;
            }

            case "PRODUCT": {
                return PRODUCT;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ORDER: {
                return "ORDER";
            }

            case PRODUCT: {
                return "PRODUCT";
            }

            default: {
                return "";
            }
        }
    }
}

