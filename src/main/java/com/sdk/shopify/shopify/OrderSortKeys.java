// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;


import com.shopify.graphql.support.ID;

/**
* The set of valid sort keys for the Order query.
*/
public enum OrderSortKeys {
    /**
    * Sort by the `created_at` value.
    */
    CREATED_AT,

    /**
    * Sort by the `customer_name` value.
    */
    CUSTOMER_NAME,

    /**
    * Sort by shipping address to analyze regional sales patterns or plan logistics.
    */
    DESTINATION,

    /**
    * Sort by the `financial_status` value.
    */
    FINANCIAL_STATUS,

    /**
    * Sort by the `fulfillment_status` value.
    */
    FULFILLMENT_STATUS,

    /**
    * Sort by the `id` value.
    */
    ID,

    /**
    * Sort by the `order_number` value.
    */
    ORDER_NUMBER,

    /**
    * Sort by the purchase order number to match external procurement systems or track recent orders.
    */
    PO_NUMBER,

    /**
    * Sort by the `processed_at` value.
    */
    PROCESSED_AT,

    /**
    * Sort by relevance to the search terms when the `query` parameter is specified on the connection.
    * Don't use this sort key when no search query is specified.
    */
    RELEVANCE,

    /**
    * Sort by the total quantity of all line items to identify large purchases or analyze inventory demand
    * patterns.
    */
    TOTAL_ITEMS_QUANTITY,

    /**
    * Sorts by the total sold price of an order in the shop currency, excluding any
    * returns/refunds/removals.
    */
    TOTAL_PRICE,

    /**
    * Sort by the `updated_at` value.
    */
    UPDATED_AT,

    UNKNOWN_VALUE;

    public static OrderSortKeys fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CREATED_AT": {
                return CREATED_AT;
            }

            case "CUSTOMER_NAME": {
                return CUSTOMER_NAME;
            }

            case "DESTINATION": {
                return DESTINATION;
            }

            case "FINANCIAL_STATUS": {
                return FINANCIAL_STATUS;
            }

            case "FULFILLMENT_STATUS": {
                return FULFILLMENT_STATUS;
            }

            case "ID": {
                return ID;
            }

            case "ORDER_NUMBER": {
                return ORDER_NUMBER;
            }

            case "PO_NUMBER": {
                return PO_NUMBER;
            }

            case "PROCESSED_AT": {
                return PROCESSED_AT;
            }

            case "RELEVANCE": {
                return RELEVANCE;
            }

            case "TOTAL_ITEMS_QUANTITY": {
                return TOTAL_ITEMS_QUANTITY;
            }

            case "TOTAL_PRICE": {
                return TOTAL_PRICE;
            }

            case "UPDATED_AT": {
                return UPDATED_AT;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CREATED_AT: {
                return "CREATED_AT";
            }

            case CUSTOMER_NAME: {
                return "CUSTOMER_NAME";
            }

            case DESTINATION: {
                return "DESTINATION";
            }

            case FINANCIAL_STATUS: {
                return "FINANCIAL_STATUS";
            }

            case FULFILLMENT_STATUS: {
                return "FULFILLMENT_STATUS";
            }

            case ID: {
                return "ID";
            }

            case ORDER_NUMBER: {
                return "ORDER_NUMBER";
            }

            case PO_NUMBER: {
                return "PO_NUMBER";
            }

            case PROCESSED_AT: {
                return "PROCESSED_AT";
            }

            case RELEVANCE: {
                return "RELEVANCE";
            }

            case TOTAL_ITEMS_QUANTITY: {
                return "TOTAL_ITEMS_QUANTITY";
            }

            case TOTAL_PRICE: {
                return "TOTAL_PRICE";
            }

            case UPDATED_AT: {
                return "UPDATED_AT";
            }

            default: {
                return "";
            }
        }
    }
}

