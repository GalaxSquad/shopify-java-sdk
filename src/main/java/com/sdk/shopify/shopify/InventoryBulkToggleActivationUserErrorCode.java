// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `InventoryBulkToggleActivationUserError`.
*/
public enum InventoryBulkToggleActivationUserErrorCode {
    /**
    * Cannot unstock an inventory item from the only location at which it is stocked.
    */
    CANNOT_DEACTIVATE_FROM_ONLY_LOCATION,

    /**
    * Cannot unstock this inventory item from this location because it has committed quantities.
    */
    COMMITTED_INVENTORY_AT_LOCATION,

    /**
    * Failed to stock this inventory item at this location.
    */
    FAILED_TO_STOCK_AT_LOCATION,

    /**
    * Failed to unstock this inventory item from this location.
    */
    FAILED_TO_UNSTOCK_FROM_LOCATION,

    /**
    * An error occurred while setting the activation status.
    */
    GENERIC_ERROR,

    /**
    * Cannot unstock this inventory item from this location because it has incoming quantities.
    */
    INCOMING_INVENTORY_AT_LOCATION,

    /**
    * The inventory item was not found.
    */
    INVENTORY_ITEM_NOT_FOUND,

    /**
    * Cannot stock this inventory item at this location because it is managed by a third-party fulfillment
    * service.
    */
    INVENTORY_MANAGED_BY_3RD_PARTY,

    /**
    * Cannot stock this inventory item at this location because it is managed by Shopify.
    */
    INVENTORY_MANAGED_BY_SHOPIFY,

    /**
    * The location was not found.
    */
    LOCATION_NOT_FOUND,

    /**
    * Cannot stock this inventory item at this location because the variant is missing a SKU.
    */
    MISSING_SKU,

    /**
    * Cannot unstock this inventory item from this location because it has unavailable quantities.
    */
    RESERVED_INVENTORY_AT_LOCATION,

    UNKNOWN_VALUE;

    public static InventoryBulkToggleActivationUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CANNOT_DEACTIVATE_FROM_ONLY_LOCATION": {
                return CANNOT_DEACTIVATE_FROM_ONLY_LOCATION;
            }

            case "COMMITTED_INVENTORY_AT_LOCATION": {
                return COMMITTED_INVENTORY_AT_LOCATION;
            }

            case "FAILED_TO_STOCK_AT_LOCATION": {
                return FAILED_TO_STOCK_AT_LOCATION;
            }

            case "FAILED_TO_UNSTOCK_FROM_LOCATION": {
                return FAILED_TO_UNSTOCK_FROM_LOCATION;
            }

            case "GENERIC_ERROR": {
                return GENERIC_ERROR;
            }

            case "INCOMING_INVENTORY_AT_LOCATION": {
                return INCOMING_INVENTORY_AT_LOCATION;
            }

            case "INVENTORY_ITEM_NOT_FOUND": {
                return INVENTORY_ITEM_NOT_FOUND;
            }

            case "INVENTORY_MANAGED_BY_3RD_PARTY": {
                return INVENTORY_MANAGED_BY_3RD_PARTY;
            }

            case "INVENTORY_MANAGED_BY_SHOPIFY": {
                return INVENTORY_MANAGED_BY_SHOPIFY;
            }

            case "LOCATION_NOT_FOUND": {
                return LOCATION_NOT_FOUND;
            }

            case "MISSING_SKU": {
                return MISSING_SKU;
            }

            case "RESERVED_INVENTORY_AT_LOCATION": {
                return RESERVED_INVENTORY_AT_LOCATION;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CANNOT_DEACTIVATE_FROM_ONLY_LOCATION: {
                return "CANNOT_DEACTIVATE_FROM_ONLY_LOCATION";
            }

            case COMMITTED_INVENTORY_AT_LOCATION: {
                return "COMMITTED_INVENTORY_AT_LOCATION";
            }

            case FAILED_TO_STOCK_AT_LOCATION: {
                return "FAILED_TO_STOCK_AT_LOCATION";
            }

            case FAILED_TO_UNSTOCK_FROM_LOCATION: {
                return "FAILED_TO_UNSTOCK_FROM_LOCATION";
            }

            case GENERIC_ERROR: {
                return "GENERIC_ERROR";
            }

            case INCOMING_INVENTORY_AT_LOCATION: {
                return "INCOMING_INVENTORY_AT_LOCATION";
            }

            case INVENTORY_ITEM_NOT_FOUND: {
                return "INVENTORY_ITEM_NOT_FOUND";
            }

            case INVENTORY_MANAGED_BY_3RD_PARTY: {
                return "INVENTORY_MANAGED_BY_3RD_PARTY";
            }

            case INVENTORY_MANAGED_BY_SHOPIFY: {
                return "INVENTORY_MANAGED_BY_SHOPIFY";
            }

            case LOCATION_NOT_FOUND: {
                return "LOCATION_NOT_FOUND";
            }

            case MISSING_SKU: {
                return "MISSING_SKU";
            }

            case RESERVED_INVENTORY_AT_LOCATION: {
                return "RESERVED_INVENTORY_AT_LOCATION";
            }

            default: {
                return "";
            }
        }
    }
}

