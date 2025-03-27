// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* Possible error codes that can be returned by `DeliveryCustomizationError`.
*/
public enum DeliveryCustomizationErrorCode {
    /**
    * Shop must be on a Shopify Plus plan to activate functions from a custom app.
    */
    CUSTOM_APP_FUNCTION_NOT_ELIGIBLE,

    /**
    * Shop must be on a Shopify Plus plan to activate delivery customizations from a custom app.
    */
    DELIVERY_CUSTOMIZATION_FUNCTION_NOT_ELIGIBLE,

    /**
    * Delivery customization not found.
    */
    DELIVERY_CUSTOMIZATION_NOT_FOUND,

    /**
    * Function does not implement the required interface for this delivery customization.
    */
    FUNCTION_DOES_NOT_IMPLEMENT,

    /**
    * Function ID cannot be changed.
    */
    FUNCTION_ID_CANNOT_BE_CHANGED,

    /**
    * Function not found.
    */
    FUNCTION_NOT_FOUND,

    /**
    * Function is pending deletion.
    */
    FUNCTION_PENDING_DELETION,

    /**
    * The input value is invalid.
    */
    INVALID,

    /**
    * Could not create or update metafields.
    */
    INVALID_METAFIELDS,

    /**
    * Maximum delivery customizations are already enabled.
    */
    MAXIMUM_ACTIVE_DELIVERY_CUSTOMIZATIONS,

    /**
    * Required input field must be present.
    */
    REQUIRED_INPUT_FIELD,

    /**
    * Unauthorized app scope.
    */
    UNAUTHORIZED_APP_SCOPE,

    UNKNOWN_VALUE;

    public static DeliveryCustomizationErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CUSTOM_APP_FUNCTION_NOT_ELIGIBLE": {
                return CUSTOM_APP_FUNCTION_NOT_ELIGIBLE;
            }

            case "DELIVERY_CUSTOMIZATION_FUNCTION_NOT_ELIGIBLE": {
                return DELIVERY_CUSTOMIZATION_FUNCTION_NOT_ELIGIBLE;
            }

            case "DELIVERY_CUSTOMIZATION_NOT_FOUND": {
                return DELIVERY_CUSTOMIZATION_NOT_FOUND;
            }

            case "FUNCTION_DOES_NOT_IMPLEMENT": {
                return FUNCTION_DOES_NOT_IMPLEMENT;
            }

            case "FUNCTION_ID_CANNOT_BE_CHANGED": {
                return FUNCTION_ID_CANNOT_BE_CHANGED;
            }

            case "FUNCTION_NOT_FOUND": {
                return FUNCTION_NOT_FOUND;
            }

            case "FUNCTION_PENDING_DELETION": {
                return FUNCTION_PENDING_DELETION;
            }

            case "INVALID": {
                return INVALID;
            }

            case "INVALID_METAFIELDS": {
                return INVALID_METAFIELDS;
            }

            case "MAXIMUM_ACTIVE_DELIVERY_CUSTOMIZATIONS": {
                return MAXIMUM_ACTIVE_DELIVERY_CUSTOMIZATIONS;
            }

            case "REQUIRED_INPUT_FIELD": {
                return REQUIRED_INPUT_FIELD;
            }

            case "UNAUTHORIZED_APP_SCOPE": {
                return UNAUTHORIZED_APP_SCOPE;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CUSTOM_APP_FUNCTION_NOT_ELIGIBLE: {
                return "CUSTOM_APP_FUNCTION_NOT_ELIGIBLE";
            }

            case DELIVERY_CUSTOMIZATION_FUNCTION_NOT_ELIGIBLE: {
                return "DELIVERY_CUSTOMIZATION_FUNCTION_NOT_ELIGIBLE";
            }

            case DELIVERY_CUSTOMIZATION_NOT_FOUND: {
                return "DELIVERY_CUSTOMIZATION_NOT_FOUND";
            }

            case FUNCTION_DOES_NOT_IMPLEMENT: {
                return "FUNCTION_DOES_NOT_IMPLEMENT";
            }

            case FUNCTION_ID_CANNOT_BE_CHANGED: {
                return "FUNCTION_ID_CANNOT_BE_CHANGED";
            }

            case FUNCTION_NOT_FOUND: {
                return "FUNCTION_NOT_FOUND";
            }

            case FUNCTION_PENDING_DELETION: {
                return "FUNCTION_PENDING_DELETION";
            }

            case INVALID: {
                return "INVALID";
            }

            case INVALID_METAFIELDS: {
                return "INVALID_METAFIELDS";
            }

            case MAXIMUM_ACTIVE_DELIVERY_CUSTOMIZATIONS: {
                return "MAXIMUM_ACTIVE_DELIVERY_CUSTOMIZATIONS";
            }

            case REQUIRED_INPUT_FIELD: {
                return "REQUIRED_INPUT_FIELD";
            }

            case UNAUTHORIZED_APP_SCOPE: {
                return "UNAUTHORIZED_APP_SCOPE";
            }

            default: {
                return "";
            }
        }
    }
}

