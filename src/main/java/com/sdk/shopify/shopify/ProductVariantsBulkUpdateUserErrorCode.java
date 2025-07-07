// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `ProductVariantsBulkUpdateUserError`.
*/
public enum ProductVariantsBulkUpdateUserErrorCode {
    /**
    * The input value is blank.
    */
    BLANK,

    /**
    * Cannot set name for an option value linked to a metafield.
    */
    CANNOT_SET_NAME_FOR_LINKED_OPTION_VALUE,

    /**
    * Mutually exclusive input fields provided.
    */
    CANNOT_SPECIFY_BOTH,

    /**
    * The price of the variant must be greater than or equal to zero.
    */
    GREATER_THAN_OR_EQUAL_TO,

    /**
    * Input is invalid.
    */
    INVALID_INPUT,

    /**
    * Metafield value is invalid.
    */
    INVALID_VALUE,

    /**
    * Input must be for this product.
    */
    MUST_BE_FOR_THIS_PRODUCT,

    /**
    * Mandatory field input field missing.
    */
    MUST_SPECIFY_ONE_OF_PAIR,

    /**
    * Variant options are not enough.
    */
    NEED_TO_ADD_OPTION_VALUES,

    /**
    * Price cannot take a negative value.
    */
    NEGATIVE_PRICE_VALUE,

    /**
    * Input is not defined for this shop.
    */
    NOT_DEFINED_FOR_SHOP,

    /**
    * Inventory quantities cannot be provided during update.
    */
    NO_INVENTORY_QUANTITES_DURING_UPDATE,

    /**
    * Inventory quantities can only be provided during create. To update inventory for existing variants,
    * use inventoryAdjustQuantities.
    */
    NO_INVENTORY_QUANTITIES_ON_VARIANTS_UPDATE,

    /**
    * Option does not exist.
    */
    OPTION_DOES_NOT_EXIST,

    /**
    * Variant options are more than the product options.
    */
    OPTION_VALUES_FOR_NUMBER_OF_UNKNOWN_OPTIONS,

    /**
    * Option value does not exist.
    */
    OPTION_VALUE_DOES_NOT_EXIST,

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
    * Product variant does not exist.
    */
    PRODUCT_VARIANT_DOES_NOT_EXIST,

    /**
    * Product variant is missing ID attribute.
    */
    PRODUCT_VARIANT_ID_MISSING,

    /**
    * You reached the limit of available SKUs in your current plan.
    */
    SUBSCRIPTION_VIOLATION,

    /**
    * The input value is too long.
    */
    TOO_LONG,

    /**
    * The input value is too short.
    */
    TOO_SHORT,

    /**
    * Operation is not supported for a combined listing parent product.
    */
    UNSUPPORTED_COMBINED_LISTING_PARENT_OPERATION,

    /**
    * The variant already exists.
    */
    VARIANT_ALREADY_EXISTS,

    UNKNOWN_VALUE;

    public static ProductVariantsBulkUpdateUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "BLANK": {
                return BLANK;
            }

            case "CANNOT_SET_NAME_FOR_LINKED_OPTION_VALUE": {
                return CANNOT_SET_NAME_FOR_LINKED_OPTION_VALUE;
            }

            case "CANNOT_SPECIFY_BOTH": {
                return CANNOT_SPECIFY_BOTH;
            }

            case "GREATER_THAN_OR_EQUAL_TO": {
                return GREATER_THAN_OR_EQUAL_TO;
            }

            case "INVALID_INPUT": {
                return INVALID_INPUT;
            }

            case "INVALID_VALUE": {
                return INVALID_VALUE;
            }

            case "MUST_BE_FOR_THIS_PRODUCT": {
                return MUST_BE_FOR_THIS_PRODUCT;
            }

            case "MUST_SPECIFY_ONE_OF_PAIR": {
                return MUST_SPECIFY_ONE_OF_PAIR;
            }

            case "NEED_TO_ADD_OPTION_VALUES": {
                return NEED_TO_ADD_OPTION_VALUES;
            }

            case "NEGATIVE_PRICE_VALUE": {
                return NEGATIVE_PRICE_VALUE;
            }

            case "NOT_DEFINED_FOR_SHOP": {
                return NOT_DEFINED_FOR_SHOP;
            }

            case "NO_INVENTORY_QUANTITES_DURING_UPDATE": {
                return NO_INVENTORY_QUANTITES_DURING_UPDATE;
            }

            case "NO_INVENTORY_QUANTITIES_ON_VARIANTS_UPDATE": {
                return NO_INVENTORY_QUANTITIES_ON_VARIANTS_UPDATE;
            }

            case "OPTION_DOES_NOT_EXIST": {
                return OPTION_DOES_NOT_EXIST;
            }

            case "OPTION_VALUES_FOR_NUMBER_OF_UNKNOWN_OPTIONS": {
                return OPTION_VALUES_FOR_NUMBER_OF_UNKNOWN_OPTIONS;
            }

            case "OPTION_VALUE_DOES_NOT_EXIST": {
                return OPTION_VALUE_DOES_NOT_EXIST;
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

            case "PRODUCT_VARIANT_DOES_NOT_EXIST": {
                return PRODUCT_VARIANT_DOES_NOT_EXIST;
            }

            case "PRODUCT_VARIANT_ID_MISSING": {
                return PRODUCT_VARIANT_ID_MISSING;
            }

            case "SUBSCRIPTION_VIOLATION": {
                return SUBSCRIPTION_VIOLATION;
            }

            case "TOO_LONG": {
                return TOO_LONG;
            }

            case "TOO_SHORT": {
                return TOO_SHORT;
            }

            case "UNSUPPORTED_COMBINED_LISTING_PARENT_OPERATION": {
                return UNSUPPORTED_COMBINED_LISTING_PARENT_OPERATION;
            }

            case "VARIANT_ALREADY_EXISTS": {
                return VARIANT_ALREADY_EXISTS;
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

            case CANNOT_SET_NAME_FOR_LINKED_OPTION_VALUE: {
                return "CANNOT_SET_NAME_FOR_LINKED_OPTION_VALUE";
            }

            case CANNOT_SPECIFY_BOTH: {
                return "CANNOT_SPECIFY_BOTH";
            }

            case GREATER_THAN_OR_EQUAL_TO: {
                return "GREATER_THAN_OR_EQUAL_TO";
            }

            case INVALID_INPUT: {
                return "INVALID_INPUT";
            }

            case INVALID_VALUE: {
                return "INVALID_VALUE";
            }

            case MUST_BE_FOR_THIS_PRODUCT: {
                return "MUST_BE_FOR_THIS_PRODUCT";
            }

            case MUST_SPECIFY_ONE_OF_PAIR: {
                return "MUST_SPECIFY_ONE_OF_PAIR";
            }

            case NEED_TO_ADD_OPTION_VALUES: {
                return "NEED_TO_ADD_OPTION_VALUES";
            }

            case NEGATIVE_PRICE_VALUE: {
                return "NEGATIVE_PRICE_VALUE";
            }

            case NOT_DEFINED_FOR_SHOP: {
                return "NOT_DEFINED_FOR_SHOP";
            }

            case NO_INVENTORY_QUANTITES_DURING_UPDATE: {
                return "NO_INVENTORY_QUANTITES_DURING_UPDATE";
            }

            case NO_INVENTORY_QUANTITIES_ON_VARIANTS_UPDATE: {
                return "NO_INVENTORY_QUANTITIES_ON_VARIANTS_UPDATE";
            }

            case OPTION_DOES_NOT_EXIST: {
                return "OPTION_DOES_NOT_EXIST";
            }

            case OPTION_VALUES_FOR_NUMBER_OF_UNKNOWN_OPTIONS: {
                return "OPTION_VALUES_FOR_NUMBER_OF_UNKNOWN_OPTIONS";
            }

            case OPTION_VALUE_DOES_NOT_EXIST: {
                return "OPTION_VALUE_DOES_NOT_EXIST";
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

            case PRODUCT_VARIANT_DOES_NOT_EXIST: {
                return "PRODUCT_VARIANT_DOES_NOT_EXIST";
            }

            case PRODUCT_VARIANT_ID_MISSING: {
                return "PRODUCT_VARIANT_ID_MISSING";
            }

            case SUBSCRIPTION_VIOLATION: {
                return "SUBSCRIPTION_VIOLATION";
            }

            case TOO_LONG: {
                return "TOO_LONG";
            }

            case TOO_SHORT: {
                return "TOO_SHORT";
            }

            case UNSUPPORTED_COMBINED_LISTING_PARENT_OPERATION: {
                return "UNSUPPORTED_COMBINED_LISTING_PARENT_OPERATION";
            }

            case VARIANT_ALREADY_EXISTS: {
                return "VARIANT_ALREADY_EXISTS";
            }

            default: {
                return "";
            }
        }
    }
}

