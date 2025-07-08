// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The reason a discount on a subscription draft was rejected.
*/
public enum SubscriptionDiscountRejectionReason {
    /**
    * Discount is inactive.
    */
    CURRENTLY_INACTIVE,

    /**
    * Given customer does not qualify for the discount.
    */
    CUSTOMER_NOT_ELIGIBLE,

    /**
    * Customer usage limit has been reached.
    */
    CUSTOMER_USAGE_LIMIT_REACHED,

    /**
    * Purchase type does not qualify for the discount.
    */
    INCOMPATIBLE_PURCHASE_TYPE,

    /**
    * Internal error during discount code validation.
    */
    INTERNAL_ERROR,

    /**
    * Discount code is not found.
    */
    NOT_FOUND,

    /**
    * Discount does not apply to any of the given line items.
    */
    NO_ENTITLED_LINE_ITEMS,

    /**
    * No applicable shipping lines.
    */
    NO_ENTITLED_SHIPPING_LINES,

    /**
    * Purchase amount of items does not qualify for the discount.
    */
    PURCHASE_NOT_IN_RANGE,

    /**
    * Quantity of items does not qualify for the discount.
    */
    QUANTITY_NOT_IN_RANGE,

    /**
    * Discount usage limit has been reached.
    */
    USAGE_LIMIT_REACHED,

    UNKNOWN_VALUE;

    public static SubscriptionDiscountRejectionReason fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CURRENTLY_INACTIVE": {
                return CURRENTLY_INACTIVE;
            }

            case "CUSTOMER_NOT_ELIGIBLE": {
                return CUSTOMER_NOT_ELIGIBLE;
            }

            case "CUSTOMER_USAGE_LIMIT_REACHED": {
                return CUSTOMER_USAGE_LIMIT_REACHED;
            }

            case "INCOMPATIBLE_PURCHASE_TYPE": {
                return INCOMPATIBLE_PURCHASE_TYPE;
            }

            case "INTERNAL_ERROR": {
                return INTERNAL_ERROR;
            }

            case "NOT_FOUND": {
                return NOT_FOUND;
            }

            case "NO_ENTITLED_LINE_ITEMS": {
                return NO_ENTITLED_LINE_ITEMS;
            }

            case "NO_ENTITLED_SHIPPING_LINES": {
                return NO_ENTITLED_SHIPPING_LINES;
            }

            case "PURCHASE_NOT_IN_RANGE": {
                return PURCHASE_NOT_IN_RANGE;
            }

            case "QUANTITY_NOT_IN_RANGE": {
                return QUANTITY_NOT_IN_RANGE;
            }

            case "USAGE_LIMIT_REACHED": {
                return USAGE_LIMIT_REACHED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CURRENTLY_INACTIVE: {
                return "CURRENTLY_INACTIVE";
            }

            case CUSTOMER_NOT_ELIGIBLE: {
                return "CUSTOMER_NOT_ELIGIBLE";
            }

            case CUSTOMER_USAGE_LIMIT_REACHED: {
                return "CUSTOMER_USAGE_LIMIT_REACHED";
            }

            case INCOMPATIBLE_PURCHASE_TYPE: {
                return "INCOMPATIBLE_PURCHASE_TYPE";
            }

            case INTERNAL_ERROR: {
                return "INTERNAL_ERROR";
            }

            case NOT_FOUND: {
                return "NOT_FOUND";
            }

            case NO_ENTITLED_LINE_ITEMS: {
                return "NO_ENTITLED_LINE_ITEMS";
            }

            case NO_ENTITLED_SHIPPING_LINES: {
                return "NO_ENTITLED_SHIPPING_LINES";
            }

            case PURCHASE_NOT_IN_RANGE: {
                return "PURCHASE_NOT_IN_RANGE";
            }

            case QUANTITY_NOT_IN_RANGE: {
                return "QUANTITY_NOT_IN_RANGE";
            }

            case USAGE_LIMIT_REACHED: {
                return "USAGE_LIMIT_REACHED";
            }

            default: {
                return "";
            }
        }
    }
}

