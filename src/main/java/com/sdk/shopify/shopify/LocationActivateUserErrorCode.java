// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `LocationActivateUserError`.
*/
public enum LocationActivateUserErrorCode {
    /**
    * An error occurred while activating the location.
    */
    GENERIC_ERROR,

    /**
    * There is already an active location with this name.
    */
    HAS_NON_UNIQUE_NAME,

    /**
    * This location currently cannot be activated as inventory, pending orders or transfers are being
    * relocated from this location.
    */
    HAS_ONGOING_RELOCATION,

    /**
    * Shop has reached its location limit.
    */
    LOCATION_LIMIT,

    /**
    * Location not found.
    */
    LOCATION_NOT_FOUND,

    UNKNOWN_VALUE;

    public static LocationActivateUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "GENERIC_ERROR": {
                return GENERIC_ERROR;
            }

            case "HAS_NON_UNIQUE_NAME": {
                return HAS_NON_UNIQUE_NAME;
            }

            case "HAS_ONGOING_RELOCATION": {
                return HAS_ONGOING_RELOCATION;
            }

            case "LOCATION_LIMIT": {
                return LOCATION_LIMIT;
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

            case HAS_NON_UNIQUE_NAME: {
                return "HAS_NON_UNIQUE_NAME";
            }

            case HAS_ONGOING_RELOCATION: {
                return "HAS_ONGOING_RELOCATION";
            }

            case LOCATION_LIMIT: {
                return "LOCATION_LIMIT";
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

