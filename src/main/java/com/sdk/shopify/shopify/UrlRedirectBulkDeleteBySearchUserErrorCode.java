// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `UrlRedirectBulkDeleteBySearchUserError`.
*/
public enum UrlRedirectBulkDeleteBySearchUserErrorCode {
    /**
    * Invalid search string.
    */
    INVALID_SEARCH_ARGUMENT,

    UNKNOWN_VALUE;

    public static UrlRedirectBulkDeleteBySearchUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "INVALID_SEARCH_ARGUMENT": {
                return INVALID_SEARCH_ARGUMENT;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case INVALID_SEARCH_ARGUMENT: {
                return "INVALID_SEARCH_ARGUMENT";
            }

            default: {
                return "";
            }
        }
    }
}

