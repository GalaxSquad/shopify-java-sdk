// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* The set of strategies available for use on the `productVariantsBulkCreate` mutation.
*/
public enum ProductVariantsBulkCreateStrategy {
    /**
    * The default strategy; keep the standalone variant (when product has only a single or default
    * variant) when creating variants in bulk.
    */
    DEFAULT,

    /**
    * Delete the standalone variant (when product has only a single or default variant) when creating new
    * variants in bulk.
    */
    REMOVE_STANDALONE_VARIANT,

    UNKNOWN_VALUE;

    public static ProductVariantsBulkCreateStrategy fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "DEFAULT": {
                return DEFAULT;
            }

            case "REMOVE_STANDALONE_VARIANT": {
                return REMOVE_STANDALONE_VARIANT;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case DEFAULT: {
                return "DEFAULT";
            }

            case REMOVE_STANDALONE_VARIANT: {
                return "REMOVE_STANDALONE_VARIANT";
            }

            default: {
                return "";
            }
        }
    }
}

