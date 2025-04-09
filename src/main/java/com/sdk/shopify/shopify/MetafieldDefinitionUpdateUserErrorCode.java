// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* Possible error codes that can be returned by `MetafieldDefinitionUpdateUserError`.
*/
public enum MetafieldDefinitionUpdateUserErrorCode {
    /**
    * Admin access can only be specified for app-owned metafield definitions.
    */
    ADMIN_ACCESS_INPUT_NOT_ALLOWED,

    /**
    * The metafield definition capability cannot be disabled.
    */
    CAPABILITY_CANNOT_BE_DISABLED,

    /**
    * A capability is required for the definition type but is disabled.
    */
    CAPABILITY_REQUIRED_BUT_DISABLED,

    /**
    * The maximum limit of grants per definition type has been exceeded.
    */
    GRANT_LIMIT_EXCEEDED,

    /**
    * An internal error occurred.
    */
    INTERNAL_ERROR,

    /**
    * The metafield definition capability is invalid.
    */
    INVALID_CAPABILITY,

    /**
    * The metafield definition constraints are invalid.
    */
    INVALID_CONSTRAINTS,

    /**
    * An invalid input.
    */
    INVALID_INPUT,

    /**
    * The input combination is invalid.
    */
    INVALID_INPUT_COMBINATION,

    /**
    * Action cannot proceed. Definition is currently in use.
    */
    METAFIELD_DEFINITION_IN_USE,

    /**
    * You cannot change the metaobject definition pointed to by a metaobject reference metafield
    * definition.
    */
    METAOBJECT_DEFINITION_CHANGED,

    /**
    * The metafield definition wasn't found.
    */
    NOT_FOUND,

    /**
    * You have reached the maximum allowed definitions for automated collections.
    */
    OWNER_TYPE_LIMIT_EXCEEDED_FOR_AUTOMATED_COLLECTIONS,

    /**
    * The pinned limit has been reached for the owner type.
    */
    PINNED_LIMIT_REACHED,

    /**
    * The input value needs to be blank.
    */
    PRESENT,

    /**
    * The input value is too long.
    */
    TOO_LONG,

    /**
    * The definition type is not eligible to be used as collection condition.
    */
    TYPE_NOT_ALLOWED_FOR_CONDITIONS,

    /**
    * The metafield definition does not support pinning.
    */
    UNSUPPORTED_PINNING,

    UNKNOWN_VALUE;

    public static MetafieldDefinitionUpdateUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ADMIN_ACCESS_INPUT_NOT_ALLOWED": {
                return ADMIN_ACCESS_INPUT_NOT_ALLOWED;
            }

            case "CAPABILITY_CANNOT_BE_DISABLED": {
                return CAPABILITY_CANNOT_BE_DISABLED;
            }

            case "CAPABILITY_REQUIRED_BUT_DISABLED": {
                return CAPABILITY_REQUIRED_BUT_DISABLED;
            }

            case "GRANT_LIMIT_EXCEEDED": {
                return GRANT_LIMIT_EXCEEDED;
            }

            case "INTERNAL_ERROR": {
                return INTERNAL_ERROR;
            }

            case "INVALID_CAPABILITY": {
                return INVALID_CAPABILITY;
            }

            case "INVALID_CONSTRAINTS": {
                return INVALID_CONSTRAINTS;
            }

            case "INVALID_INPUT": {
                return INVALID_INPUT;
            }

            case "INVALID_INPUT_COMBINATION": {
                return INVALID_INPUT_COMBINATION;
            }

            case "METAFIELD_DEFINITION_IN_USE": {
                return METAFIELD_DEFINITION_IN_USE;
            }

            case "METAOBJECT_DEFINITION_CHANGED": {
                return METAOBJECT_DEFINITION_CHANGED;
            }

            case "NOT_FOUND": {
                return NOT_FOUND;
            }

            case "OWNER_TYPE_LIMIT_EXCEEDED_FOR_AUTOMATED_COLLECTIONS": {
                return OWNER_TYPE_LIMIT_EXCEEDED_FOR_AUTOMATED_COLLECTIONS;
            }

            case "PINNED_LIMIT_REACHED": {
                return PINNED_LIMIT_REACHED;
            }

            case "PRESENT": {
                return PRESENT;
            }

            case "TOO_LONG": {
                return TOO_LONG;
            }

            case "TYPE_NOT_ALLOWED_FOR_CONDITIONS": {
                return TYPE_NOT_ALLOWED_FOR_CONDITIONS;
            }

            case "UNSUPPORTED_PINNING": {
                return UNSUPPORTED_PINNING;
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

            case CAPABILITY_CANNOT_BE_DISABLED: {
                return "CAPABILITY_CANNOT_BE_DISABLED";
            }

            case CAPABILITY_REQUIRED_BUT_DISABLED: {
                return "CAPABILITY_REQUIRED_BUT_DISABLED";
            }

            case GRANT_LIMIT_EXCEEDED: {
                return "GRANT_LIMIT_EXCEEDED";
            }

            case INTERNAL_ERROR: {
                return "INTERNAL_ERROR";
            }

            case INVALID_CAPABILITY: {
                return "INVALID_CAPABILITY";
            }

            case INVALID_CONSTRAINTS: {
                return "INVALID_CONSTRAINTS";
            }

            case INVALID_INPUT: {
                return "INVALID_INPUT";
            }

            case INVALID_INPUT_COMBINATION: {
                return "INVALID_INPUT_COMBINATION";
            }

            case METAFIELD_DEFINITION_IN_USE: {
                return "METAFIELD_DEFINITION_IN_USE";
            }

            case METAOBJECT_DEFINITION_CHANGED: {
                return "METAOBJECT_DEFINITION_CHANGED";
            }

            case NOT_FOUND: {
                return "NOT_FOUND";
            }

            case OWNER_TYPE_LIMIT_EXCEEDED_FOR_AUTOMATED_COLLECTIONS: {
                return "OWNER_TYPE_LIMIT_EXCEEDED_FOR_AUTOMATED_COLLECTIONS";
            }

            case PINNED_LIMIT_REACHED: {
                return "PINNED_LIMIT_REACHED";
            }

            case PRESENT: {
                return "PRESENT";
            }

            case TOO_LONG: {
                return "TOO_LONG";
            }

            case TYPE_NOT_ALLOWED_FOR_CONDITIONS: {
                return "TYPE_NOT_ALLOWED_FOR_CONDITIONS";
            }

            case UNSUPPORTED_PINNING: {
                return "UNSUPPORTED_PINNING";
            }

            default: {
                return "";
            }
        }
    }
}

