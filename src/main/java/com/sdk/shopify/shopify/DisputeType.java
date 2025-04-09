// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* The possible types for a dispute.
*/
public enum DisputeType {
    /**
    * The dispute has turned into a chargeback.
    */
    CHARGEBACK,

    /**
    * The dispute is in the inquiry phase.
    */
    INQUIRY,

    UNKNOWN_VALUE;

    public static DisputeType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CHARGEBACK": {
                return CHARGEBACK;
            }

            case "INQUIRY": {
                return INQUIRY;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CHARGEBACK: {
                return "CHARGEBACK";
            }

            case INQUIRY: {
                return "INQUIRY";
            }

            default: {
                return "";
            }
        }
    }
}

