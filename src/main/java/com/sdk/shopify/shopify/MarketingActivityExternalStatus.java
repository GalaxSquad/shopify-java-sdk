// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* Set of possible statuses for an external marketing activity.
*/
public enum MarketingActivityExternalStatus {
    /**
    * This marketing activity is currently running.
    */
    ACTIVE,

    /**
    * This marketing activity was deleted and it was triggered from outside of Shopify.
    */
    DELETED_EXTERNALLY,

    /**
    * This marketing activity has completed running.
    */
    INACTIVE,

    /**
    * This marketing activity is currently not running.
    */
    PAUSED,

    /**
    * This marketing activity is scheduled to run.
    */
    SCHEDULED,

    /**
    * The marketing activity's status is unknown.
    */
    UNDEFINED,

    UNKNOWN_VALUE;

    public static MarketingActivityExternalStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ACTIVE": {
                return ACTIVE;
            }

            case "DELETED_EXTERNALLY": {
                return DELETED_EXTERNALLY;
            }

            case "INACTIVE": {
                return INACTIVE;
            }

            case "PAUSED": {
                return PAUSED;
            }

            case "SCHEDULED": {
                return SCHEDULED;
            }

            case "UNDEFINED": {
                return UNDEFINED;
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

            case DELETED_EXTERNALLY: {
                return "DELETED_EXTERNALLY";
            }

            case INACTIVE: {
                return "INACTIVE";
            }

            case PAUSED: {
                return "PAUSED";
            }

            case SCHEDULED: {
                return "SCHEDULED";
            }

            case UNDEFINED: {
                return "UNDEFINED";
            }

            default: {
                return "";
            }
        }
    }
}

