// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* Possible error codes that can be returned by `CartTransformCreateUserError`.
*/
public enum CartTransformCreateUserErrorCode {
    /**
    * A cart transform function already exists for the provided function_id.
    */
    FUNCTION_ALREADY_REGISTERED,

    /**
    * Function does not implement the required interface for this cart_transform function.
    */
    FUNCTION_DOES_NOT_IMPLEMENT,

    /**
    * No Shopify Function found for provided function_id.
    */
    FUNCTION_NOT_FOUND,

    /**
    * Failed to create cart transform due to invalid input.
    */
    INPUT_INVALID,

    /**
    * Could not create or update metafields.
    */
    INVALID_METAFIELDS,

    UNKNOWN_VALUE;

    public static CartTransformCreateUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "FUNCTION_ALREADY_REGISTERED": {
                return FUNCTION_ALREADY_REGISTERED;
            }

            case "FUNCTION_DOES_NOT_IMPLEMENT": {
                return FUNCTION_DOES_NOT_IMPLEMENT;
            }

            case "FUNCTION_NOT_FOUND": {
                return FUNCTION_NOT_FOUND;
            }

            case "INPUT_INVALID": {
                return INPUT_INVALID;
            }

            case "INVALID_METAFIELDS": {
                return INVALID_METAFIELDS;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case FUNCTION_ALREADY_REGISTERED: {
                return "FUNCTION_ALREADY_REGISTERED";
            }

            case FUNCTION_DOES_NOT_IMPLEMENT: {
                return "FUNCTION_DOES_NOT_IMPLEMENT";
            }

            case FUNCTION_NOT_FOUND: {
                return "FUNCTION_NOT_FOUND";
            }

            case INPUT_INVALID: {
                return "INPUT_INVALID";
            }

            case INVALID_METAFIELDS: {
                return "INVALID_METAFIELDS";
            }

            default: {
                return "";
            }
        }
    }
}

