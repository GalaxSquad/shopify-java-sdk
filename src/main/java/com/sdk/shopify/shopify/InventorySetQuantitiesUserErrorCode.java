// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `InventorySetQuantitiesUserError`.
*/
public enum InventorySetQuantitiesUserErrorCode {
    /**
    * The compareQuantity argument must be given to each quantity or ignored using ignoreCompareQuantity.
    */
    COMPARE_QUANTITY_REQUIRED,

    /**
    * The compareQuantity value does not match persisted value.
    */
    COMPARE_QUANTITY_STALE,

    /**
    * The specified inventory item could not be found.
    */
    INVALID_INVENTORY_ITEM,

    /**
    * The specified location could not be found.
    */
    INVALID_LOCATION,

    /**
    * The quantity name must be either 'available' or 'on_hand'.
    */
    INVALID_NAME,

    /**
    * The quantity can't be negative.
    */
    INVALID_QUANTITY_NEGATIVE,

    /**
    * The total quantity can't be higher than 1,000,000,000.
    */
    INVALID_QUANTITY_TOO_HIGH,

    /**
    * The total quantity can't be lower than -1,000,000,000.
    */
    INVALID_QUANTITY_TOO_LOW,

    /**
    * The specified reason is invalid.
    */
    INVALID_REASON,

    /**
    * The specified reference document is invalid.
    */
    INVALID_REFERENCE_DOCUMENT,

    /**
    * The specified inventory item is not stocked at the location.
    */
    ITEM_NOT_STOCKED_AT_LOCATION,

    /**
    * The specified inventory item is not allowed to be adjusted via API. Example: if the inventory item
    * is a parent bundle.
    */
    NON_MUTABLE_INVENTORY_ITEM,

    /**
    * The combination of inventoryItemId and locationId must be unique.
    */
    NO_DUPLICATE_INVENTORY_ITEM_ID_GROUP_ID_PAIR,

    UNKNOWN_VALUE;

    public static InventorySetQuantitiesUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "COMPARE_QUANTITY_REQUIRED": {
                return COMPARE_QUANTITY_REQUIRED;
            }

            case "COMPARE_QUANTITY_STALE": {
                return COMPARE_QUANTITY_STALE;
            }

            case "INVALID_INVENTORY_ITEM": {
                return INVALID_INVENTORY_ITEM;
            }

            case "INVALID_LOCATION": {
                return INVALID_LOCATION;
            }

            case "INVALID_NAME": {
                return INVALID_NAME;
            }

            case "INVALID_QUANTITY_NEGATIVE": {
                return INVALID_QUANTITY_NEGATIVE;
            }

            case "INVALID_QUANTITY_TOO_HIGH": {
                return INVALID_QUANTITY_TOO_HIGH;
            }

            case "INVALID_QUANTITY_TOO_LOW": {
                return INVALID_QUANTITY_TOO_LOW;
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

            case "NO_DUPLICATE_INVENTORY_ITEM_ID_GROUP_ID_PAIR": {
                return NO_DUPLICATE_INVENTORY_ITEM_ID_GROUP_ID_PAIR;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case COMPARE_QUANTITY_REQUIRED: {
                return "COMPARE_QUANTITY_REQUIRED";
            }

            case COMPARE_QUANTITY_STALE: {
                return "COMPARE_QUANTITY_STALE";
            }

            case INVALID_INVENTORY_ITEM: {
                return "INVALID_INVENTORY_ITEM";
            }

            case INVALID_LOCATION: {
                return "INVALID_LOCATION";
            }

            case INVALID_NAME: {
                return "INVALID_NAME";
            }

            case INVALID_QUANTITY_NEGATIVE: {
                return "INVALID_QUANTITY_NEGATIVE";
            }

            case INVALID_QUANTITY_TOO_HIGH: {
                return "INVALID_QUANTITY_TOO_HIGH";
            }

            case INVALID_QUANTITY_TOO_LOW: {
                return "INVALID_QUANTITY_TOO_LOW";
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

            case NO_DUPLICATE_INVENTORY_ITEM_ID_GROUP_ID_PAIR: {
                return "NO_DUPLICATE_INVENTORY_ITEM_ID_GROUP_ID_PAIR";
            }

            default: {
                return "";
            }
        }
    }
}

