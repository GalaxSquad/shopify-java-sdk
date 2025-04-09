// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* Possible error codes that can be returned by `InventoryMoveQuantitiesUserError`.
*/
public enum InventoryMoveQuantitiesUserErrorCode {
    /**
    * The quantities can't be moved between different locations.
    */
    DIFFERENT_LOCATIONS,

    /**
    * Internal (gid://shopify/) ledger documents are not allowed to be adjusted via API.
    */
    INTERNAL_LEDGER_DOCUMENT,

    /**
    * A ledger document URI is not allowed when adjusting available.
    */
    INVALID_AVAILABLE_DOCUMENT,

    /**
    * The specified inventory item could not be found.
    */
    INVALID_INVENTORY_ITEM,

    /**
    * The specified ledger document is invalid.
    */
    INVALID_LEDGER_DOCUMENT,

    /**
    * The specified location could not be found.
    */
    INVALID_LOCATION,

    /**
    * A ledger document URI is required except when adjusting available.
    */
    INVALID_QUANTITY_DOCUMENT,

    /**
    * The specified quantity name is invalid.
    */
    INVALID_QUANTITY_NAME,

    /**
    * The quantity can't be negative.
    */
    INVALID_QUANTITY_NEGATIVE,

    /**
    * The quantity can't be higher than 2,000,000,000.
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
    * Only a maximum of 2 ledger document URIs across all changes is allowed.
    */
    MAXIMUM_LEDGER_DOCUMENT_URIS,

    /**
    * The quantities couldn't be moved. Try again.
    */
    MOVE_QUANTITIES_FAILED,

    /**
    * The specified inventory item is not allowed to be adjusted via API. Example: if the inventory item
    * is a parent bundle.
    */
    NON_MUTABLE_INVENTORY_ITEM,

    /**
    * The quantity names for each change can't be the same.
    */
    SAME_QUANTITY_NAME,

    UNKNOWN_VALUE;

    public static InventoryMoveQuantitiesUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "DIFFERENT_LOCATIONS": {
                return DIFFERENT_LOCATIONS;
            }

            case "INTERNAL_LEDGER_DOCUMENT": {
                return INTERNAL_LEDGER_DOCUMENT;
            }

            case "INVALID_AVAILABLE_DOCUMENT": {
                return INVALID_AVAILABLE_DOCUMENT;
            }

            case "INVALID_INVENTORY_ITEM": {
                return INVALID_INVENTORY_ITEM;
            }

            case "INVALID_LEDGER_DOCUMENT": {
                return INVALID_LEDGER_DOCUMENT;
            }

            case "INVALID_LOCATION": {
                return INVALID_LOCATION;
            }

            case "INVALID_QUANTITY_DOCUMENT": {
                return INVALID_QUANTITY_DOCUMENT;
            }

            case "INVALID_QUANTITY_NAME": {
                return INVALID_QUANTITY_NAME;
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

            case "MAXIMUM_LEDGER_DOCUMENT_URIS": {
                return MAXIMUM_LEDGER_DOCUMENT_URIS;
            }

            case "MOVE_QUANTITIES_FAILED": {
                return MOVE_QUANTITIES_FAILED;
            }

            case "NON_MUTABLE_INVENTORY_ITEM": {
                return NON_MUTABLE_INVENTORY_ITEM;
            }

            case "SAME_QUANTITY_NAME": {
                return SAME_QUANTITY_NAME;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case DIFFERENT_LOCATIONS: {
                return "DIFFERENT_LOCATIONS";
            }

            case INTERNAL_LEDGER_DOCUMENT: {
                return "INTERNAL_LEDGER_DOCUMENT";
            }

            case INVALID_AVAILABLE_DOCUMENT: {
                return "INVALID_AVAILABLE_DOCUMENT";
            }

            case INVALID_INVENTORY_ITEM: {
                return "INVALID_INVENTORY_ITEM";
            }

            case INVALID_LEDGER_DOCUMENT: {
                return "INVALID_LEDGER_DOCUMENT";
            }

            case INVALID_LOCATION: {
                return "INVALID_LOCATION";
            }

            case INVALID_QUANTITY_DOCUMENT: {
                return "INVALID_QUANTITY_DOCUMENT";
            }

            case INVALID_QUANTITY_NAME: {
                return "INVALID_QUANTITY_NAME";
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

            case MAXIMUM_LEDGER_DOCUMENT_URIS: {
                return "MAXIMUM_LEDGER_DOCUMENT_URIS";
            }

            case MOVE_QUANTITIES_FAILED: {
                return "MOVE_QUANTITIES_FAILED";
            }

            case NON_MUTABLE_INVENTORY_ITEM: {
                return "NON_MUTABLE_INVENTORY_ITEM";
            }

            case SAME_QUANTITY_NAME: {
                return "SAME_QUANTITY_NAME";
            }

            default: {
                return "";
            }
        }
    }
}

