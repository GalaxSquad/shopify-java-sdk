// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The state of the payment request receipt.
*/
public enum ShopPayPaymentRequestReceiptProcessingStatusState {
    /**
    * The payment request requires action from the buyer.
    */
    ACTION_REQUIRED,

    /**
    * The payment request processing completed successfully.
    */
    COMPLETED,

    /**
    * The payment request processing failed.
    */
    FAILED,

    /**
    * The payment request currently being processed.
    */
    PROCESSING,

    /**
    * The payment request is ready and queued to be processed.
    */
    READY,

    UNKNOWN_VALUE;

    public static ShopPayPaymentRequestReceiptProcessingStatusState fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ACTION_REQUIRED": {
                return ACTION_REQUIRED;
            }

            case "COMPLETED": {
                return COMPLETED;
            }

            case "FAILED": {
                return FAILED;
            }

            case "PROCESSING": {
                return PROCESSING;
            }

            case "READY": {
                return READY;
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

            case COMPLETED: {
                return "COMPLETED";
            }

            case FAILED: {
                return "FAILED";
            }

            case PROCESSING: {
                return "PROCESSING";
            }

            case READY: {
                return "READY";
            }

            default: {
                return "";
            }
        }
    }
}

