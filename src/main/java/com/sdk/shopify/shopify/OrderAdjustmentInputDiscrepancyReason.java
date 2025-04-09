// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* Discrepancy reasons for order adjustments.
*/
public enum OrderAdjustmentInputDiscrepancyReason {
    /**
    * The discrepancy reason is customer.
    */
    CUSTOMER,

    /**
    * The discrepancy reason is damage.
    */
    DAMAGE,

    /**
    * The discrepancy reason is not one of the predefined reasons.
    */
    OTHER,

    /**
    * The discrepancy reason is restocking.
    */
    RESTOCK,

    UNKNOWN_VALUE;

    public static OrderAdjustmentInputDiscrepancyReason fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CUSTOMER": {
                return CUSTOMER;
            }

            case "DAMAGE": {
                return DAMAGE;
            }

            case "OTHER": {
                return OTHER;
            }

            case "RESTOCK": {
                return RESTOCK;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CUSTOMER: {
                return "CUSTOMER";
            }

            case DAMAGE: {
                return "DAMAGE";
            }

            case OTHER: {
                return "OTHER";
            }

            case RESTOCK: {
                return "RESTOCK";
            }

            default: {
                return "";
            }
        }
    }
}

