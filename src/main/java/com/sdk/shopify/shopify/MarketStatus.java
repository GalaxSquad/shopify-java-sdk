// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The possible market statuses.
*/
public enum MarketStatus {
    /**
    * The market is active.
    */
    ACTIVE,

    /**
    * The market is in draft.
    */
    DRAFT,

    UNKNOWN_VALUE;

    public static MarketStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ACTIVE": {
                return ACTIVE;
            }

            case "DRAFT": {
                return DRAFT;
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

            case DRAFT: {
                return "DRAFT";
            }

            default: {
                return "";
            }
        }
    }
}

