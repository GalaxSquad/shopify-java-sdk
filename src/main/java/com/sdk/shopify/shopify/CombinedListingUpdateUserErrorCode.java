// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* Possible error codes that can be returned by `CombinedListingUpdateUserError`.
*/
public enum CombinedListingUpdateUserErrorCode {
    /**
    * Unable to add duplicated products.
    */
    CANNOT_HAVE_DUPLICATED_PRODUCTS,

    /**
    * Unable to add a product that is a parent.
    */
    CANNOT_HAVE_PARENT_AS_CHILD,

    /**
    * Unable to add products with repeated options.
    */
    CANNOT_HAVE_REPEATED_OPTIONS,

    /**
    * Option values cannot be repeated.
    */
    CANNOT_HAVE_REPEATED_OPTION_VALUES,

    /**
    * Unable to add options values that are already in use.
    */
    CANT_ADD_OPTIONS_VALUES_IF_ALREADY_EXISTS,

    /**
    * Combined listings feature is not enabled.
    */
    COMBINED_LISTINGS_NOT_ENABLED,

    /**
    * Cannot perform edit and remove on same products.
    */
    EDIT_AND_REMOVE_ON_SAME_PRODUCTS,

    /**
    * Unable to add products.
    */
    FAILED_TO_ADD_PRODUCTS,

    /**
    * Unable to remove products.
    */
    FAILED_TO_REMOVE_PRODUCTS,

    /**
    * Unable to update products.
    */
    FAILED_TO_UPDATE_PRODUCTS,

    /**
    * The same metafield cannot be linked to multiple options.
    */
    LINKED_METAFIELDS_CANNOT_BE_REPEATED,

    /**
    * An option linked to a metafield cannot be linked to a different metafield.
    */
    LINKED_METAFIELD_CANNOT_BE_CHANGED,

    /**
    * Linked metafield value missing from `optionsAndValues` field.
    */
    LINKED_METAFIELD_VALUE_MISSING,

    /**
    * Linked options are currently not supported for this shop.
    */
    LINKED_OPTIONS_NOT_SUPPORTED_FOR_SHOP,

    /**
    * The optionsAndValues field is required for this operation.
    */
    MISSING_OPTION_VALUES,

    /**
    * Selected option values cannot be empty.
    */
    MUST_HAVE_SELECTED_OPTION_VALUES,

    /**
    * All child products must include the same options.
    */
    OPTIONS_MUST_BE_EQUAL_TO_THE_OTHER_COMPONENTS,

    /**
    * Unable to add products with blank option names.
    */
    OPTION_NAME_CANNOT_BE_BLANK,

    /**
    * Option does not exist.
    */
    OPTION_NOT_FOUND,

    /**
    * Unable to update options with blank option values.
    */
    OPTION_VALUES_CANNOT_BE_BLANK,

    /**
    * Unable to update options with no option values.
    */
    OPTION_VALUES_CANNOT_BE_EMPTY,

    /**
    * Unable to update components for a product that isn't a combined listing.
    */
    PARENT_PRODUCT_MUST_BE_A_COMBINED_LISTING,

    /**
    * Unable to add a product that is already a child.
    */
    PRODUCT_IS_ALREADY_A_CHILD,

    /**
    * Failed to remove mebmership due to invalid input.
    */
    PRODUCT_MEMBERSHIP_NOT_FOUND,

    /**
    * Unable to add products that do not exist.
    */
    PRODUCT_NOT_FOUND,

    /**
    * The title cannot be longer than 255 characters.
    */
    TITLE_TOO_LONG,

    /**
    * You have reached the maximum number of products that can be added to an individual combined listing.
    */
    TOO_MANY_PRODUCTS,

    /**
    * You have reached the maximum number of variants across all products for an individual combined
    * listing.
    */
    TOO_MANY_VARIANTS,

    /**
    * An unexpected error occurred.
    */
    UNEXPECTED_ERROR,

    UNKNOWN_VALUE;

    public static CombinedListingUpdateUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CANNOT_HAVE_DUPLICATED_PRODUCTS": {
                return CANNOT_HAVE_DUPLICATED_PRODUCTS;
            }

            case "CANNOT_HAVE_PARENT_AS_CHILD": {
                return CANNOT_HAVE_PARENT_AS_CHILD;
            }

            case "CANNOT_HAVE_REPEATED_OPTIONS": {
                return CANNOT_HAVE_REPEATED_OPTIONS;
            }

            case "CANNOT_HAVE_REPEATED_OPTION_VALUES": {
                return CANNOT_HAVE_REPEATED_OPTION_VALUES;
            }

            case "CANT_ADD_OPTIONS_VALUES_IF_ALREADY_EXISTS": {
                return CANT_ADD_OPTIONS_VALUES_IF_ALREADY_EXISTS;
            }

            case "COMBINED_LISTINGS_NOT_ENABLED": {
                return COMBINED_LISTINGS_NOT_ENABLED;
            }

            case "EDIT_AND_REMOVE_ON_SAME_PRODUCTS": {
                return EDIT_AND_REMOVE_ON_SAME_PRODUCTS;
            }

            case "FAILED_TO_ADD_PRODUCTS": {
                return FAILED_TO_ADD_PRODUCTS;
            }

            case "FAILED_TO_REMOVE_PRODUCTS": {
                return FAILED_TO_REMOVE_PRODUCTS;
            }

            case "FAILED_TO_UPDATE_PRODUCTS": {
                return FAILED_TO_UPDATE_PRODUCTS;
            }

            case "LINKED_METAFIELDS_CANNOT_BE_REPEATED": {
                return LINKED_METAFIELDS_CANNOT_BE_REPEATED;
            }

            case "LINKED_METAFIELD_CANNOT_BE_CHANGED": {
                return LINKED_METAFIELD_CANNOT_BE_CHANGED;
            }

            case "LINKED_METAFIELD_VALUE_MISSING": {
                return LINKED_METAFIELD_VALUE_MISSING;
            }

            case "LINKED_OPTIONS_NOT_SUPPORTED_FOR_SHOP": {
                return LINKED_OPTIONS_NOT_SUPPORTED_FOR_SHOP;
            }

            case "MISSING_OPTION_VALUES": {
                return MISSING_OPTION_VALUES;
            }

            case "MUST_HAVE_SELECTED_OPTION_VALUES": {
                return MUST_HAVE_SELECTED_OPTION_VALUES;
            }

            case "OPTIONS_MUST_BE_EQUAL_TO_THE_OTHER_COMPONENTS": {
                return OPTIONS_MUST_BE_EQUAL_TO_THE_OTHER_COMPONENTS;
            }

            case "OPTION_NAME_CANNOT_BE_BLANK": {
                return OPTION_NAME_CANNOT_BE_BLANK;
            }

            case "OPTION_NOT_FOUND": {
                return OPTION_NOT_FOUND;
            }

            case "OPTION_VALUES_CANNOT_BE_BLANK": {
                return OPTION_VALUES_CANNOT_BE_BLANK;
            }

            case "OPTION_VALUES_CANNOT_BE_EMPTY": {
                return OPTION_VALUES_CANNOT_BE_EMPTY;
            }

            case "PARENT_PRODUCT_MUST_BE_A_COMBINED_LISTING": {
                return PARENT_PRODUCT_MUST_BE_A_COMBINED_LISTING;
            }

            case "PRODUCT_IS_ALREADY_A_CHILD": {
                return PRODUCT_IS_ALREADY_A_CHILD;
            }

            case "PRODUCT_MEMBERSHIP_NOT_FOUND": {
                return PRODUCT_MEMBERSHIP_NOT_FOUND;
            }

            case "PRODUCT_NOT_FOUND": {
                return PRODUCT_NOT_FOUND;
            }

            case "TITLE_TOO_LONG": {
                return TITLE_TOO_LONG;
            }

            case "TOO_MANY_PRODUCTS": {
                return TOO_MANY_PRODUCTS;
            }

            case "TOO_MANY_VARIANTS": {
                return TOO_MANY_VARIANTS;
            }

            case "UNEXPECTED_ERROR": {
                return UNEXPECTED_ERROR;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CANNOT_HAVE_DUPLICATED_PRODUCTS: {
                return "CANNOT_HAVE_DUPLICATED_PRODUCTS";
            }

            case CANNOT_HAVE_PARENT_AS_CHILD: {
                return "CANNOT_HAVE_PARENT_AS_CHILD";
            }

            case CANNOT_HAVE_REPEATED_OPTIONS: {
                return "CANNOT_HAVE_REPEATED_OPTIONS";
            }

            case CANNOT_HAVE_REPEATED_OPTION_VALUES: {
                return "CANNOT_HAVE_REPEATED_OPTION_VALUES";
            }

            case CANT_ADD_OPTIONS_VALUES_IF_ALREADY_EXISTS: {
                return "CANT_ADD_OPTIONS_VALUES_IF_ALREADY_EXISTS";
            }

            case COMBINED_LISTINGS_NOT_ENABLED: {
                return "COMBINED_LISTINGS_NOT_ENABLED";
            }

            case EDIT_AND_REMOVE_ON_SAME_PRODUCTS: {
                return "EDIT_AND_REMOVE_ON_SAME_PRODUCTS";
            }

            case FAILED_TO_ADD_PRODUCTS: {
                return "FAILED_TO_ADD_PRODUCTS";
            }

            case FAILED_TO_REMOVE_PRODUCTS: {
                return "FAILED_TO_REMOVE_PRODUCTS";
            }

            case FAILED_TO_UPDATE_PRODUCTS: {
                return "FAILED_TO_UPDATE_PRODUCTS";
            }

            case LINKED_METAFIELDS_CANNOT_BE_REPEATED: {
                return "LINKED_METAFIELDS_CANNOT_BE_REPEATED";
            }

            case LINKED_METAFIELD_CANNOT_BE_CHANGED: {
                return "LINKED_METAFIELD_CANNOT_BE_CHANGED";
            }

            case LINKED_METAFIELD_VALUE_MISSING: {
                return "LINKED_METAFIELD_VALUE_MISSING";
            }

            case LINKED_OPTIONS_NOT_SUPPORTED_FOR_SHOP: {
                return "LINKED_OPTIONS_NOT_SUPPORTED_FOR_SHOP";
            }

            case MISSING_OPTION_VALUES: {
                return "MISSING_OPTION_VALUES";
            }

            case MUST_HAVE_SELECTED_OPTION_VALUES: {
                return "MUST_HAVE_SELECTED_OPTION_VALUES";
            }

            case OPTIONS_MUST_BE_EQUAL_TO_THE_OTHER_COMPONENTS: {
                return "OPTIONS_MUST_BE_EQUAL_TO_THE_OTHER_COMPONENTS";
            }

            case OPTION_NAME_CANNOT_BE_BLANK: {
                return "OPTION_NAME_CANNOT_BE_BLANK";
            }

            case OPTION_NOT_FOUND: {
                return "OPTION_NOT_FOUND";
            }

            case OPTION_VALUES_CANNOT_BE_BLANK: {
                return "OPTION_VALUES_CANNOT_BE_BLANK";
            }

            case OPTION_VALUES_CANNOT_BE_EMPTY: {
                return "OPTION_VALUES_CANNOT_BE_EMPTY";
            }

            case PARENT_PRODUCT_MUST_BE_A_COMBINED_LISTING: {
                return "PARENT_PRODUCT_MUST_BE_A_COMBINED_LISTING";
            }

            case PRODUCT_IS_ALREADY_A_CHILD: {
                return "PRODUCT_IS_ALREADY_A_CHILD";
            }

            case PRODUCT_MEMBERSHIP_NOT_FOUND: {
                return "PRODUCT_MEMBERSHIP_NOT_FOUND";
            }

            case PRODUCT_NOT_FOUND: {
                return "PRODUCT_NOT_FOUND";
            }

            case TITLE_TOO_LONG: {
                return "TITLE_TOO_LONG";
            }

            case TOO_MANY_PRODUCTS: {
                return "TOO_MANY_PRODUCTS";
            }

            case TOO_MANY_VARIANTS: {
                return "TOO_MANY_VARIANTS";
            }

            case UNEXPECTED_ERROR: {
                return "UNEXPECTED_ERROR";
            }

            default: {
                return "";
            }
        }
    }
}

