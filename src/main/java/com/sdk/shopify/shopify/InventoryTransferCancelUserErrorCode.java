// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `InventoryTransferCancelUserError`.
*/
public enum InventoryTransferCancelUserErrorCode {
    /**
    * Current transfer status does not support this operation.
    */
    INVALID_TRANSFER_STATUS,

    /**
    * Shipment already exists for the transfer.
    */
    SHIPMENT_EXISTS,

    /**
    * The transfer was not found.
    */
    TRANSFER_NOT_FOUND,

    UNKNOWN_VALUE;

    public static InventoryTransferCancelUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "INVALID_TRANSFER_STATUS": {
                return INVALID_TRANSFER_STATUS;
            }

            case "SHIPMENT_EXISTS": {
                return SHIPMENT_EXISTS;
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
            case INVALID_TRANSFER_STATUS: {
                return "INVALID_TRANSFER_STATUS";
            }

            case SHIPMENT_EXISTS: {
                return "SHIPMENT_EXISTS";
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

