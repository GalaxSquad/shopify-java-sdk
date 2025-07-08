// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `InventoryTransferDuplicateUserError`.
*/
public enum InventoryTransferDuplicateUserErrorCode {
    /**
    * The transfer was not found.
    */
    TRANSFER_NOT_FOUND,

    UNKNOWN_VALUE;

    public static InventoryTransferDuplicateUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
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
            case TRANSFER_NOT_FOUND: {
                return "TRANSFER_NOT_FOUND";
            }

            default: {
                return "";
            }
        }
    }
}

