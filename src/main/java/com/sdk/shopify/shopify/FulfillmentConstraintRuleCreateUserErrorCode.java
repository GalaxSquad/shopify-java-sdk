// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `FulfillmentConstraintRuleCreateUserError`.
*/
public enum FulfillmentConstraintRuleCreateUserErrorCode {
    /**
    * Shop must be on a Shopify Plus plan to activate functions from a custom app.
    */
    CUSTOM_APP_FUNCTION_NOT_ELIGIBLE,

    /**
    * A fulfillment constraint rule already exists for the provided function_id.
    */
    FUNCTION_ALREADY_REGISTERED,

    /**
    * Function does not implement the required interface for this fulfillment constraint rule.
    */
    FUNCTION_DOES_NOT_IMPLEMENT,

    /**
    * No Shopify Function found for provided function_id.
    */
    FUNCTION_NOT_FOUND,

    /**
    * Function is pending deletion and cannot have new rules created against it.
    */
    FUNCTION_PENDING_DELETION,

    /**
    * Failed to create fulfillment constraint rule due to invalid input.
    */
    INPUT_INVALID,

    /**
    * Maximum number of fulfillment constraint rules reached. Limit is 10.
    */
    MAXIMUM_FULFILLMENT_CONSTRAINT_RULES_REACHED,

    UNKNOWN_VALUE;

    public static FulfillmentConstraintRuleCreateUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CUSTOM_APP_FUNCTION_NOT_ELIGIBLE": {
                return CUSTOM_APP_FUNCTION_NOT_ELIGIBLE;
            }

            case "FUNCTION_ALREADY_REGISTERED": {
                return FUNCTION_ALREADY_REGISTERED;
            }

            case "FUNCTION_DOES_NOT_IMPLEMENT": {
                return FUNCTION_DOES_NOT_IMPLEMENT;
            }

            case "FUNCTION_NOT_FOUND": {
                return FUNCTION_NOT_FOUND;
            }

            case "FUNCTION_PENDING_DELETION": {
                return FUNCTION_PENDING_DELETION;
            }

            case "INPUT_INVALID": {
                return INPUT_INVALID;
            }

            case "MAXIMUM_FULFILLMENT_CONSTRAINT_RULES_REACHED": {
                return MAXIMUM_FULFILLMENT_CONSTRAINT_RULES_REACHED;
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

            case FUNCTION_ALREADY_REGISTERED: {
                return "FUNCTION_ALREADY_REGISTERED";
            }

            case FUNCTION_DOES_NOT_IMPLEMENT: {
                return "FUNCTION_DOES_NOT_IMPLEMENT";
            }

            case FUNCTION_NOT_FOUND: {
                return "FUNCTION_NOT_FOUND";
            }

            case FUNCTION_PENDING_DELETION: {
                return "FUNCTION_PENDING_DELETION";
            }

            case INPUT_INVALID: {
                return "INPUT_INVALID";
            }

            case MAXIMUM_FULFILLMENT_CONSTRAINT_RULES_REACHED: {
                return "MAXIMUM_FULFILLMENT_CONSTRAINT_RULES_REACHED";
            }

            default: {
                return "";
            }
        }
    }
}

