// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Represents the staged status of a CalculatedShippingLine on a CalculatedOrder.
*/
public enum CalculatedShippingLineStagedStatus {
    /**
    * The shipping line was added as part of the current order edit.
    */
    ADDED,

    /**
    * The shipping line has no staged changes associated with it.
    */
    NONE,

    /**
    * The shipping line was removed as part of the current order edit.
    */
    REMOVED,

    UNKNOWN_VALUE;

    public static CalculatedShippingLineStagedStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ADDED": {
                return ADDED;
            }

            case "NONE": {
                return NONE;
            }

            case "REMOVED": {
                return REMOVED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ADDED: {
                return "ADDED";
            }

            case NONE: {
                return "NONE";
            }

            case REMOVED: {
                return "REMOVED";
            }

            default: {
                return "";
            }
        }
    }
}

