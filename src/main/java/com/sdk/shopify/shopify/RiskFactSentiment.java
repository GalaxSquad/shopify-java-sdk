// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* List of possible values for a RiskFact sentiment.
*/
public enum RiskFactSentiment {
    /**
    * A negative contributor that increases the risk.
    */
    NEGATIVE,

    /**
    * A neutral contributor with regards to risk.
    */
    NEUTRAL,

    /**
    * A positive contributor that lowers the risk.
    */
    POSITIVE,

    UNKNOWN_VALUE;

    public static RiskFactSentiment fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "NEGATIVE": {
                return NEGATIVE;
            }

            case "NEUTRAL": {
                return NEUTRAL;
            }

            case "POSITIVE": {
                return POSITIVE;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case NEGATIVE: {
                return "NEGATIVE";
            }

            case NEUTRAL: {
                return "NEUTRAL";
            }

            case POSITIVE: {
                return "POSITIVE";
            }

            default: {
                return "";
            }
        }
    }
}

