// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* The lines on the order to which the discount is applied, of the type defined by
* the discount application's `targetType`. For example, the value `ENTITLED`, combined with a
* `targetType` of
* `LINE_ITEM`, applies the discount on all line items that are entitled to the discount.
* The value `ALL`, combined with a `targetType` of `SHIPPING_LINE`, applies the discount on all
* shipping lines.
*/
public enum DiscountApplicationTargetSelection {
    /**
    * The discount is allocated onto all the lines.
    */
    ALL,

    /**
    * The discount is allocated onto only the lines that it's entitled for.
    */
    ENTITLED,

    /**
    * The discount is allocated onto explicitly chosen lines.
    */
    EXPLICIT,

    UNKNOWN_VALUE;

    public static DiscountApplicationTargetSelection fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ALL": {
                return ALL;
            }

            case "ENTITLED": {
                return ENTITLED;
            }

            case "EXPLICIT": {
                return EXPLICIT;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ALL: {
                return "ALL";
            }

            case ENTITLED: {
                return "ENTITLED";
            }

            case EXPLICIT: {
                return "EXPLICIT";
            }

            default: {
                return "";
            }
        }
    }
}

