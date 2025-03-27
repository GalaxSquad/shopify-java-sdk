// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* The page or pages on the online store where the script should be included.
*/
public enum ScriptTagDisplayScope {
    /**
    * Include the script only on the web storefront.
    */
    ONLINE_STORE,

    UNKNOWN_VALUE;

    public static ScriptTagDisplayScope fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ONLINE_STORE": {
                return ONLINE_STORE;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ONLINE_STORE: {
                return "ONLINE_STORE";
            }

            default: {
                return "";
            }
        }
    }
}

