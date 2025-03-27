// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* The types of behavior to use when updating inventory.
*/
public enum OrderCreateInputsInventoryBehavior {
    /**
    * Do not claim inventory.
    */
    BYPASS,

    /**
    * Ignore the product's inventory policy and claim inventory.
    */
    DECREMENT_IGNORING_POLICY,

    /**
    * Follow the product's inventory policy and claim inventory, if possible.
    */
    DECREMENT_OBEYING_POLICY,

    UNKNOWN_VALUE;

    public static OrderCreateInputsInventoryBehavior fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "BYPASS": {
                return BYPASS;
            }

            case "DECREMENT_IGNORING_POLICY": {
                return DECREMENT_IGNORING_POLICY;
            }

            case "DECREMENT_OBEYING_POLICY": {
                return DECREMENT_OBEYING_POLICY;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case BYPASS: {
                return "BYPASS";
            }

            case DECREMENT_IGNORING_POLICY: {
                return "DECREMENT_IGNORING_POLICY";
            }

            case DECREMENT_OBEYING_POLICY: {
                return "DECREMENT_OBEYING_POLICY";
            }

            default: {
                return "";
            }
        }
    }
}

