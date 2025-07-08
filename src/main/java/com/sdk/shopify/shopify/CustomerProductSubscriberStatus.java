// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The possible product subscription states for a customer, as defined by the customer's subscription
* contracts.
*/
public enum CustomerProductSubscriberStatus {
    /**
    * The customer has at least one active subscription contract.
    */
    ACTIVE,

    /**
    * The customer's last subscription contract was cancelled and there are no other active or paused
    * subscription contracts.
    */
    CANCELLED,

    /**
    * The customer's last subscription contract expired and there are no other active or paused
    * subscription contracts.
    */
    EXPIRED,

    /**
    * The customer's last subscription contract failed and there are no other active or paused
    * subscription contracts.
    */
    FAILED,

    /**
    * The customer has never had a subscription contract.
    */
    NEVER_SUBSCRIBED,

    /**
    * The customer has at least one paused subscription contract and there are no other active
    * subscription contracts.
    */
    PAUSED,

    UNKNOWN_VALUE;

    public static CustomerProductSubscriberStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ACTIVE": {
                return ACTIVE;
            }

            case "CANCELLED": {
                return CANCELLED;
            }

            case "EXPIRED": {
                return EXPIRED;
            }

            case "FAILED": {
                return FAILED;
            }

            case "NEVER_SUBSCRIBED": {
                return NEVER_SUBSCRIBED;
            }

            case "PAUSED": {
                return PAUSED;
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

            case CANCELLED: {
                return "CANCELLED";
            }

            case EXPIRED: {
                return "EXPIRED";
            }

            case FAILED: {
                return "FAILED";
            }

            case NEVER_SUBSCRIBED: {
                return "NEVER_SUBSCRIBED";
            }

            case PAUSED: {
                return "PAUSED";
            }

            default: {
                return "";
            }
        }
    }
}

