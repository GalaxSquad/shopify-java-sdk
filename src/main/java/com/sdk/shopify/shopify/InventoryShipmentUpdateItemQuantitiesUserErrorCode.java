// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `InventoryShipmentUpdateItemQuantitiesUserError`.
*/
public enum InventoryShipmentUpdateItemQuantitiesUserErrorCode {
    /**
    * The quantity is invalid.
    */
    INVALID_QUANTITY,

    /**
    * Current shipment status does not support this operation.
    */
    INVALID_SHIPMENT_STATUS,

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

    public static InventoryShipmentUpdateItemQuantitiesUserErrorCode fromGraphQl(String value) {
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
            case INVALID_QUANTITY: {
                return "INVALID_QUANTITY";
            }

            case INVALID_SHIPMENT_STATUS: {
                return "INVALID_SHIPMENT_STATUS";
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

