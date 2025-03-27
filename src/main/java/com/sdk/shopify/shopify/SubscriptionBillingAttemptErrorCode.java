// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

/**
* The possible error codes associated with making billing attempts. The error codes supplement the
* `error_message` to provide consistent results and help with dunning management.
*/
public enum SubscriptionBillingAttemptErrorCode {
    /**
    * The amount is too small.
    */
    AMOUNT_TOO_SMALL,

    /**
    * There was an error during the authentication.
    */
    AUTHENTICATION_ERROR,

    /**
    * Payment method was canceled by buyer.
    */
    BUYER_CANCELED_PAYMENT_METHOD,

    /**
    * Card number was incorrect.
    */
    CARD_NUMBER_INCORRECT,

    /**
    * Customer is invalid.
    */
    CUSTOMER_INVALID,

    /**
    * Customer was not found.
    */
    CUSTOMER_NOT_FOUND,

    /**
    * Payment method is expired.
    */
    EXPIRED_PAYMENT_METHOD,

    /**
    * Fraud was suspected.
    */
    FRAUD_SUSPECTED,

    /**
    * Insufficient funds.
    */
    INSUFFICIENT_FUNDS,

    /**
    * Not enough inventory found.
    */
    INSUFFICIENT_INVENTORY,

    /**
    * The billing agreement ID or the transaction ID for the customer's payment method is invalid.
    */
    INVALID_CUSTOMER_BILLING_AGREEMENT,

    /**
    * Payment method is invalid. Please update or create a new payment method.
    */
    INVALID_PAYMENT_METHOD,

    /**
    * The shipping address is either missing or invalid.
    */
    INVALID_SHIPPING_ADDRESS,

    /**
    * No inventory location found or enabled.
    */
    INVENTORY_ALLOCATIONS_NOT_FOUND,

    /**
    * A payment has already been made for this invoice.
    */
    INVOICE_ALREADY_PAID,

    /**
    * Payment method was declined by processor.
    */
    PAYMENT_METHOD_DECLINED,

    /**
    * Payment method cannot be used with the current payment gateway test mode configuration.
    */
    PAYMENT_METHOD_INCOMPATIBLE_WITH_GATEWAY_CONFIG,

    /**
    * Payment method was not found.
    */
    PAYMENT_METHOD_NOT_FOUND,

    /**
    * Payment provider is not enabled.
    */
    PAYMENT_PROVIDER_IS_NOT_ENABLED,

    /**
    * Paypal Error General.
    */
    PAYPAL_ERROR_GENERAL,

    /**
    * Purchase Type is not supported.
    */
    PURCHASE_TYPE_NOT_SUPPORTED,

    /**
    * Gateway is in test mode and attempted to bill a live payment method.
    */
    TEST_MODE,

    /**
    * Transient error, try again later.
    */
    TRANSIENT_ERROR,

    /**
    * There was an unexpected error during the billing attempt.
    */
    UNEXPECTED_ERROR,

    UNKNOWN_VALUE;

    public static SubscriptionBillingAttemptErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "AMOUNT_TOO_SMALL": {
                return AMOUNT_TOO_SMALL;
            }

            case "AUTHENTICATION_ERROR": {
                return AUTHENTICATION_ERROR;
            }

            case "BUYER_CANCELED_PAYMENT_METHOD": {
                return BUYER_CANCELED_PAYMENT_METHOD;
            }

            case "CARD_NUMBER_INCORRECT": {
                return CARD_NUMBER_INCORRECT;
            }

            case "CUSTOMER_INVALID": {
                return CUSTOMER_INVALID;
            }

            case "CUSTOMER_NOT_FOUND": {
                return CUSTOMER_NOT_FOUND;
            }

            case "EXPIRED_PAYMENT_METHOD": {
                return EXPIRED_PAYMENT_METHOD;
            }

            case "FRAUD_SUSPECTED": {
                return FRAUD_SUSPECTED;
            }

            case "INSUFFICIENT_FUNDS": {
                return INSUFFICIENT_FUNDS;
            }

            case "INSUFFICIENT_INVENTORY": {
                return INSUFFICIENT_INVENTORY;
            }

            case "INVALID_CUSTOMER_BILLING_AGREEMENT": {
                return INVALID_CUSTOMER_BILLING_AGREEMENT;
            }

            case "INVALID_PAYMENT_METHOD": {
                return INVALID_PAYMENT_METHOD;
            }

            case "INVALID_SHIPPING_ADDRESS": {
                return INVALID_SHIPPING_ADDRESS;
            }

            case "INVENTORY_ALLOCATIONS_NOT_FOUND": {
                return INVENTORY_ALLOCATIONS_NOT_FOUND;
            }

            case "INVOICE_ALREADY_PAID": {
                return INVOICE_ALREADY_PAID;
            }

            case "PAYMENT_METHOD_DECLINED": {
                return PAYMENT_METHOD_DECLINED;
            }

            case "PAYMENT_METHOD_INCOMPATIBLE_WITH_GATEWAY_CONFIG": {
                return PAYMENT_METHOD_INCOMPATIBLE_WITH_GATEWAY_CONFIG;
            }

            case "PAYMENT_METHOD_NOT_FOUND": {
                return PAYMENT_METHOD_NOT_FOUND;
            }

            case "PAYMENT_PROVIDER_IS_NOT_ENABLED": {
                return PAYMENT_PROVIDER_IS_NOT_ENABLED;
            }

            case "PAYPAL_ERROR_GENERAL": {
                return PAYPAL_ERROR_GENERAL;
            }

            case "PURCHASE_TYPE_NOT_SUPPORTED": {
                return PURCHASE_TYPE_NOT_SUPPORTED;
            }

            case "TEST_MODE": {
                return TEST_MODE;
            }

            case "TRANSIENT_ERROR": {
                return TRANSIENT_ERROR;
            }

            case "UNEXPECTED_ERROR": {
                return UNEXPECTED_ERROR;
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

            case AUTHENTICATION_ERROR: {
                return "AUTHENTICATION_ERROR";
            }

            case BUYER_CANCELED_PAYMENT_METHOD: {
                return "BUYER_CANCELED_PAYMENT_METHOD";
            }

            case CARD_NUMBER_INCORRECT: {
                return "CARD_NUMBER_INCORRECT";
            }

            case CUSTOMER_INVALID: {
                return "CUSTOMER_INVALID";
            }

            case CUSTOMER_NOT_FOUND: {
                return "CUSTOMER_NOT_FOUND";
            }

            case EXPIRED_PAYMENT_METHOD: {
                return "EXPIRED_PAYMENT_METHOD";
            }

            case FRAUD_SUSPECTED: {
                return "FRAUD_SUSPECTED";
            }

            case INSUFFICIENT_FUNDS: {
                return "INSUFFICIENT_FUNDS";
            }

            case INSUFFICIENT_INVENTORY: {
                return "INSUFFICIENT_INVENTORY";
            }

            case INVALID_CUSTOMER_BILLING_AGREEMENT: {
                return "INVALID_CUSTOMER_BILLING_AGREEMENT";
            }

            case INVALID_PAYMENT_METHOD: {
                return "INVALID_PAYMENT_METHOD";
            }

            case INVALID_SHIPPING_ADDRESS: {
                return "INVALID_SHIPPING_ADDRESS";
            }

            case INVENTORY_ALLOCATIONS_NOT_FOUND: {
                return "INVENTORY_ALLOCATIONS_NOT_FOUND";
            }

            case INVOICE_ALREADY_PAID: {
                return "INVOICE_ALREADY_PAID";
            }

            case PAYMENT_METHOD_DECLINED: {
                return "PAYMENT_METHOD_DECLINED";
            }

            case PAYMENT_METHOD_INCOMPATIBLE_WITH_GATEWAY_CONFIG: {
                return "PAYMENT_METHOD_INCOMPATIBLE_WITH_GATEWAY_CONFIG";
            }

            case PAYMENT_METHOD_NOT_FOUND: {
                return "PAYMENT_METHOD_NOT_FOUND";
            }

            case PAYMENT_PROVIDER_IS_NOT_ENABLED: {
                return "PAYMENT_PROVIDER_IS_NOT_ENABLED";
            }

            case PAYPAL_ERROR_GENERAL: {
                return "PAYPAL_ERROR_GENERAL";
            }

            case PURCHASE_TYPE_NOT_SUPPORTED: {
                return "PURCHASE_TYPE_NOT_SUPPORTED";
            }

            case TEST_MODE: {
                return "TEST_MODE";
            }

            case TRANSIENT_ERROR: {
                return "TRANSIENT_ERROR";
            }

            case UNEXPECTED_ERROR: {
                return "UNEXPECTED_ERROR";
            }

            default: {
                return "";
            }
        }
    }
}

