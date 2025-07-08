// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `ProductSetUserError`.
*/
public enum ProductSetUserErrorCode {
    /**
    * An option cannot have both metafield linked and nonlinked option values.
    */
    CANNOT_COMBINE_LINKED_AND_NONLINKED_OPTION_VALUES,

    /**
    * The metafield violates a capability restriction.
    */
    CAPABILITY_VIOLATION,

    /**
    * Duplicated metafield value for linked option.
    */
    DUPLICATED_METAFIELD_VALUE,

    /**
    * Duplicated option name.
    */
    DUPLICATED_OPTION_NAME,

    /**
    * Duplicated option value.
    */
    DUPLICATED_OPTION_VALUE,

    /**
    * Duplicated value.
    */
    DUPLICATED_VALUE,

    /**
    * Cannot link multiple options to the same metafield.
    */
    DUPLICATE_LINKED_OPTION,

    /**
    * Something went wrong, please try again.
    */
    GENERIC_ERROR,

    /**
    * Gift card products can only be created after they have been activated.
    */
    GIFT_CARDS_NOT_ACTIVATED,

    /**
    * The product gift_card attribute cannot be changed after creation.
    */
    GIFT_CARD_ATTRIBUTE_CANNOT_BE_CHANGED,

    /**
    * Handle already in use. Please provide a new handle.
    */
    HANDLE_NOT_UNIQUE,

    /**
    * The id field is not allowed if identifier is provided.
    */
    ID_NOT_ALLOWED,

    /**
    * The identifier value does not match the value of the corresponding field in the input.
    */
    INPUT_MISMATCH,

    /**
    * Input is not valid.
    */
    INVALID_INPUT,

    /**
    * Metafield is not valid.
    */
    INVALID_METAFIELD,

    /**
    * Invalid metafield value for linked option.
    */
    INVALID_METAFIELD_VALUE_FOR_LINKED_OPTION,

    /**
    * Product is not valid.
    */
    INVALID_PRODUCT,

    /**
    * Product variant is not valid.
    */
    INVALID_VARIANT,

    /**
    * Error processing request in the background job.
    */
    JOB_ERROR,

    /**
    * No valid metafield definition found for linked option.
    */
    LINKED_METAFIELD_DEFINITION_NOT_FOUND,

    /**
    * Linked options are currently not supported for this shop.
    */
    LINKED_OPTIONS_NOT_SUPPORTED_FOR_SHOP,

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
    * Options over limit.
    */
    OPTIONS_OVER_LIMIT,

    /**
    * Option does not exist.
    */
    OPTION_DOES_NOT_EXIST,

    /**
    * Each option must have at least one option value specified.
    */
    OPTION_VALUES_MISSING,

    /**
    * Option values over limit.
    */
    OPTION_VALUES_OVER_LIMIT,

    /**
    * Option value does not exist.
    */
    OPTION_VALUE_DOES_NOT_EXIST,

    /**
    * Product does not exist.
    */
    PRODUCT_DOES_NOT_EXIST,

    /**
    * Must specify product options when updating variants.
    */
    PRODUCT_OPTIONS_INPUT_MISSING,

    /**
    * Product is suspended.
    */
    PRODUCT_SUSPENDED,

    /**
    * Product variant does not exist.
    */
    PRODUCT_VARIANT_DOES_NOT_EXIST,

    /**
    * Must specify variants when updating options.
    */
    VARIANTS_INPUT_MISSING,

    /**
    * Number of product variants exceeds shop limit.
    */
    VARIANTS_OVER_LIMIT,

    UNKNOWN_VALUE;

    public static ProductSetUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CANNOT_COMBINE_LINKED_AND_NONLINKED_OPTION_VALUES": {
                return CANNOT_COMBINE_LINKED_AND_NONLINKED_OPTION_VALUES;
            }

            case "CAPABILITY_VIOLATION": {
                return CAPABILITY_VIOLATION;
            }

            case "DUPLICATED_METAFIELD_VALUE": {
                return DUPLICATED_METAFIELD_VALUE;
            }

            case "DUPLICATED_OPTION_NAME": {
                return DUPLICATED_OPTION_NAME;
            }

            case "DUPLICATED_OPTION_VALUE": {
                return DUPLICATED_OPTION_VALUE;
            }

            case "DUPLICATED_VALUE": {
                return DUPLICATED_VALUE;
            }

            case "DUPLICATE_LINKED_OPTION": {
                return DUPLICATE_LINKED_OPTION;
            }

            case "GENERIC_ERROR": {
                return GENERIC_ERROR;
            }

            case "GIFT_CARDS_NOT_ACTIVATED": {
                return GIFT_CARDS_NOT_ACTIVATED;
            }

            case "GIFT_CARD_ATTRIBUTE_CANNOT_BE_CHANGED": {
                return GIFT_CARD_ATTRIBUTE_CANNOT_BE_CHANGED;
            }

            case "HANDLE_NOT_UNIQUE": {
                return HANDLE_NOT_UNIQUE;
            }

            case "ID_NOT_ALLOWED": {
                return ID_NOT_ALLOWED;
            }

            case "INPUT_MISMATCH": {
                return INPUT_MISMATCH;
            }

            case "INVALID_INPUT": {
                return INVALID_INPUT;
            }

            case "INVALID_METAFIELD": {
                return INVALID_METAFIELD;
            }

            case "INVALID_METAFIELD_VALUE_FOR_LINKED_OPTION": {
                return INVALID_METAFIELD_VALUE_FOR_LINKED_OPTION;
            }

            case "INVALID_PRODUCT": {
                return INVALID_PRODUCT;
            }

            case "INVALID_VARIANT": {
                return INVALID_VARIANT;
            }

            case "JOB_ERROR": {
                return JOB_ERROR;
            }

            case "LINKED_METAFIELD_DEFINITION_NOT_FOUND": {
                return LINKED_METAFIELD_DEFINITION_NOT_FOUND;
            }

            case "LINKED_OPTIONS_NOT_SUPPORTED_FOR_SHOP": {
                return LINKED_OPTIONS_NOT_SUPPORTED_FOR_SHOP;
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

            case "OPTIONS_OVER_LIMIT": {
                return OPTIONS_OVER_LIMIT;
            }

            case "OPTION_DOES_NOT_EXIST": {
                return OPTION_DOES_NOT_EXIST;
            }

            case "OPTION_VALUES_MISSING": {
                return OPTION_VALUES_MISSING;
            }

            case "OPTION_VALUES_OVER_LIMIT": {
                return OPTION_VALUES_OVER_LIMIT;
            }

            case "OPTION_VALUE_DOES_NOT_EXIST": {
                return OPTION_VALUE_DOES_NOT_EXIST;
            }

            case "PRODUCT_DOES_NOT_EXIST": {
                return PRODUCT_DOES_NOT_EXIST;
            }

            case "PRODUCT_OPTIONS_INPUT_MISSING": {
                return PRODUCT_OPTIONS_INPUT_MISSING;
            }

            case "PRODUCT_SUSPENDED": {
                return PRODUCT_SUSPENDED;
            }

            case "PRODUCT_VARIANT_DOES_NOT_EXIST": {
                return PRODUCT_VARIANT_DOES_NOT_EXIST;
            }

            case "VARIANTS_INPUT_MISSING": {
                return VARIANTS_INPUT_MISSING;
            }

            case "VARIANTS_OVER_LIMIT": {
                return VARIANTS_OVER_LIMIT;
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

            case CAPABILITY_VIOLATION: {
                return "CAPABILITY_VIOLATION";
            }

            case DUPLICATED_METAFIELD_VALUE: {
                return "DUPLICATED_METAFIELD_VALUE";
            }

            case DUPLICATED_OPTION_NAME: {
                return "DUPLICATED_OPTION_NAME";
            }

            case DUPLICATED_OPTION_VALUE: {
                return "DUPLICATED_OPTION_VALUE";
            }

            case DUPLICATED_VALUE: {
                return "DUPLICATED_VALUE";
            }

            case DUPLICATE_LINKED_OPTION: {
                return "DUPLICATE_LINKED_OPTION";
            }

            case GENERIC_ERROR: {
                return "GENERIC_ERROR";
            }

            case GIFT_CARDS_NOT_ACTIVATED: {
                return "GIFT_CARDS_NOT_ACTIVATED";
            }

            case GIFT_CARD_ATTRIBUTE_CANNOT_BE_CHANGED: {
                return "GIFT_CARD_ATTRIBUTE_CANNOT_BE_CHANGED";
            }

            case HANDLE_NOT_UNIQUE: {
                return "HANDLE_NOT_UNIQUE";
            }

            case ID_NOT_ALLOWED: {
                return "ID_NOT_ALLOWED";
            }

            case INPUT_MISMATCH: {
                return "INPUT_MISMATCH";
            }

            case INVALID_INPUT: {
                return "INVALID_INPUT";
            }

            case INVALID_METAFIELD: {
                return "INVALID_METAFIELD";
            }

            case INVALID_METAFIELD_VALUE_FOR_LINKED_OPTION: {
                return "INVALID_METAFIELD_VALUE_FOR_LINKED_OPTION";
            }

            case INVALID_PRODUCT: {
                return "INVALID_PRODUCT";
            }

            case INVALID_VARIANT: {
                return "INVALID_VARIANT";
            }

            case JOB_ERROR: {
                return "JOB_ERROR";
            }

            case LINKED_METAFIELD_DEFINITION_NOT_FOUND: {
                return "LINKED_METAFIELD_DEFINITION_NOT_FOUND";
            }

            case LINKED_OPTIONS_NOT_SUPPORTED_FOR_SHOP: {
                return "LINKED_OPTIONS_NOT_SUPPORTED_FOR_SHOP";
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

            case OPTIONS_OVER_LIMIT: {
                return "OPTIONS_OVER_LIMIT";
            }

            case OPTION_DOES_NOT_EXIST: {
                return "OPTION_DOES_NOT_EXIST";
            }

            case OPTION_VALUES_MISSING: {
                return "OPTION_VALUES_MISSING";
            }

            case OPTION_VALUES_OVER_LIMIT: {
                return "OPTION_VALUES_OVER_LIMIT";
            }

            case OPTION_VALUE_DOES_NOT_EXIST: {
                return "OPTION_VALUE_DOES_NOT_EXIST";
            }

            case PRODUCT_DOES_NOT_EXIST: {
                return "PRODUCT_DOES_NOT_EXIST";
            }

            case PRODUCT_OPTIONS_INPUT_MISSING: {
                return "PRODUCT_OPTIONS_INPUT_MISSING";
            }

            case PRODUCT_SUSPENDED: {
                return "PRODUCT_SUSPENDED";
            }

            case PRODUCT_VARIANT_DOES_NOT_EXIST: {
                return "PRODUCT_VARIANT_DOES_NOT_EXIST";
            }

            case VARIANTS_INPUT_MISSING: {
                return "VARIANTS_INPUT_MISSING";
            }

            case VARIANTS_OVER_LIMIT: {
                return "VARIANTS_OVER_LIMIT";
            }

            default: {
                return "";
            }
        }
    }
}

