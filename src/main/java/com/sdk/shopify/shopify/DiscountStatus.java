// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The status of the discount that describes its availability,
* expiration, or pending activation.
*/
public enum DiscountStatus {
    /**
    * The discount is currently available for use.
    */
    ACTIVE,

    /**
    * The discount has reached its end date and is no longer valid.
    */
    EXPIRED,

    /**
    * The discount is set to become active at a future date.
    */
    SCHEDULED,

    UNKNOWN_VALUE;

    public static DiscountStatus fromGraphQl(String value) {
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

