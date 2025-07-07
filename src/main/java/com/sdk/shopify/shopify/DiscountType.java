// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The type of the subscription discount.
*/
public enum DiscountType {
    /**
    * Automatic discount type.
    */
    AUTOMATIC_DISCOUNT,

    /**
    * Code discount type.
    */
    CODE_DISCOUNT,

    /**
    * Manual discount type.
    */
    MANUAL,

    UNKNOWN_VALUE;

    public static DiscountType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "AUTOMATIC_DISCOUNT": {
                return AUTOMATIC_DISCOUNT;
            }

            case "CODE_DISCOUNT": {
                return CODE_DISCOUNT;
            }

            case "MANUAL": {
                return MANUAL;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case AUTOMATIC_DISCOUNT: {
                return "AUTOMATIC_DISCOUNT";
            }

            case CODE_DISCOUNT: {
                return "CODE_DISCOUNT";
            }

            case MANUAL: {
                return "MANUAL";
            }

            default: {
                return "";
            }
        }
    }
}

