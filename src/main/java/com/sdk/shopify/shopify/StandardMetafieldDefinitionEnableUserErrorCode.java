// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `StandardMetafieldDefinitionEnableUserError`.
*/
public enum StandardMetafieldDefinitionEnableUserErrorCode {
    /**
    * Admin access can only be specified for app-owned metafield definitions.
    */
    ADMIN_ACCESS_INPUT_NOT_ALLOWED,

    /**
    * The metafield definition capability cannot be disabled.
    */
    CAPABILITY_CANNOT_BE_DISABLED,

    /**
    * The input value is invalid.
    */
    INVALID,

    /**
    * The metafield definition capability is invalid.
    */
    INVALID_CAPABILITY,

    /**
    * The input combination is invalid.
    */
    INVALID_INPUT_COMBINATION,

    /**
    * The maximum number of definitions per owner type has been exceeded.
    */
    LIMIT_EXCEEDED,

    /**
    * The input value is already taken.
    */
    TAKEN,

    /**
    * The standard metafield definition template was not found.
    */
    TEMPLATE_NOT_FOUND,

    /**
    * The definition type is not eligible to be used as collection condition.
    */
    TYPE_NOT_ALLOWED_FOR_CONDITIONS,

    /**
    * The namespace and key is already in use for a set of your metafields.
    */
    UNSTRUCTURED_ALREADY_EXISTS,

    /**
    * The metafield definition does not support pinning.
    */
    UNSUPPORTED_PINNING,

    UNKNOWN_VALUE;

    public static StandardMetafieldDefinitionEnableUserErrorCode fromGraphQl(String value) {
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

            case "INVALID": {
                return INVALID;
            }

            case "INVALID_CAPABILITY": {
                return INVALID_CAPABILITY;
            }

            case "INVALID_INPUT_COMBINATION": {
                return INVALID_INPUT_COMBINATION;
            }

            case "LIMIT_EXCEEDED": {
                return LIMIT_EXCEEDED;
            }

            case "TAKEN": {
                return TAKEN;
            }

            case "TEMPLATE_NOT_FOUND": {
                return TEMPLATE_NOT_FOUND;
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

            case CAPABILITY_CANNOT_BE_DISABLED: {
                return "CAPABILITY_CANNOT_BE_DISABLED";
            }

            case INVALID: {
                return "INVALID";
            }

            case INVALID_CAPABILITY: {
                return "INVALID_CAPABILITY";
            }

            case INVALID_INPUT_COMBINATION: {
                return "INVALID_INPUT_COMBINATION";
            }

            case LIMIT_EXCEEDED: {
                return "LIMIT_EXCEEDED";
            }

            case TAKEN: {
                return "TAKEN";
            }

            case TEMPLATE_NOT_FOUND: {
                return "TEMPLATE_NOT_FOUND";
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

