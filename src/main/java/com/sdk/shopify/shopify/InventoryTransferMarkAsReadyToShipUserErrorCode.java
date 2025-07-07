// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `InventoryTransferMarkAsReadyToShipUserError`.
*/
public enum InventoryTransferMarkAsReadyToShipUserErrorCode {
    /**
    * One or more items are not valid.
    */
    INVALID_ITEM,

    /**
    * Current transfer status does not support this operation.
    */
    INVALID_TRANSFER_STATUS,

    /**
    * The list of line items is empty.
    */
    ITEMS_EMPTY,

    /**
    * The location selected is not active.
    */
    LOCATION_NOT_ACTIVE,

    /**
    * The location selected can't be found.
    */
    LOCATION_NOT_FOUND,

    /**
    * The transfer was not found.
    */
    TRANSFER_NOT_FOUND,

    UNKNOWN_VALUE;

    public static InventoryTransferMarkAsReadyToShipUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "INVALID_ITEM": {
                return INVALID_ITEM;
            }

            case "INVALID_TRANSFER_STATUS": {
                return INVALID_TRANSFER_STATUS;
            }

            case "ITEMS_EMPTY": {
                return ITEMS_EMPTY;
            }

            case "LOCATION_NOT_ACTIVE": {
                return LOCATION_NOT_ACTIVE;
            }

            case "LOCATION_NOT_FOUND": {
                return LOCATION_NOT_FOUND;
            }

            case "TRANSFER_NOT_FOUND": {
                return TRANSFER_NOT_FOUND;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case INVALID_ITEM: {
                return "INVALID_ITEM";
            }

            case INVALID_TRANSFER_STATUS: {
                return "INVALID_TRANSFER_STATUS";
            }

            case ITEMS_EMPTY: {
                return "ITEMS_EMPTY";
            }

            case LOCATION_NOT_ACTIVE: {
                return "LOCATION_NOT_ACTIVE";
            }

            case LOCATION_NOT_FOUND: {
                return "LOCATION_NOT_FOUND";
            }

            case TRANSFER_NOT_FOUND: {
                return "TRANSFER_NOT_FOUND";
            }

            default: {
                return "";
            }
        }
    }
}

