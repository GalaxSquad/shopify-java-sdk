// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The transfer status of the payout.
*/
public enum ShopifyPaymentsPayoutStatus {
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
    * The payout has been created and had transactions assigned to it, but
    * it has not yet been submitted to the bank.
    */
    SCHEDULED,

    UNKNOWN_VALUE;

    public static ShopifyPaymentsPayoutStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CANCELED": {
                return CANCELED;
            }

            case "FAILED": {
                return FAILED;
            }

            case "PAID": {
                return PAID;
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
            case CANCELED: {
                return "CANCELED";
            }

            case FAILED: {
                return "FAILED";
            }

            case PAID: {
                return "PAID";
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

