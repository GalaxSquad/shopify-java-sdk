// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `InventoryTransferRemoveItemsUserError`.
*/
public enum InventoryTransferRemoveItemsUserErrorCode {
    /**
    * The item cannot have its shippable quantity removed if all of its quantity is fully allocated in one
    * or more shipments.
    */
    ALL_QUANTITY_SHIPPED,

    /**
    * A ready to ship transfer must have at least one item.
    */
    CANT_REMOVE_ALL_ITEMS_FROM_READY_TO_SHIP_TRANSFER,

    /**
    * Current transfer status does not support this operation.
    */
    INVALID_TRANSFER_STATUS,

    /**
    * The item was not found.
    */
    ITEM_NOT_FOUND,

    /**
    * The item cannot be removed because it exists in a draft shipment with zero quantity.
    */
    ITEM_PRESENT_ON_DRAFT_SHIPMENT_WITH_ZERO_QUANTITY,

    /**
    * The location selected can't be found.
    */
    LOCATION_NOT_FOUND,

    /**
    * The transfer was not found.
    */
    TRANSFER_NOT_FOUND,

    UNKNOWN_VALUE;

    public static InventoryTransferRemoveItemsUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ALL_QUANTITY_SHIPPED": {
                return ALL_QUANTITY_SHIPPED;
            }

            case "CANT_REMOVE_ALL_ITEMS_FROM_READY_TO_SHIP_TRANSFER": {
                return CANT_REMOVE_ALL_ITEMS_FROM_READY_TO_SHIP_TRANSFER;
            }

            case "INVALID_TRANSFER_STATUS": {
                return INVALID_TRANSFER_STATUS;
            }

            case "ITEM_NOT_FOUND": {
                return ITEM_NOT_FOUND;
            }

            case "ITEM_PRESENT_ON_DRAFT_SHIPMENT_WITH_ZERO_QUANTITY": {
                return ITEM_PRESENT_ON_DRAFT_SHIPMENT_WITH_ZERO_QUANTITY;
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
            case ALL_QUANTITY_SHIPPED: {
                return "ALL_QUANTITY_SHIPPED";
            }

            case CANT_REMOVE_ALL_ITEMS_FROM_READY_TO_SHIP_TRANSFER: {
                return "CANT_REMOVE_ALL_ITEMS_FROM_READY_TO_SHIP_TRANSFER";
            }

            case INVALID_TRANSFER_STATUS: {
                return "INVALID_TRANSFER_STATUS";
            }

            case ITEM_NOT_FOUND: {
                return "ITEM_NOT_FOUND";
            }

            case ITEM_PRESENT_ON_DRAFT_SHIPMENT_WITH_ZERO_QUANTITY: {
                return "ITEM_PRESENT_ON_DRAFT_SHIPMENT_WITH_ZERO_QUANTITY";
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

