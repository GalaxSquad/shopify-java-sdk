// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;


/**
* The set of valid sort keys for the File query.
*/
public enum FileSortKeys {
    /**
    * Sort by the `created_at` value.
    */
    CREATED_AT,

    /**
    * Sort by the `filename` value.
    */
    FILENAME,

    /**
    * Sort by the `id` value.
    */
    ID,

    /**
    * Sort by the `original_upload_size` value.
    */
    ORIGINAL_UPLOAD_SIZE,

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

    public static FileSortKeys fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CREATED_AT": {
                return CREATED_AT;
            }

            case "FILENAME": {
                return FILENAME;
            }

            case "ID": {
                return ID;
            }

            case "ORIGINAL_UPLOAD_SIZE": {
                return ORIGINAL_UPLOAD_SIZE;
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

            case FILENAME: {
                return "FILENAME";
            }

            case ID: {
                return "ID";
            }

            case ORIGINAL_UPLOAD_SIZE: {
                return "ORIGINAL_UPLOAD_SIZE";
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

