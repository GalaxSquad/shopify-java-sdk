// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The budget type for a marketing activity.
*/
public enum MarketingBudgetBudgetType {
    /**
    * A daily budget.
    */
    DAILY,

    /**
    * A budget for the lifetime of a marketing activity.
    */
    LIFETIME,

    UNKNOWN_VALUE;

    public static MarketingBudgetBudgetType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "DAILY": {
                return DAILY;
            }

            case "LIFETIME": {
                return LIFETIME;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case DAILY: {
                return "DAILY";
            }

            case LIFETIME: {
                return "LIFETIME";
            }

            default: {
                return "";
            }
        }
    }
}

