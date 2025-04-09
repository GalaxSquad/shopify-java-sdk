// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* The set of valid sort keys for the Segment query.
*/
public enum SegmentSortKeys {
    /**
    * Sort by the `creation_date` value.
    */
    CREATION_DATE,

    /**
    * Sort by the `id` value.
    */
    ID,

    /**
    * Sort by the `last_edit_date` value.
    */
    LAST_EDIT_DATE,

    /**
    * Sort by relevance to the search terms when the `query` parameter is specified on the connection.
    * Don't use this sort key when no search query is specified.
    */
    RELEVANCE,

    UNKNOWN_VALUE;

    public static SegmentSortKeys fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CREATION_DATE": {
                return CREATION_DATE;
            }

            case "ID": {
                return ID;
            }

            case "LAST_EDIT_DATE": {
                return LAST_EDIT_DATE;
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
            case CREATION_DATE: {
                return "CREATION_DATE";
            }

            case ID: {
                return "ID";
            }

            case LAST_EDIT_DATE: {
                return "LAST_EDIT_DATE";
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

