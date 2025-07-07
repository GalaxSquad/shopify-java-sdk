// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The status of the customer merge request.
*/
public enum CustomerMergeRequestStatus {
    /**
    * The customer merge request has been completed.
    */
    COMPLETED,

    /**
    * The customer merge request has failed.
    */
    FAILED,

    /**
    * The customer merge request is currently in progress.
    */
    IN_PROGRESS,

    /**
    * The customer merge request has been requested.
    */
    REQUESTED,

    UNKNOWN_VALUE;

    public static CustomerMergeRequestStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "COMPLETED": {
                return COMPLETED;
            }

            case "FAILED": {
                return FAILED;
            }

            case "IN_PROGRESS": {
                return IN_PROGRESS;
            }

            case "REQUESTED": {
                return REQUESTED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case COMPLETED: {
                return "COMPLETED";
            }

            case FAILED: {
                return "FAILED";
            }

            case IN_PROGRESS: {
                return "IN_PROGRESS";
            }

            case REQUESTED: {
                return "REQUESTED";
            }

            default: {
                return "";
            }
        }
    }
}

