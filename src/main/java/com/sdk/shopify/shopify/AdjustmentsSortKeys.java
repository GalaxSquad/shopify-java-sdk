// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;


import com.shopify.graphql.support.ID;

/**
* The set of valid sort keys for the Adjustments query.
*/
public enum AdjustmentsSortKeys {
    /**
    * Sort by the `id` value.
    */
    ID,

    /**
    * Sort by the `time` value.
    */
    TIME,

    UNKNOWN_VALUE;

    public static AdjustmentsSortKeys fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ID": {
                return ID;
            }

            case "TIME": {
                return TIME;
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

            case TIME: {
                return "TIME";
            }

            default: {
                return "";
            }
        }
    }
}

