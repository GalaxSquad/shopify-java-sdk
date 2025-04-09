// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* The medium through which the marketing activity and event reached consumers. This is used for
* reporting aggregation.
*/
public enum MarketingChannel {
    /**
    * Displayed ads.
    */
    DISPLAY,

    /**
    * Email.
    */
    EMAIL,

    /**
    * Referral links.
    */
    REFERRAL,

    /**
    * Paid search.
    */
    SEARCH,

    /**
    * Social media.
    */
    SOCIAL,

    UNKNOWN_VALUE;

    public static MarketingChannel fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "DISPLAY": {
                return DISPLAY;
            }

            case "EMAIL": {
                return EMAIL;
            }

            case "REFERRAL": {
                return REFERRAL;
            }

            case "SEARCH": {
                return SEARCH;
            }

            case "SOCIAL": {
                return SOCIAL;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case DISPLAY: {
                return "DISPLAY";
            }

            case EMAIL: {
                return "EMAIL";
            }

            case REFERRAL: {
                return "REFERRAL";
            }

            case SEARCH: {
                return "SEARCH";
            }

            case SOCIAL: {
                return "SOCIAL";
            }

            default: {
                return "";
            }
        }
    }
}

