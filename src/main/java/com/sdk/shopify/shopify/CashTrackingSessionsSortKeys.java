// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* The set of valid sort keys for the CashTrackingSessions query.
*/
public enum CashTrackingSessionsSortKeys {
    /**
    * Sort by the `closing_time_asc` value.
    */
    CLOSING_TIME_ASC,

    /**
    * Sort by the `closing_time_desc` value.
    */
    CLOSING_TIME_DESC,

    /**
    * Sort by the `id` value.
    */
    ID,

    /**
    * Sort by the `opening_time_asc` value.
    */
    OPENING_TIME_ASC,

    /**
    * Sort by the `opening_time_desc` value.
    */
    OPENING_TIME_DESC,

    /**
    * Sort by relevance to the search terms when the `query` parameter is specified on the connection.
    * Don't use this sort key when no search query is specified.
    */
    RELEVANCE,

    /**
    * Sort by the `total_discrepancy_asc` value.
    */
    TOTAL_DISCREPANCY_ASC,

    /**
    * Sort by the `total_discrepancy_desc` value.
    */
    TOTAL_DISCREPANCY_DESC,

    UNKNOWN_VALUE;

    public static CashTrackingSessionsSortKeys fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CLOSING_TIME_ASC": {
                return CLOSING_TIME_ASC;
            }

            case "CLOSING_TIME_DESC": {
                return CLOSING_TIME_DESC;
            }

            case "ID": {
                return ID;
            }

            case "OPENING_TIME_ASC": {
                return OPENING_TIME_ASC;
            }

            case "OPENING_TIME_DESC": {
                return OPENING_TIME_DESC;
            }

            case "RELEVANCE": {
                return RELEVANCE;
            }

            case "TOTAL_DISCREPANCY_ASC": {
                return TOTAL_DISCREPANCY_ASC;
            }

            case "TOTAL_DISCREPANCY_DESC": {
                return TOTAL_DISCREPANCY_DESC;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CLOSING_TIME_ASC: {
                return "CLOSING_TIME_ASC";
            }

            case CLOSING_TIME_DESC: {
                return "CLOSING_TIME_DESC";
            }

            case ID: {
                return "ID";
            }

            case OPENING_TIME_ASC: {
                return "OPENING_TIME_ASC";
            }

            case OPENING_TIME_DESC: {
                return "OPENING_TIME_DESC";
            }

            case RELEVANCE: {
                return "RELEVANCE";
            }

            case TOTAL_DISCREPANCY_ASC: {
                return "TOTAL_DISCREPANCY_ASC";
            }

            case TOTAL_DISCREPANCY_DESC: {
                return "TOTAL_DISCREPANCY_DESC";
            }

            default: {
                return "";
            }
        }
    }
}

