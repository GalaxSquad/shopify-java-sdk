// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;


/**
* The set of valid sort keys for the GiftCard query.
*/
public enum GiftCardSortKeys {
    /**
    * Sort by the `amount_spent` value.
    */
    AMOUNT_SPENT,

    /**
    * Sort by the `balance` value.
    */
    BALANCE,

    /**
    * Sort by the `code` value.
    */
    CODE,

    /**
    * Sort by the `created_at` value.
    */
    CREATED_AT,

    /**
    * Sort by the `customer_name` value.
    */
    CUSTOMER_NAME,

    /**
    * Sort by the `disabled_at` value.
    */
    DISABLED_AT,

    /**
    * Sort by the `expires_on` value.
    */
    EXPIRES_ON,

    /**
    * Sort by the `id` value.
    */
    ID,

    /**
    * Sort by the `initial_value` value.
    */
    INITIAL_VALUE,

    /**
    * Sort by relevance to the search terms when the `query` parameter is specified on the connection.
    * Don't use this sort key when no search query is specified.
    */
    RELEVANCE,

    /**
    * Sort by the `updated_at` value.
    */
    UPDATED_AT,

    UNKNOWN_VALUE;

    public static GiftCardSortKeys fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "AMOUNT_SPENT": {
                return AMOUNT_SPENT;
            }

            case "BALANCE": {
                return BALANCE;
            }

            case "CODE": {
                return CODE;
            }

            case "CREATED_AT": {
                return CREATED_AT;
            }

            case "CUSTOMER_NAME": {
                return CUSTOMER_NAME;
            }

            case "DISABLED_AT": {
                return DISABLED_AT;
            }

            case "EXPIRES_ON": {
                return EXPIRES_ON;
            }

            case "ID": {
                return ID;
            }

            case "INITIAL_VALUE": {
                return INITIAL_VALUE;
            }

            case "RELEVANCE": {
                return RELEVANCE;
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
            case AMOUNT_SPENT: {
                return "AMOUNT_SPENT";
            }

            case BALANCE: {
                return "BALANCE";
            }

            case CODE: {
                return "CODE";
            }

            case CREATED_AT: {
                return "CREATED_AT";
            }

            case CUSTOMER_NAME: {
                return "CUSTOMER_NAME";
            }

            case DISABLED_AT: {
                return "DISABLED_AT";
            }

            case EXPIRES_ON: {
                return "EXPIRES_ON";
            }

            case ID: {
                return "ID";
            }

            case INITIAL_VALUE: {
                return "INITIAL_VALUE";
            }

            case RELEVANCE: {
                return "RELEVANCE";
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

