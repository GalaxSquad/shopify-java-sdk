// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The payout status of the balance transaction.
*/
public enum ShopifyPaymentsBalanceTransactionPayoutStatus {
    /**
    * The transaction requires action before it can be paid out.
    */
    ACTION_REQUIRED,

    /**
    * The payout has been canceled by Shopify.
    */
    CANCELED,

    /**
    * The payout has been declined by the bank.
    */
    FAILED,

    /**
    * The payout has been successfully deposited into the bank.
    */
    PAID,

    /**
    * The transaction has not been assigned a payout yet.
    */
    PENDING,

    /**
    * The payout has been created and had transactions assigned to it, but
    * it has not yet been submitted to the bank.
    */
    SCHEDULED,

    UNKNOWN_VALUE;

    public static ShopifyPaymentsBalanceTransactionPayoutStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ACTION_REQUIRED": {
                return ACTION_REQUIRED;
            }

            case "CANCELED": {
                return CANCELED;
            }

            case "FAILED": {
                return FAILED;
            }

            case "PAID": {
                return PAID;
            }

            case "PENDING": {
                return PENDING;
            }

            case "SCHEDULED": {
                return SCHEDULED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ACTION_REQUIRED: {
                return "ACTION_REQUIRED";
            }

            case CANCELED: {
                return "CANCELED";
            }

            case FAILED: {
                return "FAILED";
            }

            case PAID: {
                return "PAID";
            }

            case PENDING: {
                return "PENDING";
            }

            case SCHEDULED: {
                return "SCHEDULED";
            }

            default: {
                return "";
            }
        }
    }
}

