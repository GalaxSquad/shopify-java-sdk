// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `CarrierServiceCreateUserError`.
*/
public enum CarrierServiceCreateUserErrorCode {
    /**
    * Carrier service creation failed.
    */
    CARRIER_SERVICE_CREATE_FAILED,

    UNKNOWN_VALUE;

    public static CarrierServiceCreateUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CARRIER_SERVICE_CREATE_FAILED": {
                return CARRIER_SERVICE_CREATE_FAILED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CARRIER_SERVICE_CREATE_FAILED: {
                return "CARRIER_SERVICE_CREATE_FAILED";
            }

            default: {
                return "";
            }
        }
    }
}

