// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The possible values of the last billing error on a subscription contract.
*/
public enum SubscriptionContractLastBillingErrorType {
    /**
    * Subscription billing attempt error due to customer error.
    */
    CUSTOMER_ERROR,

    /**
    * Subscription billing attempt error due to inventory error.
    */
    INVENTORY_ERROR,

    /**
    * All other billing attempt errors.
    */
    OTHER,

    /**
    * Subscription billing attempt error due to payment error.
    */
    PAYMENT_ERROR,

    UNKNOWN_VALUE;

    public static SubscriptionContractLastBillingErrorType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CUSTOMER_ERROR": {
                return CUSTOMER_ERROR;
            }

            case "INVENTORY_ERROR": {
                return INVENTORY_ERROR;
            }

            case "OTHER": {
                return OTHER;
            }

            case "PAYMENT_ERROR": {
                return PAYMENT_ERROR;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CUSTOMER_ERROR: {
                return "CUSTOMER_ERROR";
            }

            case INVENTORY_ERROR: {
                return "INVENTORY_ERROR";
            }

            case OTHER: {
                return "OTHER";
            }

            case PAYMENT_ERROR: {
                return "PAYMENT_ERROR";
            }

            default: {
                return "";
            }
        }
    }
}

