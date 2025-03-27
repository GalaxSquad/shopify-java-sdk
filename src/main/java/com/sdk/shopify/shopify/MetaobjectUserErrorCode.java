// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* Possible error codes that can be returned by `MetaobjectUserError`.
*/
public enum MetaobjectUserErrorCode {
    /**
    * Admin access can only be specified on metaobject definitions that have an app-reserved type.
    */
    ADMIN_ACCESS_INPUT_NOT_ALLOWED,

    /**
    * The input value is blank.
    */
    BLANK,

    /**
    * The capability you are using is not enabled.
    */
    CAPABILITY_NOT_ENABLED,

    /**
    * The display name cannot be the same when using the metaobject as a product option.
    */
    DISPLAY_NAME_CONFLICT,

    /**
    * Duplicate inputs were provided for this field key.
    */
    DUPLICATE_FIELD_INPUT,

    /**
    * Renderable data input is referencing an invalid field.
    */
    FIELD_TYPE_INVALID,

    /**
    * The targeted object cannot be modified.
    */
    IMMUTABLE,

    /**
    * The input value isn't included in the list.
    */
    INCLUSION,

    /**
    * An unexpected error occurred.
    */
    INTERNAL_ERROR,

    /**
    * The input value is invalid.
    */
    INVALID,

    /**
    * The value for the metafield definition option was invalid.
    */
    INVALID_OPTION,

    /**
    * The metafield type is invalid.
    */
    INVALID_TYPE,

    /**
    * The value is invalid for the metafield type or the definition options.
    */
    INVALID_VALUE,

    /**
    * The maximum number of metaobjects definitions has been exceeded.
    */
    MAX_DEFINITIONS_EXCEEDED,

    /**
    * The maximum number of metaobjects per shop has been exceeded.
    */
    MAX_OBJECTS_EXCEEDED,

    /**
    * The input is missing required keys.
    */
    MISSING_REQUIRED_KEYS,

    /**
    * Not authorized.
    */
    NOT_AUTHORIZED,

    /**
    * Missing required fields were found for this object.
    */
    OBJECT_FIELD_REQUIRED,

    /**
    * The specified field key is already in use.
    */
    OBJECT_FIELD_TAKEN,

    /**
    * The input value needs to be blank.
    */
    PRESENT,

    /**
    * The requested record couldn't be found.
    */
    RECORD_NOT_FOUND,

    /**
    * The provided name is reserved for system use.
    */
    RESERVED_NAME,

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
    * No field definition found for this key.
    */
    UNDEFINED_OBJECT_FIELD,

    /**
    * No metaobject definition found for this type.
    */
    UNDEFINED_OBJECT_TYPE,

    /**
    * The Online Store URL handle cannot be blank.
    */
    URL_HANDLE_BLANK,

    /**
    * The Online Store URL handle is invalid.
    */
    URL_HANDLE_INVALID,

    /**
    * The Online Store URL handle is already taken.
    */
    URL_HANDLE_TAKEN,

    UNKNOWN_VALUE;

    public static MetaobjectUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ADMIN_ACCESS_INPUT_NOT_ALLOWED": {
                return ADMIN_ACCESS_INPUT_NOT_ALLOWED;
            }

            case "BLANK": {
                return BLANK;
            }

            case "CAPABILITY_NOT_ENABLED": {
                return CAPABILITY_NOT_ENABLED;
            }

            case "DISPLAY_NAME_CONFLICT": {
                return DISPLAY_NAME_CONFLICT;
            }

            case "DUPLICATE_FIELD_INPUT": {
                return DUPLICATE_FIELD_INPUT;
            }

            case "FIELD_TYPE_INVALID": {
                return FIELD_TYPE_INVALID;
            }

            case "IMMUTABLE": {
                return IMMUTABLE;
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

            case "INVALID_OPTION": {
                return INVALID_OPTION;
            }

            case "INVALID_TYPE": {
                return INVALID_TYPE;
            }

            case "INVALID_VALUE": {
                return INVALID_VALUE;
            }

            case "MAX_DEFINITIONS_EXCEEDED": {
                return MAX_DEFINITIONS_EXCEEDED;
            }

            case "MAX_OBJECTS_EXCEEDED": {
                return MAX_OBJECTS_EXCEEDED;
            }

            case "MISSING_REQUIRED_KEYS": {
                return MISSING_REQUIRED_KEYS;
            }

            case "NOT_AUTHORIZED": {
                return NOT_AUTHORIZED;
            }

            case "OBJECT_FIELD_REQUIRED": {
                return OBJECT_FIELD_REQUIRED;
            }

            case "OBJECT_FIELD_TAKEN": {
                return OBJECT_FIELD_TAKEN;
            }

            case "PRESENT": {
                return PRESENT;
            }

            case "RECORD_NOT_FOUND": {
                return RECORD_NOT_FOUND;
            }

            case "RESERVED_NAME": {
                return RESERVED_NAME;
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

            case "UNDEFINED_OBJECT_FIELD": {
                return UNDEFINED_OBJECT_FIELD;
            }

            case "UNDEFINED_OBJECT_TYPE": {
                return UNDEFINED_OBJECT_TYPE;
            }

            case "URL_HANDLE_BLANK": {
                return URL_HANDLE_BLANK;
            }

            case "URL_HANDLE_INVALID": {
                return URL_HANDLE_INVALID;
            }

            case "URL_HANDLE_TAKEN": {
                return URL_HANDLE_TAKEN;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ADMIN_ACCESS_INPUT_NOT_ALLOWED: {
                return "ADMIN_ACCESS_INPUT_NOT_ALLOWED";
            }

            case BLANK: {
                return "BLANK";
            }

            case CAPABILITY_NOT_ENABLED: {
                return "CAPABILITY_NOT_ENABLED";
            }

            case DISPLAY_NAME_CONFLICT: {
                return "DISPLAY_NAME_CONFLICT";
            }

            case DUPLICATE_FIELD_INPUT: {
                return "DUPLICATE_FIELD_INPUT";
            }

            case FIELD_TYPE_INVALID: {
                return "FIELD_TYPE_INVALID";
            }

            case IMMUTABLE: {
                return "IMMUTABLE";
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

            case INVALID_OPTION: {
                return "INVALID_OPTION";
            }

            case INVALID_TYPE: {
                return "INVALID_TYPE";
            }

            case INVALID_VALUE: {
                return "INVALID_VALUE";
            }

            case MAX_DEFINITIONS_EXCEEDED: {
                return "MAX_DEFINITIONS_EXCEEDED";
            }

            case MAX_OBJECTS_EXCEEDED: {
                return "MAX_OBJECTS_EXCEEDED";
            }

            case MISSING_REQUIRED_KEYS: {
                return "MISSING_REQUIRED_KEYS";
            }

            case NOT_AUTHORIZED: {
                return "NOT_AUTHORIZED";
            }

            case OBJECT_FIELD_REQUIRED: {
                return "OBJECT_FIELD_REQUIRED";
            }

            case OBJECT_FIELD_TAKEN: {
                return "OBJECT_FIELD_TAKEN";
            }

            case PRESENT: {
                return "PRESENT";
            }

            case RECORD_NOT_FOUND: {
                return "RECORD_NOT_FOUND";
            }

            case RESERVED_NAME: {
                return "RESERVED_NAME";
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

            case UNDEFINED_OBJECT_FIELD: {
                return "UNDEFINED_OBJECT_FIELD";
            }

            case UNDEFINED_OBJECT_TYPE: {
                return "UNDEFINED_OBJECT_TYPE";
            }

            case URL_HANDLE_BLANK: {
                return "URL_HANDLE_BLANK";
            }

            case URL_HANDLE_INVALID: {
                return "URL_HANDLE_INVALID";
            }

            case URL_HANDLE_TAKEN: {
                return "URL_HANDLE_TAKEN";
            }

            default: {
                return "";
            }
        }
    }
}

