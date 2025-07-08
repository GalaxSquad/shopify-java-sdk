// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `CarrierServiceUpdateUserError`.
*/
public enum CarrierServiceUpdateUserErrorCode {
    /**
    * Carrier service update failed.
    */
    CARRIER_SERVICE_UPDATE_FAILED,

    UNKNOWN_VALUE;

    public static CarrierServiceUpdateUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CARRIER_SERVICE_UPDATE_FAILED": {
                return CARRIER_SERVICE_UPDATE_FAILED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CARRIER_SERVICE_UPDATE_FAILED: {
                return "CARRIER_SERVICE_UPDATE_FAILED";
            }

            default: {
                return "";
            }
        }
    }
}

