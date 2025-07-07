// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The status of the price rule.
*/
public enum PriceRuleStatus {
    /**
    * The price rule is active.
    */
    ACTIVE,

    /**
    * The price rule is expired.
    */
    EXPIRED,

    /**
    * The price rule is scheduled.
    */
    SCHEDULED,

    UNKNOWN_VALUE;

    public static PriceRuleStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ACTIVE": {
                return ACTIVE;
            }

            case "EXPIRED": {
                return EXPIRED;
            }

            case "SCHEDULED": {
                return SCHEDULED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ACTIVE: {
                return "ACTIVE";
            }

            case EXPIRED: {
                return "EXPIRED";
            }

            case SCHEDULED: {
                return "SCHEDULED";
            }

            default: {
                return "";
            }
        }
    }
}

