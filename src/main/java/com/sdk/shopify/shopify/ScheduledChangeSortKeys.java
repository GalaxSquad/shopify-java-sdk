// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;


import com.shopify.graphql.support.ID;

/**
* The set of valid sort keys for the ScheduledChange query.
*/
public enum ScheduledChangeSortKeys {
    /**
    * Sort by the `expected_at` value.
    */
    EXPECTED_AT,

    /**
    * Sort by the `id` value.
    */
    ID,

    UNKNOWN_VALUE;

    public static ScheduledChangeSortKeys fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "EXPECTED_AT": {
                return EXPECTED_AT;
            }

            case "ID": {
                return ID;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case EXPECTED_AT: {
                return "EXPECTED_AT";
            }

            case ID: {
                return "ID";
            }

            default: {
                return "";
            }
        }
    }
}

