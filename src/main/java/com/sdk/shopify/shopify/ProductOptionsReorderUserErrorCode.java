// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* Possible error codes that can be returned by `ProductOptionsReorderUserError`.
*/
public enum ProductOptionsReorderUserErrorCode {
    /**
    * At least one of the product variants has invalid SKUs.
    */
    CANNOT_MAKE_CHANGES_IF_VARIANT_IS_MISSING_REQUIRED_SKU,

    /**
    * Duplicated option name.
    */
    DUPLICATED_OPTION_NAME,

    /**
    * Duplicated option value.
    */
    DUPLICATED_OPTION_VALUE,

    /**
    * Missing option name.
    */
    MISSING_OPTION_NAME,

    /**
    * Missing option value.
    */
    MISSING_OPTION_VALUE,

    /**
    * Cannot specify different options or option values using mixed id and name reference key.
    */
    MIXING_ID_AND_NAME_KEYS_IS_NOT_ALLOWED,

    /**
    * On reorder, this key cannot be used.
    */
    NO_KEY_ON_REORDER,

    /**
    * Option id does not exist.
    */
    OPTION_ID_DOES_NOT_EXIST,

    /**
    * Option name does not exist.
    */
    OPTION_NAME_DOES_NOT_EXIST,

    /**
    * Option value does not exist.
    */
    OPTION_VALUE_DOES_NOT_EXIST,

    /**
    * Option value id does not exist.
    */
    OPTION_VALUE_ID_DOES_NOT_EXIST,

    /**
    * Product does not exist.
    */
    PRODUCT_DOES_NOT_EXIST,

    UNKNOWN_VALUE;

    public static ProductOptionsReorderUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CANNOT_MAKE_CHANGES_IF_VARIANT_IS_MISSING_REQUIRED_SKU": {
                return CANNOT_MAKE_CHANGES_IF_VARIANT_IS_MISSING_REQUIRED_SKU;
            }

            case "DUPLICATED_OPTION_NAME": {
                return DUPLICATED_OPTION_NAME;
            }

            case "DUPLICATED_OPTION_VALUE": {
                return DUPLICATED_OPTION_VALUE;
            }

            case "MISSING_OPTION_NAME": {
                return MISSING_OPTION_NAME;
            }

            case "MISSING_OPTION_VALUE": {
                return MISSING_OPTION_VALUE;
            }

            case "MIXING_ID_AND_NAME_KEYS_IS_NOT_ALLOWED": {
                return MIXING_ID_AND_NAME_KEYS_IS_NOT_ALLOWED;
            }

            case "NO_KEY_ON_REORDER": {
                return NO_KEY_ON_REORDER;
            }

            case "OPTION_ID_DOES_NOT_EXIST": {
                return OPTION_ID_DOES_NOT_EXIST;
            }

            case "OPTION_NAME_DOES_NOT_EXIST": {
                return OPTION_NAME_DOES_NOT_EXIST;
            }

            case "OPTION_VALUE_DOES_NOT_EXIST": {
                return OPTION_VALUE_DOES_NOT_EXIST;
            }

            case "OPTION_VALUE_ID_DOES_NOT_EXIST": {
                return OPTION_VALUE_ID_DOES_NOT_EXIST;
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
            case CANNOT_MAKE_CHANGES_IF_VARIANT_IS_MISSING_REQUIRED_SKU: {
                return "CANNOT_MAKE_CHANGES_IF_VARIANT_IS_MISSING_REQUIRED_SKU";
            }

            case DUPLICATED_OPTION_NAME: {
                return "DUPLICATED_OPTION_NAME";
            }

            case DUPLICATED_OPTION_VALUE: {
                return "DUPLICATED_OPTION_VALUE";
            }

            case MISSING_OPTION_NAME: {
                return "MISSING_OPTION_NAME";
            }

            case MISSING_OPTION_VALUE: {
                return "MISSING_OPTION_VALUE";
            }

            case MIXING_ID_AND_NAME_KEYS_IS_NOT_ALLOWED: {
                return "MIXING_ID_AND_NAME_KEYS_IS_NOT_ALLOWED";
            }

            case NO_KEY_ON_REORDER: {
                return "NO_KEY_ON_REORDER";
            }

            case OPTION_ID_DOES_NOT_EXIST: {
                return "OPTION_ID_DOES_NOT_EXIST";
            }

            case OPTION_NAME_DOES_NOT_EXIST: {
                return "OPTION_NAME_DOES_NOT_EXIST";
            }

            case OPTION_VALUE_DOES_NOT_EXIST: {
                return "OPTION_VALUE_DOES_NOT_EXIST";
            }

            case OPTION_VALUE_ID_DOES_NOT_EXIST: {
                return "OPTION_VALUE_ID_DOES_NOT_EXIST";
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

