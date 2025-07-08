// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The status of a transfer.
*/
public enum InventoryTransferStatus {
    /**
    * The inventory transfer has been canceled.
    */
    CANCELED,

    /**
    * The inventory transfer has been created but not yet finalized.
    */
    DRAFT,

    /**
    * The inventory transfer is in progress, with a shipment currently underway or received.
    */
    IN_PROGRESS,

    /**
    * Status not included in the current enumeration set.
    */
    OTHER,

    /**
    * The inventory transfer has been created, but not yet shipped.
    */
    READY_TO_SHIP,

    /**
    * The inventory transfer has been completely received at the destination.
    */
    TRANSFERRED,

    UNKNOWN_VALUE;

    public static InventoryTransferStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CANCELED": {
                return CANCELED;
            }

            case "DRAFT": {
                return DRAFT;
            }

            case "IN_PROGRESS": {
                return IN_PROGRESS;
            }

            case "OTHER": {
                return OTHER;
            }

            case "READY_TO_SHIP": {
                return READY_TO_SHIP;
            }

            case "TRANSFERRED": {
                return TRANSFERRED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CANCELED: {
                return "CANCELED";
            }

            case DRAFT: {
                return "DRAFT";
            }

            case IN_PROGRESS: {
                return "IN_PROGRESS";
            }

            case OTHER: {
                return "OTHER";
            }

            case READY_TO_SHIP: {
                return "READY_TO_SHIP";
            }

            case TRANSFERRED: {
                return "TRANSFERRED";
            }

            default: {
                return "";
            }
        }
    }
}

