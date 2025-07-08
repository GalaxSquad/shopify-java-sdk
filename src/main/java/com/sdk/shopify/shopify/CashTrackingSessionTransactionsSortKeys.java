// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;


import com.shopify.graphql.support.ID;

/**
* The set of valid sort keys for the CashTrackingSessionTransactions query.
*/
public enum CashTrackingSessionTransactionsSortKeys {
    /**
    * Sort by the `id` value.
    */
    ID,

    /**
    * Sort by the `processed_at` value.
    */
    PROCESSED_AT,

    UNKNOWN_VALUE;

    public static CashTrackingSessionTransactionsSortKeys fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ID": {
                return ID;
            }

            case "PROCESSED_AT": {
                return PROCESSED_AT;
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

            case PROCESSED_AT: {
                return "PROCESSED_AT";
            }

            default: {
                return "";
            }
        }
    }
}

