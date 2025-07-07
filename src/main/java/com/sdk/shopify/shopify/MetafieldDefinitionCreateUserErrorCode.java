// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `MetafieldDefinitionCreateUserError`.
*/
public enum MetafieldDefinitionCreateUserErrorCode {
    /**
    * Admin access can only be specified for app-owned metafield definitions.
    */
    ADMIN_ACCESS_INPUT_NOT_ALLOWED,

    /**
    * The input value is blank.
    */
    BLANK,

    /**
    * A capability is required for the definition type but is disabled.
    */
    CAPABILITY_REQUIRED_BUT_DISABLED,

    /**
    * A duplicate option.
    */
    DUPLICATE_OPTION,

    /**
    * The input value isn't included in the list.
    */
    INCLUSION,

    /**
    * The input value is invalid.
    */
    INVALID,

    /**
    * The metafield definition capability is invalid.
    */
    INVALID_CAPABILITY,

    /**
    * A field contains an invalid character.
    */
    INVALID_CHARACTER,

    /**
    * The metafield definition constraints are invalid.
    */
    INVALID_CONSTRAINTS,

    /**
    * The input combination is invalid.
    */
    INVALID_INPUT_COMBINATION,

    /**
    * An invalid option.
    */
    INVALID_OPTION,

    /**
    * The maximum limit of definitions per owner type has exceeded.
    */
    LIMIT_EXCEEDED,

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
    * This namespace and key combination is reserved for standard definitions.
    */
    RESERVED_NAMESPACE_KEY,

    /**
    * The definition limit per owner type has exceeded.
    */
    RESOURCE_TYPE_LIMIT_EXCEEDED,

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
    * The definition type is not eligible to be used as collection condition.
    */
    TYPE_NOT_ALLOWED_FOR_CONDITIONS,

    /**
    * This namespace and key combination is already in use for a set of your metafields.
    */
    UNSTRUCTURED_ALREADY_EXISTS,

    /**
    * The metafield definition does not support pinning.
    */
    UNSUPPORTED_PINNING,

    UNKNOWN_VALUE;

    public static MetafieldDefinitionCreateUserErrorCode fromGraphQl(String value) {
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

            case "CAPABILITY_REQUIRED_BUT_DISABLED": {
                return CAPABILITY_REQUIRED_BUT_DISABLED;
            }

            case "DUPLICATE_OPTION": {
                return DUPLICATE_OPTION;
            }

            case "INCLUSION": {
                return INCLUSION;
            }

            case "INVALID": {
                return INVALID;
            }

            case "INVALID_CAPABILITY": {
                return INVALID_CAPABILITY;
            }

            case "INVALID_CHARACTER": {
                return INVALID_CHARACTER;
            }

            case "INVALID_CONSTRAINTS": {
                return INVALID_CONSTRAINTS;
            }

            case "INVALID_INPUT_COMBINATION": {
                return INVALID_INPUT_COMBINATION;
            }

            case "INVALID_OPTION": {
                return INVALID_OPTION;
            }

            case "LIMIT_EXCEEDED": {
                return LIMIT_EXCEEDED;
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

            case "RESERVED_NAMESPACE_KEY": {
                return RESERVED_NAMESPACE_KEY;
            }

            case "RESOURCE_TYPE_LIMIT_EXCEEDED": {
                return RESOURCE_TYPE_LIMIT_EXCEEDED;
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

            case "TYPE_NOT_ALLOWED_FOR_CONDITIONS": {
                return TYPE_NOT_ALLOWED_FOR_CONDITIONS;
            }

            case "UNSTRUCTURED_ALREADY_EXISTS": {
                return UNSTRUCTURED_ALREADY_EXISTS;
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

            case BLANK: {
                return "BLANK";
            }

            case CAPABILITY_REQUIRED_BUT_DISABLED: {
                return "CAPABILITY_REQUIRED_BUT_DISABLED";
            }

            case DUPLICATE_OPTION: {
                return "DUPLICATE_OPTION";
            }

            case INCLUSION: {
                return "INCLUSION";
            }

            case INVALID: {
                return "INVALID";
            }

            case INVALID_CAPABILITY: {
                return "INVALID_CAPABILITY";
            }

            case INVALID_CHARACTER: {
                return "INVALID_CHARACTER";
            }

            case INVALID_CONSTRAINTS: {
                return "INVALID_CONSTRAINTS";
            }

            case INVALID_INPUT_COMBINATION: {
                return "INVALID_INPUT_COMBINATION";
            }

            case INVALID_OPTION: {
                return "INVALID_OPTION";
            }

            case LIMIT_EXCEEDED: {
                return "LIMIT_EXCEEDED";
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

            case RESERVED_NAMESPACE_KEY: {
                return "RESERVED_NAMESPACE_KEY";
            }

            case RESOURCE_TYPE_LIMIT_EXCEEDED: {
                return "RESOURCE_TYPE_LIMIT_EXCEEDED";
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

            case TYPE_NOT_ALLOWED_FOR_CONDITIONS: {
                return "TYPE_NOT_ALLOWED_FOR_CONDITIONS";
            }

            case UNSTRUCTURED_ALREADY_EXISTS: {
                return "UNSTRUCTURED_ALREADY_EXISTS";
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

