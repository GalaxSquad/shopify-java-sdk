// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* The operator to use to determine if the condition passes.
*/
public enum DeliveryConditionOperator {
    /**
    * The condition will check whether the field is greater than or equal to the criterion.
    */
    GREATER_THAN_OR_EQUAL_TO,

    /**
    * The condition will check if the field is less than or equal to the criterion.
    */
    LESS_THAN_OR_EQUAL_TO,

    UNKNOWN_VALUE;

    public static DeliveryConditionOperator fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "GREATER_THAN_OR_EQUAL_TO": {
                return GREATER_THAN_OR_EQUAL_TO;
            }

            case "LESS_THAN_OR_EQUAL_TO": {
                return LESS_THAN_OR_EQUAL_TO;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case GREATER_THAN_OR_EQUAL_TO: {
                return "GREATER_THAN_OR_EQUAL_TO";
            }

            case LESS_THAN_OR_EQUAL_TO: {
                return "LESS_THAN_OR_EQUAL_TO";
            }

            default: {
                return "";
            }
        }
    }
}

