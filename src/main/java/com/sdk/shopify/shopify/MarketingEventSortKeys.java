// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;


import com.shopify.graphql.support.ID;

/**
* The set of valid sort keys for the MarketingEvent query.
*/
public enum MarketingEventSortKeys {
    /**
    * Sort by the `id` value.
    */
    ID,

    /**
    * Sort by the `started_at` value.
    */
    STARTED_AT,

    UNKNOWN_VALUE;

    public static MarketingEventSortKeys fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ID": {
                return ID;
            }

            case "STARTED_AT": {
                return STARTED_AT;
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

            case STARTED_AT: {
                return "STARTED_AT";
            }

            default: {
                return "";
            }
        }
    }
}

