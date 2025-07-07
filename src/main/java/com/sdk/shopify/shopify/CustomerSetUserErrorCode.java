// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `CustomerSetUserError`.
*/
public enum CustomerSetUserErrorCode {
    /**
    * The input value is blank.
    */
    BLANK,

    /**
    * The id field is not allowed if identifier is provided.
    */
    ID_NOT_ALLOWED,

    /**
    * The input value isn't included in the list.
    */
    INCLUSION,

    /**
    * The identifier value does not match the value of the corresponding field in the input.
    */
    INPUT_MISMATCH,

    /**
    * The input value is invalid.
    */
    INVALID,

    /**
    * The input argument `metafields` (if present) must contain the `customId` value.
    */
    METAFIELD_MISMATCH,

    /**
    * The input field corresponding to the identifier is required.
    */
    MISSING_FIELD_REQUIRED,

    /**
    * Resource matching the identifier was not found.
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
    * The input value is too long.
    */
    TOO_LONG,

    /**
    * The input value is too short.
    */
    TOO_SHORT,

    UNKNOWN_VALUE;

    public static CustomerSetUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "BLANK": {
                return BLANK;
            }

            case "ID_NOT_ALLOWED": {
                return ID_NOT_ALLOWED;
            }

            case "INCLUSION": {
                return INCLUSION;
            }

            case "INPUT_MISMATCH": {
                return INPUT_MISMATCH;
            }

            case "INVALID": {
                return INVALID;
            }

            case "METAFIELD_MISMATCH": {
                return METAFIELD_MISMATCH;
            }

            case "MISSING_FIELD_REQUIRED": {
                return MISSING_FIELD_REQUIRED;
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

            case "TOO_LONG": {
                return TOO_LONG;
            }

            case "TOO_SHORT": {
                return TOO_SHORT;
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

            case ID_NOT_ALLOWED: {
                return "ID_NOT_ALLOWED";
            }

            case INCLUSION: {
                return "INCLUSION";
            }

            case INPUT_MISMATCH: {
                return "INPUT_MISMATCH";
            }

            case INVALID: {
                return "INVALID";
            }

            case METAFIELD_MISMATCH: {
                return "METAFIELD_MISMATCH";
            }

            case MISSING_FIELD_REQUIRED: {
                return "MISSING_FIELD_REQUIRED";
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

            case TOO_LONG: {
                return "TOO_LONG";
            }

            case TOO_SHORT: {
                return "TOO_SHORT";
            }

            default: {
                return "";
            }
        }
    }
}

