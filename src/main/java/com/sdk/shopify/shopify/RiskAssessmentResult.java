// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* List of possible values for a RiskAssessment result.
*/
public enum RiskAssessmentResult {
    /**
    * Indicates a high likelihood that the order is fraudulent.
    */
    HIGH,

    /**
    * Indicates a low likelihood that the order is fraudulent.
    */
    LOW,

    /**
    * Indicates a medium likelihood that the order is fraudulent.
    */
    MEDIUM,

    /**
    * Indicates that the risk assessment will not provide a recommendation for the order.
    */
    NONE,

    /**
    * Indicates that the risk assessment is still pending.
    */
    PENDING,

    UNKNOWN_VALUE;

    public static RiskAssessmentResult fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "HIGH": {
                return HIGH;
            }

            case "LOW": {
                return LOW;
            }

            case "MEDIUM": {
                return MEDIUM;
            }

            case "NONE": {
                return NONE;
            }

            case "PENDING": {
                return PENDING;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case HIGH: {
                return "HIGH";
            }

            case LOW: {
                return "LOW";
            }

            case MEDIUM: {
                return "MEDIUM";
            }

            case NONE: {
                return "NONE";
            }

            case PENDING: {
                return "PENDING";
            }

            default: {
                return "";
            }
        }
    }
}

