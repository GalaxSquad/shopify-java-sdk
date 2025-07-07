// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `ErrorsWebPixelUserError`.
*/
public enum ErrorsWebPixelUserErrorCode {
    /**
    * The input value is blank.
    */
    BLANK,

    /**
    * The provided settings is not a valid JSON.
    */
    INVALID_CONFIGURATION_JSON,

    /**
    * The provided runtime context is invalid.
    */
    INVALID_RUNTIME_CONTEXT,

    /**
    * The provided settings does not match the expected settings definition on the app.
    */
    INVALID_SETTINGS,

    /**
    * The settings definition of the web pixel extension is in an invalid state on the app.
    */
    INVALID_SETTINGS_DEFINITION,

    /**
    * The record with the ID used as the input value couldn't be found.
    */
    NOT_FOUND,

    /**
    * No extension found.
    */
    NO_EXTENSION,

    /**
    * The input value is already taken.
    */
    TAKEN,

    /**
    * An unexpected error occurred.
    */
    UNEXPECTED_ERROR,

    UNKNOWN_VALUE;

    public static ErrorsWebPixelUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "BLANK": {
                return BLANK;
            }

            case "INVALID_CONFIGURATION_JSON": {
                return INVALID_CONFIGURATION_JSON;
            }

            case "INVALID_RUNTIME_CONTEXT": {
                return INVALID_RUNTIME_CONTEXT;
            }

            case "INVALID_SETTINGS": {
                return INVALID_SETTINGS;
            }

            case "INVALID_SETTINGS_DEFINITION": {
                return INVALID_SETTINGS_DEFINITION;
            }

            case "NOT_FOUND": {
                return NOT_FOUND;
            }

            case "NO_EXTENSION": {
                return NO_EXTENSION;
            }

            case "TAKEN": {
                return TAKEN;
            }

            case "UNEXPECTED_ERROR": {
                return UNEXPECTED_ERROR;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case BLANK: {
                return "BLANK";
            }

            case INVALID_CONFIGURATION_JSON: {
                return "INVALID_CONFIGURATION_JSON";
            }

            case INVALID_RUNTIME_CONTEXT: {
                return "INVALID_RUNTIME_CONTEXT";
            }

            case INVALID_SETTINGS: {
                return "INVALID_SETTINGS";
            }

            case INVALID_SETTINGS_DEFINITION: {
                return "INVALID_SETTINGS_DEFINITION";
            }

            case NOT_FOUND: {
                return "NOT_FOUND";
            }

            case NO_EXTENSION: {
                return "NO_EXTENSION";
            }

            case TAKEN: {
                return "TAKEN";
            }

            case UNEXPECTED_ERROR: {
                return "UNEXPECTED_ERROR";
            }

            default: {
                return "";
            }
        }
    }
}

