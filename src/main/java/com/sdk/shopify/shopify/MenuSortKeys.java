// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;


import com.shopify.graphql.support.ID;

/**
* The set of valid sort keys for the Menu query.
*/
public enum MenuSortKeys {
    /**
    * Sort by the `id` value.
    */
    ID,

    /**
    * Sort by the `title` value.
    */
    TITLE,

    /**
    * Sort by the `updated_at` value.
    */
    UPDATED_AT,

    UNKNOWN_VALUE;

    public static MenuSortKeys fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ID": {
                return ID;
            }

            case "TITLE": {
                return TITLE;
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
            case ID: {
                return "ID";
            }

            case TITLE: {
                return "TITLE";
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

