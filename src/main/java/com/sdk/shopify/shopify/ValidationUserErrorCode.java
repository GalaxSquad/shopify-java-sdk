// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `ValidationUserError`.
*/
public enum ValidationUserErrorCode {
    /**
    * ApiPermission metafields can only be created or updated by the app owner.
    */
    APP_NOT_AUTHORIZED,

    /**
    * The input value is blank.
    */
    BLANK,

    /**
    * The metafield violates a capability restriction.
    */
    CAPABILITY_VIOLATION,

    /**
    * Shop must be on a Shopify Plus plan to activate functions from a custom app.
    */
    CUSTOM_APP_FUNCTION_NOT_ELIGIBLE,

    /**
    * Owner type can't be used in this mutation.
    */
    DISALLOWED_OWNER_TYPE,

    /**
    * Function does not implement the required interface for this cart & checkout validation.
    */
    FUNCTION_DOES_NOT_IMPLEMENT,

    /**
    * Function not found.
    */
    FUNCTION_NOT_FOUND,

    /**
    * Function is pending deletion.
    */
    FUNCTION_PENDING_DELETION,

    /**
    * The input value isn't included in the list.
    */
    INCLUSION,

    /**
    * An internal error occurred.
    */
    INTERNAL_ERROR,

    /**
    * The type is invalid.
    */
    INVALID_TYPE,

    /**
    * The value is invalid for the metafield type or for the definition options.
    */
    INVALID_VALUE,

    /**
    * Cannot have more than 25 active validation functions.
    */
    MAX_VALIDATIONS_ACTIVATED,

    /**
    * Validation not found.
    */
    NOT_FOUND,

    /**
    * The input value needs to be blank.
    */
    PRESENT,

    /**
    * Only unlisted apps can be used for this cart & checkout validation.
    */
    PUBLIC_APP_NOT_ALLOWED,

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

    /**
    * Unstructured reserved namespace.
    */
    UNSTRUCTURED_RESERVED_NAMESPACE,

    UNKNOWN_VALUE;

    public static ValidationUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "APP_NOT_AUTHORIZED": {
                return APP_NOT_AUTHORIZED;
            }

            case "BLANK": {
                return BLANK;
            }

            case "CAPABILITY_VIOLATION": {
                return CAPABILITY_VIOLATION;
            }

            case "CUSTOM_APP_FUNCTION_NOT_ELIGIBLE": {
                return CUSTOM_APP_FUNCTION_NOT_ELIGIBLE;
            }

            case "DISALLOWED_OWNER_TYPE": {
                return DISALLOWED_OWNER_TYPE;
            }

            case "FUNCTION_DOES_NOT_IMPLEMENT": {
                return FUNCTION_DOES_NOT_IMPLEMENT;
            }

            case "FUNCTION_NOT_FOUND": {
                return FUNCTION_NOT_FOUND;
            }

            case "FUNCTION_PENDING_DELETION": {
                return FUNCTION_PENDING_DELETION;
            }

            case "INCLUSION": {
                return INCLUSION;
            }

            case "INTERNAL_ERROR": {
                return INTERNAL_ERROR;
            }

            case "INVALID_TYPE": {
                return INVALID_TYPE;
            }

            case "INVALID_VALUE": {
                return INVALID_VALUE;
            }

            case "MAX_VALIDATIONS_ACTIVATED": {
                return MAX_VALIDATIONS_ACTIVATED;
            }

            case "NOT_FOUND": {
                return NOT_FOUND;
            }

            case "PRESENT": {
                return PRESENT;
            }

            case "PUBLIC_APP_NOT_ALLOWED": {
                return PUBLIC_APP_NOT_ALLOWED;
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

            case "UNSTRUCTURED_RESERVED_NAMESPACE": {
                return UNSTRUCTURED_RESERVED_NAMESPACE;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case APP_NOT_AUTHORIZED: {
                return "APP_NOT_AUTHORIZED";
            }

            case BLANK: {
                return "BLANK";
            }

            case CAPABILITY_VIOLATION: {
                return "CAPABILITY_VIOLATION";
            }

            case CUSTOM_APP_FUNCTION_NOT_ELIGIBLE: {
                return "CUSTOM_APP_FUNCTION_NOT_ELIGIBLE";
            }

            case DISALLOWED_OWNER_TYPE: {
                return "DISALLOWED_OWNER_TYPE";
            }

            case FUNCTION_DOES_NOT_IMPLEMENT: {
                return "FUNCTION_DOES_NOT_IMPLEMENT";
            }

            case FUNCTION_NOT_FOUND: {
                return "FUNCTION_NOT_FOUND";
            }

            case FUNCTION_PENDING_DELETION: {
                return "FUNCTION_PENDING_DELETION";
            }

            case INCLUSION: {
                return "INCLUSION";
            }

            case INTERNAL_ERROR: {
                return "INTERNAL_ERROR";
            }

            case INVALID_TYPE: {
                return "INVALID_TYPE";
            }

            case INVALID_VALUE: {
                return "INVALID_VALUE";
            }

            case MAX_VALIDATIONS_ACTIVATED: {
                return "MAX_VALIDATIONS_ACTIVATED";
            }

            case NOT_FOUND: {
                return "NOT_FOUND";
            }

            case PRESENT: {
                return "PRESENT";
            }

            case PUBLIC_APP_NOT_ALLOWED: {
                return "PUBLIC_APP_NOT_ALLOWED";
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

            case UNSTRUCTURED_RESERVED_NAMESPACE: {
                return "UNSTRUCTURED_RESERVED_NAMESPACE";
            }

            default: {
                return "";
            }
        }
    }
}

