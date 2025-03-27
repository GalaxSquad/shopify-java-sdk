// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* Possible error codes that can be returned by `ProductVariantsBulkCreateUserError`.
*/
public enum ProductVariantsBulkCreateUserErrorCode {
    /**
    * Cannot set name for an option value linked to a metafield.
    */
    CANNOT_SET_NAME_FOR_LINKED_OPTION_VALUE,

    /**
    * Variant price must be greater than or equal to zero.
    */
    GREATER_THAN_OR_EQUAL_TO,

    /**
    * Invalid input detected.
    */
    INVALID,

    /**
    * Input is invalid.
    */
    INVALID_INPUT,

    /**
    * Input must be for this product.
    */
    MUST_BE_FOR_THIS_PRODUCT,

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
    * On create, this key cannot be used.
    */
    NO_KEY_ON_CREATE,

    /**
    * Variant options are more than the product options.
    */
    OPTION_VALUES_FOR_NUMBER_OF_UNKNOWN_OPTIONS,

    /**
    * Product does not exist.
    */
    PRODUCT_DOES_NOT_EXIST,

    /**
    * Product is suspended.
    */
    PRODUCT_SUSPENDED,

    /**
    * You reached the limit of available SKUs in your current plan.
    */
    SUBSCRIPTION_VIOLATION,

    /**
    * Inventory locations cannot exceed the allowed resource limit or 10.
    */
    TOO_MANY_INVENTORY_LOCATIONS,

    /**
    * Quantity could not be set. The location was not found.
    */
    TRACKED_VARIANT_LOCATION_NOT_FOUND,

    /**
    * Operation is not supported for a combined listing parent product.
    */
    UNSUPPORTED_COMBINED_LISTING_PARENT_OPERATION,

    /**
    * Variant already exists.
    */
    VARIANT_ALREADY_EXISTS,

    /**
    * Variant options already exist. Please change the variant option(s).
    */
    VARIANT_ALREADY_EXISTS_CHANGE_OPTION_VALUE,

    UNKNOWN_VALUE;

    public static ProductVariantsBulkCreateUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CANNOT_SET_NAME_FOR_LINKED_OPTION_VALUE": {
                return CANNOT_SET_NAME_FOR_LINKED_OPTION_VALUE;
            }

            case "GREATER_THAN_OR_EQUAL_TO": {
                return GREATER_THAN_OR_EQUAL_TO;
            }

            case "INVALID": {
                return INVALID;
            }

            case "INVALID_INPUT": {
                return INVALID_INPUT;
            }

            case "MUST_BE_FOR_THIS_PRODUCT": {
                return MUST_BE_FOR_THIS_PRODUCT;
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

            case "NO_KEY_ON_CREATE": {
                return NO_KEY_ON_CREATE;
            }

            case "OPTION_VALUES_FOR_NUMBER_OF_UNKNOWN_OPTIONS": {
                return OPTION_VALUES_FOR_NUMBER_OF_UNKNOWN_OPTIONS;
            }

            case "PRODUCT_DOES_NOT_EXIST": {
                return PRODUCT_DOES_NOT_EXIST;
            }

            case "PRODUCT_SUSPENDED": {
                return PRODUCT_SUSPENDED;
            }

            case "SUBSCRIPTION_VIOLATION": {
                return SUBSCRIPTION_VIOLATION;
            }

            case "TOO_MANY_INVENTORY_LOCATIONS": {
                return TOO_MANY_INVENTORY_LOCATIONS;
            }

            case "TRACKED_VARIANT_LOCATION_NOT_FOUND": {
                return TRACKED_VARIANT_LOCATION_NOT_FOUND;
            }

            case "UNSUPPORTED_COMBINED_LISTING_PARENT_OPERATION": {
                return UNSUPPORTED_COMBINED_LISTING_PARENT_OPERATION;
            }

            case "VARIANT_ALREADY_EXISTS": {
                return VARIANT_ALREADY_EXISTS;
            }

            case "VARIANT_ALREADY_EXISTS_CHANGE_OPTION_VALUE": {
                return VARIANT_ALREADY_EXISTS_CHANGE_OPTION_VALUE;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CANNOT_SET_NAME_FOR_LINKED_OPTION_VALUE: {
                return "CANNOT_SET_NAME_FOR_LINKED_OPTION_VALUE";
            }

            case GREATER_THAN_OR_EQUAL_TO: {
                return "GREATER_THAN_OR_EQUAL_TO";
            }

            case INVALID: {
                return "INVALID";
            }

            case INVALID_INPUT: {
                return "INVALID_INPUT";
            }

            case MUST_BE_FOR_THIS_PRODUCT: {
                return "MUST_BE_FOR_THIS_PRODUCT";
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

            case NO_KEY_ON_CREATE: {
                return "NO_KEY_ON_CREATE";
            }

            case OPTION_VALUES_FOR_NUMBER_OF_UNKNOWN_OPTIONS: {
                return "OPTION_VALUES_FOR_NUMBER_OF_UNKNOWN_OPTIONS";
            }

            case PRODUCT_DOES_NOT_EXIST: {
                return "PRODUCT_DOES_NOT_EXIST";
            }

            case PRODUCT_SUSPENDED: {
                return "PRODUCT_SUSPENDED";
            }

            case SUBSCRIPTION_VIOLATION: {
                return "SUBSCRIPTION_VIOLATION";
            }

            case TOO_MANY_INVENTORY_LOCATIONS: {
                return "TOO_MANY_INVENTORY_LOCATIONS";
            }

            case TRACKED_VARIANT_LOCATION_NOT_FOUND: {
                return "TRACKED_VARIANT_LOCATION_NOT_FOUND";
            }

            case UNSUPPORTED_COMBINED_LISTING_PARENT_OPERATION: {
                return "UNSUPPORTED_COMBINED_LISTING_PARENT_OPERATION";
            }

            case VARIANT_ALREADY_EXISTS: {
                return "VARIANT_ALREADY_EXISTS";
            }

            case VARIANT_ALREADY_EXISTS_CHANGE_OPTION_VALUE: {
                return "VARIANT_ALREADY_EXISTS_CHANGE_OPTION_VALUE";
            }

            default: {
                return "";
            }
        }
    }
}

