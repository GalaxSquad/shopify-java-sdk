// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `UrlRedirectImportUserError`.
*/
public enum UrlRedirectImportErrorCode {
    /**
    * The import has already completed.
    */
    ALREADY_IMPORTED,

    /**
    * The import is already in progress.
    */
    IN_PROGRESS,

    /**
    * URL redirect import not found.
    */
    NOT_FOUND,

    UNKNOWN_VALUE;

    public static UrlRedirectImportErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ALREADY_IMPORTED": {
                return ALREADY_IMPORTED;
            }

            case "IN_PROGRESS": {
                return IN_PROGRESS;
            }

            case "NOT_FOUND": {
                return NOT_FOUND;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ALREADY_IMPORTED: {
                return "ALREADY_IMPORTED";
            }

            case IN_PROGRESS: {
                return "IN_PROGRESS";
            }

            case NOT_FOUND: {
                return "NOT_FOUND";
            }

            default: {
                return "";
            }
        }
    }
}

