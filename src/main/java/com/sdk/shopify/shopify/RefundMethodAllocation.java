// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The different methods that a refund amount can be allocated to.
*/
public enum RefundMethodAllocation {
    /**
    * The refund is to original payment methods.
    */
    ORIGINAL_PAYMENT_METHODS,

    /**
    * The refund is to store credit.
    */
    STORE_CREDIT,

    UNKNOWN_VALUE;

    public static RefundMethodAllocation fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ORIGINAL_PAYMENT_METHODS": {
                return ORIGINAL_PAYMENT_METHODS;
            }

            case "STORE_CREDIT": {
                return STORE_CREDIT;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ORIGINAL_PAYMENT_METHODS: {
                return "ORIGINAL_PAYMENT_METHODS";
            }

            case STORE_CREDIT: {
                return "STORE_CREDIT";
            }

            default: {
                return "";
            }
        }
    }
}

