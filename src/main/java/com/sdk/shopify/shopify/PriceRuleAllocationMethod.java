// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* The method by which the price rule's value is allocated to its entitled items.
*/
public enum PriceRuleAllocationMethod {
    /**
    * The value will be applied once across the entitled items.
    */
    ACROSS,

    /**
    * The value will be applied to each of the entitled items.
    */
    EACH,

    UNKNOWN_VALUE;

    public static PriceRuleAllocationMethod fromGraphQl(String value) {
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

