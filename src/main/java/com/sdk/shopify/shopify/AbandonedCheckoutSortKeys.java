// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;


import com.shopify.graphql.support.ID;

/**
* The set of valid sort keys for the AbandonedCheckout query.
*/
public enum AbandonedCheckoutSortKeys {
    /**
    * Sort by the `checkout_id` value.
    */
    CHECKOUT_ID,

    /**
    * Sort by the `created_at` value.
    */
    CREATED_AT,

    /**
    * Sort by the `customer_name` value.
    */
    CUSTOMER_NAME,

    /**
    * Sort by the `id` value.
    */
    ID,

    /**
    * Sort by relevance to the search terms when the `query` parameter is specified on the connection.
    * Don't use this sort key when no search query is specified.
    */
    RELEVANCE,

    /**
    * Sort by the `total_price` value.
    */
    TOTAL_PRICE,

    UNKNOWN_VALUE;

    public static AbandonedCheckoutSortKeys fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CHECKOUT_ID": {
                return CHECKOUT_ID;
            }

            case "CREATED_AT": {
                return CREATED_AT;
            }

            case "CUSTOMER_NAME": {
                return CUSTOMER_NAME;
            }

            case "ID": {
                return ID;
            }

            case "RELEVANCE": {
                return RELEVANCE;
            }

            case "TOTAL_PRICE": {
                return TOTAL_PRICE;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CHECKOUT_ID: {
                return "CHECKOUT_ID";
            }

            case CREATED_AT: {
                return "CREATED_AT";
            }

            case CUSTOMER_NAME: {
                return "CUSTOMER_NAME";
            }

            case ID: {
                return "ID";
            }

            case RELEVANCE: {
                return "RELEVANCE";
            }

            case TOTAL_PRICE: {
                return "TOTAL_PRICE";
            }

            default: {
                return "";
            }
        }
    }
}

