// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* The origin of quantity rule on a price list.
*/
public enum QuantityRuleOriginType {
    /**
    * Quantity rule is explicitly defined.
    */
    FIXED,

    /**
    * Quantity rule falls back to the relative rule.
    */
    RELATIVE,

    UNKNOWN_VALUE;

    public static QuantityRuleOriginType fromGraphQl(String value) {
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

