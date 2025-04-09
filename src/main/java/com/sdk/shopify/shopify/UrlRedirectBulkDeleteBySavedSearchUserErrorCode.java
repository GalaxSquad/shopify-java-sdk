// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* Possible error codes that can be returned by `UrlRedirectBulkDeleteBySavedSearchUserError`.
*/
public enum UrlRedirectBulkDeleteBySavedSearchUserErrorCode {
    /**
    * The saved search's query cannot match all entries or be empty.
    */
    INVALID_SAVED_SEARCH_QUERY,

    /**
    * Saved search not found.
    */
    SAVED_SEARCH_NOT_FOUND,

    UNKNOWN_VALUE;

    public static UrlRedirectBulkDeleteBySavedSearchUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "INVALID_SAVED_SEARCH_QUERY": {
                return INVALID_SAVED_SEARCH_QUERY;
            }

            case "SAVED_SEARCH_NOT_FOUND": {
                return SAVED_SEARCH_NOT_FOUND;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case INVALID_SAVED_SEARCH_QUERY: {
                return "INVALID_SAVED_SEARCH_QUERY";
            }

            case SAVED_SEARCH_NOT_FOUND: {
                return "SAVED_SEARCH_NOT_FOUND";
            }

            default: {
                return "";
            }
        }
    }
}

