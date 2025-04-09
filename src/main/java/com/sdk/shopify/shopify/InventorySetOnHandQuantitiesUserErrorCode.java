// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* Possible error codes that can be returned by `InventorySetOnHandQuantitiesUserError`.
*/
public enum InventorySetOnHandQuantitiesUserErrorCode {
    /**
    * The specified inventory item could not be found.
    */
    INVALID_INVENTORY_ITEM,

    /**
    * The specified location could not be found.
    */
    INVALID_LOCATION,

    /**
    * The quantity can't be negative.
    */
    INVALID_QUANTITY_NEGATIVE,

    /**
    * The total quantity can't be higher than 1,000,000,000.
    */
    INVALID_QUANTITY_TOO_HIGH,

    /**
    * The specified reason is invalid.
    */
    INVALID_REASON,

    /**
    * The specified reference document is invalid.
    */
    INVALID_REFERENCE_DOCUMENT,

    /**
    * The inventory item is not stocked at the location.
    */
    ITEM_NOT_STOCKED_AT_LOCATION,

    /**
    * The specified inventory item is not allowed to be adjusted via API. Example: if the inventory item
    * is a parent bundle.
    */
    NON_MUTABLE_INVENTORY_ITEM,

    /**
    * The on-hand quantities couldn't be set. Try again.
    */
    SET_ON_HAND_QUANTITIES_FAILED,

    UNKNOWN_VALUE;

    public static InventorySetOnHandQuantitiesUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "INVALID_INVENTORY_ITEM": {
                return INVALID_INVENTORY_ITEM;
            }

            case "INVALID_LOCATION": {
                return INVALID_LOCATION;
            }

            case "INVALID_QUANTITY_NEGATIVE": {
                return INVALID_QUANTITY_NEGATIVE;
            }

            case "INVALID_QUANTITY_TOO_HIGH": {
                return INVALID_QUANTITY_TOO_HIGH;
            }

            case "INVALID_REASON": {
                return INVALID_REASON;
            }

            case "INVALID_REFERENCE_DOCUMENT": {
                return INVALID_REFERENCE_DOCUMENT;
            }

            case "ITEM_NOT_STOCKED_AT_LOCATION": {
                return ITEM_NOT_STOCKED_AT_LOCATION;
            }

            case "NON_MUTABLE_INVENTORY_ITEM": {
                return NON_MUTABLE_INVENTORY_ITEM;
            }

            case "SET_ON_HAND_QUANTITIES_FAILED": {
                return SET_ON_HAND_QUANTITIES_FAILED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case INVALID_INVENTORY_ITEM: {
                return "INVALID_INVENTORY_ITEM";
            }

            case INVALID_LOCATION: {
                return "INVALID_LOCATION";
            }

            case INVALID_QUANTITY_NEGATIVE: {
                return "INVALID_QUANTITY_NEGATIVE";
            }

            case INVALID_QUANTITY_TOO_HIGH: {
                return "INVALID_QUANTITY_TOO_HIGH";
            }

            case INVALID_REASON: {
                return "INVALID_REASON";
            }

            case INVALID_REFERENCE_DOCUMENT: {
                return "INVALID_REFERENCE_DOCUMENT";
            }

            case ITEM_NOT_STOCKED_AT_LOCATION: {
                return "ITEM_NOT_STOCKED_AT_LOCATION";
            }

            case NON_MUTABLE_INVENTORY_ITEM: {
                return "NON_MUTABLE_INVENTORY_ITEM";
            }

            case SET_ON_HAND_QUANTITIES_FAILED: {
                return "SET_ON_HAND_QUANTITIES_FAILED";
            }

            default: {
                return "";
            }
        }
    }
}

