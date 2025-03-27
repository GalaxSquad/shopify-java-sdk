// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* The status of payments associated with the order. Can only be set when the order is created.
*/
public enum OrderCreateFinancialStatus {
    /**
    * The payments have been authorized.
    */
    AUTHORIZED,

    /**
    * The payments have been expired.
    */
    EXPIRED,

    /**
    * The payments have been paid.
    */
    PAID,

    /**
    * The order has been partially paid.
    */
    PARTIALLY_PAID,

    /**
    * The payments have been partially refunded.
    */
    PARTIALLY_REFUNDED,

    /**
    * The payments are pending. Payment might fail in this state. Check again to confirm whether the
    * payments have been paid successfully.
    */
    PENDING,

    /**
    * The payments have been refunded.
    */
    REFUNDED,

    /**
    * The payments have been voided.
    */
    VOIDED,

    UNKNOWN_VALUE;

    public static OrderCreateFinancialStatus fromGraphQl(String value) {
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

