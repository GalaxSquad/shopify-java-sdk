// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;


import com.shopify.graphql.support.ID;

/**
* The set of valid sort keys for the ProductMedia query.
*/
public enum ProductMediaSortKeys {
    /**
    * Sort by the `id` value.
    */
    ID,

    /**
    * Sort by the `position` value.
    */
    POSITION,

    UNKNOWN_VALUE;

    public static ProductMediaSortKeys fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ID": {
                return ID;
            }

            case "POSITION": {
                return POSITION;
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

            case POSITION: {
                return "POSITION";
            }

            default: {
                return "";
            }
        }
    }
}

