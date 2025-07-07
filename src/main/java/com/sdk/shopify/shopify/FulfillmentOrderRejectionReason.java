// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The reason for a fulfillment order rejection.
*/
public enum FulfillmentOrderRejectionReason {
    /**
    * The fulfillment order was rejected because of an incorrect address.
    */
    INCORRECT_ADDRESS,

    /**
    * The fulfillment order was rejected because product information is incorrect to be able to ship.
    */
    INCORRECT_PRODUCT_INFO,

    /**
    * The fulfillment order was rejected because of an ineligible product.
    */
    INELIGIBLE_PRODUCT,

    /**
    * The fulfillment order was rejected because international address shipping hasn't been enabled.
    */
    INTERNATIONAL_SHIPPING_UNAVAILABLE,

    /**
    * The fulfillment order was rejected because of invalid customer contact information.
    */
    INVALID_CONTACT_INFORMATION,

    /**
    * The fulfillment order was rejected because of an invalid SKU.
    */
    INVALID_SKU,

    /**
    * The fulfillment order was rejected because inventory is out of stock.
    */
    INVENTORY_OUT_OF_STOCK,

    /**
    * The fulfillment order was rejected because the merchant is blocked or suspended.
    */
    MERCHANT_BLOCKED_OR_SUSPENDED,

    /**
    * The fulfillment order was rejected because customs information was missing for international
    * shipping.
    */
    MISSING_CUSTOMS_INFO,

    /**
    * The fulfillment order was rejected because the order is too large.
    */
    ORDER_TOO_LARGE,

    /**
    * The fulfillment order was rejected for another reason.
    */
    OTHER,

    /**
    * The fulfillment order was rejected because the package preference was not set.
    */
    PACKAGE_PREFERENCE_NOT_SET,

    /**
    * The fulfillment order was rejected because the payment method was declined.
    */
    PAYMENT_DECLINED,

    /**
    * The fulfillment order was rejected because of an undeliverable destination.
    */
    UNDELIVERABLE_DESTINATION,

    UNKNOWN_VALUE;

    public static FulfillmentOrderRejectionReason fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "INCORRECT_ADDRESS": {
                return INCORRECT_ADDRESS;
            }

            case "INCORRECT_PRODUCT_INFO": {
                return INCORRECT_PRODUCT_INFO;
            }

            case "INELIGIBLE_PRODUCT": {
                return INELIGIBLE_PRODUCT;
            }

            case "INTERNATIONAL_SHIPPING_UNAVAILABLE": {
                return INTERNATIONAL_SHIPPING_UNAVAILABLE;
            }

            case "INVALID_CONTACT_INFORMATION": {
                return INVALID_CONTACT_INFORMATION;
            }

            case "INVALID_SKU": {
                return INVALID_SKU;
            }

            case "INVENTORY_OUT_OF_STOCK": {
                return INVENTORY_OUT_OF_STOCK;
            }

            case "MERCHANT_BLOCKED_OR_SUSPENDED": {
                return MERCHANT_BLOCKED_OR_SUSPENDED;
            }

            case "MISSING_CUSTOMS_INFO": {
                return MISSING_CUSTOMS_INFO;
            }

            case "ORDER_TOO_LARGE": {
                return ORDER_TOO_LARGE;
            }

            case "OTHER": {
                return OTHER;
            }

            case "PACKAGE_PREFERENCE_NOT_SET": {
                return PACKAGE_PREFERENCE_NOT_SET;
            }

            case "PAYMENT_DECLINED": {
                return PAYMENT_DECLINED;
            }

            case "UNDELIVERABLE_DESTINATION": {
                return UNDELIVERABLE_DESTINATION;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case INCORRECT_ADDRESS: {
                return "INCORRECT_ADDRESS";
            }

            case INCORRECT_PRODUCT_INFO: {
                return "INCORRECT_PRODUCT_INFO";
            }

            case INELIGIBLE_PRODUCT: {
                return "INELIGIBLE_PRODUCT";
            }

            case INTERNATIONAL_SHIPPING_UNAVAILABLE: {
                return "INTERNATIONAL_SHIPPING_UNAVAILABLE";
            }

            case INVALID_CONTACT_INFORMATION: {
                return "INVALID_CONTACT_INFORMATION";
            }

            case INVALID_SKU: {
                return "INVALID_SKU";
            }

            case INVENTORY_OUT_OF_STOCK: {
                return "INVENTORY_OUT_OF_STOCK";
            }

            case MERCHANT_BLOCKED_OR_SUSPENDED: {
                return "MERCHANT_BLOCKED_OR_SUSPENDED";
            }

            case MISSING_CUSTOMS_INFO: {
                return "MISSING_CUSTOMS_INFO";
            }

            case ORDER_TOO_LARGE: {
                return "ORDER_TOO_LARGE";
            }

            case OTHER: {
                return "OTHER";
            }

            case PACKAGE_PREFERENCE_NOT_SET: {
                return "PACKAGE_PREFERENCE_NOT_SET";
            }

            case PAYMENT_DECLINED: {
                return "PAYMENT_DECLINED";
            }

            case UNDELIVERABLE_DESTINATION: {
                return "UNDELIVERABLE_DESTINATION";
            }

            default: {
                return "";
            }
        }
    }
}

