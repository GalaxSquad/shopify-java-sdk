// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `LocationDeleteUserError`.
*/
public enum LocationDeleteUserErrorCode {
    /**
    * An error occurred while deleting the location.
    */
    GENERIC_ERROR,

    /**
    * The location cannot be deleted while it has any active Retail subscriptions in the Point of Sale
    * channel.
    */
    LOCATION_HAS_ACTIVE_RETAIL_SUBSCRIPTION,

    /**
    * The location cannot be deleted while it has inventory.
    */
    LOCATION_HAS_INVENTORY,

    /**
    * The location cannot be deleted while it has pending orders.
    */
    LOCATION_HAS_PENDING_ORDERS,

    /**
    * The location cannot be deleted while it is active.
    */
    LOCATION_IS_ACTIVE,

    /**
    * Location not found.
    */
    LOCATION_NOT_FOUND,

    UNKNOWN_VALUE;

    public static LocationDeleteUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "GENERIC_ERROR": {
                return GENERIC_ERROR;
            }

            case "LOCATION_HAS_ACTIVE_RETAIL_SUBSCRIPTION": {
                return LOCATION_HAS_ACTIVE_RETAIL_SUBSCRIPTION;
            }

            case "LOCATION_HAS_INVENTORY": {
                return LOCATION_HAS_INVENTORY;
            }

            case "LOCATION_HAS_PENDING_ORDERS": {
                return LOCATION_HAS_PENDING_ORDERS;
            }

            case "LOCATION_IS_ACTIVE": {
                return LOCATION_IS_ACTIVE;
            }

            case "LOCATION_NOT_FOUND": {
                return LOCATION_NOT_FOUND;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case GENERIC_ERROR: {
                return "GENERIC_ERROR";
            }

            case LOCATION_HAS_ACTIVE_RETAIL_SUBSCRIPTION: {
                return "LOCATION_HAS_ACTIVE_RETAIL_SUBSCRIPTION";
            }

            case LOCATION_HAS_INVENTORY: {
                return "LOCATION_HAS_INVENTORY";
            }

            case LOCATION_HAS_PENDING_ORDERS: {
                return "LOCATION_HAS_PENDING_ORDERS";
            }

            case LOCATION_IS_ACTIVE: {
                return "LOCATION_IS_ACTIVE";
            }

            case LOCATION_NOT_FOUND: {
                return "LOCATION_NOT_FOUND";
            }

            default: {
                return "";
            }
        }
    }
}

