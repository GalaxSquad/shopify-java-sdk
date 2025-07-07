// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by
* `OrderCreateManualPaymentOrderCreateManualPaymentError`.
*/
public enum OrderCreateManualPaymentOrderCreateManualPaymentErrorCode {
    /**
    * Amount exceeds the remaining balance.
    */
    AMOUNT_EXCEEDS_BALANCE,

    /**
    * Amount must be positive.
    */
    AMOUNT_NOT_POSITIVE,

    /**
    * Payment gateway is not found.
    */
    GATEWAY_NOT_FOUND,

    /**
    * Order is temporarily unavailable.
    */
    ORDER_IS_TEMPORARILY_UNAVAILABLE,

    /**
    * Order is not found.
    */
    ORDER_NOT_FOUND,

    /**
    * Indicates that the processedAt field is invalid, such as when it references a future date.
    */
    PROCESSED_AT_INVALID,

    UNKNOWN_VALUE;

    public static OrderCreateManualPaymentOrderCreateManualPaymentErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "AMOUNT_EXCEEDS_BALANCE": {
                return AMOUNT_EXCEEDS_BALANCE;
            }

            case "AMOUNT_NOT_POSITIVE": {
                return AMOUNT_NOT_POSITIVE;
            }

            case "GATEWAY_NOT_FOUND": {
                return GATEWAY_NOT_FOUND;
            }

            case "ORDER_IS_TEMPORARILY_UNAVAILABLE": {
                return ORDER_IS_TEMPORARILY_UNAVAILABLE;
            }

            case "ORDER_NOT_FOUND": {
                return ORDER_NOT_FOUND;
            }

            case "PROCESSED_AT_INVALID": {
                return PROCESSED_AT_INVALID;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case AMOUNT_EXCEEDS_BALANCE: {
                return "AMOUNT_EXCEEDS_BALANCE";
            }

            case AMOUNT_NOT_POSITIVE: {
                return "AMOUNT_NOT_POSITIVE";
            }

            case GATEWAY_NOT_FOUND: {
                return "GATEWAY_NOT_FOUND";
            }

            case ORDER_IS_TEMPORARILY_UNAVAILABLE: {
                return "ORDER_IS_TEMPORARILY_UNAVAILABLE";
            }

            case ORDER_NOT_FOUND: {
                return "ORDER_NOT_FOUND";
            }

            case PROCESSED_AT_INVALID: {
                return "PROCESSED_AT_INVALID";
            }

            default: {
                return "";
            }
        }
    }
}

