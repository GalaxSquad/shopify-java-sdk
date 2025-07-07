// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Represents the order's current financial status.
*/
public enum OrderDisplayFinancialStatus {
    /**
    * Displayed as **Authorized**. The payment provider has validated the customer's payment information.
    * This status appears only for manual payment capture and indicates payments should be captured before
    * the authorization period expires.
    */
    AUTHORIZED,

    /**
    * Displayed as **Expired**. Payment wasn't captured before the payment provider's deadline on an
    * authorized order. Some payment providers use this status to indicate failed payment processing.
    */
    EXPIRED,

    /**
    * Displayed as **Paid**. Payment was automatically or manually captured, or the order was marked as
    * paid.
    */
    PAID,

    /**
    * Displayed as **Partially paid**. A payment was manually captured for the order with an amount less
    * than the full order value.
    */
    PARTIALLY_PAID,

    /**
    * Displayed as **Partially refunded**. The amount refunded to a customer is less than the full amount
    * paid for an order.
    */
    PARTIALLY_REFUNDED,

    /**
    * Displayed as **Pending**. Orders have this status when the payment provider needs time to complete
    * the payment, or when manual payment methods are being used.
    */
    PENDING,

    /**
    * Displayed as **Refunded**. The full amount paid for an order was refunded to the customer.
    */
    REFUNDED,

    /**
    * Displayed as **Voided**. An unpaid (payment authorized but not captured) order was manually
    * canceled.
    */
    VOIDED,

    UNKNOWN_VALUE;

    public static OrderDisplayFinancialStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "AUTHORIZED": {
                return AUTHORIZED;
            }

            case "EXPIRED": {
                return EXPIRED;
            }

            case "PAID": {
                return PAID;
            }

            case "PARTIALLY_PAID": {
                return PARTIALLY_PAID;
            }

            case "PARTIALLY_REFUNDED": {
                return PARTIALLY_REFUNDED;
            }

            case "PENDING": {
                return PENDING;
            }

            case "REFUNDED": {
                return REFUNDED;
            }

            case "VOIDED": {
                return VOIDED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case AUTHORIZED: {
                return "AUTHORIZED";
            }

            case EXPIRED: {
                return "EXPIRED";
            }

            case PAID: {
                return "PAID";
            }

            case PARTIALLY_PAID: {
                return "PARTIALLY_PAID";
            }

            case PARTIALLY_REFUNDED: {
                return "PARTIALLY_REFUNDED";
            }

            case PENDING: {
                return "PENDING";
            }

            case REFUNDED: {
                return "REFUNDED";
            }

            case VOIDED: {
                return "VOIDED";
            }

            default: {
                return "";
            }
        }
    }
}

