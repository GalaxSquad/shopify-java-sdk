// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;


import com.shopify.graphql.support.ID;

/**
* The set of valid sort keys for the Company query.
*/
public enum CompanySortKeys {
    /**
    * Sort by the `created_at` value.
    */
    CREATED_AT,

    /**
    * Sort by the `id` value.
    */
    ID,

    /**
    * Sort by the `name` value.
    */
    NAME,

    /**
    * Sort by the `order_count` value.
    */
    ORDER_COUNT,

    /**
    * Sort by the `since_date` value.
    */
    SINCE_DATE,

    /**
    * Sort by the `total_spent` value.
    */
    TOTAL_SPENT,

    /**
    * Sort by the `updated_at` value.
    */
    UPDATED_AT,

    UNKNOWN_VALUE;

    public static CompanySortKeys fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CREATED_AT": {
                return CREATED_AT;
            }

            case "ID": {
                return ID;
            }

            case "NAME": {
                return NAME;
            }

            case "ORDER_COUNT": {
                return ORDER_COUNT;
            }

            case "SINCE_DATE": {
                return SINCE_DATE;
            }

            case "TOTAL_SPENT": {
                return TOTAL_SPENT;
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

            case ID: {
                return "ID";
            }

            case NAME: {
                return "NAME";
            }

            case ORDER_COUNT: {
                return "ORDER_COUNT";
            }

            case SINCE_DATE: {
                return "SINCE_DATE";
            }

            case TOTAL_SPENT: {
                return "TOTAL_SPENT";
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

