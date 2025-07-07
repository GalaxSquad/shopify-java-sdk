// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The possible statuses of a dispute.
*/
public enum DisputeStatus {
    ACCEPTED,

    LOST,

    NEEDS_RESPONSE,

    UNDER_REVIEW,

    WON,

    UNKNOWN_VALUE;

    public static DisputeStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ACCEPTED": {
                return ACCEPTED;
            }

            case "LOST": {
                return LOST;
            }

            case "NEEDS_RESPONSE": {
                return NEEDS_RESPONSE;
            }

            case "UNDER_REVIEW": {
                return UNDER_REVIEW;
            }

            case "WON": {
                return WON;
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

            case LOST: {
                return "LOST";
            }

            case NEEDS_RESPONSE: {
                return "NEEDS_RESPONSE";
            }

            case UNDER_REVIEW: {
                return "UNDER_REVIEW";
            }

            case WON: {
                return "WON";
            }

            default: {
                return "";
            }
        }
    }
}

