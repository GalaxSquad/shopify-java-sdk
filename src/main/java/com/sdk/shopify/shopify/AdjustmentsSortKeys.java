// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* The set of valid sort keys for the Adjustments query.
*/
public enum AdjustmentsSortKeys {
    /**
    * Sort by the `id` value.
    */
    ID,

    /**
    * Sort by relevance to the search terms when the `query` parameter is specified on the connection.
    * Don't use this sort key when no search query is specified.
    */
    RELEVANCE,

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

            case "RELEVANCE": {
                return RELEVANCE;
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

            case RELEVANCE: {
                return "RELEVANCE";
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

