// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Type of a theme file operation result.
*/
public enum OnlineStoreThemeFileResultType {
    /**
    * Operation was malformed or invalid.
    */
    BAD_REQUEST,

    /**
    * Operation faced a conflict with the current state of the file.
    */
    CONFLICT,

    /**
    * Operation encountered an error.
    */
    ERROR,

    /**
    * Operation file could not be found.
    */
    NOT_FOUND,

    /**
    * Operation was successful.
    */
    SUCCESS,

    /**
    * Operation timed out.
    */
    TIMEOUT,

    /**
    * Operation could not be processed due to issues with input data.
    */
    UNPROCESSABLE_ENTITY,

    UNKNOWN_VALUE;

    public static OnlineStoreThemeFileResultType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "BAD_REQUEST": {
                return BAD_REQUEST;
            }

            case "CONFLICT": {
                return CONFLICT;
            }

            case "ERROR": {
                return ERROR;
            }

            case "NOT_FOUND": {
                return NOT_FOUND;
            }

            case "SUCCESS": {
                return SUCCESS;
            }

            case "TIMEOUT": {
                return TIMEOUT;
            }

            case "UNPROCESSABLE_ENTITY": {
                return UNPROCESSABLE_ENTITY;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case BAD_REQUEST: {
                return "BAD_REQUEST";
            }

            case CONFLICT: {
                return "CONFLICT";
            }

            case ERROR: {
                return "ERROR";
            }

            case NOT_FOUND: {
                return "NOT_FOUND";
            }

            case SUCCESS: {
                return "SUCCESS";
            }

            case TIMEOUT: {
                return "TIMEOUT";
            }

            case UNPROCESSABLE_ENTITY: {
                return "UNPROCESSABLE_ENTITY";
            }

            default: {
                return "";
            }
        }
    }
}

