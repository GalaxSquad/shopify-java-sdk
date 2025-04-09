// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* The current state of a server pixel.
*/
public enum ServerPixelStatus {
    /**
    * This server pixel is connected: it will stream customer events to the endpoint if it is configured
    * properly.
    */
    CONNECTED,

    /**
    * This server pixel is disconnected: it does not stream events to the endpoint and an endpoint address
    * has been added to the server pixel.
    */
    DISCONNECTED_CONFIGURED,

    /**
    * This server pixel is disconnected and unconfigured: it does not stream events to the endpoint and no
    * endpoint address had been added to the server pixel.
    */
    DISCONNECTED_UNCONFIGURED,

    UNKNOWN_VALUE;

    public static ServerPixelStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CONNECTED": {
                return CONNECTED;
            }

            case "DISCONNECTED_CONFIGURED": {
                return DISCONNECTED_CONFIGURED;
            }

            case "DISCONNECTED_UNCONFIGURED": {
                return DISCONNECTED_UNCONFIGURED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CONNECTED: {
                return "CONNECTED";
            }

            case DISCONNECTED_CONFIGURED: {
                return "DISCONNECTED_CONFIGURED";
            }

            case DISCONNECTED_UNCONFIGURED: {
                return "DISCONNECTED_UNCONFIGURED";
            }

            default: {
                return "";
            }
        }
    }
}

