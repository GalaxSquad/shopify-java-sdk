// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* The set of variant strategies available for use in the `productOptionsCreate` mutation.
*/
public enum ProductOptionCreateVariantStrategy {
    /**
    * Existing variants are updated with the first option value of each added option. New variants are
    * created for each combination of existing variant option values and new option values.
    */
    CREATE,

    /**
    * No additional variants are created in response to the added options. Existing variants are updated
    * with the
    * first option value of each option added.
    */
    LEAVE_AS_IS,

    UNKNOWN_VALUE;

    public static ProductOptionCreateVariantStrategy fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CREATE": {
                return CREATE;
            }

            case "LEAVE_AS_IS": {
                return LEAVE_AS_IS;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CREATE: {
                return "CREATE";
            }

            case LEAVE_AS_IS: {
                return "LEAVE_AS_IS";
            }

            default: {
                return "";
            }
        }
    }
}

