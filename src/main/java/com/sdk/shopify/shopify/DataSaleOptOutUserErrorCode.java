// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* Possible error codes that can be returned by `DataSaleOptOutUserError`.
*/
public enum DataSaleOptOutUserErrorCode {
    /**
    * Data sale opt out failed.
    */
    FAILED,

    UNKNOWN_VALUE;

    public static DataSaleOptOutUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "FAILED": {
                return FAILED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case FAILED: {
                return "FAILED";
            }

            default: {
                return "";
            }
        }
    }
}

