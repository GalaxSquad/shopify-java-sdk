// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* The type of a payment status.
*/
public enum OrderPaymentStatusResult {
    /**
    * The payment is authorized.
    */
    AUTHORIZED,

    /**
    * The payment is captured.
    */
    CAPTURED,

    /**
    * There was an error initiating the payment.
    */
    ERROR,

    /**
    * The payment is awaiting processing.
    */
    INITIATED,

    /**
    * The payment is pending with the provider, and may take a while.
    */
    PENDING,

    /**
    * The payment is still being processed.
    */
    PROCESSING,

    /**
    * The payment is in purchased status.
    */
    PURCHASED,

    /**
    * Redirect required.
    */
    REDIRECT_REQUIRED,

    /**
    * The payment is refunded.
    */
    REFUNDED,

    /**
    * Payment can be retried.
    */
    RETRYABLE,

    /**
    * The payment succeeded.
    */
    SUCCESS,

    /**
    * Status is unknown.
    */
    UNKNOWN,

    /**
    * The payment is voided.
    */
    VOIDED,

    UNKNOWN_VALUE;

    public static OrderPaymentStatusResult fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "AUTHORIZED": {
                return AUTHORIZED;
            }

            case "CAPTURED": {
                return CAPTURED;
            }

            case "ERROR": {
                return ERROR;
            }

            case "INITIATED": {
                return INITIATED;
            }

            case "PENDING": {
                return PENDING;
            }

            case "PROCESSING": {
                return PROCESSING;
            }

            case "PURCHASED": {
                return PURCHASED;
            }

            case "REDIRECT_REQUIRED": {
                return REDIRECT_REQUIRED;
            }

            case "REFUNDED": {
                return REFUNDED;
            }

            case "RETRYABLE": {
                return RETRYABLE;
            }

            case "SUCCESS": {
                return SUCCESS;
            }

            case "UNKNOWN": {
                return UNKNOWN;
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

            case CAPTURED: {
                return "CAPTURED";
            }

            case ERROR: {
                return "ERROR";
            }

            case INITIATED: {
                return "INITIATED";
            }

            case PENDING: {
                return "PENDING";
            }

            case PROCESSING: {
                return "PROCESSING";
            }

            case PURCHASED: {
                return "PURCHASED";
            }

            case REDIRECT_REQUIRED: {
                return "REDIRECT_REQUIRED";
            }

            case REFUNDED: {
                return "REFUNDED";
            }

            case RETRYABLE: {
                return "RETRYABLE";
            }

            case SUCCESS: {
                return "SUCCESS";
            }

            case UNKNOWN: {
                return "UNKNOWN";
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

