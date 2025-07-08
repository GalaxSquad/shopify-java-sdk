// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;


import com.shopify.graphql.support.ID;

/**
* The set of valid sort keys for the CustomerSavedSearch query.
*/
public enum CustomerSavedSearchSortKeys {
    /**
    * Sort by the `id` value.
    */
    ID,

    /**
    * Sort by the `name` value.
    */
    NAME,

    UNKNOWN_VALUE;

    public static CustomerSavedSearchSortKeys fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ID": {
                return ID;
            }

            case "NAME": {
                return NAME;
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

            case NAME: {
                return "NAME";
            }

            default: {
                return "";
            }
        }
    }
}

