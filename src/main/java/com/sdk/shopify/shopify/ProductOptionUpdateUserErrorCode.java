// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `ProductOptionUpdateUserError`.
*/
public enum ProductOptionUpdateUserErrorCode {
    /**
    * An option cannot have both metafield linked and nonlinked option values.
    */
    CANNOT_COMBINE_LINKED_AND_NONLINKED_OPTION_VALUES,

    /**
    * The number of variants will be above the limit after this operation.
    */
    CANNOT_CREATE_VARIANTS_ABOVE_LIMIT,

    /**
    * Deleting all option values of an option is not allowed.
    */
    CANNOT_DELETE_ALL_OPTION_VALUES_IN_OPTION,

    /**
    * Cannot update the option because it would result in deleting variants, and you don't have the
    * required permissions.
    */
    CANNOT_DELETE_VARIANT_WITHOUT_PERMISSION,

    /**
    * An option cannot be left only with option values that are not linked to any variant.
    */
    CANNOT_LEAVE_OPTIONS_WITHOUT_VARIANTS,

    /**
    * At least one of the product variants has invalid SKUs.
    */
    CANNOT_MAKE_CHANGES_IF_VARIANT_IS_MISSING_REQUIRED_SKU,

    /**
    * Duplicated option value.
    */
    DUPLICATED_OPTION_VALUE,

    /**
    * Cannot link multiple options to the same metafield.
    */
    DUPLICATE_LINKED_OPTION,

    /**
    * Invalid metafield value for linked option.
    */
    INVALID_METAFIELD_VALUE_FOR_LINKED_OPTION,

    /**
    * The name provided is not valid.
    */
    INVALID_NAME,

    /**
    * The option position provided is not valid.
    */
    INVALID_POSITION,

    /**
    * A key is missing in the input.
    */
    KEY_MISSING_IN_INPUT,

    /**
    * No valid metafield definition found for linked option.
    */
    LINKED_METAFIELD_DEFINITION_NOT_FOUND,

    /**
    * Linked options are currently not supported for this shop.
    */
    LINKED_OPTIONS_NOT_SUPPORTED_FOR_SHOP,

    /**
    * Updating the linked_metafield of an option requires a linked_metafield_value for each option value.
    */
    LINKED_OPTION_UPDATE_MISSING_VALUES,

    /**
    * On create, this key cannot be used.
    */
    NO_KEY_ON_CREATE,

    /**
    * Option already exists.
    */
    OPTION_ALREADY_EXISTS,

    /**
    * Option does not exist.
    */
    OPTION_DOES_NOT_EXIST,

    /**
    * An option linked to the provided metafield already exists.
    */
    OPTION_LINKED_METAFIELD_ALREADY_TAKEN,

    /**
    * Option name is too long.
    */
    OPTION_NAME_TOO_LONG,

    /**
    * Option values count is over the allowed limit.
    */
    OPTION_VALUES_OVER_LIMIT,

    /**
    * Option value already exists.
    */
    OPTION_VALUE_ALREADY_EXISTS,

    /**
    * Performing conflicting actions on an option value.
    */
    OPTION_VALUE_CONFLICTING_OPERATION,

    /**
    * Option value does not exist.
    */
    OPTION_VALUE_DOES_NOT_EXIST,

    /**
    * Option value with variants linked cannot be deleted.
    */
    OPTION_VALUE_HAS_VARIANTS,

    /**
    * Option value name is too long.
    */
    OPTION_VALUE_NAME_TOO_LONG,

    /**
    * Product does not exist.
    */
    PRODUCT_DOES_NOT_EXIST,

    /**
    * Product is suspended.
    */
    PRODUCT_SUSPENDED,

    /**
    * The number of option values created with the MANAGE strategy would exceed the variant limit.
    */
    TOO_MANY_VARIANTS_CREATED,

    /**
    * Operation is not supported for a combined listing parent product.
    */
    UNSUPPORTED_COMBINED_LISTING_PARENT_OPERATION,

    UNKNOWN_VALUE;

    public static ProductOptionUpdateUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CANNOT_COMBINE_LINKED_AND_NONLINKED_OPTION_VALUES": {
                return CANNOT_COMBINE_LINKED_AND_NONLINKED_OPTION_VALUES;
            }

            case "CANNOT_CREATE_VARIANTS_ABOVE_LIMIT": {
                return CANNOT_CREATE_VARIANTS_ABOVE_LIMIT;
            }

            case "CANNOT_DELETE_ALL_OPTION_VALUES_IN_OPTION": {
                return CANNOT_DELETE_ALL_OPTION_VALUES_IN_OPTION;
            }

            case "CANNOT_DELETE_VARIANT_WITHOUT_PERMISSION": {
                return CANNOT_DELETE_VARIANT_WITHOUT_PERMISSION;
            }

            case "CANNOT_LEAVE_OPTIONS_WITHOUT_VARIANTS": {
                return CANNOT_LEAVE_OPTIONS_WITHOUT_VARIANTS;
            }

            case "CANNOT_MAKE_CHANGES_IF_VARIANT_IS_MISSING_REQUIRED_SKU": {
                return CANNOT_MAKE_CHANGES_IF_VARIANT_IS_MISSING_REQUIRED_SKU;
            }

            case "DUPLICATED_OPTION_VALUE": {
                return DUPLICATED_OPTION_VALUE;
            }

            case "DUPLICATE_LINKED_OPTION": {
                return DUPLICATE_LINKED_OPTION;
            }

            case "INVALID_METAFIELD_VALUE_FOR_LINKED_OPTION": {
                return INVALID_METAFIELD_VALUE_FOR_LINKED_OPTION;
            }

            case "INVALID_NAME": {
                return INVALID_NAME;
            }

            case "INVALID_POSITION": {
                return INVALID_POSITION;
            }

            case "KEY_MISSING_IN_INPUT": {
                return KEY_MISSING_IN_INPUT;
            }

            case "LINKED_METAFIELD_DEFINITION_NOT_FOUND": {
                return LINKED_METAFIELD_DEFINITION_NOT_FOUND;
            }

            case "LINKED_OPTIONS_NOT_SUPPORTED_FOR_SHOP": {
                return LINKED_OPTIONS_NOT_SUPPORTED_FOR_SHOP;
            }

            case "LINKED_OPTION_UPDATE_MISSING_VALUES": {
                return LINKED_OPTION_UPDATE_MISSING_VALUES;
            }

            case "NO_KEY_ON_CREATE": {
                return NO_KEY_ON_CREATE;
            }

            case "OPTION_ALREADY_EXISTS": {
                return OPTION_ALREADY_EXISTS;
            }

            case "OPTION_DOES_NOT_EXIST": {
                return OPTION_DOES_NOT_EXIST;
            }

            case "OPTION_LINKED_METAFIELD_ALREADY_TAKEN": {
                return OPTION_LINKED_METAFIELD_ALREADY_TAKEN;
            }

            case "OPTION_NAME_TOO_LONG": {
                return OPTION_NAME_TOO_LONG;
            }

            case "OPTION_VALUES_OVER_LIMIT": {
                return OPTION_VALUES_OVER_LIMIT;
            }

            case "OPTION_VALUE_ALREADY_EXISTS": {
                return OPTION_VALUE_ALREADY_EXISTS;
            }

            case "OPTION_VALUE_CONFLICTING_OPERATION": {
                return OPTION_VALUE_CONFLICTING_OPERATION;
            }

            case "OPTION_VALUE_DOES_NOT_EXIST": {
                return OPTION_VALUE_DOES_NOT_EXIST;
            }

            case "OPTION_VALUE_HAS_VARIANTS": {
                return OPTION_VALUE_HAS_VARIANTS;
            }

            case "OPTION_VALUE_NAME_TOO_LONG": {
                return OPTION_VALUE_NAME_TOO_LONG;
            }

            case "PRODUCT_DOES_NOT_EXIST": {
                return PRODUCT_DOES_NOT_EXIST;
            }

            case "PRODUCT_SUSPENDED": {
                return PRODUCT_SUSPENDED;
            }

            case "TOO_MANY_VARIANTS_CREATED": {
                return TOO_MANY_VARIANTS_CREATED;
            }

            case "UNSUPPORTED_COMBINED_LISTING_PARENT_OPERATION": {
                return UNSUPPORTED_COMBINED_LISTING_PARENT_OPERATION;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CANNOT_COMBINE_LINKED_AND_NONLINKED_OPTION_VALUES: {
                return "CANNOT_COMBINE_LINKED_AND_NONLINKED_OPTION_VALUES";
            }

            case CANNOT_CREATE_VARIANTS_ABOVE_LIMIT: {
                return "CANNOT_CREATE_VARIANTS_ABOVE_LIMIT";
            }

            case CANNOT_DELETE_ALL_OPTION_VALUES_IN_OPTION: {
                return "CANNOT_DELETE_ALL_OPTION_VALUES_IN_OPTION";
            }

            case CANNOT_DELETE_VARIANT_WITHOUT_PERMISSION: {
                return "CANNOT_DELETE_VARIANT_WITHOUT_PERMISSION";
            }

            case CANNOT_LEAVE_OPTIONS_WITHOUT_VARIANTS: {
                return "CANNOT_LEAVE_OPTIONS_WITHOUT_VARIANTS";
            }

            case CANNOT_MAKE_CHANGES_IF_VARIANT_IS_MISSING_REQUIRED_SKU: {
                return "CANNOT_MAKE_CHANGES_IF_VARIANT_IS_MISSING_REQUIRED_SKU";
            }

            case DUPLICATED_OPTION_VALUE: {
                return "DUPLICATED_OPTION_VALUE";
            }

            case DUPLICATE_LINKED_OPTION: {
                return "DUPLICATE_LINKED_OPTION";
            }

            case INVALID_METAFIELD_VALUE_FOR_LINKED_OPTION: {
                return "INVALID_METAFIELD_VALUE_FOR_LINKED_OPTION";
            }

            case INVALID_NAME: {
                return "INVALID_NAME";
            }

            case INVALID_POSITION: {
                return "INVALID_POSITION";
            }

            case KEY_MISSING_IN_INPUT: {
                return "KEY_MISSING_IN_INPUT";
            }

            case LINKED_METAFIELD_DEFINITION_NOT_FOUND: {
                return "LINKED_METAFIELD_DEFINITION_NOT_FOUND";
            }

            case LINKED_OPTIONS_NOT_SUPPORTED_FOR_SHOP: {
                return "LINKED_OPTIONS_NOT_SUPPORTED_FOR_SHOP";
            }

            case LINKED_OPTION_UPDATE_MISSING_VALUES: {
                return "LINKED_OPTION_UPDATE_MISSING_VALUES";
            }

            case NO_KEY_ON_CREATE: {
                return "NO_KEY_ON_CREATE";
            }

            case OPTION_ALREADY_EXISTS: {
                return "OPTION_ALREADY_EXISTS";
            }

            case OPTION_DOES_NOT_EXIST: {
                return "OPTION_DOES_NOT_EXIST";
            }

            case OPTION_LINKED_METAFIELD_ALREADY_TAKEN: {
                return "OPTION_LINKED_METAFIELD_ALREADY_TAKEN";
            }

            case OPTION_NAME_TOO_LONG: {
                return "OPTION_NAME_TOO_LONG";
            }

            case OPTION_VALUES_OVER_LIMIT: {
                return "OPTION_VALUES_OVER_LIMIT";
            }

            case OPTION_VALUE_ALREADY_EXISTS: {
                return "OPTION_VALUE_ALREADY_EXISTS";
            }

            case OPTION_VALUE_CONFLICTING_OPERATION: {
                return "OPTION_VALUE_CONFLICTING_OPERATION";
            }

            case OPTION_VALUE_DOES_NOT_EXIST: {
                return "OPTION_VALUE_DOES_NOT_EXIST";
            }

            case OPTION_VALUE_HAS_VARIANTS: {
                return "OPTION_VALUE_HAS_VARIANTS";
            }

            case OPTION_VALUE_NAME_TOO_LONG: {
                return "OPTION_VALUE_NAME_TOO_LONG";
            }

            case PRODUCT_DOES_NOT_EXIST: {
                return "PRODUCT_DOES_NOT_EXIST";
            }

            case PRODUCT_SUSPENDED: {
                return "PRODUCT_SUSPENDED";
            }

            case TOO_MANY_VARIANTS_CREATED: {
                return "TOO_MANY_VARIANTS_CREATED";
            }

            case UNSUPPORTED_COMBINED_LISTING_PARENT_OPERATION: {
                return "UNSUPPORTED_COMBINED_LISTING_PARENT_OPERATION";
            }

            default: {
                return "";
            }
        }
    }
}

