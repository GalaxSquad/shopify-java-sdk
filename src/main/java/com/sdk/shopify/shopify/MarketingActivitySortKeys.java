// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;


import com.shopify.graphql.support.ID;

/**
* The set of valid sort keys for the MarketingActivity query.
*/
public enum MarketingActivitySortKeys {
    /**
    * Sort by the `created_at` value.
    */
    CREATED_AT,

    /**
    * Sort by the `id` value.
    */
    ID,

    /**
    * Sort by the `title` value.
    */
    TITLE,

    UNKNOWN_VALUE;

    public static MarketingActivitySortKeys fromGraphQl(String value) {
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

            case "TITLE": {
                return TITLE;
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

            case TITLE: {
                return "TITLE";
            }

            default: {
                return "";
            }
        }
    }
}

