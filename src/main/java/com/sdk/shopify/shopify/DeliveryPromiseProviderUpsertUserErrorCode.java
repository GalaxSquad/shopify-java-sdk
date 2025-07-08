// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `DeliveryPromiseProviderUpsertUserError`.
*/
public enum DeliveryPromiseProviderUpsertUserErrorCode {
    /**
    * The time zone is invalid.
    */
    INVALID_TIME_ZONE,

    /**
    * The location doesn't belong to the app.
    */
    MUST_BELONG_TO_APP,

    /**
    * The record with the ID used as the input value couldn't be found.
    */
    NOT_FOUND,

    /**
    * The input value is too long.
    */
    TOO_LONG,

    UNKNOWN_VALUE;

    public static DeliveryPromiseProviderUpsertUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "INVALID_TIME_ZONE": {
                return INVALID_TIME_ZONE;
            }

            case "MUST_BELONG_TO_APP": {
                return MUST_BELONG_TO_APP;
            }

            case "NOT_FOUND": {
                return NOT_FOUND;
            }

            case "TOO_LONG": {
                return TOO_LONG;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case INVALID_TIME_ZONE: {
                return "INVALID_TIME_ZONE";
            }

            case MUST_BELONG_TO_APP: {
                return "MUST_BELONG_TO_APP";
            }

            case NOT_FOUND: {
                return "NOT_FOUND";
            }

            case TOO_LONG: {
                return "TOO_LONG";
            }

            default: {
                return "";
            }
        }
    }
}

