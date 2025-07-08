// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The reason for a fulfillment hold.
*/
public enum FulfillmentHoldReason {
    /**
    * The fulfillment hold is applied because payment is pending.
    */
    AWAITING_PAYMENT,

    /**
    * The fulfillment hold is applied because of return items not yet received during an exchange.
    */
    AWAITING_RETURN_ITEMS,

    /**
    * The fulfillment hold is applied because of a high risk of fraud.
    */
    HIGH_RISK_OF_FRAUD,

    /**
    * The fulfillment hold is applied because of an incorrect address.
    */
    INCORRECT_ADDRESS,

    /**
    * The fulfillment hold is applied because inventory is out of stock.
    */
    INVENTORY_OUT_OF_STOCK,

    /**
    * The fulfillment hold is applied because of a post purchase upsell offer.
    */
    ONLINE_STORE_POST_PURCHASE_CROSS_SELL,

    /**
    * The fulfillment hold is applied for another reason.
    */
    OTHER,

    /**
    * The fulfillment hold is applied because of an unknown delivery date.
    */
    UNKNOWN_DELIVERY_DATE,

    UNKNOWN_VALUE;

    public static FulfillmentHoldReason fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "AWAITING_PAYMENT": {
                return AWAITING_PAYMENT;
            }

            case "AWAITING_RETURN_ITEMS": {
                return AWAITING_RETURN_ITEMS;
            }

            case "HIGH_RISK_OF_FRAUD": {
                return HIGH_RISK_OF_FRAUD;
            }

            case "INCORRECT_ADDRESS": {
                return INCORRECT_ADDRESS;
            }

            case "INVENTORY_OUT_OF_STOCK": {
                return INVENTORY_OUT_OF_STOCK;
            }

            case "ONLINE_STORE_POST_PURCHASE_CROSS_SELL": {
                return ONLINE_STORE_POST_PURCHASE_CROSS_SELL;
            }

            case "OTHER": {
                return OTHER;
            }

            case "UNKNOWN_DELIVERY_DATE": {
                return UNKNOWN_DELIVERY_DATE;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case AWAITING_PAYMENT: {
                return "AWAITING_PAYMENT";
            }

            case AWAITING_RETURN_ITEMS: {
                return "AWAITING_RETURN_ITEMS";
            }

            case HIGH_RISK_OF_FRAUD: {
                return "HIGH_RISK_OF_FRAUD";
            }

            case INCORRECT_ADDRESS: {
                return "INCORRECT_ADDRESS";
            }

            case INVENTORY_OUT_OF_STOCK: {
                return "INVENTORY_OUT_OF_STOCK";
            }

            case ONLINE_STORE_POST_PURCHASE_CROSS_SELL: {
                return "ONLINE_STORE_POST_PURCHASE_CROSS_SELL";
            }

            case OTHER: {
                return "OTHER";
            }

            case UNKNOWN_DELIVERY_DATE: {
                return "UNKNOWN_DELIVERY_DATE";
            }

            default: {
                return "";
            }
        }
    }
}

