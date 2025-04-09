// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* The type of line (i.e. line item or shipping line) on an order that the discount is applicable
* towards.
*/
public enum DiscountApplicationTargetType {
    /**
    * The discount applies onto line items.
    */
    LINE_ITEM,

    /**
    * The discount applies onto shipping lines.
    */
    SHIPPING_LINE,

    UNKNOWN_VALUE;

    public static DiscountApplicationTargetType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "LINE_ITEM": {
                return LINE_ITEM;
            }

            case "SHIPPING_LINE": {
                return SHIPPING_LINE;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case LINE_ITEM: {
                return "LINE_ITEM";
            }

            case SHIPPING_LINE: {
                return "SHIPPING_LINE";
            }

            default: {
                return "";
            }
        }
    }
}

