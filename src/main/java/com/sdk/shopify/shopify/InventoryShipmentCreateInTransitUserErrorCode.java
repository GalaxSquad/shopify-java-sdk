// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `InventoryShipmentCreateInTransitUserError`.
*/
public enum InventoryShipmentCreateInTransitUserErrorCode {
    /**
    * A single item can't be listed twice.
    */
    DUPLICATE_ITEM,

    /**
    * The shipment input cannot be empty.
    */
    EMPTY_SHIPMENT_INPUT,

    /**
    * One or more items are not valid.
    */
    INVALID_ITEM,

    /**
    * The quantity is invalid.
    */
    INVALID_QUANTITY,

    /**
    * The shipment input is invalid.
    */
    INVALID_SHIPMENT_INPUT,

    /**
    * Current transfer status does not support this operation.
    */
    INVALID_TRANSFER_STATUS,

    /**
    * The URL is invalid.
    */
    INVALID_URL,

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
    * The transfer was not found.
    */
    TRANSFER_NOT_FOUND,

    /**
    * The item does not track inventory.
    */
    UNTRACKED_ITEM,

    UNKNOWN_VALUE;

    public static InventoryShipmentCreateInTransitUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "DUPLICATE_ITEM": {
                return DUPLICATE_ITEM;
            }

            case "EMPTY_SHIPMENT_INPUT": {
                return EMPTY_SHIPMENT_INPUT;
            }

            case "INVALID_ITEM": {
                return INVALID_ITEM;
            }

            case "INVALID_QUANTITY": {
                return INVALID_QUANTITY;
            }

            case "INVALID_SHIPMENT_INPUT": {
                return INVALID_SHIPMENT_INPUT;
            }

            case "INVALID_TRANSFER_STATUS": {
                return INVALID_TRANSFER_STATUS;
            }

            case "INVALID_URL": {
                return INVALID_URL;
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

            case "TRANSFER_NOT_FOUND": {
                return TRANSFER_NOT_FOUND;
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
            case DUPLICATE_ITEM: {
                return "DUPLICATE_ITEM";
            }

            case EMPTY_SHIPMENT_INPUT: {
                return "EMPTY_SHIPMENT_INPUT";
            }

            case INVALID_ITEM: {
                return "INVALID_ITEM";
            }

            case INVALID_QUANTITY: {
                return "INVALID_QUANTITY";
            }

            case INVALID_SHIPMENT_INPUT: {
                return "INVALID_SHIPMENT_INPUT";
            }

            case INVALID_TRANSFER_STATUS: {
                return "INVALID_TRANSFER_STATUS";
            }

            case INVALID_URL: {
                return "INVALID_URL";
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

            case TRANSFER_NOT_FOUND: {
                return "TRANSFER_NOT_FOUND";
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

