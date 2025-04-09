// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;


/**
* The set of valid sort keys for the CheckoutProfile query.
*/
public enum CheckoutProfileSortKeys {
    /**
    * Sort by the `created_at` value.
    */
    CREATED_AT,

    /**
    * Sort by the `edited_at` value.
    */
    EDITED_AT,

    /**
    * Sort by the `id` value.
    */
    ID,

    /**
    * Sort by the `is_published` value.
    */
    IS_PUBLISHED,

    /**
    * Sort by relevance to the search terms when the `query` parameter is specified on the connection.
    * Don't use this sort key when no search query is specified.
    */
    RELEVANCE,

    /**
    * Sort by the `updated_at` value.
    */
    UPDATED_AT,

    UNKNOWN_VALUE;

    public static CheckoutProfileSortKeys fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CREATED_AT": {
                return CREATED_AT;
            }

            case "EDITED_AT": {
                return EDITED_AT;
            }

            case "ID": {
                return ID;
            }

            case "IS_PUBLISHED": {
                return IS_PUBLISHED;
            }

            case "RELEVANCE": {
                return RELEVANCE;
            }

            case "UPDATED_AT": {
                return UPDATED_AT;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CREATED_AT: {
                return "CREATED_AT";
            }

            case EDITED_AT: {
                return "EDITED_AT";
            }

            case ID: {
                return "ID";
            }

            case IS_PUBLISHED: {
                return "IS_PUBLISHED";
            }

            case RELEVANCE: {
                return "RELEVANCE";
            }

            case UPDATED_AT: {
                return "UPDATED_AT";
            }

            default: {
                return "";
            }
        }
    }
}

