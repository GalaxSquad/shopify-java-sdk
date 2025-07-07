// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The supported formats for webhook subscriptions.
*/
public enum WebhookSubscriptionFormat {
    JSON,

    XML,

    UNKNOWN_VALUE;

    public static WebhookSubscriptionFormat fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "JSON": {
                return JSON;
            }

            case "XML": {
                return XML;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case JSON: {
                return "JSON";
            }

            case XML: {
                return "XML";
            }

            default: {
                return "";
            }
        }
    }
}

