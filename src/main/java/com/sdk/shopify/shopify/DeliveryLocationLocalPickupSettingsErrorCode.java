// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `DeliveryLocationLocalPickupSettingsError`.
*/
public enum DeliveryLocationLocalPickupSettingsErrorCode {
    /**
    * Provided locationId is not for an active location belonging to this store.
    */
    ACTIVE_LOCATION_NOT_FOUND,

    /**
    * Custom pickup time is not allowed for local pickup settings.
    */
    CUSTOM_PICKUP_TIME_NOT_ALLOWED,

    /**
    * An error occurred while changing the local pickup settings.
    */
    GENERIC_ERROR,

    UNKNOWN_VALUE;

    public static DeliveryLocationLocalPickupSettingsErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ACTIVE_LOCATION_NOT_FOUND": {
                return ACTIVE_LOCATION_NOT_FOUND;
            }

            case "CUSTOM_PICKUP_TIME_NOT_ALLOWED": {
                return CUSTOM_PICKUP_TIME_NOT_ALLOWED;
            }

            case "GENERIC_ERROR": {
                return GENERIC_ERROR;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ACTIVE_LOCATION_NOT_FOUND: {
                return "ACTIVE_LOCATION_NOT_FOUND";
            }

            case CUSTOM_PICKUP_TIME_NOT_ALLOWED: {
                return "CUSTOM_PICKUP_TIME_NOT_ALLOWED";
            }

            case GENERIC_ERROR: {
                return "GENERIC_ERROR";
            }

            default: {
                return "";
            }
        }
    }
}

