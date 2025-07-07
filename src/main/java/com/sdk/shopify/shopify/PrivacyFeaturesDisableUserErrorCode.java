// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `PrivacyFeaturesDisableUserError`.
*/
public enum PrivacyFeaturesDisableUserErrorCode {
    /**
    * Failed to disable privacy features.
    */
    FAILED,

    UNKNOWN_VALUE;

    public static PrivacyFeaturesDisableUserErrorCode fromGraphQl(String value) {
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

