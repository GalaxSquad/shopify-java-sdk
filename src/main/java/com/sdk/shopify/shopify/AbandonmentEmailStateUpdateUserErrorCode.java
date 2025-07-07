// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `AbandonmentEmailStateUpdateUserError`.
*/
public enum AbandonmentEmailStateUpdateUserErrorCode {
    /**
    * Unable to find an Abandonment for the provided ID.
    */
    ABANDONMENT_NOT_FOUND,

    UNKNOWN_VALUE;

    public static AbandonmentEmailStateUpdateUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ABANDONMENT_NOT_FOUND": {
                return ABANDONMENT_NOT_FOUND;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ABANDONMENT_NOT_FOUND: {
                return "ABANDONMENT_NOT_FOUND";
            }

            default: {
                return "";
            }
        }
    }
}

