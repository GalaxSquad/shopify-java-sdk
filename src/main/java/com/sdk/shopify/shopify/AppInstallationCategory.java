// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* The possible categories of an app installation, based on their purpose
* or the environment they can run in.
*/
public enum AppInstallationCategory {
    /**
    * Apps that serve as channels through which sales are made, such as the online store.
    */
    CHANNEL,

    /**
    * Apps that can be used in the POS mobile client.
    */
    POS_EMBEDDED,

    UNKNOWN_VALUE;

    public static AppInstallationCategory fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CHANNEL": {
                return CHANNEL;
            }

            case "POS_EMBEDDED": {
                return POS_EMBEDDED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CHANNEL: {
                return "CHANNEL";
            }

            case POS_EMBEDDED: {
                return "POS_EMBEDDED";
            }

            default: {
                return "";
            }
        }
    }
}

