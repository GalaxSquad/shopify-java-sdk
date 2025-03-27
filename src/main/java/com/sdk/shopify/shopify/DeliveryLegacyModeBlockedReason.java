// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* Reasons the shop is blocked from converting to full multi-location delivery profiles mode.
*/
public enum DeliveryLegacyModeBlockedReason {
    /**
    * There are no locations for this store that can fulfill online orders.
    */
    NO_LOCATIONS_FULFILLING_ONLINE_ORDERS,

    UNKNOWN_VALUE;

    public static DeliveryLegacyModeBlockedReason fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "NO_LOCATIONS_FULFILLING_ONLINE_ORDERS": {
                return NO_LOCATIONS_FULFILLING_ONLINE_ORDERS;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case NO_LOCATIONS_FULFILLING_ONLINE_ORDERS: {
                return "NO_LOCATIONS_FULFILLING_ONLINE_ORDERS";
            }

            default: {
                return "";
            }
        }
    }
}

