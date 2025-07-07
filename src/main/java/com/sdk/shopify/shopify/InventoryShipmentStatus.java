// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The status of an inventory shipment.
*/
public enum InventoryShipmentStatus {
    /**
    * The inventory shipment has been created but not yet shipped.
    */
    DRAFT,

    /**
    * The inventory shipment is currently in transit.
    */
    IN_TRANSIT,

    /**
    * Status not included in the current enumeration set.
    */
    OTHER,

    /**
    * The inventory shipment has been partially received at the destination.
    */
    PARTIALLY_RECEIVED,

    /**
    * The inventory shipment has been completely received at the destination.
    */
    RECEIVED,

    UNKNOWN_VALUE;

    public static InventoryShipmentStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "DRAFT": {
                return DRAFT;
            }

            case "IN_TRANSIT": {
                return IN_TRANSIT;
            }

            case "OTHER": {
                return OTHER;
            }

            case "PARTIALLY_RECEIVED": {
                return PARTIALLY_RECEIVED;
            }

            case "RECEIVED": {
                return RECEIVED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case DRAFT: {
                return "DRAFT";
            }

            case IN_TRANSIT: {
                return "IN_TRANSIT";
            }

            case OTHER: {
                return "OTHER";
            }

            case PARTIALLY_RECEIVED: {
                return "PARTIALLY_RECEIVED";
            }

            case RECEIVED: {
                return "RECEIVED";
            }

            default: {
                return "";
            }
        }
    }
}

