// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;


/**
* The set of valid sort keys for the DiscountCode query.
*/
public enum DiscountCodeSortKeys {
    /**
    * Sort by the `code` value.
    */
    CODE,

    /**
    * Sort by the `created_at` value.
    */
    CREATED_AT,

    /**
    * Sort by the `id` value.
    */
    ID,

    /**
    * Sort by relevance to the search terms when the `query` parameter is specified on the connection.
    * Don't use this sort key when no search query is specified.
    */
    RELEVANCE,

    UNKNOWN_VALUE;

    public static DiscountCodeSortKeys fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CODE": {
                return CODE;
            }

            case "CREATED_AT": {
                return CREATED_AT;
            }

            case "ID": {
                return ID;
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
            case CODE: {
                return "CODE";
            }

            case CREATED_AT: {
                return "CREATED_AT";
            }

            case ID: {
                return "ID";
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

