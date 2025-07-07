// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* A standardized error code, independent of the payment provider.
*/
public enum ShopPayPaymentRequestReceiptProcessingStatusErrorCode {
    /**
    * The amount is too small.
    */
    AMOUNT_TOO_SMALL,

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
    * The card issuer has flagged the transaction as potentially fraudulent.
    */
    FRAUD_SUSPECTED,

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
    * The 3D Secure check failed.
    */
    THREE_D_SECURE_FAILED,

    /**
    * The gateway or merchant configuration doesn't support a feature, such as network tokenization.
    */
    UNSUPPORTED_FEATURE,

    UNKNOWN_VALUE;

    public static ShopPayPaymentRequestReceiptProcessingStatusErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "AMOUNT_TOO_SMALL": {
                return AMOUNT_TOO_SMALL;
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

            case "FRAUD_SUSPECTED": {
                return FRAUD_SUSPECTED;
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

            case "THREE_D_SECURE_FAILED": {
                return THREE_D_SECURE_FAILED;
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
            case AMOUNT_TOO_SMALL: {
                return "AMOUNT_TOO_SMALL";
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

            case FRAUD_SUSPECTED: {
                return "FRAUD_SUSPECTED";
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

            case THREE_D_SECURE_FAILED: {
                return "THREE_D_SECURE_FAILED";
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

