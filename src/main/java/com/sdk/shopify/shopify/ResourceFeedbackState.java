// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The state of the resource feedback.
*/
public enum ResourceFeedbackState {
    /**
    * No action required from merchant.
    */
    ACCEPTED,

    /**
    * The merchant needs to resolve an issue with the resource.
    */
    REQUIRES_ACTION,

    UNKNOWN_VALUE;

    public static ResourceFeedbackState fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ACCEPTED": {
                return ACCEPTED;
            }

            case "REQUIRES_ACTION": {
                return REQUIRES_ACTION;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ACCEPTED: {
                return "ACCEPTED";
            }

            case REQUIRES_ACTION: {
                return "REQUIRES_ACTION";
            }

            default: {
                return "";
            }
        }
    }
}

