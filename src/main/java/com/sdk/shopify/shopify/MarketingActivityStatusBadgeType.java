// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* StatusBadgeType helps to identify the color of the status badge.
*/
public enum MarketingActivityStatusBadgeType {
    /**
    * This status badge has type attention.
    */
    ATTENTION,

    /**
    * This status badge has type critical.
    */
    CRITICAL,

    /**
    * This status badge has type default.
    */
    DEFAULT,

    /**
    * This status badge has type info.
    */
    INFO,

    /**
    * This status badge has type success.
    */
    SUCCESS,

    /**
    * This status badge has type warning.
    */
    WARNING,

    UNKNOWN_VALUE;

    public static MarketingActivityStatusBadgeType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ATTENTION": {
                return ATTENTION;
            }

            case "CRITICAL": {
                return CRITICAL;
            }

            case "DEFAULT": {
                return DEFAULT;
            }

            case "INFO": {
                return INFO;
            }

            case "SUCCESS": {
                return SUCCESS;
            }

            case "WARNING": {
                return WARNING;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ATTENTION: {
                return "ATTENTION";
            }

            case CRITICAL: {
                return "CRITICAL";
            }

            case DEFAULT: {
                return "DEFAULT";
            }

            case INFO: {
                return "INFO";
            }

            case SUCCESS: {
                return "SUCCESS";
            }

            case WARNING: {
                return "WARNING";
            }

            default: {
                return "";
            }
        }
    }
}

