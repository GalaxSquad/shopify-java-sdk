// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* The frequency at which the shop is billed for an app subscription.
*/
public enum AppPricingInterval {
    /**
    * The app subscription bills the shop annually.
    */
    ANNUAL,

    /**
    * The app subscription bills the shop every 30 days.
    */
    EVERY_30_DAYS,

    UNKNOWN_VALUE;

    public static AppPricingInterval fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ANNUAL": {
                return ANNUAL;
            }

            case "EVERY_30_DAYS": {
                return EVERY_30_DAYS;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ANNUAL: {
                return "ANNUAL";
            }

            case EVERY_30_DAYS: {
                return "EVERY_30_DAYS";
            }

            default: {
                return "";
            }
        }
    }
}

