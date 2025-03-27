// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* Possible error codes that can be returned by `ProductOptionsDeleteUserError`.
*/
public enum ProductOptionsDeleteUserErrorCode {
    /**
    * Can't delete option with multiple values.
    */
    CANNOT_DELETE_OPTION_WITH_MULTIPLE_VALUES,

    /**
    * Cannot perform option deletion because it would result in deleting variants, and you don't have the
    * required permissions.
    */
    CANNOT_DELETE_VARIANT_WITHOUT_PERMISSION,

    /**
    * At least one of the product variants has invalid SKUs.
    */
    CANNOT_MAKE_CHANGES_IF_VARIANT_IS_MISSING_REQUIRED_SKU,

    /**
    * Cannot delete options without deleting variants.
    */
    CANNOT_USE_NON_DESTRUCTIVE_STRATEGY,

    /**
    * Options do not belong to the same product.
    */
    OPTIONS_DO_NOT_BELONG_TO_THE_SAME_PRODUCT,

    /**
    * Option does not exist.
    */
    OPTION_DOES_NOT_EXIST,

    /**
    * Product does not exist.
    */
    PRODUCT_DOES_NOT_EXIST,

    /**
    * Product is suspended.
    */
    PRODUCT_SUSPENDED,

    /**
    * Operation is not supported for a combined listing parent product.
    */
    UNSUPPORTED_COMBINED_LISTING_PARENT_OPERATION,

    UNKNOWN_VALUE;

    public static ProductOptionsDeleteUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CANNOT_DELETE_OPTION_WITH_MULTIPLE_VALUES": {
                return CANNOT_DELETE_OPTION_WITH_MULTIPLE_VALUES;
            }

            case "CANNOT_DELETE_VARIANT_WITHOUT_PERMISSION": {
                return CANNOT_DELETE_VARIANT_WITHOUT_PERMISSION;
            }

            case "CANNOT_MAKE_CHANGES_IF_VARIANT_IS_MISSING_REQUIRED_SKU": {
                return CANNOT_MAKE_CHANGES_IF_VARIANT_IS_MISSING_REQUIRED_SKU;
            }

            case "CANNOT_USE_NON_DESTRUCTIVE_STRATEGY": {
                return CANNOT_USE_NON_DESTRUCTIVE_STRATEGY;
            }

            case "OPTIONS_DO_NOT_BELONG_TO_THE_SAME_PRODUCT": {
                return OPTIONS_DO_NOT_BELONG_TO_THE_SAME_PRODUCT;
            }

            case "OPTION_DOES_NOT_EXIST": {
                return OPTION_DOES_NOT_EXIST;
            }

            case "PRODUCT_DOES_NOT_EXIST": {
                return PRODUCT_DOES_NOT_EXIST;
            }

            case "PRODUCT_SUSPENDED": {
                return PRODUCT_SUSPENDED;
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
            case CANNOT_DELETE_OPTION_WITH_MULTIPLE_VALUES: {
                return "CANNOT_DELETE_OPTION_WITH_MULTIPLE_VALUES";
            }

            case CANNOT_DELETE_VARIANT_WITHOUT_PERMISSION: {
                return "CANNOT_DELETE_VARIANT_WITHOUT_PERMISSION";
            }

            case CANNOT_MAKE_CHANGES_IF_VARIANT_IS_MISSING_REQUIRED_SKU: {
                return "CANNOT_MAKE_CHANGES_IF_VARIANT_IS_MISSING_REQUIRED_SKU";
            }

            case CANNOT_USE_NON_DESTRUCTIVE_STRATEGY: {
                return "CANNOT_USE_NON_DESTRUCTIVE_STRATEGY";
            }

            case OPTIONS_DO_NOT_BELONG_TO_THE_SAME_PRODUCT: {
                return "OPTIONS_DO_NOT_BELONG_TO_THE_SAME_PRODUCT";
            }

            case OPTION_DOES_NOT_EXIST: {
                return "OPTION_DOES_NOT_EXIST";
            }

            case PRODUCT_DOES_NOT_EXIST: {
                return "PRODUCT_DOES_NOT_EXIST";
            }

            case PRODUCT_SUSPENDED: {
                return "PRODUCT_SUSPENDED";
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

