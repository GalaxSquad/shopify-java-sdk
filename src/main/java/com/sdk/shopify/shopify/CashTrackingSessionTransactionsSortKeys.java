// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

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

    /**
    * Sort by relevance to the search terms when the `query` parameter is specified on the connection.
    * Don't use this sort key when no search query is specified.
    */
    RELEVANCE,

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

            case "RELEVANCE": {
                return RELEVANCE;
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

            case RELEVANCE: {
                return "RELEVANCE";
            }

            default: {
                return "";
            }
        }
    }
}

