// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `OrderCreateMandatePaymentUserError`.
*/
public enum OrderCreateMandatePaymentUserErrorCode {
    /**
    * Errors for mandate payment on order.
    */
    ORDER_MANDATE_PAYMENT_ERROR_CODE,

    UNKNOWN_VALUE;

    public static OrderCreateMandatePaymentUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ORDER_MANDATE_PAYMENT_ERROR_CODE": {
                return ORDER_MANDATE_PAYMENT_ERROR_CODE;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ORDER_MANDATE_PAYMENT_ERROR_CODE: {
                return "ORDER_MANDATE_PAYMENT_ERROR_CODE";
            }

            default: {
                return "";
            }
        }
    }
}

