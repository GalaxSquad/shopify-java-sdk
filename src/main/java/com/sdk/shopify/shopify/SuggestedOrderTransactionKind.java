// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* Specifies the kind of the suggested order transaction.
*/
public enum SuggestedOrderTransactionKind {
    /**
    * A suggested refund transaction for an order.
    */
    SUGGESTED_REFUND,

    UNKNOWN_VALUE;

    public static SuggestedOrderTransactionKind fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "SUGGESTED_REFUND": {
                return SUGGESTED_REFUND;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case SUGGESTED_REFUND: {
                return "SUGGESTED_REFUND";
            }

            default: {
                return "";
            }
        }
    }
}

