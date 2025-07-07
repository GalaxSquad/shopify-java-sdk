// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `InventoryShipmentSetTrackingUserError`.
*/
public enum InventoryShipmentSetTrackingUserErrorCode {
    /**
    * The URL is invalid.
    */
    INVALID_URL,

    /**
    * The shipment was not found.
    */
    SHIPMENT_NOT_FOUND,

    UNKNOWN_VALUE;

    public static InventoryShipmentSetTrackingUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "INVALID_URL": {
                return INVALID_URL;
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
            case INVALID_URL: {
                return "INVALID_URL";
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

