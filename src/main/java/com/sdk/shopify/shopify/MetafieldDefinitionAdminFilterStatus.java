// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* Possible filter statuses associated with a metafield definition for use in admin filtering.
*/
public enum MetafieldDefinitionAdminFilterStatus {
    /**
    * The metafield definition has failed to be enabled for admin filtering.
    */
    FAILED,

    /**
    * The metafield definition allows admin filtering by matching metafield values.
    */
    FILTERABLE,

    /**
    * The metafield definition's metafields are currently being processed for admin filtering.
    */
    IN_PROGRESS,

    /**
    * The metafield definition cannot be used for admin filtering.
    */
    NOT_FILTERABLE,

    UNKNOWN_VALUE;

    public static MetafieldDefinitionAdminFilterStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "FAILED": {
                return FAILED;
            }

            case "FILTERABLE": {
                return FILTERABLE;
            }

            case "IN_PROGRESS": {
                return IN_PROGRESS;
            }

            case "NOT_FILTERABLE": {
                return NOT_FILTERABLE;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case FAILED: {
                return "FAILED";
            }

            case FILTERABLE: {
                return "FILTERABLE";
            }

            case IN_PROGRESS: {
                return "IN_PROGRESS";
            }

            case NOT_FILTERABLE: {
                return "NOT_FILTERABLE";
            }

            default: {
                return "";
            }
        }
    }
}

