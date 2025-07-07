// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The reason for receiving a line item on an inventory shipment.
*/
public enum InventoryShipmentReceiveLineItemReason {
    /**
    * The line item was accepted.
    */
    ACCEPTED,

    /**
    * The line item was rejected.
    */
    REJECTED,

    UNKNOWN_VALUE;

    public static InventoryShipmentReceiveLineItemReason fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ACCEPTED": {
                return ACCEPTED;
            }

            case "REJECTED": {
                return REJECTED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ACCEPTED: {
                return "ACCEPTED";
            }

            case REJECTED: {
                return "REJECTED";
            }

            default: {
                return "";
            }
        }
    }
}

