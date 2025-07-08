// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;


import com.shopify.graphql.support.ID;

/**
* The set of valid sort keys for the FulfillmentEvent query.
*/
public enum FulfillmentEventSortKeys {
    /**
    * Sort by the `happened_at` value.
    */
    HAPPENED_AT,

    /**
    * Sort by the `id` value.
    */
    ID,

    UNKNOWN_VALUE;

    public static FulfillmentEventSortKeys fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "HAPPENED_AT": {
                return HAPPENED_AT;
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
            case HAPPENED_AT: {
                return "HAPPENED_AT";
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

