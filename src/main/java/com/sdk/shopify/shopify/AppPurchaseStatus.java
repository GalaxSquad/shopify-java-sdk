// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* The approval status of the app purchase.
* The merchant is charged for the purchase immediately after approval, and the status changes to
* `active`.
* If the payment fails, then the app purchase remains `pending`.
* Purchases start as `pending` and can change to: `active`, `declined`, `expired`. After a purchase
* changes, it
* remains in that final state.
*/
public enum AppPurchaseStatus {
    /**
    * The app purchase was approved by the merchant and has been activated by the app. Active app
    * purchases are charged to the merchant and are paid out to the partner.
    */
    ACTIVE,

    /**
    * The app purchase was declined by the merchant.
    */
    DECLINED,

    /**
    * The app purchase was not accepted within two days of being created.
    */
    EXPIRED,

    /**
    * The app purchase is pending approval by the merchant.
    */
    PENDING,

    UNKNOWN_VALUE;

    public static AppPurchaseStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ACTIVE": {
                return ACTIVE;
            }

            case "DECLINED": {
                return DECLINED;
            }

            case "EXPIRED": {
                return EXPIRED;
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

            case DECLINED: {
                return "DECLINED";
            }

            case EXPIRED: {
                return "EXPIRED";
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

