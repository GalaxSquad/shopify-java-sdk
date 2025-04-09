// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* Possible error codes that can be returned by `CarrierServiceDeleteUserError`.
*/
public enum CarrierServiceDeleteUserErrorCode {
    /**
    * Carrier service deletion failed.
    */
    CARRIER_SERVICE_DELETE_FAILED,

    UNKNOWN_VALUE;

    public static CarrierServiceDeleteUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CARRIER_SERVICE_DELETE_FAILED": {
                return CARRIER_SERVICE_DELETE_FAILED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CARRIER_SERVICE_DELETE_FAILED: {
                return "CARRIER_SERVICE_DELETE_FAILED";
            }

            default: {
                return "";
            }
        }
    }
}

