// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The error code resulted from the marketing activity extension integration.
*/
public enum MarketingActivityExtensionAppErrorCode {
    /**
    * The app is either not responding or returning unexpected data.
    */
    API_ERROR,

    /**
    * The app needs to be installed.
    */
    INSTALL_REQUIRED_ERROR,

    /**
    * The shop/user must be onboarded to use the app.
    */
    NOT_ONBOARDED_ERROR,

    /**
    * The app has returned an error when invoking the platform.
    */
    PLATFORM_ERROR,

    /**
    * The app has returned validation errors.
    */
    VALIDATION_ERROR,

    UNKNOWN_VALUE;

    public static MarketingActivityExtensionAppErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "API_ERROR": {
                return API_ERROR;
            }

            case "INSTALL_REQUIRED_ERROR": {
                return INSTALL_REQUIRED_ERROR;
            }

            case "NOT_ONBOARDED_ERROR": {
                return NOT_ONBOARDED_ERROR;
            }

            case "PLATFORM_ERROR": {
                return PLATFORM_ERROR;
            }

            case "VALIDATION_ERROR": {
                return VALIDATION_ERROR;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case API_ERROR: {
                return "API_ERROR";
            }

            case INSTALL_REQUIRED_ERROR: {
                return "INSTALL_REQUIRED_ERROR";
            }

            case NOT_ONBOARDED_ERROR: {
                return "NOT_ONBOARDED_ERROR";
            }

            case PLATFORM_ERROR: {
                return "PLATFORM_ERROR";
            }

            case VALIDATION_ERROR: {
                return "VALIDATION_ERROR";
            }

            default: {
                return "";
            }
        }
    }
}

