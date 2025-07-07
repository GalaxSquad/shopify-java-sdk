// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The set of variant strategies available for use in the `productOptionUpdate` mutation.
*/
public enum ProductOptionUpdateVariantStrategy {
    /**
    * Variants are not created nor deleted in response to option values to add or delete.
    * In cases where deleting a variant would be necessary to complete the operation, an error will be
    * returned.
    */
    LEAVE_AS_IS,

    /**
    * Variants are created and deleted according to the option values to add and to delete.
    * If an option value is added, a new variant will be added for each existing option combination
    * available on the product. For example, if the existing options are `Size` and `Color`, with
    * values `S`/`XL` and `Red`/`Blue`, adding a new option value `Green` for the option `Color` will
    * create
    * variants with the option value combinations `S`/`Green` and `XL`/`Green`.
    * If an option value is deleted, all variants referencing that option value will be deleted.
    */
    MANAGE,

    UNKNOWN_VALUE;

    public static ProductOptionUpdateVariantStrategy fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "LEAVE_AS_IS": {
                return LEAVE_AS_IS;
            }

            case "MANAGE": {
                return MANAGE;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case LEAVE_AS_IS: {
                return "LEAVE_AS_IS";
            }

            case MANAGE: {
                return "MANAGE";
            }

            default: {
                return "";
            }
        }
    }
}

