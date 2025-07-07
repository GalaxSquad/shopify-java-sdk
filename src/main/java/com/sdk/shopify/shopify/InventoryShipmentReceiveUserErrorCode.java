// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `InventoryShipmentReceiveUserError`.
*/
public enum InventoryShipmentReceiveUserErrorCode {
    /**
    * Unexpected internal error happened.
    */
    INTERNAL_ERROR,

    /**
    * The quantity is invalid.
    */
    INVALID_QUANTITY,

    /**
    * Current shipment status does not support this operation.
    */
    INVALID_SHIPMENT_STATUS,

    /**
    * The item is not stocked at the intended location.
    */
    INVENTORY_STATE_NOT_ACTIVE,

    /**
    * The item was not found.
    */
    ITEM_NOT_FOUND,

    /**
    * The location selected can't be found.
    */
    LOCATION_NOT_FOUND,

    /**
    * The shipment was not found.
    */
    SHIPMENT_NOT_FOUND,

    UNKNOWN_VALUE;

    public static InventoryShipmentReceiveUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "INTERNAL_ERROR": {
                return INTERNAL_ERROR;
            }

            case "INVALID_QUANTITY": {
                return INVALID_QUANTITY;
            }

            case "INVALID_SHIPMENT_STATUS": {
                return INVALID_SHIPMENT_STATUS;
            }

            case "INVENTORY_STATE_NOT_ACTIVE": {
                return INVENTORY_STATE_NOT_ACTIVE;
            }

            case "ITEM_NOT_FOUND": {
                return ITEM_NOT_FOUND;
            }

            case "LOCATION_NOT_FOUND": {
                return LOCATION_NOT_FOUND;
            }

            case "SHIPMENT_NOT_FOUND": {
                return SHIPMENT_NOT_FOUND;
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

            case INVALID_QUANTITY: {
                return "INVALID_QUANTITY";
            }

            case INVALID_SHIPMENT_STATUS: {
                return "INVALID_SHIPMENT_STATUS";
            }

            case INVENTORY_STATE_NOT_ACTIVE: {
                return "INVENTORY_STATE_NOT_ACTIVE";
            }

            case ITEM_NOT_FOUND: {
                return "ITEM_NOT_FOUND";
            }

            case LOCATION_NOT_FOUND: {
                return "LOCATION_NOT_FOUND";
            }

            case SHIPMENT_NOT_FOUND: {
                return "SHIPMENT_NOT_FOUND";
            }

            default: {
                return "";
            }
        }
    }
}

