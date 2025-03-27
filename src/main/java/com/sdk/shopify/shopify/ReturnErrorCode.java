// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* Possible error codes that can be returned by `ReturnUserError`.
*/
public enum ReturnErrorCode {
    /**
    * The requested resource already exists.
    */
    ALREADY_EXISTS,

    /**
    * The input value is blank.
    */
    BLANK,

    /**
    * A requested resource could not be created.
    */
    CREATION_FAILED,

    /**
    * The input value should be equal to the value allowed.
    */
    EQUAL_TO,

    /**
    * A required feature is not enabled.
    */
    FEATURE_NOT_ENABLED,

    /**
    * The input value should be greater than the minimum allowed value.
    */
    GREATER_THAN,

    /**
    * The input value should be greater than or equal to the minimum value allowed.
    */
    GREATER_THAN_OR_EQUAL_TO,

    /**
    * The input value isn't included in the list.
    */
    INCLUSION,

    /**
    * Unexpected internal error happened.
    */
    INTERNAL_ERROR,

    /**
    * The input value is invalid.
    */
    INVALID,

    /**
    * A resource was not in the correct state for the operation to succeed.
    */
    INVALID_STATE,

    /**
    * The input value should be less than the maximum value allowed.
    */
    LESS_THAN,

    /**
    * The input value should be less than or equal to the maximum value allowed.
    */
    LESS_THAN_OR_EQUAL_TO,

    /**
    * A requested notification could not be sent.
    */
    NOTIFICATION_FAILED,

    /**
    * The input value is not a number.
    */
    NOT_A_NUMBER,

    /**
    * A requested item is not editable.
    */
    NOT_EDITABLE,

    /**
    * A requested item could not be found.
    */
    NOT_FOUND,

    /**
    * The input value needs to be blank.
    */
    PRESENT,

    /**
    * The input value is already taken.
    */
    TAKEN,

    /**
    * The input value is too big.
    */
    TOO_BIG,

    /**
    * The input value is too long.
    */
    TOO_LONG,

    /**
    * Too many arguments provided.
    */
    TOO_MANY_ARGUMENTS,

    /**
    * The input value is too short.
    */
    TOO_SHORT,

    /**
    * The input value is the wrong length.
    */
    WRONG_LENGTH,

    UNKNOWN_VALUE;

    public static ReturnErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ALREADY_EXISTS": {
                return ALREADY_EXISTS;
            }

            case "BLANK": {
                return BLANK;
            }

            case "CREATION_FAILED": {
                return CREATION_FAILED;
            }

            case "EQUAL_TO": {
                return EQUAL_TO;
            }

            case "FEATURE_NOT_ENABLED": {
                return FEATURE_NOT_ENABLED;
            }

            case "GREATER_THAN": {
                return GREATER_THAN;
            }

            case "GREATER_THAN_OR_EQUAL_TO": {
                return GREATER_THAN_OR_EQUAL_TO;
            }

            case "INCLUSION": {
                return INCLUSION;
            }

            case "INTERNAL_ERROR": {
                return INTERNAL_ERROR;
            }

            case "INVALID": {
                return INVALID;
            }

            case "INVALID_STATE": {
                return INVALID_STATE;
            }

            case "LESS_THAN": {
                return LESS_THAN;
            }

            case "LESS_THAN_OR_EQUAL_TO": {
                return LESS_THAN_OR_EQUAL_TO;
            }

            case "NOTIFICATION_FAILED": {
                return NOTIFICATION_FAILED;
            }

            case "NOT_A_NUMBER": {
                return NOT_A_NUMBER;
            }

            case "NOT_EDITABLE": {
                return NOT_EDITABLE;
            }

            case "NOT_FOUND": {
                return NOT_FOUND;
            }

            case "PRESENT": {
                return PRESENT;
            }

            case "TAKEN": {
                return TAKEN;
            }

            case "TOO_BIG": {
                return TOO_BIG;
            }

            case "TOO_LONG": {
                return TOO_LONG;
            }

            case "TOO_MANY_ARGUMENTS": {
                return TOO_MANY_ARGUMENTS;
            }

            case "TOO_SHORT": {
                return TOO_SHORT;
            }

            case "WRONG_LENGTH": {
                return WRONG_LENGTH;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ALREADY_EXISTS: {
                return "ALREADY_EXISTS";
            }

            case BLANK: {
                return "BLANK";
            }

            case CREATION_FAILED: {
                return "CREATION_FAILED";
            }

            case EQUAL_TO: {
                return "EQUAL_TO";
            }

            case FEATURE_NOT_ENABLED: {
                return "FEATURE_NOT_ENABLED";
            }

            case GREATER_THAN: {
                return "GREATER_THAN";
            }

            case GREATER_THAN_OR_EQUAL_TO: {
                return "GREATER_THAN_OR_EQUAL_TO";
            }

            case INCLUSION: {
                return "INCLUSION";
            }

            case INTERNAL_ERROR: {
                return "INTERNAL_ERROR";
            }

            case INVALID: {
                return "INVALID";
            }

            case INVALID_STATE: {
                return "INVALID_STATE";
            }

            case LESS_THAN: {
                return "LESS_THAN";
            }

            case LESS_THAN_OR_EQUAL_TO: {
                return "LESS_THAN_OR_EQUAL_TO";
            }

            case NOTIFICATION_FAILED: {
                return "NOTIFICATION_FAILED";
            }

            case NOT_A_NUMBER: {
                return "NOT_A_NUMBER";
            }

            case NOT_EDITABLE: {
                return "NOT_EDITABLE";
            }

            case NOT_FOUND: {
                return "NOT_FOUND";
            }

            case PRESENT: {
                return "PRESENT";
            }

            case TAKEN: {
                return "TAKEN";
            }

            case TOO_BIG: {
                return "TOO_BIG";
            }

            case TOO_LONG: {
                return "TOO_LONG";
            }

            case TOO_MANY_ARGUMENTS: {
                return "TOO_MANY_ARGUMENTS";
            }

            case TOO_SHORT: {
                return "TOO_SHORT";
            }

            case WRONG_LENGTH: {
                return "WRONG_LENGTH";
            }

            default: {
                return "";
            }
        }
    }
}

