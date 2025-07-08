// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `InventoryShipmentMarkInTransitUserError`.
*/
public enum InventoryShipmentMarkInTransitUserErrorCode {
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
    * The list of line items is empty.
    */
    ITEMS_EMPTY,

    /**
    * The item was not found.
    */
    ITEM_NOT_FOUND,

    /**
    * The location selected is not active.
    */
    LOCATION_NOT_ACTIVE,

    /**
    * The shipment was not found.
    */
    SHIPMENT_NOT_FOUND,

    /**
    * The item does not track inventory.
    */
    UNTRACKED_ITEM,

    UNKNOWN_VALUE;

    public static InventoryShipmentMarkInTransitUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "INVALID_QUANTITY": {
                return INVALID_QUANTITY;
            }

            case "INVALID_SHIPMENT_STATUS": {
                return INVALID_SHIPMENT_STATUS;
            }

            case "INVENTORY_STATE_NOT_ACTIVE": {
                return INVENTORY_STATE_NOT_ACTIVE;
            }

            case "ITEMS_EMPTY": {
                return ITEMS_EMPTY;
            }

            case "ITEM_NOT_FOUND": {
                return ITEM_NOT_FOUND;
            }

            case "LOCATION_NOT_ACTIVE": {
                return LOCATION_NOT_ACTIVE;
            }

            case "SHIPMENT_NOT_FOUND": {
                return SHIPMENT_NOT_FOUND;
            }

            case "UNTRACKED_ITEM": {
                return UNTRACKED_ITEM;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case INVALID_QUANTITY: {
                return "INVALID_QUANTITY";
            }

            case INVALID_SHIPMENT_STATUS: {
                return "INVALID_SHIPMENT_STATUS";
            }

            case INVENTORY_STATE_NOT_ACTIVE: {
                return "INVENTORY_STATE_NOT_ACTIVE";
            }

            case ITEMS_EMPTY: {
                return "ITEMS_EMPTY";
            }

            case ITEM_NOT_FOUND: {
                return "ITEM_NOT_FOUND";
            }

            case LOCATION_NOT_ACTIVE: {
                return "LOCATION_NOT_ACTIVE";
            }

            case SHIPMENT_NOT_FOUND: {
                return "SHIPMENT_NOT_FOUND";
            }

            case UNTRACKED_ITEM: {
                return "UNTRACKED_ITEM";
            }

            default: {
                return "";
            }
        }
    }
}

