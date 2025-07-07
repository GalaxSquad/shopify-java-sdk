// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Metaobject Capabilities types which can be enabled.
*/
public enum MetaobjectCapabilityType {
    /**
    * Allows for a Metaobject to be rendered as an Online Store page.
    */
    ONLINE_STORE,

    /**
    * Allows for a Metaobject to be conditionally publishable.
    */
    PUBLISHABLE,

    /**
    * Allows for a Metaobject to have attributes of a renderable page such as SEO.
    */
    RENDERABLE,

    /**
    * Allows for a Metaobject to be translated using the translation api.
    */
    TRANSLATABLE,

    UNKNOWN_VALUE;

    public static MetaobjectCapabilityType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ONLINE_STORE": {
                return ONLINE_STORE;
            }

            case "PUBLISHABLE": {
                return PUBLISHABLE;
            }

            case "RENDERABLE": {
                return RENDERABLE;
            }

            case "TRANSLATABLE": {
                return TRANSLATABLE;
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

            case PUBLISHABLE: {
                return "PUBLISHABLE";
            }

            case RENDERABLE: {
                return "RENDERABLE";
            }

            case TRANSLATABLE: {
                return "TRANSLATABLE";
            }

            default: {
                return "";
            }
        }
    }
}

