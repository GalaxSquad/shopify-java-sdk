// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* The possible order action types for a sale.
*/
public enum SaleActionType {
    /**
    * A purchase or charge.
    */
    ORDER,

    /**
    * A removal or return.
    */
    RETURN,

    /**
    * An unknown order action. Represents new actions that may be added in future versions.
    */
    UNKNOWN,

    /**
    * A change to the price, taxes, or discounts for a prior purchase.
    */
    UPDATE,

    UNKNOWN_VALUE;

    public static SaleActionType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ORDER": {
                return ORDER;
            }

            case "RETURN": {
                return RETURN;
            }

            case "UNKNOWN": {
                return UNKNOWN;
            }

            case "UPDATE": {
                return UPDATE;
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

            case RETURN: {
                return "RETURN";
            }

            case UNKNOWN: {
                return "UNKNOWN";
            }

            case UPDATE: {
                return "UPDATE";
            }

            default: {
                return "";
            }
        }
    }
}

