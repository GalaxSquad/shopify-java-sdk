// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* The status of the app subscription.
*/
public enum AppSubscriptionStatus {
    /**
    * The app subscription has been approved by the merchant. Active app subscriptions are billed to the
    * shop. After payment, partners receive payouts.
    */
    ACTIVE,

    /**
    * The app subscription was cancelled by the app. This could be caused by the app being uninstalled, a
    * new app subscription being activated, or a direct cancellation by the app. This is a terminal state.
    */
    CANCELLED,

    /**
    * The app subscription was declined by the merchant. This is a terminal state.
    */
    DECLINED,

    /**
    * The app subscription wasn't approved by the merchant within two days of being created. This is a
    * terminal state.
    */
    EXPIRED,

    /**
    * The app subscription is on hold due to non-payment. The subscription re-activates after payments
    * resume.
    */
    FROZEN,

    /**
    * The app subscription is pending approval by the merchant.
    */
    PENDING,

    UNKNOWN_VALUE;

    public static AppSubscriptionStatus fromGraphQl(String value) {
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

            case "DECLINED": {
                return DECLINED;
            }

            case "EXPIRED": {
                return EXPIRED;
            }

            case "FROZEN": {
                return FROZEN;
            }

            case "PENDING": {
                return PENDING;
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

            case DECLINED: {
                return "DECLINED";
            }

            case EXPIRED: {
                return "EXPIRED";
            }

            case FROZEN: {
                return "FROZEN";
            }

            case PENDING: {
                return "PENDING";
            }

            default: {
                return "";
            }
        }
    }
}

