// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* The event that caused the store credit account transaction.
*/
public enum StoreCreditSystemEvent {
    /**
    * An adjustment was made to the store credit account.
    */
    ADJUSTMENT,

    /**
    * Store credit was returned when an authorized payment was voided.
    */
    ORDER_CANCELLATION,

    /**
    * Store credit was used as payment for an order.
    */
    ORDER_PAYMENT,

    /**
    * Store credit was refunded from an order.
    */
    ORDER_REFUND,

    /**
    * A store credit payment was reverted due to another payment method failing.
    */
    PAYMENT_FAILURE,

    /**
    * A smaller amount of store credit was captured than was originally authorized.
    */
    PAYMENT_RETURNED,

    /**
    * Tax finalization affected the store credit payment.
    */
    TAX_FINALIZATION,

    UNKNOWN_VALUE;

    public static StoreCreditSystemEvent fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ADJUSTMENT": {
                return ADJUSTMENT;
            }

            case "ORDER_CANCELLATION": {
                return ORDER_CANCELLATION;
            }

            case "ORDER_PAYMENT": {
                return ORDER_PAYMENT;
            }

            case "ORDER_REFUND": {
                return ORDER_REFUND;
            }

            case "PAYMENT_FAILURE": {
                return PAYMENT_FAILURE;
            }

            case "PAYMENT_RETURNED": {
                return PAYMENT_RETURNED;
            }

            case "TAX_FINALIZATION": {
                return TAX_FINALIZATION;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ADJUSTMENT: {
                return "ADJUSTMENT";
            }

            case ORDER_CANCELLATION: {
                return "ORDER_CANCELLATION";
            }

            case ORDER_PAYMENT: {
                return "ORDER_PAYMENT";
            }

            case ORDER_REFUND: {
                return "ORDER_REFUND";
            }

            case PAYMENT_FAILURE: {
                return "PAYMENT_FAILURE";
            }

            case PAYMENT_RETURNED: {
                return "PAYMENT_RETURNED";
            }

            case TAX_FINALIZATION: {
                return "TAX_FINALIZATION";
            }

            default: {
                return "";
            }
        }
    }
}

