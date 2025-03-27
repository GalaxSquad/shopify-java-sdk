// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* The valid values for the status of product feed.
*/
public enum ProductFeedStatus {
    /**
    * The product feed is active.
    */
    ACTIVE,

    /**
    * The product feed is inactive.
    */
    INACTIVE,

    UNKNOWN_VALUE;

    public static ProductFeedStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ACTIVE": {
                return ACTIVE;
            }

            case "INACTIVE": {
                return INACTIVE;
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

            case INACTIVE: {
                return "INACTIVE";
            }

            default: {
                return "";
            }
        }
    }
}

