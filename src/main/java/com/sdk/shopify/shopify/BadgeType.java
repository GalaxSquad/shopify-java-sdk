// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The possible types for a badge.
*/
public enum BadgeType {
    /**
    * This badge has type `attention`.
    */
    ATTENTION,

    /**
    * This badge has type `critical`.
    */
    CRITICAL,

    /**
    * This badge has type `default`.
    */
    DEFAULT,

    /**
    * This badge has type `info`.
    */
    INFO,

    /**
    * This badge has type `success`.
    */
    SUCCESS,

    /**
    * This badge has type `warning`.
    */
    WARNING,

    UNKNOWN_VALUE;

    public static BadgeType fromGraphQl(String value) {
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

