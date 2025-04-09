// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* Possible error codes that can be returned by `BusinessCustomerUserError`.
*/
public enum BusinessCustomerErrorCode {
    /**
    * The input value is blank.
    */
    BLANK,

    /**
    * Deleting the resource failed.
    */
    FAILED_TO_DELETE,

    /**
    * An internal error occurred.
    */
    INTERNAL_ERROR,

    /**
    * The input value is invalid.
    */
    INVALID,

    /**
    * The input is invalid.
    */
    INVALID_INPUT,

    /**
    * The number of resources exceeded the limit.
    */
    LIMIT_REACHED,

    /**
    * The input is empty.
    */
    NO_INPUT,

    /**
    * Missing a required field.
    */
    REQUIRED,

    /**
    * The resource wasn't found.
    */
    RESOURCE_NOT_FOUND,

    /**
    * The input value is already taken.
    */
    TAKEN,

    /**
    * The field value is too long.
    */
    TOO_LONG,

    /**
    * Unexpected type.
    */
    UNEXPECTED_TYPE,

    UNKNOWN_VALUE;

    public static BusinessCustomerErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "BLANK": {
                return BLANK;
            }

            case "FAILED_TO_DELETE": {
                return FAILED_TO_DELETE;
            }

            case "INTERNAL_ERROR": {
                return INTERNAL_ERROR;
            }

            case "INVALID": {
                return INVALID;
            }

            case "INVALID_INPUT": {
                return INVALID_INPUT;
            }

            case "LIMIT_REACHED": {
                return LIMIT_REACHED;
            }

            case "NO_INPUT": {
                return NO_INPUT;
            }

            case "REQUIRED": {
                return REQUIRED;
            }

            case "RESOURCE_NOT_FOUND": {
                return RESOURCE_NOT_FOUND;
            }

            case "TAKEN": {
                return TAKEN;
            }

            case "TOO_LONG": {
                return TOO_LONG;
            }

            case "UNEXPECTED_TYPE": {
                return UNEXPECTED_TYPE;
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

            case FAILED_TO_DELETE: {
                return "FAILED_TO_DELETE";
            }

            case INTERNAL_ERROR: {
                return "INTERNAL_ERROR";
            }

            case INVALID: {
                return "INVALID";
            }

            case INVALID_INPUT: {
                return "INVALID_INPUT";
            }

            case LIMIT_REACHED: {
                return "LIMIT_REACHED";
            }

            case NO_INPUT: {
                return "NO_INPUT";
            }

            case REQUIRED: {
                return "REQUIRED";
            }

            case RESOURCE_NOT_FOUND: {
                return "RESOURCE_NOT_FOUND";
            }

            case TAKEN: {
                return "TAKEN";
            }

            case TOO_LONG: {
                return "TOO_LONG";
            }

            case UNEXPECTED_TYPE: {
                return "UNEXPECTED_TYPE";
            }

            default: {
                return "";
            }
        }
    }
}

