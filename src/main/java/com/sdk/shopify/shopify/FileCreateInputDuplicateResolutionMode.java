// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* The input fields for handling if filename is already in use.
*/
public enum FileCreateInputDuplicateResolutionMode {
    /**
    * Append a UUID if filename is already in use.
    */
    APPEND_UUID,

    /**
    * Raise an error if filename is already in use.
    */
    RAISE_ERROR,

    /**
    * Replace the existing file if filename is already in use.
    */
    REPLACE,

    UNKNOWN_VALUE;

    public static FileCreateInputDuplicateResolutionMode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "APPEND_UUID": {
                return APPEND_UUID;
            }

            case "RAISE_ERROR": {
                return RAISE_ERROR;
            }

            case "REPLACE": {
                return REPLACE;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case APPEND_UUID: {
                return "APPEND_UUID";
            }

            case RAISE_ERROR: {
                return "RAISE_ERROR";
            }

            case REPLACE: {
                return "REPLACE";
            }

            default: {
                return "";
            }
        }
    }
}

