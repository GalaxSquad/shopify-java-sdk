// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

/**
* Possible error codes that can be returned by `PaymentCustomizationError`.
*/
public enum PaymentCustomizationErrorCode {
    /**
    * Shop plan not eligible to use Functions from a custom app.
    */
    CUSTOM_APP_FUNCTION_NOT_ELIGIBLE,

    /**
    * Function does not implement the required interface.
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
    * Maximum payment customizations are already enabled.
    */
    MAXIMUM_ACTIVE_PAYMENT_CUSTOMIZATIONS,

    /**
    * Shop must be on a Shopify Plus plan to activate payment customizations from a custom app.
    */
    PAYMENT_CUSTOMIZATION_FUNCTION_NOT_ELIGIBLE,

    /**
    * Payment customization not found.
    */
    PAYMENT_CUSTOMIZATION_NOT_FOUND,

    /**
    * Required input field must be present.
    */
    REQUIRED_INPUT_FIELD,

    UNKNOWN_VALUE;

    public static PaymentCustomizationErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CUSTOM_APP_FUNCTION_NOT_ELIGIBLE": {
                return CUSTOM_APP_FUNCTION_NOT_ELIGIBLE;
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

            case "MAXIMUM_ACTIVE_PAYMENT_CUSTOMIZATIONS": {
                return MAXIMUM_ACTIVE_PAYMENT_CUSTOMIZATIONS;
            }

            case "PAYMENT_CUSTOMIZATION_FUNCTION_NOT_ELIGIBLE": {
                return PAYMENT_CUSTOMIZATION_FUNCTION_NOT_ELIGIBLE;
            }

            case "PAYMENT_CUSTOMIZATION_NOT_FOUND": {
                return PAYMENT_CUSTOMIZATION_NOT_FOUND;
            }

            case "REQUIRED_INPUT_FIELD": {
                return REQUIRED_INPUT_FIELD;
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

            case MAXIMUM_ACTIVE_PAYMENT_CUSTOMIZATIONS: {
                return "MAXIMUM_ACTIVE_PAYMENT_CUSTOMIZATIONS";
            }

            case PAYMENT_CUSTOMIZATION_FUNCTION_NOT_ELIGIBLE: {
                return "PAYMENT_CUSTOMIZATION_FUNCTION_NOT_ELIGIBLE";
            }

            case PAYMENT_CUSTOMIZATION_NOT_FOUND: {
                return "PAYMENT_CUSTOMIZATION_NOT_FOUND";
            }

            case REQUIRED_INPUT_FIELD: {
                return "REQUIRED_INPUT_FIELD";
            }

            default: {
                return "";
            }
        }
    }
}

