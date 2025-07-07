// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* List of possible values for an OrderRiskRecommendation recommendation.
*/
public enum OrderRiskRecommendationResult {
    /**
    * Recommends fulfilling the order.
    */
    ACCEPT,

    /**
    * Recommends cancelling the order.
    */
    CANCEL,

    /**
    * Recommends investigating the order by contacting buyers.
    */
    INVESTIGATE,

    /**
    * There is no recommended action for the order.
    */
    NONE,

    UNKNOWN_VALUE;

    public static OrderRiskRecommendationResult fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ACCEPT": {
                return ACCEPT;
            }

            case "CANCEL": {
                return CANCEL;
            }

            case "INVESTIGATE": {
                return INVESTIGATE;
            }

            case "NONE": {
                return NONE;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ACCEPT: {
                return "ACCEPT";
            }

            case CANCEL: {
                return "CANCEL";
            }

            case INVESTIGATE: {
                return "INVESTIGATE";
            }

            case NONE: {
                return "NONE";
            }

            default: {
                return "";
            }
        }
    }
}

