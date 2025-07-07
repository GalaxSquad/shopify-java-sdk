// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The possible transaction types for a payout.
*/
public enum ShopifyPaymentsPayoutTransactionType {
    /**
    * The payout is a deposit.
    */
    DEPOSIT,

    /**
    * The payout is a withdrawal.
    */
    WITHDRAWAL,

    UNKNOWN_VALUE;

    public static ShopifyPaymentsPayoutTransactionType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "DEPOSIT": {
                return DEPOSIT;
            }

            case "WITHDRAWAL": {
                return WITHDRAWAL;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case DEPOSIT: {
                return "DEPOSIT";
            }

            case WITHDRAWAL: {
                return "WITHDRAWAL";
            }

            default: {
                return "";
            }
        }
    }
}

