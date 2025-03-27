// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* Possible error codes that can be returned by `ProductVariantsBulkReorderUserError`.
*/
public enum ProductVariantsBulkReorderUserErrorCode {
    /**
    * Product variant IDs must be unique.
    */
    DUPLICATED_VARIANT_ID,

    /**
    * Something went wrong, please try again.
    */
    GENERIC_ERROR,

    /**
    * Product variant position cannot be zero or negative number.
    */
    INVALID_POSITION,

    /**
    * Product variant does not exist.
    */
    MISSING_VARIANT,

    /**
    * Product does not exist.
    */
    PRODUCT_DOES_NOT_EXIST,

    UNKNOWN_VALUE;

    public static ProductVariantsBulkReorderUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "DUPLICATED_VARIANT_ID": {
                return DUPLICATED_VARIANT_ID;
            }

            case "GENERIC_ERROR": {
                return GENERIC_ERROR;
            }

            case "INVALID_POSITION": {
                return INVALID_POSITION;
            }

            case "MISSING_VARIANT": {
                return MISSING_VARIANT;
            }

            case "PRODUCT_DOES_NOT_EXIST": {
                return PRODUCT_DOES_NOT_EXIST;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case DUPLICATED_VARIANT_ID: {
                return "DUPLICATED_VARIANT_ID";
            }

            case GENERIC_ERROR: {
                return "GENERIC_ERROR";
            }

            case INVALID_POSITION: {
                return "INVALID_POSITION";
            }

            case MISSING_VARIANT: {
                return "MISSING_VARIANT";
            }

            case PRODUCT_DOES_NOT_EXIST: {
                return "PRODUCT_DOES_NOT_EXIST";
            }

            default: {
                return "";
            }
        }
    }
}

