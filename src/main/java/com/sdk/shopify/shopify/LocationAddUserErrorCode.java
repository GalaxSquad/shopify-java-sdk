// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* Possible error codes that can be returned by `LocationAddUserError`.
*/
public enum LocationAddUserErrorCode {
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
    * Owner type can't be used in this mutation.
    */
    DISALLOWED_OWNER_TYPE,

    /**
    * An error occurred while adding the location.
    */
    GENERIC_ERROR,

    /**
    * The input value isn't included in the list.
    */
    INCLUSION,

    /**
    * An internal error occurred.
    */
    INTERNAL_ERROR,

    /**
    * The input value is invalid.
    */
    INVALID,

    /**
    * The type is invalid.
    */
    INVALID_TYPE,

    /**
    * The ZIP code is not a valid US ZIP code.
    */
    INVALID_US_ZIPCODE,

    /**
    * The value is invalid for the metafield type or for the definition options.
    */
    INVALID_VALUE,

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

    /**
    * Unstructured reserved namespace.
    */
    UNSTRUCTURED_RESERVED_NAMESPACE,

    UNKNOWN_VALUE;

    public static LocationAddUserErrorCode fromGraphQl(String value) {
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

            case "DISALLOWED_OWNER_TYPE": {
                return DISALLOWED_OWNER_TYPE;
            }

            case "GENERIC_ERROR": {
                return GENERIC_ERROR;
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

            case "INVALID_TYPE": {
                return INVALID_TYPE;
            }

            case "INVALID_US_ZIPCODE": {
                return INVALID_US_ZIPCODE;
            }

            case "INVALID_VALUE": {
                return INVALID_VALUE;
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

            case DISALLOWED_OWNER_TYPE: {
                return "DISALLOWED_OWNER_TYPE";
            }

            case GENERIC_ERROR: {
                return "GENERIC_ERROR";
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

            case INVALID_TYPE: {
                return "INVALID_TYPE";
            }

            case INVALID_US_ZIPCODE: {
                return "INVALID_US_ZIPCODE";
            }

            case INVALID_VALUE: {
                return "INVALID_VALUE";
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

            case UNSTRUCTURED_RESERVED_NAMESPACE: {
                return "UNSTRUCTURED_RESERVED_NAMESPACE";
            }

            default: {
                return "";
            }
        }
    }
}

