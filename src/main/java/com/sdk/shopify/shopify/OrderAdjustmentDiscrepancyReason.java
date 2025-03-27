// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* Discrepancy reasons for order adjustments.
*/
public enum OrderAdjustmentDiscrepancyReason {
    /**
    * The discrepancy reason is customer.
    */
    CUSTOMER,

    /**
    * The discrepancy reason is damage.
    */
    DAMAGE,

    /**
    * The discrepancy reason is balance adjustment.
    */
    FULL_RETURN_BALANCING_ADJUSTMENT,

    /**
    * The discrepancy reason is pending refund.
    */
    PENDING_REFUND_DISCREPANCY,

    /**
    * The discrepancy reason is not one of the predefined reasons.
    */
    REFUND_DISCREPANCY,

    /**
    * The discrepancy reason is restocking.
    */
    RESTOCK,

    UNKNOWN_VALUE;

    public static OrderAdjustmentDiscrepancyReason fromGraphQl(String value) {
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

            case "FULL_RETURN_BALANCING_ADJUSTMENT": {
                return FULL_RETURN_BALANCING_ADJUSTMENT;
            }

            case "PENDING_REFUND_DISCREPANCY": {
                return PENDING_REFUND_DISCREPANCY;
            }

            case "REFUND_DISCREPANCY": {
                return REFUND_DISCREPANCY;
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

            case FULL_RETURN_BALANCING_ADJUSTMENT: {
                return "FULL_RETURN_BALANCING_ADJUSTMENT";
            }

            case PENDING_REFUND_DISCREPANCY: {
                return "PENDING_REFUND_DISCREPANCY";
            }

            case REFUND_DISCREPANCY: {
                return "REFUND_DISCREPANCY";
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

