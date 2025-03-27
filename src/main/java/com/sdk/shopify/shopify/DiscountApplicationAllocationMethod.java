// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* The method by which the discount's value is allocated onto its entitled lines.
*/
public enum DiscountApplicationAllocationMethod {
    /**
    * The value is spread across all entitled lines.
    */
    ACROSS,

    /**
    * The value is applied onto every entitled line.
    */
    EACH,

    UNKNOWN_VALUE;

    public static DiscountApplicationAllocationMethod fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ACROSS": {
                return ACROSS;
            }

            case "EACH": {
                return EACH;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ACROSS: {
                return "ACROSS";
            }

            case EACH: {
                return "EACH";
            }

            default: {
                return "";
            }
        }
    }
}

