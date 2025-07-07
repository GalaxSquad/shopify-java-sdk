// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `InventoryTransferEditUserError`.
*/
public enum InventoryTransferEditUserErrorCode {
    /**
    * Unexpected internal error happened.
    */
    INTERNAL_ERROR,

    /**
    * The item is not stocked at the intended location.
    */
    INVENTORY_STATE_NOT_ACTIVE,

    /**
    * The location selected is not active.
    */
    LOCATION_NOT_ACTIVE,

    /**
    * The location selected can't be found.
    */
    LOCATION_NOT_FOUND,

    /**
    * The location of a transfer cannot be updated. Only Draft Transfers can mutate their locations.
    */
    TRANSFER_LOCATION_IMMUTABLE,

    /**
    * The transfer was not found.
    */
    TRANSFER_NOT_FOUND,

    /**
    * The origin location cannot be the same as the destination location.
    */
    TRANSFER_ORIGIN_CANNOT_BE_THE_SAME_AS_DESTINATION,

    UNKNOWN_VALUE;

    public static InventoryTransferEditUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "INTERNAL_ERROR": {
                return INTERNAL_ERROR;
            }

            case "INVENTORY_STATE_NOT_ACTIVE": {
                return INVENTORY_STATE_NOT_ACTIVE;
            }

            case "LOCATION_NOT_ACTIVE": {
                return LOCATION_NOT_ACTIVE;
            }

            case "LOCATION_NOT_FOUND": {
                return LOCATION_NOT_FOUND;
            }

            case "TRANSFER_LOCATION_IMMUTABLE": {
                return TRANSFER_LOCATION_IMMUTABLE;
            }

            case "TRANSFER_NOT_FOUND": {
                return TRANSFER_NOT_FOUND;
            }

            case "TRANSFER_ORIGIN_CANNOT_BE_THE_SAME_AS_DESTINATION": {
                return TRANSFER_ORIGIN_CANNOT_BE_THE_SAME_AS_DESTINATION;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case INTERNAL_ERROR: {
                return "INTERNAL_ERROR";
            }

            case INVENTORY_STATE_NOT_ACTIVE: {
                return "INVENTORY_STATE_NOT_ACTIVE";
            }

            case LOCATION_NOT_ACTIVE: {
                return "LOCATION_NOT_ACTIVE";
            }

            case LOCATION_NOT_FOUND: {
                return "LOCATION_NOT_FOUND";
            }

            case TRANSFER_LOCATION_IMMUTABLE: {
                return "TRANSFER_LOCATION_IMMUTABLE";
            }

            case TRANSFER_NOT_FOUND: {
                return "TRANSFER_NOT_FOUND";
            }

            case TRANSFER_ORIGIN_CANNOT_BE_THE_SAME_AS_DESTINATION: {
                return "TRANSFER_ORIGIN_CANNOT_BE_THE_SAME_AS_DESTINATION";
            }

            default: {
                return "";
            }
        }
    }
}

