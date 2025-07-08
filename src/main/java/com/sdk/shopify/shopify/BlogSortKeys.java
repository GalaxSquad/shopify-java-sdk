// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;


import com.shopify.graphql.support.ID;

/**
* The set of valid sort keys for the Blog query.
*/
public enum BlogSortKeys {
    /**
    * Sort by the `handle` value.
    */
    HANDLE,

    /**
    * Sort by the `id` value.
    */
    ID,

    /**
    * Sort by the `title` value.
    */
    TITLE,

    UNKNOWN_VALUE;

    public static BlogSortKeys fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "HANDLE": {
                return HANDLE;
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
            case HANDLE: {
                return "HANDLE";
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

