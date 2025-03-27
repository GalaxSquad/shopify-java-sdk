// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* A standardized error code, independent of the payment provider.
*/
public enum OrderTransactionErrorCode {
    /**
    * The payment method was invalid.
    */
    AMAZON_PAYMENTS_INVALID_PAYMENT_METHOD,

    /**
    * The maximum amount has been captured.
    */
    AMAZON_PAYMENTS_MAX_AMOUNT_CHARGED,

    /**
    * The maximum amount has been refunded.
    */
    AMAZON_PAYMENTS_MAX_AMOUNT_REFUNDED,

    /**
    * The maximum of 10 authorizations has been captured for an order.
    */
    AMAZON_PAYMENTS_MAX_AUTHORIZATIONS_CAPTURED,

    /**
    * The maximum of 10 refunds has been processed for an order.
    */
    AMAZON_PAYMENTS_MAX_REFUNDS_PROCESSED,

    /**
    * The order was canceled, which canceled all open authorizations.
    */
    AMAZON_PAYMENTS_ORDER_REFERENCE_CANCELED,

    /**
    * The order was not confirmed within three hours.
    */
    AMAZON_PAYMENTS_STALE,

    /**
    * Call the card issuer.
    */
    CALL_ISSUER,

    /**
    * The card was declined.
    */
    CARD_DECLINED,

    /**
    * There is an error in the gateway or merchant configuration.
    */
    CONFIG_ERROR,

    /**
    * The card is expired.
    */
    EXPIRED_CARD,

    /**
    * There was an unknown error with processing the payment.
    */
    GENERIC_ERROR,

    /**
    * The address does not match the card number.
    */
    INCORRECT_ADDRESS,

    /**
    * The CVC does not match the card number.
    */
    INCORRECT_CVC,

    /**
    * The card number is incorrect.
    */
    INCORRECT_NUMBER,

    /**
    * The entered PIN is incorrect.
    */
    INCORRECT_PIN,

    /**
    * The ZIP or postal code does not match the card number.
    */
    INCORRECT_ZIP,

    /**
    * The amount is either too high or too low for the provider.
    */
    INVALID_AMOUNT,

    /**
    * The payment method is not available in the customer's country.
    */
    INVALID_COUNTRY,

    /**
    * The format of the CVC is incorrect.
    */
    INVALID_CVC,

    /**
    * The format of the expiry date is incorrect.
    */
    INVALID_EXPIRY_DATE,

    /**
    * The format of the card number is incorrect.
    */
    INVALID_NUMBER,

    /**
    * The payment method is momentarily unavailable.
    */
    PAYMENT_METHOD_UNAVAILABLE,

    /**
    * The card has been reported as lost or stolen, and the card issuer has requested that the merchant
    * keep the card and call the number on the back.
    */
    PICK_UP_CARD,

    /**
    * There was an error while processing the payment.
    */
    PROCESSING_ERROR,

    /**
    * A real card was used but the gateway was in test mode.
    */
    TEST_MODE_LIVE_CARD,

    /**
    * The gateway or merchant configuration doesn't support a feature, such as network tokenization.
    */
    UNSUPPORTED_FEATURE,

    UNKNOWN_VALUE;

    public static OrderTransactionErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "AMAZON_PAYMENTS_INVALID_PAYMENT_METHOD": {
                return AMAZON_PAYMENTS_INVALID_PAYMENT_METHOD;
            }

            case "AMAZON_PAYMENTS_MAX_AMOUNT_CHARGED": {
                return AMAZON_PAYMENTS_MAX_AMOUNT_CHARGED;
            }

            case "AMAZON_PAYMENTS_MAX_AMOUNT_REFUNDED": {
                return AMAZON_PAYMENTS_MAX_AMOUNT_REFUNDED;
            }

            case "AMAZON_PAYMENTS_MAX_AUTHORIZATIONS_CAPTURED": {
                return AMAZON_PAYMENTS_MAX_AUTHORIZATIONS_CAPTURED;
            }

            case "AMAZON_PAYMENTS_MAX_REFUNDS_PROCESSED": {
                return AMAZON_PAYMENTS_MAX_REFUNDS_PROCESSED;
            }

            case "AMAZON_PAYMENTS_ORDER_REFERENCE_CANCELED": {
                return AMAZON_PAYMENTS_ORDER_REFERENCE_CANCELED;
            }

            case "AMAZON_PAYMENTS_STALE": {
                return AMAZON_PAYMENTS_STALE;
            }

            case "CALL_ISSUER": {
                return CALL_ISSUER;
            }

            case "CARD_DECLINED": {
                return CARD_DECLINED;
            }

            case "CONFIG_ERROR": {
                return CONFIG_ERROR;
            }

            case "EXPIRED_CARD": {
                return EXPIRED_CARD;
            }

            case "GENERIC_ERROR": {
                return GENERIC_ERROR;
            }

            case "INCORRECT_ADDRESS": {
                return INCORRECT_ADDRESS;
            }

            case "INCORRECT_CVC": {
                return INCORRECT_CVC;
            }

            case "INCORRECT_NUMBER": {
                return INCORRECT_NUMBER;
            }

            case "INCORRECT_PIN": {
                return INCORRECT_PIN;
            }

            case "INCORRECT_ZIP": {
                return INCORRECT_ZIP;
            }

            case "INVALID_AMOUNT": {
                return INVALID_AMOUNT;
            }

            case "INVALID_COUNTRY": {
                return INVALID_COUNTRY;
            }

            case "INVALID_CVC": {
                return INVALID_CVC;
            }

            case "INVALID_EXPIRY_DATE": {
                return INVALID_EXPIRY_DATE;
            }

            case "INVALID_NUMBER": {
                return INVALID_NUMBER;
            }

            case "PAYMENT_METHOD_UNAVAILABLE": {
                return PAYMENT_METHOD_UNAVAILABLE;
            }

            case "PICK_UP_CARD": {
                return PICK_UP_CARD;
            }

            case "PROCESSING_ERROR": {
                return PROCESSING_ERROR;
            }

            case "TEST_MODE_LIVE_CARD": {
                return TEST_MODE_LIVE_CARD;
            }

            case "UNSUPPORTED_FEATURE": {
                return UNSUPPORTED_FEATURE;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case AMAZON_PAYMENTS_INVALID_PAYMENT_METHOD: {
                return "AMAZON_PAYMENTS_INVALID_PAYMENT_METHOD";
            }

            case AMAZON_PAYMENTS_MAX_AMOUNT_CHARGED: {
                return "AMAZON_PAYMENTS_MAX_AMOUNT_CHARGED";
            }

            case AMAZON_PAYMENTS_MAX_AMOUNT_REFUNDED: {
                return "AMAZON_PAYMENTS_MAX_AMOUNT_REFUNDED";
            }

            case AMAZON_PAYMENTS_MAX_AUTHORIZATIONS_CAPTURED: {
                return "AMAZON_PAYMENTS_MAX_AUTHORIZATIONS_CAPTURED";
            }

            case AMAZON_PAYMENTS_MAX_REFUNDS_PROCESSED: {
                return "AMAZON_PAYMENTS_MAX_REFUNDS_PROCESSED";
            }

            case AMAZON_PAYMENTS_ORDER_REFERENCE_CANCELED: {
                return "AMAZON_PAYMENTS_ORDER_REFERENCE_CANCELED";
            }

            case AMAZON_PAYMENTS_STALE: {
                return "AMAZON_PAYMENTS_STALE";
            }

            case CALL_ISSUER: {
                return "CALL_ISSUER";
            }

            case CARD_DECLINED: {
                return "CARD_DECLINED";
            }

            case CONFIG_ERROR: {
                return "CONFIG_ERROR";
            }

            case EXPIRED_CARD: {
                return "EXPIRED_CARD";
            }

            case GENERIC_ERROR: {
                return "GENERIC_ERROR";
            }

            case INCORRECT_ADDRESS: {
                return "INCORRECT_ADDRESS";
            }

            case INCORRECT_CVC: {
                return "INCORRECT_CVC";
            }

            case INCORRECT_NUMBER: {
                return "INCORRECT_NUMBER";
            }

            case INCORRECT_PIN: {
                return "INCORRECT_PIN";
            }

            case INCORRECT_ZIP: {
                return "INCORRECT_ZIP";
            }

            case INVALID_AMOUNT: {
                return "INVALID_AMOUNT";
            }

            case INVALID_COUNTRY: {
                return "INVALID_COUNTRY";
            }

            case INVALID_CVC: {
                return "INVALID_CVC";
            }

            case INVALID_EXPIRY_DATE: {
                return "INVALID_EXPIRY_DATE";
            }

            case INVALID_NUMBER: {
                return "INVALID_NUMBER";
            }

            case PAYMENT_METHOD_UNAVAILABLE: {
                return "PAYMENT_METHOD_UNAVAILABLE";
            }

            case PICK_UP_CARD: {
                return "PICK_UP_CARD";
            }

            case PROCESSING_ERROR: {
                return "PROCESSING_ERROR";
            }

            case TEST_MODE_LIVE_CARD: {
                return "TEST_MODE_LIVE_CARD";
            }

            case UNSUPPORTED_FEATURE: {
                return "UNSUPPORTED_FEATURE";
            }

            default: {
                return "";
            }
        }
    }
}

