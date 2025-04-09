// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* Possible error codes that can be returned by `ProductVariantsBulkDeleteUserError`.
*/
public enum ProductVariantsBulkDeleteUserErrorCode {
    /**
    * The variant does not exist.
    */
    AT_LEAST_ONE_VARIANT_DOES_NOT_BELONG_TO_THE_PRODUCT,

    /**
    * Cannot delete default variant.
    */
    CANNOT_DELETE_LAST_VARIANT,

    /**
    * Product does not exist.
    */
    PRODUCT_DOES_NOT_EXIST,

    /**
    * Operation is not supported for a combined listing parent product.
    */
    UNSUPPORTED_COMBINED_LISTING_PARENT_OPERATION,

    UNKNOWN_VALUE;

    public static ProductVariantsBulkDeleteUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "AT_LEAST_ONE_VARIANT_DOES_NOT_BELONG_TO_THE_PRODUCT": {
                return AT_LEAST_ONE_VARIANT_DOES_NOT_BELONG_TO_THE_PRODUCT;
            }

            case "CANNOT_DELETE_LAST_VARIANT": {
                return CANNOT_DELETE_LAST_VARIANT;
            }

            case "PRODUCT_DOES_NOT_EXIST": {
                return PRODUCT_DOES_NOT_EXIST;
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
            case AT_LEAST_ONE_VARIANT_DOES_NOT_BELONG_TO_THE_PRODUCT: {
                return "AT_LEAST_ONE_VARIANT_DOES_NOT_BELONG_TO_THE_PRODUCT";
            }

            case CANNOT_DELETE_LAST_VARIANT: {
                return "CANNOT_DELETE_LAST_VARIANT";
            }

            case PRODUCT_DOES_NOT_EXIST: {
                return "PRODUCT_DOES_NOT_EXIST";
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

