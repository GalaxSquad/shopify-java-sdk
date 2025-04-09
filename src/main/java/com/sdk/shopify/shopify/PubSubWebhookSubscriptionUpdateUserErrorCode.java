// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* Possible error codes that can be returned by `PubSubWebhookSubscriptionUpdateUserError`.
*/
public enum PubSubWebhookSubscriptionUpdateUserErrorCode {
    /**
    * Invalid parameters provided.
    */
    INVALID_PARAMETERS,

    UNKNOWN_VALUE;

    public static PubSubWebhookSubscriptionUpdateUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "INVALID_PARAMETERS": {
                return INVALID_PARAMETERS;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case INVALID_PARAMETERS: {
                return "INVALID_PARAMETERS";
            }

            default: {
                return "";
            }
        }
    }
}

