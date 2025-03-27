// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* The possible severity levels for a resource alert.
*/
public enum ResourceAlertSeverity {
    /**
    * Indicates a critical alert. For example, a blocked app.
    */
    CRITICAL,

    /**
    * Indicates a neutral alert. For example, an accepted dispute.
    */
    DEFAULT,

    /**
    * Indicates an informative alert. For example, an escalated dispute.
    */
    INFO,

    /**
    * Indicates a success alert. For example, a winning a dispute.
    */
    SUCCESS,

    /**
    * Indicates an informative alert. For example, a new dispute.
    */
    WARNING,

    UNKNOWN_VALUE;

    public static ResourceAlertSeverity fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
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

