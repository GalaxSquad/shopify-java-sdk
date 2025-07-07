// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `InventoryTransferCreateUserError`.
*/
public enum InventoryTransferCreateUserErrorCode {
    /**
    * Bundled items cannot be used for this operation.
    */
    BUNDLED_ITEM,

    /**
    * A single item can't be listed twice.
    */
    DUPLICATE_ITEM,

    /**
    * The quantity is invalid.
    */
    INVALID_QUANTITY,

    /**
    * The item is not stocked at the intended location.
    */
    INVENTORY_STATE_NOT_ACTIVE,

    /**
    * The item was not found.
    */
    ITEM_NOT_FOUND,

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

    /**
    * The origin location cannot be the same as the destination location.
    */
    TRANSFER_ORIGIN_CANNOT_BE_THE_SAME_AS_DESTINATION,

    /**
    * The item does not track inventory.
    */
    UNTRACKED_ITEM,

    UNKNOWN_VALUE;

    public static InventoryTransferCreateUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "BUNDLED_ITEM": {
                return BUNDLED_ITEM;
            }

            case "DUPLICATE_ITEM": {
                return DUPLICATE_ITEM;
            }

            case "INVALID_QUANTITY": {
                return INVALID_QUANTITY;
            }

            case "INVENTORY_STATE_NOT_ACTIVE": {
                return INVENTORY_STATE_NOT_ACTIVE;
            }

            case "ITEM_NOT_FOUND": {
                return ITEM_NOT_FOUND;
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

            case "TRANSFER_ORIGIN_CANNOT_BE_THE_SAME_AS_DESTINATION": {
                return TRANSFER_ORIGIN_CANNOT_BE_THE_SAME_AS_DESTINATION;
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
            case BUNDLED_ITEM: {
                return "BUNDLED_ITEM";
            }

            case DUPLICATE_ITEM: {
                return "DUPLICATE_ITEM";
            }

            case INVALID_QUANTITY: {
                return "INVALID_QUANTITY";
            }

            case INVENTORY_STATE_NOT_ACTIVE: {
                return "INVENTORY_STATE_NOT_ACTIVE";
            }

            case ITEM_NOT_FOUND: {
                return "ITEM_NOT_FOUND";
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

            case TRANSFER_ORIGIN_CANNOT_BE_THE_SAME_AS_DESTINATION: {
                return "TRANSFER_ORIGIN_CANNOT_BE_THE_SAME_AS_DESTINATION";
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

