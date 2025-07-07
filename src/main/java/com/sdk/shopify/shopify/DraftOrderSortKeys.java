// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;


import com.shopify.graphql.support.ID;

/**
* The set of valid sort keys for the DraftOrder query.
*/
public enum DraftOrderSortKeys {
    /**
    * Sort by the `customer_name` value.
    */
    CUSTOMER_NAME,

    /**
    * Sort by the `id` value.
    */
    ID,

    /**
    * Sort by the `number` value.
    */
    NUMBER,

    /**
    * Sort by relevance to the search terms when the `query` parameter is specified on the connection.
    * Don't use this sort key when no search query is specified.
    */
    RELEVANCE,

    /**
    * Sort by the `status` value.
    */
    STATUS,

    /**
    * Sort by the `total_price` value.
    */
    TOTAL_PRICE,

    /**
    * Sort by the `updated_at` value.
    */
    UPDATED_AT,

    UNKNOWN_VALUE;

    public static DraftOrderSortKeys fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CUSTOMER_NAME": {
                return CUSTOMER_NAME;
            }

            case "ID": {
                return ID;
            }

            case "NUMBER": {
                return NUMBER;
            }

            case "RELEVANCE": {
                return RELEVANCE;
            }

            case "STATUS": {
                return STATUS;
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
            case CUSTOMER_NAME: {
                return "CUSTOMER_NAME";
            }

            case ID: {
                return "ID";
            }

            case NUMBER: {
                return "NUMBER";
            }

            case RELEVANCE: {
                return "RELEVANCE";
            }

            case STATUS: {
                return "STATUS";
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

