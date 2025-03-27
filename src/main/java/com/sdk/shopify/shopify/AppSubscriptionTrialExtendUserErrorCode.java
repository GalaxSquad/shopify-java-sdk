// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* Possible error codes that can be returned by `AppSubscriptionTrialExtendUserError`.
*/
public enum AppSubscriptionTrialExtendUserErrorCode {
    /**
    * The app subscription isn't active.
    */
    SUBSCRIPTION_NOT_ACTIVE,

    /**
    * The app subscription wasn't found.
    */
    SUBSCRIPTION_NOT_FOUND,

    /**
    * The trial isn't active.
    */
    TRIAL_NOT_ACTIVE,

    UNKNOWN_VALUE;

    public static AppSubscriptionTrialExtendUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "SUBSCRIPTION_NOT_ACTIVE": {
                return SUBSCRIPTION_NOT_ACTIVE;
            }

            case "SUBSCRIPTION_NOT_FOUND": {
                return SUBSCRIPTION_NOT_FOUND;
            }

            case "TRIAL_NOT_ACTIVE": {
                return TRIAL_NOT_ACTIVE;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case SUBSCRIPTION_NOT_ACTIVE: {
                return "SUBSCRIPTION_NOT_ACTIVE";
            }

            case SUBSCRIPTION_NOT_FOUND: {
                return "SUBSCRIPTION_NOT_FOUND";
            }

            case TRIAL_NOT_ACTIVE: {
                return "TRIAL_NOT_ACTIVE";
            }

            default: {
                return "";
            }
        }
    }
}

